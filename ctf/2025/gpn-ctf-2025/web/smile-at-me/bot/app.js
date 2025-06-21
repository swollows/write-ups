const express = require('express');
const fs = require('fs');
const path = require('path');
const puppeteer = require('puppeteer');
const crypto = require('crypto');

const app = express();
let flag;
try {
  flag = fs.readFileSync('/flag', 'utf8').trim();
  if (!flag) {
    console.warn('flag is empty or contains only whitespace');
  }
} catch (err) {
  console.error(`Error reading flag: ${err}`);
  process.exit(1);
}

const baseUrl = process.env.BASE_URL || 'http://challenge_service:9222';

const browserPromise = puppeteer.launch({ args: ['--no-sandbox'] });

let initPromise = null;

async function initializeBot() {
  try {
    const browser = await browserPromise;
    const page = await browser.newPage();
    const randomUser = 'I_love_emojis_' + crypto.randomBytes(32).toString('hex');

    await page.goto(`${baseUrl}/login`, { waitUntil: 'networkidle2' });
    await page.type('input[name="username"]', randomUser);
    await page.click('button[type="submit"]');
    await page.waitForNavigation({ waitUntil: 'networkidle2' });

    await page.goto(`${baseUrl}/note/new`, { waitUntil: 'networkidle2' });
    await page.type('input[name="title"]', flag);
    await page.type('textarea[name="content"]', `Here you got some juicy flag: ${flag}`);
    await page.click('button[type="submit"]');
    await page.waitForNavigation({ waitUntil: 'networkidle2' });
    console.log(`Bot logged in as ${randomUser} and created initial note.`);
    await page.close();
  } catch (err) {
    console.error('Initialization failed:', err);
    throw err;
  }
}

app.use(express.json());

app.post('/bot', async (req, res) => {
  const url = req.body.url;
  if (!url) {
    res.status(400).send('Missing url parameter');
    return;
  }
  try {
    if (!initPromise) {
      initPromise = initializeBot();
    }
    await initPromise;

    const browser = await browserPromise;
    const page = await browser.newPage();
    console.log(`Visiting URL: ${url}`);
    await page.goto(url, { timeout: 5000, waitUntil: 'networkidle0' });
    await new Promise(r => setTimeout(r, 5000));
    res.send(`Bot visited your url ${url}`);
    await page.close();
  } catch (err) {
    console.error('Error in /bot handler:', err);
    res.status(502).send(`Could not reach ${url}`);
  }
});

const PORT = 3000;
app.listen(PORT, () => {
  console.log(`Bot running on port ${PORT}`);
});
