document.addEventListener('DOMContentLoaded', function() {
    const emojiPicker = document.getElementById('emojiPicker');
    const noteContent = document.getElementById('noteContent');

    emojiPicker.addEventListener('click', function(event) {
        if (event.target.classList.contains('emoji-picker__emoji')) {
            const emoji = event.target.dataset.emoji;
            insertEmoji(emoji);
        }
    });

    function insertEmoji(emoji) {
        const start = noteContent.selectionStart;
        const end = noteContent.selectionEnd;
        const text = noteContent.value;
        const newText = text.substring(0, start) + emoji + text.substring(end);
        noteContent.value = newText;

        noteContent.selectionStart = noteContent.selectionEnd = start + emoji.length;
        noteContent.focus();
    }
});
