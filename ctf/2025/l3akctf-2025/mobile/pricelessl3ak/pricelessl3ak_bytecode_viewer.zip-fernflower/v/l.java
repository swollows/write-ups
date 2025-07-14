package v;

public final class l {
   public static final l k;
   public final float a;
   public final float b;
   public final float c;
   public final float d;
   public final float e;
   public final float f;
   public final float[] g;
   public final float h;
   public final float i;
   public final float j;

   static {
      float[] var11 = v.b.c;
      float var6 = (float)((double)v.b.f() * 63.66197723675813 / 100.0);
      float[][] var12 = v.b.a;
      float var7 = var11[0];
      float[] var13 = var12[0];
      float var5 = var13[0];
      float var2 = var11[1];
      float var4 = var13[1];
      float var3 = var11[2];
      var4 = var13[2] * var3 + var4 * var2 + var5 * var7;
      var13 = var12[1];
      var5 = var13[0];
      float var8 = var13[1];
      var5 = var13[2] * var3 + var8 * var2 + var5 * var7;
      float[] var14 = var12[2];
      float var9 = var14[0];
      var8 = var14[1];
      var7 = var3 * var14[2] + var2 * var8 + var7 * var9;
      if ((double)1.0F >= 0.9) {
         var3 = 0.69F;
      } else {
         var3 = 0.655F;
      }

      var2 = (1.0F - (float)Math.exp((double)((-var6 - 42.0F) / 92.0F)) * 0.2777778F) * 1.0F;
      double var0 = (double)var2;
      if (var0 > 1.0) {
         var2 = 1.0F;
      } else if (var0 < 0.0) {
         var2 = 0.0F;
      }

      var8 = 100.0F / var4;
      float var10 = 100.0F / var5;
      var9 = 100.0F / var7;
      var14 = new float[]{var8 * var2 + 1.0F - var2, var10 * var2 + 1.0F - var2, var9 * var2 + 1.0F - var2};
      var2 = 1.0F / (5.0F * var6 + 1.0F);
      var2 = var2 * var2 * var2 * var2;
      var8 = 1.0F - var2;
      var8 = 0.1F * var8 * var8 * (float)Math.cbrt((double)var6 * 5.0) + var2 * var6;
      var2 = v.b.f() / var11[1];
      var0 = (double)var2;
      var6 = (float)Math.sqrt(var0);
      var9 = 0.725F / (float)Math.pow(var0, 0.2);
      var4 = (float)Math.pow((double)(var14[0] * var8 * var4) / 100.0, 0.42);
      var5 = (float)Math.pow((double)(var14[1] * var8 * var5) / 100.0, 0.42);
      var7 = (float)Math.pow((double)(var14[2] * var8 * var7) / 100.0, 0.42);
      var11 = new float[]{var4, var5, var7};
      var4 = var11[0];
      var4 = var4 * 400.0F / (var4 + 27.13F);
      var5 = var11[1];
      var5 = var5 * 400.0F / (var5 + 27.13F);
      var7 = var11[2];
      var7 = 400.0F * var7 / (var7 + 27.13F);
      var11 = new float[]{var4, var5, var7};
      var5 = var11[0];
      var4 = var11[1];
      k = new l(var2, (var11[2] * 0.05F + var5 * 2.0F + var4) * var9, var9, var9, var3, 1.0F, var14, var8, (float)Math.pow((double)var8, 0.25), var6 + 1.48F);
   }

   public l(float var1, float var2, float var3, float var4, float var5, float var6, float[] var7, float var8, float var9, float var10) {
      this.f = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
      this.g = var7;
      this.h = var8;
      this.i = var9;
      this.j = var10;
   }
}
