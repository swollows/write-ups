import struct

def decode_varint(stream):
    n = stream[0]
    if n < 0xFD:
        return n, 1
    elif n == 0xFD:
        return struct.unpack("<H", stream[1:3])[0], 3
    elif n == 0xFE:
        return struct.unpack("<I", stream[1:5])[0], 5
    elif n == 0xFF:
        return struct.unpack("<Q", stream[1:9])[0], 9

def deserialize_tx(serialized_tx):
    offset = 0
    
    version = struct.unpack("<L", serialized_tx[offset:offset+4])[0]
    offset += 4
    
    vin_count, vin_offset = decode_varint(serialized_tx[offset:])
    offset += vin_offset
    vin = []
    for _ in range(vin_count):
        txid = serialized_tx[offset:offset+32][::-1].hex()
        offset += 32
        vout = struct.unpack("<L", serialized_tx[offset:offset+4])[0]
        offset += 4
        script_length, script_offset = decode_varint(serialized_tx[offset:])
        offset += script_offset
        scriptsig = serialized_tx[offset:offset+script_length].hex()
        offset += script_length
        sequence = struct.unpack("<L", serialized_tx[offset:offset+4])[0]
        offset += 4
        vin.append({"txid": txid, "vout": vout, "scriptsig": scriptsig, 
                    "sequence": sequence})
    
    vout_count, vout_offset = decode_varint(serialized_tx[offset:])
    offset += vout_offset
    vout = []
    for _ in range(vout_count):
        value = struct.unpack("<Q", serialized_tx[offset:offset+8])[0]
        offset += 8
        script_length, script_offset = decode_varint(serialized_tx[offset:])
        offset += script_offset
        scriptpubkey = serialized_tx[offset:offset+script_length].hex()
        offset += script_length
        vout.append({"value": value, "scriptpubkey": scriptpubkey})
    
    locktime = struct.unpack("<L", serialized_tx[offset:offset+4])[0]
    
    return {
        "version": version,
        "vin": vin,
        "vout": vout,
        "locktime": locktime
    }

serialized_tx = "03f9029c018308810084b2d05e008507aef40a00832dc6c09468d30f47f19c07bccef4ac7fae2dc12fca3e0dc980b902040c8f4a10000000000000000000000000000000000000000000000000000000000000004000000000000000000000000000000000000000000000000000000000000001a00000000000000000000000000000000000000000000000000000000000000001000000000000000000000000000000000000000000000000000000000000002000000000000000000000000000000000000000000000000000000000000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000633b68f5d8d3a86593ebb815b4663bcbe00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001f0030000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100000000000000000000000000000000000000000000000000000000000000200000000000000000000000000000000000000000000000000000000000000000c0843b9aca00e1a00194a3b246fb5496581acf73faaef317f9da2722b8331441b682ec070dbb243080a02bb669721a22ab3733b23667e11e4b0f1c5b16542120c90294ace12baf05b225a012f92af73220de9f3522b4998229e050d5448ac7260352635789e22477d46187"
transaction = deserialize_tx(bytes.fromhex(serialized_tx))
print("Version:", transaction["version"])
print("Vin:")
for inp in transaction["vin"]:
    print("  TXID:", inp["txid"])
    print("  Vout:", inp["vout"])
    print("  ScriptSig:", inp["scriptsig"])
    print("  Sequence:", inp["sequence"])
print("Vout:")
for out in transaction["vout"]:
    print("  Value:", out["value"])
    print("  ScriptPubKey:", out["scriptpubkey"])
print("Locktime:", transaction["locktime"])