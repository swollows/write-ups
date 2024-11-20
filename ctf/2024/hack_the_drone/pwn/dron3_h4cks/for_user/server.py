import struct
import socket
from crc import calc_hdr_checksum, calc_checksum
import threading
import random
import time
import re, os

class DUMLPacket:
    def __init__(self, packet):        
        self.packet = packet
        self.parse_header()
        self.parse_transit()
        self.parse_command()
        self.parse_payload_crc()

    def parse_header(self):
        self.magic = self.packet[0]
        self.length = self.packet[1] | ((self.packet[2] & 0x03) << 8)
        self.version = self.packet[2] >> 2
        self.crc8 = self.packet[3]

        assert self.magic == 0x55, "Invalid magic byte"
        assert self.length == len(self.packet), "Invalid length"

        calculated_crc8 = calc_hdr_checksum(0x77, self.packet[:3], 3)
        assert self.crc8 == calculated_crc8, f"CRC8 mismatch: expected {hex(calculated_crc8)}, got {hex(self.crc8)}"

    def parse_transit(self):
        self.src_id = (self.packet[4] & 0xe0) >> 5
        self.src_type = self.packet[4] & 0x1F
        self.dest_id = (self.packet[5] & 0xe0) >> 5
        self.dest_type = self.packet[5] & 0x1F
        self.counter = ((self.packet[7] & 0xFF) << 8) | (self.packet[6] & 0xFF)

    def parse_command(self):
        self.cmd_type = self.packet[8] >> 7
        self.ack_type = (self.packet[8] >> 5) & 0x03
        self.encrypt = self.packet[8] & 0x07
        self.cmd_set = self.packet[9]
        self.cmd_id = self.packet[10]

    def parse_payload_crc(self):
        self.cmd_payload = self.packet[11:-2]

        whole_packet = self.packet[:-2]
        self.crc16 = struct.unpack_from("<H", self.packet, len(whole_packet))[0]
        calculated_crc16 = calc_checksum(whole_packet, len(whole_packet))
        assert self.crc16 == calculated_crc16, f"CRC16 mismatch: expected {hex(calculated_crc16)}, got {hex(self.crc16)}"

class DJIUDPPacket:
    def __init__(self, data):
        self.data = data
        self.parse_packet()

    def parse_packet(self):
        self.packet_length, self.sequence_number, self.packet_type = struct.unpack('<HHB', self.data[:5])
        self.packet_length = self.packet_length ^ (1 << 15)
        self.payload = self.data[5:self.packet_length]
        assert self.packet_length == len(self.data), "Invalid length"

class CommandDataPacket(DJIUDPPacket):
    def __init__(self, data):
        super().__init__(data)
        self.parse_command_data()

    def parse_command_data(self):
        self.payload = DUMLPacket(self.payload)

def parse_payload(packet):
    res = ''

    # Handling different cmd_set and cmd_id combinations
    if packet.payload.cmd_set == 99 and packet.payload.cmd_id == 1:
        res = handle_DUML1(packet.payload.cmd_payload)
    elif packet.payload.cmd_set == 99 and packet.payload.cmd_id == 2:
        res = handle_DUML2(packet.payload.cmd_payload)
    elif packet.payload.cmd_set == 99 and packet.payload.cmd_id == 3:
        res = handle_DUML3(packet.payload.cmd_payload)
    elif packet.payload.cmd_set == 99 and packet.payload.cmd_id == 4:
        res = handle_DUML4(packet.payload.cmd_payload)
    else:
        res = "Unknown cmd_set and cmd_id".encode()
    
    return res

def is_valid_filepath(filepath):
    return re.match(r'^[a-zA-Z0-9._\-\/]+$', filepath) and len(filepath) <= 64

def handle_DUML1(cmd_payload):
    return cmd_payload[::-1]

def handle_DUML2(cmd_payload):
    xor_key = 0x55
    return ''.join(chr(b ^ xor_key) for b in cmd_payload).encode()

def handle_DUML3(cmd_payload):
    # get flight log number
    log_num = int(cmd_payload[:64].decode('utf-8').strip('\x00'))

    log_file = "/data/log/{}.log".format(log_num)
    # fix command injection.
    with open(log_file) as f:
        log = f.read()

    os.remove(log_file)
    return log.encode()

def handle_DUML4(cmd_payload):
    # get run-time generated log file
    source_file = cmd_payload[:64].decode('utf-8').strip('\x00')
    dest_file = cmd_payload[64:128].decode('utf-8').strip('\x00')

    # security check.
    if not (is_valid_filepath(source_file) and is_valid_filepath(dest_file)):
        return "Invalid file paths".encode()
    if not source_file.startswith("/system/log/"):
        return "Only /system/log folder is allowed for access".encode()  
    if not dest_file.startswith("/data/log/"):
        return "Only /data folder is allowed for writing".encode()
    command = f"cp {source_file} {dest_file}"
    os.system(command)
    return command.encode()

def parse_cmd(data):
    udt_packet = DJIUDPPacket(data)
    assert udt_packet.packet_type == 0x05

    packet = CommandDataPacket(data)
    return parse_payload(packet)

def boot_drone_server():
    server_address = ('0.0.0.0', 7810)
    buffer_size = 1024

    sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    sock.bind(server_address)

    while True:
        data, address = sock.recvfrom(buffer_size)
        
        try:
            result = parse_cmd(data)
            if result:
                sock.sendto(result, address)
        except Exception:
            continue
        

if __name__ == "__main__":
    boot_drone_server()


