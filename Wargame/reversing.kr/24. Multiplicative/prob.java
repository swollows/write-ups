package p000;

/* renamed from: JavaCrackMe */
public class JavaCrackMe {
    public static final synchronized /* bridge */ /* synthetic */ void main(String... strArr) {
        synchronized (JavaCrackMe.class) {
            try {
                System.out.println("Reversing.Kr CrackMe!!");
                System.out.println("-----------------------------");
                System.out.println("The idea came out of the warsaw's crackme");
                System.out.println("-----------------------------\n");
                if (Long.decode(strArr[0]).longValue() * 26729 == -1536092243306511225L) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Wrong");
                }
            } catch (Exception e) {
                System.out.println("Please enter a 64bit signed int");
            }
        }
        return;
    }
}