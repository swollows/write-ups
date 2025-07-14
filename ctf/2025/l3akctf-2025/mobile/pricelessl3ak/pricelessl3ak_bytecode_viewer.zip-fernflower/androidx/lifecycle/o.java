package androidx.lifecycle;

public enum o {
   a,
   b,
   c,
   d,
   e;

   public static final o[] f;

   static {
      Enum var3 = new Enum("DESTROYED", 0);
      a = var3;
      Enum var4 = new Enum("INITIALIZED", 1);
      b = var4;
      Enum var0 = new Enum("CREATED", 2);
      c = var0;
      Enum var2 = new Enum("STARTED", 3);
      d = var2;
      Enum var1 = new Enum("RESUMED", 4);
      e = var1;
      f = new o[]{var3, var4, var0, var2, var1};
   }
}
