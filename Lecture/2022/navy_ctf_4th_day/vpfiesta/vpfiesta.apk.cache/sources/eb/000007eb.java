package com.ctf.vpfiesta;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ctf.vpfiesta.e */
/* loaded from: classes.dex */
public class C0435e {

    /* renamed from: a */
    public static byte[] f90a = ActivityC0433a.m2x("RK<>^YLR{d~edcjR", 13).getBytes();

    /* renamed from: b */
    public static byte[] f91b = ActivityC0433a.m2x("89:;<=>?010?>=<;", 8).getBytes();

    /* renamed from: e */
    public static String m0e(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f91b);
            SecretKeySpec secretKeySpec = new SecretKeySpec(f90a, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return Base64.encodeToString(cipher.doFinal(bytes), 8);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: d */
    public static String m1d(String str) {
        try {
            byte[] decode = Base64.decode(str, 8);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f91b);
            SecretKeySpec secretKeySpec = new SecretKeySpec(f90a, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(decode), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }
}