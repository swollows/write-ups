package v;

import android.graphics.Color;

public final class a {
   public final float a;
   public final float b;
   public final float c;
   public final float d;
   public final float e;
   public final float f;

   public a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
   }

   public static a a(int var0) {
      l var19 = l.k;
      float var11 = v.b.b(Color.red(var0));
      float var9 = v.b.b(Color.green(var0));
      float var10 = v.b.b(Color.blue(var0));
      float[][] var20 = v.b.d;
      float[] var21 = var20[0];
      float var8 = var21[0];
      float var7 = var21[1];
      var7 = var21[2] * var10 + var7 * var9 + var8 * var11;
      var21 = var20[1];
      float var12 = var21[0];
      var8 = var21[1];
      var8 = var21[2] * var10 + var8 * var9 + var12 * var11;
      float[] var22 = var20[2];
      var12 = var22[0];
      float var13 = var22[1];
      var13 = var10 * var22[2] + var9 * var13 + var11 * var12;
      var20 = v.b.a;
      var21 = var20[0];
      var9 = var21[0];
      float var18 = var21[1];
      float var17 = var21[2];
      var21 = var20[1];
      float var15 = var21[0];
      float var16 = var21[1];
      var10 = var21[2];
      var22 = var20[2];
      var12 = var22[0];
      var11 = var22[1];
      float var14 = var22[2];
      var22 = var19.g;
      var9 = var22[0] * (var17 * var13 + var18 * var8 + var9 * var7);
      var10 = var22[1] * (var10 * var13 + var16 * var8 + var15 * var7);
      var8 = var22[2] * (var13 * var14 + var8 * var11 + var7 * var12);
      var11 = Math.abs(var9);
      var7 = var19.h;
      var13 = (float)Math.pow((double)(var11 * var7) / 100.0, 0.42);
      var12 = (float)Math.pow((double)(Math.abs(var10) * var7) / 100.0, 0.42);
      var11 = (float)Math.pow((double)(Math.abs(var8) * var7) / 100.0, 0.42);
      var7 = Math.signum(var9) * 400.0F * var13 / (var13 + 27.13F);
      var12 = Math.signum(var10) * 400.0F * var12 / (var12 + 27.13F);
      var8 = Math.signum(var8) * 400.0F * var11 / (var11 + 27.13F);
      double var1 = (double)var7;
      double var3 = (double)var12;
      double var5 = (double)var8;
      var10 = (float)(var3 * -12.0 + var1 * 11.0 + var5) / 11.0F;
      var9 = (float)((double)(var7 + var12) - var5 * 2.0) / 9.0F;
      var11 = var12 * 20.0F;
      var12 = (21.0F * var8 + var7 * 20.0F + var11) / 20.0F;
      var13 = (var7 * 40.0F + var11 + var8) / 20.0F;
      var8 = (float)Math.atan2((double)var9, (double)var10) * 180.0F / 3.1415927F;
      if (var8 < 0.0F) {
         var7 = var8 + 360.0F;
      } else {
         var7 = var8;
         if (var8 >= 360.0F) {
            var7 = var8 - 360.0F;
         }
      }

      var11 = 3.1415927F * var7 / 180.0F;
      var8 = var19.b;
      var14 = var19.a;
      var1 = (double)(var13 * var8 / var14);
      var15 = var19.d;
      var13 = (float)Math.pow(var1, (double)(var19.j * var15)) * 100.0F;
      Math.sqrt((double)(var13 / 100.0F));
      if ((double)var7 < 20.14) {
         var8 = 360.0F + var7;
      } else {
         var8 = var7;
      }

      var8 = (float)(Math.cos((double)var8 * Math.PI / 180.0 + 2.0) + 3.8) * 0.25F * 3846.1538F * var19.e * var19.c * (float)Math.sqrt((double)(var9 * var9 + var10 * var10)) / (var12 + 0.305F);
      var10 = (float)Math.pow(1.64 - Math.pow(0.29, (double)var19.f), 0.73) * (float)Math.pow((double)var8, 0.9);
      var8 = var10 * (float)Math.sqrt((double)var13 / 100.0);
      var9 = var19.i;
      Math.sqrt((double)(var10 * var15 / (var14 + 4.0F)));
      var10 = 1.7F * var13 / (0.007F * var13 + 1.0F);
      var9 = (float)Math.log((double)(var9 * var8 * 0.0228F + 1.0F)) * 43.85965F;
      var1 = (double)var11;
      return new a(var7, var8, var13, var10, var9 * (float)Math.cos(var1), var9 * (float)Math.sin(var1));
   }

   public static a b(float var0, float var1, float var2) {
      l var8 = l.k;
      float var5 = var8.d;
      double var3 = (double)var0 / 100.0;
      Math.sqrt(var3);
      var5 = var8.a;
      float var6 = var8.i;
      Math.sqrt((double)(var1 / (float)Math.sqrt(var3) * var8.d / (var5 + 4.0F)));
      var5 = 3.1415927F * var2 / 180.0F;
      float var7 = 1.7F * var0 / (0.007F * var0 + 1.0F);
      var6 = (float)Math.log((double)(var6 * var1) * 0.0228 + 1.0) * 43.85965F;
      var3 = (double)var5;
      return new a(var2, var1, var0, var7, var6 * (float)Math.cos(var3), var6 * (float)Math.sin(var3));
   }

   public final int c(l var1) {
      double var2;
      float var4;
      float var5;
      label13: {
         var4 = this.b;
         var2 = (double)var4;
         var5 = this.c;
         if (var2 != 0.0) {
            var2 = (double)var5;
            if (var2 != 0.0) {
               var4 /= (float)Math.sqrt(var2 / 100.0);
               break label13;
            }
         }

         var4 = 0.0F;
      }

      var4 = (float)Math.pow((double)var4 / Math.pow(1.64 - Math.pow(0.29, (double)var1.f), 0.73), 1.1111111111111112);
      var2 = (double)(this.a * 3.1415927F / 180.0F);
      float var6 = (float)(Math.cos(2.0 + var2) + 3.8);
      var5 = (float)Math.pow((double)var5 / 100.0, 1.0 / (double)var1.d / (double)var1.j);
      float var7 = var1.a;
      float var8 = var1.e;
      float var9 = var1.c;
      var5 = var7 * var5 / var1.b;
      var7 = (float)Math.sin(var2);
      float var10 = (float)Math.cos(var2);
      var6 = (0.305F + var5) * 23.0F * var4 / (var4 * 108.0F * var7 + 11.0F * var4 * var10 + var6 * 0.25F * 3846.1538F * var8 * var9 * 23.0F);
      var4 = var10 * var6;
      var8 = var6 * var7;
      var5 *= 460.0F;
      var6 = (288.0F * var8 + 451.0F * var4 + var5) / 1403.0F;
      var7 = (var5 - 891.0F * var4 - 261.0F * var8) / 1403.0F;
      var5 = (var5 - var4 * 220.0F - var8 * 6300.0F) / 1403.0F;
      var8 = (float)Math.max(0.0, (double)Math.abs(var6) * 27.13 / (400.0 - (double)Math.abs(var6)));
      var4 = Math.signum(var6);
      var6 = 100.0F / var1.h;
      var8 = (float)Math.pow((double)var8, 2.380952380952381);
      var9 = (float)Math.max(0.0, (double)Math.abs(var7) * 27.13 / (400.0 - (double)Math.abs(var7)));
      var7 = Math.signum(var7);
      var10 = (float)Math.pow((double)var9, 2.380952380952381);
      float var11 = (float)Math.max(0.0, (double)Math.abs(var5) * 27.13 / (400.0 - (double)Math.abs(var5)));
      var9 = Math.signum(var5);
      var11 = (float)Math.pow((double)var11, 2.380952380952381);
      float[] var17 = var1.g;
      var4 = var4 * var6 * var8 / var17[0];
      var5 = var7 * var6 * var10 / var17[1];
      float var13 = var9 * var6 * var11 / var17[2];
      float[][] var18 = v.b.b;
      float[] var16 = var18[0];
      var10 = var16[0];
      var11 = var16[1];
      var9 = var16[2];
      var16 = var18[1];
      float var14 = var16[0];
      float var12 = var16[1];
      var7 = var16[2];
      var17 = var18[2];
      float var15 = var17[0];
      var6 = var17[1];
      var8 = var17[2];
      return w.a.a((double)(var9 * var13 + var11 * var5 + var10 * var4), (double)(var7 * var13 + var12 * var5 + var14 * var4), (double)(var13 * var8 + var5 * var6 + var4 * var15));
   }
}
