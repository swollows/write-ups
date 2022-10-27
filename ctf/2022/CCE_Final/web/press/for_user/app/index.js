const express = require("express");
const cookieParser = require('cookie-parser');
const crypto = require("crypto");
const marked = require('marked');
const { sanitize } = require('./lib/util');
const { encode, decode } = require('html-entities');
const fs = require("fs");
const { uuid } = require('uuidv4');
const { JSDOM } = require("jsdom");
const jwt = require('jsonwebtoken');
const genNonce = () => "_".repeat(32).replace(/_/g,()=>"abcdefghijklmnopqrstuvwxyz0123456789".charAt(Math.random()*36));
const path = require('path');

const hashPasswd = p => { return crypto.createHash('sha256').update(p).digest('hex') }

const app = express();

app.use(cookieParser())
app.use(express.json());
app.use(express.urlencoded())

const HOST = process.env.production ? "" : "http://127.0.0.1:8080";
const users = new Set();
const news_info = new Set();
const newsList = new Map();
var newsId = 0;

const NEWS_TEMPLATE = fs.readFileSync("template/news.html").toString();

const PUBLIC_KEY = fs.readFileSync("secret/public_key.pem")
const PRIVATE_KEY = fs.readFileSync("secret/private_key.pem")


app.use((req,res,next) => {
    res.nonce = genNonce()
    res.setHeader('Content-Security-Policy',`script-src 'nonce-${res.nonce}' 'unsafe-inline' 'unsafe-eval'; frame-ancestors 'none'; frame-src 'none'; object-src 'none';`);
    
    next();
})


app.use((req,res,next) => {
    req.session = Object(null);
    if(req.cookies.token == undefined) {
        next();
    } else {
        const token = req.cookies.token;
        let decoded = "";
        try {
            decoded = jwt.verify(token, PUBLIC_KEY, { algorithms: ['RS256'] });
        } catch {
            res.clearCookie('token');
            res.redirect("/login?message=invalid token");
        }

        req.session = decoded;
        
        next();
    }
});

app.get('/',(req,res) => {
    html = fs.readFileSync("template/main.html").toString()
    html = html.replaceAll("{{SCRIPT_NONCE}}",res.nonce);
    return res.send(html);
});

app.get('/logout',(req,res) => {
    res.clearCookie('token');
    res.clearCookie('username');
    res.redirect("/login");
})

app.get('/login',(req,res) => {
    if(req.session.username){
        return res.redirect('/');
    }
    html = fs.readFileSync("template/login.html").toString()
    html = html.replaceAll("{{SCRIPT_NONCE}}",res.nonce);
    return res.send(html);
});

app.post('/login',(req,res) => {
    const { username, password } = req.body;

    if(!username || !password)
		return res.header("Content-Type","text/html").send(`<script nonce="${res.nonce}">alert("Bad Params");location.href="/login"</script>`);
    
    let u = null
	for(let e of users.entries())
		if(e[0].username === username.toString())
			u = e[0]

    if(!u)
		return res.header("Content-Type","text/html").send(`<script nonce="${res.nonce}">alert("Not Found User");location.href="/login"</script>`);

    let hashedPassword = hashPasswd(password.toString())
	if(u.password != hashedPassword)
        return res.header("Content-Type","text/html").send(`<script nonce="${res.nonce}">alert("Wrong Password");location.href="/login"</script>`);

    let token = "";
    try {
        token = jwt.sign({
            "username" : u.username,
            "uid" : u.uid,
            "role" : u.role
        }, PRIVATE_KEY, { algorithm: 'RS256' });
    } catch {
        return res.redirect("/login?message=something's went wrong");
    }

    res.cookie("username",u.username);
    res.cookie("token",token, { httpOnly: true });
    return res.redirect("/");
});

app.get('/register',(req,res) => {
    if(req.session.username){
        return res.redirect('/');
    }

    html = fs.readFileSync("template/register.html").toString()
    html = html.replaceAll("{{SCRIPT_NONCE}}",res.nonce);
    return res.send(html);
});

