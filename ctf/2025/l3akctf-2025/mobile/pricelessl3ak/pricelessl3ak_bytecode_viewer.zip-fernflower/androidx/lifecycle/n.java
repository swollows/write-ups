package androidx.lifecycle;

public enum n {
   private static final e0.a $ENTRIES;
   private static final n[] $VALUES;
   public static final l Companion;
   ON_ANY,
   ON_CREATE,
   ON_DESTROY,
   ON_PAUSE,
   ON_RESUME,
   ON_START,
   ON_STOP;

   static {
      Enum var6 = new Enum("ON_CREATE", 0);
      ON_CREATE = var6;
      Enum var3 = new Enum("ON_START", 1);
      ON_START = var3;
      Enum var7 = new Enum("ON_RESUME", 2);
      ON_RESUME = var7;
      Enum var0 = new Enum("ON_PAUSE", 3);
      ON_PAUSE = var0;
      Enum var1 = new Enum("ON_STOP", 4);
      ON_STOP = var1;
      Enum var2 = new Enum("ON_DESTROY", 5);
      ON_DESTROY = var2;
      Enum var4 = new Enum("ON_ANY", 6);
      ON_ANY = var4;
      n[] var5 = new n[]{var6, var3, var7, var0, var1, var2, var4};
      $VALUES = var5;
      $ENTRIES = new e0.b(var5);
      Companion = (l)(new Object());
   }

   public final o a() {
      // $FF: Couldn't be decompiled
   }
}
