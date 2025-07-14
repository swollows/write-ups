package androidx.core.widget;

public final class a {
   public int a;
   public int b;
   public float c;
   public float d;
   public long e;
   public long f;
   public long g;
   public float h;
   public int i;

   public final float a(long var1) {
      long var6 = this.e;
      if (var1 < var6) {
         return 0.0F;
      } else {
         long var4 = this.g;
         if (var4 >= 0L && var1 >= var4) {
            float var3 = this.h;
            return androidx.core.widget.d.b((float)(var1 - var4) / (float)this.i, 0.0F, 1.0F) * var3 + (1.0F - var3);
         } else {
            return androidx.core.widget.d.b((float)(var1 - var6) / (float)this.a, 0.0F, 1.0F) * 0.5F;
         }
      }
   }
}
