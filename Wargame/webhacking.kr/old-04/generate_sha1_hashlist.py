import hashlib

# Open the wordlist file
with open("wordlist.txt", "r") as wordlist, open("sha1_rainbow_table.txt", "w") as output:
    for word in wordlist:
        word = word.strip()  # Remove newline characters
        sha1_hash = hashlib.sha1(word.encode()).hexdigest()
        output.write(f"{word}:{sha1_hash}\n")

print("SHA-1 rainbow table generated in sha1_rainbow_table.txt.")