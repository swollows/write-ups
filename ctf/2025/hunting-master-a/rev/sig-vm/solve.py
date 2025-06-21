#!/usr/bin/env python3

class SigVM:
    def __init__(self):
        self.regs = [0] * 15
        self.data = bytearray(0x100)
        self.zf = False
        self.input_buffer = ""
        self.input_pos = 0
        self.debug = False
        
        # Initialize ans array in data section at offset 0x110
        self.ans = [0x48, 0xab, 0x13a, 0x26b, 0x45, 0xfb, 0x1a6, 0x30f, 
                   0x7a, 0xd1, 0x186, 0x36b, 0x71, 0xf9, 0x18a, 0x39f, 
                   0x75, 0xfd, 0x19e, 0x353, 0x75, 0xed, 0x1c6, 0x3ff]
        
        self.data.extend([0] * (0x110 - 0x100))  # Padding
        for val in self.ans:
            self.data.extend(val.to_bytes(4, 'little'))
    
    def set_input(self, input_str):
        self.input_buffer = input_str
        self.input_pos = 0
        
        # Initialize registers for input handling
        self.regs[1] = 0  # Input buffer address
        self.regs[2] = len(input_str)  # Input length
    
    def set_debug(self, debug):
        self.debug = debug
    
    def print_state(self, pc, op):
        if not self.debug:
            return
        print(f"\nPC: {pc-1:04x}, OP: {op:02x}")
        print(f"Registers: {' '.join(f'r{i}={x:08x}' for i, x in enumerate(self.regs))}")
        print(f"ZF: {self.zf}")
        if self.input_pos < len(self.input_buffer):
            print(f"Next input: '{self.input_buffer[self.input_pos]}'")
            print(f"Input buffer: {[hex(x) for x in self.data[:len(self.input_buffer)]]}")
    
    def execute(self, code):
        pc = 0
        while pc < len(code):
            op = code[pc]
            pc += 1
            
            self.print_state(pc, op)
            
            try:
                if op == 1:  # INT
                    if self.regs[0] == 0:  # sys_read
                        length = self.regs[2]
                        start = self.regs[1]
                        if self.debug:
                            print(f"sys_read: buf={start:x} len={length}")
                        for i in range(length):
                            if self.input_pos < len(self.input_buffer):
                                self.data[start + i] = ord(self.input_buffer[self.input_pos])
                                if self.debug:
                                    print(f"Writing {hex(ord(self.input_buffer[self.input_pos]))} to data[{start + i}]")
                                self.input_pos += 1
                            else:
                                self.data[start + i] = 0
                    elif self.regs[0] == 1:  # sys_write
                        length = self.regs[2]
                        start = self.regs[1]
                        if self.debug:
                            print(f"sys_write: buf={start:x} len={length}")
                            print(f"Writing: {bytes(self.data[start:start+length])}")
                        print(bytes(self.data[start:start+length]).decode(), end='')
                elif op == 2:  # ADD
                    if self.debug:
                        print(f"ADD: r0 = r{1}({self.regs[1]:x}) + r{2}({self.regs[2]:x})")
                    self.regs[0] = self.regs[1] + self.regs[2]
                elif op == 3:  # SUB
                    if self.debug:
                        print(f"SUB: r0 = r{1}({self.regs[1]:x}) - r{2}({self.regs[2]:x})")
                    self.regs[0] = self.regs[1] - self.regs[2]
                    self.zf = (self.regs[0] == 0)
                elif op == 4:  # MUL
                    if self.debug:
                        print(f"MUL: r0 = r{1}({self.regs[1]:x}) * r{2}({self.regs[2]:x})")
                    self.regs[0] = self.regs[1] * self.regs[2]
                elif op == 5:  # DIV
                    if self.debug:
                        print(f"DIV: r0,r1 = r{1}({self.regs[1]:x}) / r{2}({self.regs[2]:x})")
                    if self.regs[2] == 0:
                        if self.debug:
                            print("Warning: Division by zero attempted")
                        self.regs[0] = 0
                        self.regs[1] = 0
                    else:
                        self.regs[0] = self.regs[1] // self.regs[2]
                        self.regs[1] = self.regs[1] % self.regs[2]
                elif op == 6:  # BRS
                    if self.debug:
                        print(f"BRS: r0 = r{1}({self.regs[1]:x}) >> r{2}({self.regs[2]:x})")
                    self.regs[0] = self.regs[1] >> self.regs[2]
                elif op == 7:  # BLS
                    if self.debug:
                        print(f"BLS: r0 = r{1}({self.regs[1]:x}) << r{2}({self.regs[2]:x})")
                    self.regs[0] = self.regs[1] << self.regs[2]
                elif op == 8:  # JMP
                    if self.debug:
                        print(f"JMP: {self.regs[0]:+d} (ZF={self.zf})")
                    if self.zf:
                        pc += self.regs[0]
                elif op == 9:  # LOAD
                    if code[pc]:  # load from code
                        if self.debug:
                            print(f"LOAD: r[{self.regs[1]}] = code[{pc}] ({code[pc]:x})")
                        self.regs[self.regs[1]] = code[pc]
                    else:  # load from data
                        if self.debug:
                            print(f"LOAD: r[{self.regs[3]}] = data[{self.regs[4]}] ({self.data[self.regs[4]]:x})")
                        self.regs[self.regs[3]] = self.data[self.regs[4]]
                    pc += 1
                elif op == 10:  # MOV
                    if code[pc]:  # mov from code
                        pc += 1
                        dst = code[pc]
                        pc += 1
                        src = code[pc]
                        if self.debug:
                            print(f"MOV: r[{dst}] = {src:x}")
                        self.regs[dst] = src
                    else:  # mov between registers
                        if self.debug:
                            print(f"MOV: r[{self.regs[3]}] = r[{self.regs[4]}] ({self.regs[self.regs[4]]:x})")
                        self.regs[self.regs[3]] = self.regs[self.regs[4]]
                    pc += 1
                elif op == 11:  # STR
                    dst = code[pc]
                    pc += 1
                    src = self.regs[code[pc]]
                    if self.debug:
                        print(f"STR: data[{dst:x}] = r[{code[pc]}] ({src:x})")
                    self.data[dst] = src & 0xFF
                    pc += 1
            except Exception as e:
                print(f"\nError at PC={pc-1:04x}, OP={op:02x}: {e}")
                print(f"Registers: {' '.join(f'r{i}={x:08x}' for i, x in enumerate(self.regs))}")
                return

