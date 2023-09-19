'''
/*
 * Decompiled with CFR 0.150.
 */
public class FlagPrinter {
    public static String flag = "FLAG{d0nt_y0u_just_l0v3_byt3_c0d3}";

    public static void main(String[] arrstring) {
        if (arrstring.length < 1) {
            System.out.print("You must provide the magic number as the first argument.");
            return;
        }
        if (!arrstring[0].equals("42")) {
            System.out.println("The magic number you provided is wrong. We don't give the key to non-wizards, sorry.");
            return;
        }
        System.out.print(flag);
    }
}
'''