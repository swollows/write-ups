const createDOMPurify = require('dompurify');
const { JSDOM } = require('jsdom');


function sanitize(data,isTitle) {
    const DOMPurify = createDOMPurify(new JSDOM('').window);
    let html = custom_sanitize(data);
    if(isTitle) {
        html = DOMPurify.sanitize(html,{ALLOWED_TAGS: []}); 
    } else {
        html = DOMPurify.sanitize(html);
    }
    return html;
}

function custom_sanitize(html) {
    const document = new JSDOM('').window.document;
    document.body.outerHTML = html;
    let node;
    const iter = document.createNodeIterator(document.body);

    while (node = iter.nextNode()) {
        if (/m.+/i.test(node.nodeName)) { // for prevent mutation xss
            node.parentNode.removeChild(node);
            continue;
        }
        if (node.attributes) {
            for (let i = node.attributes.length - 1; i >= 0; i--) {
                const att = node.attributes[i]
                if (! /(src|href)/i.test(att.name)) { // you can only use this attributes!
                    node.removeAttributeNode(att);
                }
            }
        }
    }
    return document.body.innerHTML;
}

module.exports = { sanitize }