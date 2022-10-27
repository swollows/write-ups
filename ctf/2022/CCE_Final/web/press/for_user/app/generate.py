from Crypto.PublicKey import RSA

new_key = RSA.generate(4096)

private_key = new_key.exportKey("PEM")
public_key = new_key.publickey().exportKey("PEM")

fd = open("./secret/private_key.pem", "wb")
fd.write(private_key)
fd.close()

fd = open("./secret/public_key.pem", "wb")
fd.write(public_key)
fd.close()