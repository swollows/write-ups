import java.io.*;
import java.nio.*;
import java.security.MessageDigest;
import java.util.*;

public class DirectTest {
    
    // v27a8612b 클래스 구현
    static class v27a8612b {
        public final int a, b, c, d;
        
        public v27a8612b(int d, int a, int c, int b) {
            this.d = d;
            this.a = a; 
            this.c = c;
            this.b = b;
        }
        
        @Override
        public String toString() {
            return String.format("v27a8612b(d=%d, a=%d, c=%d, b=%d)", d, a, c, b);
        }
    }
    
    // i.parse() 메소드 구현
    public static byte[] parse(byte[] data, long key) {
        byte[] result = data.clone();
        
        // 1. XOR with previous byte (reverse order)
        for (int i = result.length - 1; i >= 1; i--) {
            result[i] ^= result[i - 1];
        }
        
        // 2. Bit rotation
        for (int i = 0; i < result.length; i++) {
            int rotation = (i % 7) + 1;
            int byteVal = result[i] & 0xFF;
            result[i] = (byte)(((byteVal << (8 - rotation)) | (byteVal >>> rotation)) & 0xFF);
        }
        
        // 3. Arithmetic subtraction
        for (int i = 0; i < result.length; i++) {
            int keyByte = (int)(key & 0xFF);
            result[i] = (byte)((result[i] - ((i * 19 + keyByte) & 0xFF)) & 0xFF);
        }
        
        // 4. XOR with key bytes from different positions
        for (int i = 0; i < result.length; i++) {
            int shiftAmount = (i % 4) * 8;
            int keyByte = (int)((key >> shiftAmount) & 0xFF);
            result[i] ^= keyByte;
        }
        
        return result;
    }
    
    // i.read() 메소드 구현
    public static ArrayList<v27a8612b> read(byte[] data) throws Exception {
        ArrayList<v27a8612b> objects = new ArrayList<>();
        ByteBuffer buffer = ByteBuffer.wrap(data);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        
        while (buffer.remaining() >= 7) {
            int byte1 = buffer.get() & 0xFF;
            int byte2 = buffer.get() & 0xFF;
            int byte3 = buffer.get() & 0xFF;
            int intVal = buffer.getInt();
            
            objects.add(new v27a8612b(byte1, byte2, byte3, intVal));
        }
        
        if (objects.isEmpty()) {
            throw new Exception("No objects parsed");
        }
        
        return objects;
    }
    
    // 플래그 형식 확인
    public static String checkFlag(byte[] data) {
        try {
            String text = new String(data, "UTF-8");
            if (text.contains("L3AK{")) {
                return text;
            }
        } catch (Exception e) {}
        
        try {
            String text = new String(data, "ISO-8859-1");
            if (text.contains("L3AK{")) {
                return text;
            }
        } catch (Exception e) {}
        
        return null;
    }
    
    // SHA256 해시 계산
    public static String calculateSHA256(String text) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(text.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            return "";
        }
    }
    
    public static void main(String[] args) {
        try {
            // data.enc 파일 읽기
            FileInputStream fis = new FileInputStream("ctf/2025/l3akctf-2025/mobile/pricelessl3ak/resources/assets/data.enc");
            byte[] encryptedData = fis.readAllBytes();
            fis.close();
            
            System.out.println("암호화된 데이터 크기: " + encryptedData.length + " bytes");
            
            String targetHash = "f3bdd9f68a198756b96c5cf8207db63a11507e50fb0d29be609ff678ef721935";
            
            // 테스트할 키 값들
            long[] testKeys = {
                // Android Intent flags
                0x10000000L, 0x20000000L, 0x40000000L, 0x80000000L,
                0x01000000L, 0x02000000L, 0x04000000L, 0x08000000L,
                0x00100000L, 0x00200000L, 0x00400000L, 0x00800000L,
                0x00010000L, 0x00020000L, 0x00040000L, 0x00080000L,
                0x00001000L, 0x00002000L, 0x00004000L, 0x00008000L,
                0x00000100L, 0x00000200L, 0x00000400L, 0x00000800L,
                0x00000010L, 0x00000020L, 0x00000040L, 0x00000080L,
                0x00000001L, 0x00000002L, 0x00000004L, 0x00000008L,
                
                // 특별한 값들
                0L, 1L, 2L, 3L, 1337L, 4919L, 4920L, 4921L, 2025L,
                0xDEADBEEFL, 0xCAFEBABEL, 0xFEEDFACEL, 0xDEADC0DEL
            };
            
            for (long key : testKeys) {
                try {
                    System.out.printf("테스트 키: %d (0x%x)\n", key, key);
                    
                    // h1832fla12의 핵심 로직 실행
                    byte[] decrypted = parse(encryptedData, key);
                    ArrayList<v27a8612b> objects = read(decrypted);
                    
                    System.out.println("파싱된 객체 수: " + objects.size());
                    
                    // 전체 복호화된 데이터에서 플래그 찾기
                    String flag = checkFlag(decrypted);
                    if (flag != null && flag.contains("L3AK{")) {
                        System.out.println("=== 플래그 발견! ===");
                        System.out.println("플래그: " + flag);
                        String hash = calculateSHA256(flag);
                        System.out.println("해시: " + hash);
                        System.out.println("타겟: " + targetHash);
                        System.out.println("매치: " + hash.equals(targetHash));
                        if (hash.equals(targetHash)) {
                            System.out.println("🎉 정답입니다! 🎉");
                            return;
                        }
                    }
                    
                    // 각 객체에서 플래그 찾기
                    for (int i = 0; i < Math.min(objects.size(), 10); i++) {
                        v27a8612b obj = objects.get(i);
                        
                        // int 값을 바이트로 변환해서 확인
                        byte[] intBytes = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(obj.b).array();
                        String objFlag = checkFlag(intBytes);
                        if (objFlag != null && objFlag.contains("L3AK{")) {
                            System.out.println("=== 객체에서 플래그 발견! ===");
                            System.out.println("객체: " + obj);
                            System.out.println("플래그: " + objFlag);
                            String hash = calculateSHA256(objFlag);
                            if (hash.equals(targetHash)) {
                                System.out.println("🎉 정답입니다! 🎉");
                                return;
                            }
                        }
                    }
                    
                } catch (Exception e) {
                    System.out.println("키 " + key + " 실패: " + e.getMessage());
                }
                System.out.println("---");
            }
            
            // 작은 범위 브루트포스
            System.out.println("작은 범위 브루트포스 시작...");
            for (long key = 0; key < 10000; key++) {
                if (key % 1000 == 0) {
                    System.out.println("진행상황: " + key + "/10000");
                }
                
                try {
                    byte[] decrypted = parse(encryptedData, key);
                    ArrayList<v27a8612b> objects = read(decrypted);
                    
                    String flag = checkFlag(decrypted);
                    if (flag != null && flag.contains("L3AK{")) {
                        String hash = calculateSHA256(flag);
                        if (hash.equals(targetHash)) {
                            System.out.println("🎉 브루트포스로 정답 발견! 🎉");
                            System.out.printf("키: %d (0x%x)\n", key, key);
                            System.out.println("플래그: " + flag);
                            return;
                        }
                    }
                } catch (Exception e) {
                    // 무시
                }
            }
            
            System.out.println("플래그를 찾지 못했습니다.");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} 