def parse_code(filename):
    with open(filename, 'rb') as f:
        return list(f.read())

def analyze_input_validation():
    ans = [0x48, 0xab, 0x13a, 0x26b,  # H
           0x45, 0xfb, 0x1a6, 0x30f,  # E
           0x7a, 0xd1, 0x186, 0x36b,  # z
           0x71, 0xf9, 0x18a, 0x39f,  # q
           0x75, 0xfd, 0x19e, 0x353,  # u
           0x75, 0xed, 0x1c6, 0x3ff]  # u
    
    # 각 그룹의 첫 번째 값으로 문자열 만들기
    flag_chars = ''.join(chr(ans[i]) for i in range(0, len(ans), 4))
    print(f"기본 문자열: {flag_chars}")
    
    # 각 그룹별 연산 패턴 분석
    operations = []
    for i in range(0, len(ans), 4):
        group = ans[i:i+4]
        base = group[0]
        
        # 각 단계별 연산 찾기
        steps = []
        for j in range(1, 4):
            curr = group[j]
            prev = group[j-1]
            diff = curr - prev
            
            # 비트 연산 체크
            found = False
            for shift in range(1, 9):
                if (prev << shift) & 0xFFFFFFFF == curr:
                    steps.append(f"<<{shift}")
                    found = True
                    break
                if (prev >> shift) & 0xFFFFFFFF == curr:
                    steps.append(f">>{shift}")
                    found = True
                    break
            
            # 산술 연산 체크
            if not found:
                if curr == prev + diff:
                    steps.append(f"+{hex(diff)}")
                elif curr == prev * 2:
                    steps.append("*2")
                elif curr == prev * 3:
                    steps.append("*3")
                else:
                    steps.append(f"???({hex(diff)})")
        
        operations.append((chr(base), steps))
    
    # 결과 출력
    print("\n=== 각 문자별 변환 과정 ===")
    for char, steps in operations:
        print(f"\n{char}: {' -> '.join(steps)}")
    
    # 가능한 플래그 형식
    possible_flags = [
        flag_chars,
        f"FLAG{{{flag_chars}}}",
        f"flag{{{flag_chars}}}",
        f"HM{{{flag_chars}}}"
    ]
    
    print("\n=== 가능한 플래그 형식 ===")
    for flag in possible_flags:
        print(flag)

def try_inputs():
    inputs = [
        "HEzquu",  # 첫 글자들로 만든 문자열
        "HELLO!",  # 일반적인 테스트
        "FLAG{}",  # 플래그 형식
    ]
    
    code = parse_code('code.txt')
    
    print("\n=== 입력값 테스트 ===")
    for test_input in inputs:
        print(f"\n테스트 입력: {test_input}")
        vm = SigVM()
        vm.set_debug(True)  # 디버그 모드 활성화
        vm.set_input(test_input)
        vm.execute(code)
        print("\n" + "="*50)

def main():
    code = parse_code('code.txt')
    print("코드 크기:", len(code))
    
    print("\n=== ANS 배열 분석 ===")
    analyze_input_validation()
    
    try_inputs()

