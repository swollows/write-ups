package X;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import ctf.l3akctf.pricelessl3ak.a0da01;
import ctf.l3akctf.pricelessl3ak.c9a7d02a;
import ctf.l3akctf.pricelessl3ak.da012da;
import ctf.l3akctf.pricelessl3ak.p2a1672ac;
import ctf.l3akctf.pricelessl3ak.v1289a0d;
import ctf.l3akctf.pricelessl3ak.v27a8612b;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class f extends Handler {
   public Context a;

   public static v1289a0d a(List var0, String var1) {
      int[] var11 = new int[16];
      Object var13 = new Object();
      ((a0da01)var13).a = (int[])var11.clone();
      boolean var9 = false;
      ((a0da01)var13).b = false;
      ((a0da01)var13).c = false;
      Object var12 = new Object();
      ((da012da)var12).a = (int[])var11.clone();
      ((da012da)var12).b = new HashMap();
      ((da012da)var12).c = var1;
      ((da012da)var12).d = new ArrayList();
      ((da012da)var12).e = 30;
      Object var15 = new Object();
      ((c9a7d02a)var15).a = false;
      ((c9a7d02a)var15).b = false;
      ((c9a7d02a)var15).c = 0;
      int var4 = 0;

      boolean var8;
      while(true) {
         int var2 = var0.size();
         boolean var10 = true;
         if (var4 >= var2) {
            break;
         }

         v27a8612b var17 = (v27a8612b)var0.get(var4);
         int var7 = var17.a;
         int[] var14 = (int[])((da012da)var12).a.clone();
         int var6 = var17.c;
         var2 = var17.d;
         int var3;
         if (var6 != 0) {
            var3 = var14[var6];
         } else {
            var3 = var2;
         }

         label157: {
            int var5 = var17.b;
            if (var7 >= 16 && var7 <= 40) {
               var11 = (int[])var14.clone();
               ((a0da01)var13).a = var11;
               if (var7 != 20) {
                  switch (var7) {
                     case 16:
                        var11[var5] += var3;
                        break;
                     case 17:
                        var11[var5] -= var3;
                        break;
                     case 18:
                        var11[var5] = (int)((long)var11[var5] * (long)var3 & 4294967295L);
                        break;
                     default:
                        switch (var7) {
                           case 32:
                              var11[var5] &= var3;
                              break;
                           case 33:
                              var11[var5] |= var3;
                              break;
                           case 34:
                              var11[var5] ^= var3;
                              break;
                           case 35:
                              var11[var5] = ~var11[var5];
                              break;
                           default:
                              switch (var7) {
                                 case 38:
                                    var3 = var2 % 8;
                                    var2 = var11[var5] & 255;
                                    var11[var5] = (var2 >> 8 - var3 | var2 << var3 & 255) & 255;
                                    break;
                                 case 39:
                                    var2 %= 8;
                                    var3 = var11[var5] & 255;
                                    var11[var5] = (var3 << 8 - var2 & 255 | var3 >> var2) & 255;
                                    break;
                                 case 40:
                                    boolean var16;
                                    if (var6 != 0) {
                                       var16 = true;
                                    } else {
                                       var16 = false;
                                    }

                                    var5 = var11[var5];
                                    if (var16) {
                                       var2 = var11[var6];
                                    }

                                    if ((long)var5 - (long)var2 == 0L) {
                                       var8 = true;
                                    } else {
                                       var8 = false;
                                    }

                                    ((a0da01)var13).b = var8;
                                    if (var5 < var2) {
                                       var8 = var10;
                                    } else {
                                       var8 = false;
                                    }

                                    ((a0da01)var13).c = var8;
                              }
                        }
                  }
               } else if (var3 != 0) {
                  var11[var5] %= var3;
               }

               ((da012da)var12).a = (int[])((int[])var11.clone()).clone();
               var8 = ((a0da01)var13).b;
               var10 = ((a0da01)var13).c;
               ((c9a7d02a)var15).a = var8;
               ((c9a7d02a)var15).b = var10;
            } else if ((var7 < 64 || var7 > 70) && var7 != 75) {
               if (var7 >= 48 && var7 <= 51) {
                  var11 = (int[])var14.clone();
                  ((da012da)var12).a = var11;
                  switch (var7) {
                     case 48:
                        var11[var5] = (Integer)((da012da)var12).b.getOrDefault(var2, var2 & 255);
                        break;
                     case 49:
                        if (var2 >= 4608 && var2 < ((da012da)var12).e + 4608) {
                           var3 = var11[var5];
                           ((da012da)var12).d.add(var3);
                        }

                        var3 = ((da012da)var12).a[var5];
                        ((da012da)var12).b.put(var2, var3 & 255);
                        break;
                     case 50:
                        String var18 = ((da012da)var12).c;
                        if (var2 < var18.length()) {
                           ((da012da)var12).a[var5] = var18.charAt(var2) & 255;
                        }
                        break;
                     case 51:
                        var11[var5] = var11[var6];
                  }

                  ((da012da)var12).a.clone();
               } else if (var7 == 112) {
                  break;
               }
            } else {
               label129: {
                  ((c9a7d02a)var15).c = var4;
                  var3 = var2;
                  switch (var7) {
                     case 64:
                        break label129;
                     case 65:
                        if (((c9a7d02a)var15).a) {
                           var3 = var2;
                           break label129;
                        }
                        break;
                     case 66:
                        if (!((c9a7d02a)var15).a) {
                           var3 = var2;
                           break label129;
                        }
                        break;
                     case 67:
                        if (((c9a7d02a)var15).b) {
                           var3 = var2;
                           break label129;
                        }
                        break;
                     case 68:
                        if (!((c9a7d02a)var15).a && !((c9a7d02a)var15).b) {
                           var3 = var2;
                           break label129;
                        }
                        break;
                     case 69:
                        var3 = var2;
                        if (((c9a7d02a)var15).a) {
                           break label129;
                        }

                        if (((c9a7d02a)var15).b) {
                           var3 = var2;
                           break label129;
                        }
                        break;
                     case 70:
                        if (!((c9a7d02a)var15).b) {
                           var3 = var2;
                           break label129;
                        }
                  }

                  var3 = var4 + 1;
               }

               if (var3 != var4 + 1) {
                  var2 = var3;
                  break label157;
               }
            }

            var2 = var4 + 1;
         }

         var4 = var2;
      }

      var8 = var9;
      if (((int[])((da012da)var12).a.clone())[14] == 1) {
         var8 = true;
      }

      return new v1289a0d(var8);
   }

   public static ArrayList d(byte[] var0) {
      StringBuilder var6 = null;

      Exception var10000;
      label44: {
         ByteBuffer var8;
         ArrayList var12;
         boolean var10001;
         try {
            if (var0.length < 7) {
               return null;
            }

            var8 = ByteBuffer.wrap(var0);
            var8.order(ByteOrder.LITTLE_ENDIAN);
            var12 = new ArrayList();
         } catch (Exception var10) {
            var10000 = var10;
            var10001 = false;
            break label44;
         }

         while(true) {
            try {
               if (var8.remaining() >= 7) {
                  byte var4 = var8.get();
                  byte var2 = var8.get();
                  byte var1 = var8.get();
                  int var3 = var8.getInt();
                  v27a8612b var7 = new v27a8612b(var4 & 255, var2 & 255, var1 & 255, var3);
                  var12.add(var7);
                  continue;
               }
            } catch (Exception var11) {
               var10000 = var11;
               var10001 = false;
               break;
            }

            boolean var5;
            try {
               var5 = var12.isEmpty();
            } catch (Exception var9) {
               var10000 = var9;
               var10001 = false;
               break;
            }

            if (var5) {
               var12 = var6;
            }

            return var12;
         }
      }

      Exception var13 = var10000;
      var6 = new StringBuilder("Failed");
      var6.append(var13.getMessage());
      Log.d("", var6.toString());
      return null;
   }

   public final ArrayList b(String var1) {
      Object var5 = null;

      ArrayList var15;
      label109: {
         int var2;
         boolean var10001;
         try {
            var2 = Math.abs(var1.hashCode()) % 5;
         } catch (Exception var13) {
            var10001 = false;
            break label109;
         }

         if (var2 != 0) {
            if (var2 != 1) {
               if (var2 != 2) {
                  if (var2 != 3) {
                     var1 = "27382asds982";
                  } else {
                     var1 = "as8d71aASAS";
                  }
               } else {
                  var1 = "7a879fa823as";
               }
            } else {
               var1 = "12789a712xa";
            }
         } else {
            var1 = "217sd87as";
         }

         byte var3 = 0;

         for(var2 = 0; var2 < 6; ++var2) {
            String var6;
            try {
               var6 = (new String[]{"217sd87as", var1, "12789a712xa", "7a879fa823as", "as8d71aASAS", "27382asds982"})[var2];
            } catch (Exception var11) {
               var10001 = false;
               break label109;
            }

            boolean var4;
            ArrayList var17;
            try {
               var17 = this.c(var6);
               var4 = var17.isEmpty();
            } catch (Exception var12) {
               continue;
            }

            if (!var4) {
               return var17;
            }
         }

         Exception var10000;
         label99: {
            byte[] var14;
            try {
               var14 = new byte[14];
            } catch (Exception var10) {
               var10000 = var10;
               var10001 = false;
               break label99;
            }

            for(var2 = var3; var2 < 14; ++var2) {
               try {
                  var14[var2] = (byte)((new byte[]{-104, -85, -86, -86, -86, -86, -86, -38, -86, -86, -86, -86, -86, -86})[var2] ^ 170);
               } catch (Exception var9) {
                  var10000 = var9;
                  var10001 = false;
                  break label99;
               }
            }

            try {
               var15 = d(var14);
               return var15;
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
            }
         }

         Exception var18 = var10000;

         try {
            StringBuilder var16 = new StringBuilder("Failed");
            var16.append(var18.getMessage());
            Log.d("", var16.toString());
         } catch (Exception var7) {
            var10001 = false;
            break label109;
         }

         var15 = (ArrayList)var5;
         return var15;
      }

      var15 = (ArrayList)var5;
      return var15;
   }

   public final ArrayList c(String var1) {
      ArrayList var2 = new ArrayList();
      InputStream var4 = this.a.getAssets().open(var1);
      byte[] var3 = new byte[var4.available()];
      var4.read(var3);
      var4.close();
      ByteBuffer var5 = ByteBuffer.wrap(var3);
      var5.order(ByteOrder.LITTLE_ENDIAN);

      while(var5.remaining() >= 7) {
         var2.add(new v27a8612b(var5.get() & 255, var5.get() & 255, var5.get() & 255, var5.getInt()));
      }

      return var2;
   }

   public final p2a1672ac e(p2a1672ac var1) {
      if (var1.a == 4919) {
         Exception var10000;
         Exception var18;
         label81: {
            String var3;
            boolean var10001;
            try {
               var3 = var1.b;
            } catch (Exception var10) {
               var10000 = var10;
               var10001 = false;
               break label81;
            }

            ArrayList var13;
            label86: {
               ArrayList var2 = var1.c;
               if (var2 != null) {
                  label85: {
                     try {
                        if (var2.isEmpty()) {
                           break label85;
                        }
                     } catch (Exception var12) {
                        var10000 = var12;
                        var10001 = false;
                        break label81;
                     }

                     var13 = var2;
                     break label86;
                  }
               }

               byte[] var14;
               try {
                  var14 = var1.d;
               } catch (Exception var9) {
                  var10000 = var9;
                  var10001 = false;
                  break label81;
               }

               if (var14 != null) {
                  try {
                     if (var14.length > 0) {
                        var13 = d(var14);
                        break label86;
                     }
                  } catch (Exception var11) {
                     var10000 = var11;
                     var10001 = false;
                     break label81;
                  }
               }

               try {
                  var13 = this.b(var3);
               } catch (Exception var8) {
                  var10000 = var8;
                  var10001 = false;
                  break label81;
               }
            }

            if (var13 != null) {
               try {
                  if (var13.isEmpty()) {
                     return null;
                  }
               } catch (Exception var7) {
                  var10000 = var7;
                  var10001 = false;
                  break label81;
               }

               byte[] var16;
               try {
                  v1289a0d var15 = a(var13, var3);
                  ByteBuffer var17 = ByteBuffer.allocate(4);
                  var17.order(ByteOrder.LITTLE_ENDIAN);
                  var17.put((byte)var15.a);
                  var16 = new byte[var17.position()];
                  var17.rewind();
                  var17.get(var16);
               } catch (Exception var6) {
                  var10000 = var6;
                  var10001 = false;
                  break label81;
               }

               try {
                  var1 = new p2a1672ac(4920, var16);
                  return var1;
               } catch (Exception var4) {
                  var18 = var4;
               }

               try {
                  var18.printStackTrace();
               } catch (Exception var5) {
                  var10000 = var5;
                  var10001 = false;
                  break label81;
               }
            }

            return null;
         }

         var18 = var10000;
         var18.printStackTrace();
      }

      return null;
   }

   public final void handleMessage(Message param1) {
      // $FF: Couldn't be decompiled
   }
}
