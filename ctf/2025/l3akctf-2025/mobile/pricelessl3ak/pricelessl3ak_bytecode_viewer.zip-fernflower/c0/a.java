package c0;

public enum a {
   a;

   public static final a[] b;

   static {
      Enum var0 = new Enum("COROUTINE_SUSPENDED", 0);
      a = var0;
      b = new a[]{var0, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
   }
}
