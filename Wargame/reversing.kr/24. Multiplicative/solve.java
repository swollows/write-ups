class test {
    public static void main(String[] args) {
        long answer = -1536092243306511225L;
        long multiplier = 26729L;

        long maxValue = 9223372036854775807L;
        long defaultValue = 7687279793548264584L;
        long originalValue, flag;
        
        for(int i=0;; i+=2) {
            originalValue = maxValue * i + defaultValue + (i-1);

            System.out.println(i);
            System.out.println(originalValue);
            System.out.println(originalValue % multiplier);

            if(originalValue == answer && originalValue % multiplier == 0) {
                System.out.println("maxValue : " + maxValue);
                System.out.println("multiply count : " + i);
                break;
            }
        }
    }
}