def generate_input():
    # 각 문자에 대한 연산 패턴
    patterns = [
        (0x48, [0xab, 0x13a, 0x26b]),    # H
        (0x45, [0xfb, 0x1a6, 0x30f]),    # E
        (0x7a, [0xd1, 0x186, 0x36b]),    # z
        (0x71, [0xf9, 0x18a, 0x39f]),    # q
        (0x75, [0xfd, 0x19e, 0x353]),    # u
        (0x75, [0xed, 0x1c6, 0x3ff])     # u
    ]
    
    # 각 문자에 대한 연산 결과 분석
    for i, (base, values) in enumerate(patterns):
        char = chr(base)
        print(f"\n문자 {char} (0x{base:02x}):")
        
        # 각 단계별 연산 분석
        for j, val in enumerate(values, 1):
            diff = val - base
            print(f"  단계 {j}: 0x{val:02x} (차이: +0x{diff:02x})")
            
            # 비트 연산 체크
            for shift in range(1, 9):
                if (base << shift) & 0xFFFFFFFF == val:
                    print(f"    - 왼쪽 시프트 {shift}비트")
                if (base >> shift) & 0xFFFFFFFF == val:
                    print(f"    - 오른쪽 시프트 {shift}비트")
    
    # 가능한 플래그 형식
    flag_chars = ''.join(chr(base) for base, _ in patterns)
    possible_flags = [
        flag_chars,
        f"FLAG{{{flag_chars}}}",
        f"flag{{{flag_chars}}}",
        f"HM{{{flag_chars}}}"
    ]
    
    print("\n=== 가능한 플래그 형식 ===")
    for flag in possible_flags:
        print(flag)

def find_flag():
    # ans 배열의 값들
    ans = [
        [0x48, 0xab, 0x13a, 0x26b],    # H
        [0x45, 0xfb, 0x1a6, 0x30f],    # E
        [0x7a, 0xd1, 0x186, 0x36b],    # z
        [0x71, 0xf9, 0x18a, 0x39f],    # q
        [0x75, 0xfd, 0x19e, 0x353],    # u
        [0x75, 0xed, 0x1c6, 0x3ff]     # u
    ]
    
    # 각 문자에 대한 연산 분석
    flag = ""
    for group in ans:
        base = group[0]
        char = chr(base)
        flag += char
        
        print(f"\n문자 {char} (0x{base:02x})의 연산 분석:")
        for i, val in enumerate(group[1:], 1):
            diff = val - group[i-1]
            print(f"  단계 {i}: 0x{val:02x} (차이: +0x{diff:02x})")
            
            # 비트 연산 체크
            for shift in range(1, 9):
                if (group[i-1] << shift) & 0xFFFFFFFF == val:
                    print(f"    - 왼쪽 시프트 {shift}비트")
                if (group[i-1] >> shift) & 0xFFFFFFFF == val:
                    print(f"    - 오른쪽 시프트 {shift}비트")
    
    # 가능한 플래그 형식
    possible_flags = [
        flag,
        f"FLAG{{{flag}}}",
        f"flag{{{flag}}}",
        f"HM{{{flag}}}"
    ]
    
    print("\n=== 가능한 플래그 형식 ===")
    for flag in possible_flags:
        print(flag)
    
    return possible_flags

def test_flag(flag):
    print(f"\n플래그 테스트: {flag}")
    # VM에 플래그를 6바이트씩 입력
    for i in range(0, len(flag), 6):
        chunk = flag[i:i+6].ljust(6, '\0')
        print(f"입력 청크: {chunk}")
        
        # 각 문자에 대한 연산 수행
        for j, c in enumerate(chunk):
            if j >= len(chunk) or c == '\0':
                break
            
            val = ord(c)
            print(f"  문자 {c} (0x{val:02x}):")
            
            # 연산 시뮬레이션
            r0 = val
            for op in ['ADD', 'MUL', 'DIV', 'BLS', 'BRS']:
                r0_old = r0
                if op == 'ADD':
                    r0 = (r0 + 6) & 0xFFFFFFFF
                elif op == 'MUL':
                    r0 = (r0 * 6) & 0xFFFFFFFF
                elif op == 'DIV':
                    if r0 != 0:
                        r0 = (r0 // 6) & 0xFFFFFFFF
                elif op == 'BLS':
                    r0 = (r0 << 6) & 0xFFFFFFFF
                elif op == 'BRS':
                    r0 = (r0 >> 6) & 0xFFFFFFFF
                print(f"    {op}: 0x{r0_old:08x} -> 0x{r0:08x}")

if __name__ == "__main__":
    flags = find_flag()
    for flag in flags:
        test_flag(flag) 