package androidx.lifecycle;

public abstract class m {
   public static final int[] a;

   static {
      int[] var0 = new int[n.values().length];

      try {
         var0[n.ON_CREATE.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         var0[n.ON_STOP.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         var0[n.ON_START.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var0[n.ON_PAUSE.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      try {
         var0[n.ON_RESUME.ordinal()] = 5;
      } catch (NoSuchFieldError var4) {
      }

      try {
         var0[n.ON_DESTROY.ordinal()] = 6;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[n.ON_ANY.ordinal()] = 7;
      } catch (NoSuchFieldError var2) {
      }

      a = var0;
   }
}