app.post('/register',(req,res) => {
    const { username, password } = req.body;
    if(!username || !password)
		return res.header("Content-Type","text/html").send(`<script nonce="${res.nonce}">alert("Bad Params");location.href="/register"</script>`);
    
    if(username.toString().match(/'|"|{/g)) {
        return res.header("Content-Type","text/html").send(`<script nonce="${res.nonce}">alert("Bad Params");location.href="/register"</script>`);
    }
    
    for(let e of users.entries())
		if(e[0].username === username.toString())
			return res.header("Content-Type","text/html").send(`<script nonce="${res.nonce}">alert("Already Exists..");location.href="/register"</script>`);
    
    let hashedPassword = hashPasswd(password.toString());

    users.add({
		username: username.toString(),
		password: hashedPassword,
		uid: uuid(),
        role: "normal"
	});
    
    return res.redirect("/login");
});

app.get('/news_list.json',(req,res) => {
    return res.header("Content-Type","application/json").send(JSON.stringify([...news_info]));
});

app.get('/news/:newsId',(req,res) => {
    if(!req.session.username){
        return res.redirect('/login');
    }
    const user  = req.session;
    let { newsId } = req.params;
    
    if(!newsList.has(newsId)) {
        return res.header("Content-Type","text/html").send(`<script nonce="${res.nonce}">alert("Not Found");location.href="/"</script>`);
    }

    const news = newsList.get(newsId);

    let html = fs.readFileSync(`uploads/${news.id}.html`).toString();
    html = html.replaceAll("{{SCRIPT_NONCE}}",res.nonce);

    if(news.isCanView) {
        return res.send(html);
    }

    if(news.author !== user.uid) {
        return res.header("Content-Type","text/html").send(`<script nonce="${res.nonce}">alert("Only the author can read");location.href="/"</script>`);
    }

    let dom = "";
    try {
        dom = new JSDOM(html,{runScripts: "dangerously",resources:"usable"});
    } catch {
        return res.header("Content-Type","text/html").send(`<script nonce="${res.nonce}">alert("error occur..");location.href="/"</script>`);
    }
    
    return res.send(dom.window.document.documentElement.innerHTML);
});

app.get('/new',(req,res) => {
    if(!req.session.username){
        return res.redirect('/login');
    }

    html = fs.readFileSync("template/new.html").toString()
    html = html.replaceAll("{{SCRIPT_NONCE}}",res.nonce);
    return res.send(html);
});

app.post('/new',(req,res) => {
    if(!req.session.username){
        return res.redirect('/login');
    }

    const user  = req.session;
    if(user.role !== "admin") {
        return res.header("Content-Type","text/html").send(`<script nonce="${res.nonce}">alert("You are not admin..");location.href="/"</script>`);
    }

    let { title, content, isMarkdown } = req.body;
    if(typeof title !== "string" || typeof content !== "string" || title.length > 30) {
        return res.header("Content-Type","text/html").send(`<script nonce="${res.nonce}">alert("invalid data");location.href="/new"</script>`);
    }

    if(title.includes("{") || content.includes("{")) {
        return res.header("Content-Type","text/html").send(`<script nonce="${res.nonce}">alert("invalid character..");location.href="/new"</script>`);
    }

    if(isMarkdown) {
        content = sanitize(marked.parse(content),false);
    } else {
        content = sanitize(content,false);
    }

    const time = new Date();
    const id = uuid();
    
    newsId++;

    let html = NEWS_TEMPLATE.replace("{{USER_INFO}}", encode(JSON.stringify(user)));
    html = html.replaceAll("{{HOST}}",HOST)
    html = html.replace("{{TIME}}",time.toLocaleString());
    html = html.replace("{{AUTHOR}}",encode(user.username));
    html = html.replace("{{TITLE}}",encode(title));
    html = html.replace("{{CONTENT}}",content);

    news_info.add({
        newsId: newsId,
        title: title,
        author: user.username,
        time: time.toLocaleString()
    })

    newsList.set(newsId.toString(),{
        id: id,
        author: user.uid,
        isCanView: 0
    })

    fs.writeFileSync(`uploads/${id}.html`,html);
    return res.redirect(`/news/${newsId}`);
});

app.get('/static/:dir/:path', (req,res) => {
    let type = "";
    const maxLength = 1300

    switch (req.params.dir) {
        case "css":
            type = "text/css";
            break;
        case "js":
            type = "application/javascript";
            break;
        default:
            type = "text/plain";
    }
    let filePath = path.join(__dirname,`static/${req.params.dir}/${req.params.path}`);
    if(!fs.existsSync(filePath)){
        return res.sendStatus(404).send("Not Found");
    }
    let fd, fileLength, readLength, buffer;
    try {
        fd = fs.openSync(filePath);
        fileLength = fs.statSync(filePath).size;
        readLength = fileLength > maxLength ? maxLength : fileLength;
        buffer = new Buffer.alloc(readLength);

        fs.readSync(fd, buffer, 0, readLength);
        fs.closeSync(fd);
    } catch {
        return res.sendStatus(404).send("Not Found");
    }
    return res.header('Content-Type',type).send(buffer.toString())
})

app.listen(8080, () => {
    console.log(`chall listening on 0.0.0.0:8080`);
});
