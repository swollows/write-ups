package D;

import J.b;
import P.f;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import java.io.Serializable;

public class z implements A, f {
   public static z b;
   public final int a;

   // $FF: synthetic method
   public z(int var1) {
      this.a = var1;
   }

   public static boolean d(b var0, Editable var1, int var2, int var3, boolean var4) {
      boolean var11 = false;
      boolean var10 = var11;
      if (var1 != null) {
         var10 = var11;
         if (var2 >= 0) {
            if (var3 < 0) {
               var10 = var11;
            } else {
               int var6 = Selection.getSelectionStart(var1);
               int var8 = Selection.getSelectionEnd(var1);
               var10 = var11;
               if (var6 != -1) {
                  var10 = var11;
                  if (var8 != -1) {
                     if (var6 != var8) {
                        var10 = var11;
                     } else {
                        int var7;
                        int var9;
                        if (var4) {
                           char var5;
                           boolean var14;
                           label125: {
                              var7 = Math.max(var2, 0);
                              var2 = var1.length();
                              if (var6 >= 0 && var2 >= var6) {
                                 var2 = var6;
                                 var6 = var7;
                                 if (var7 >= 0) {
                                    label121:
                                    while(true) {
                                       var14 = false;

                                       while(true) {
                                          if (var6 == 0) {
                                             break label125;
                                          }

                                          --var2;
                                          if (var2 < 0) {
                                             if (!var14) {
                                                var2 = 0;
                                                break label125;
                                             }
                                             break label121;
                                          }

                                          var5 = var1.charAt(var2);
                                          if (var14) {
                                             if (!Character.isHighSurrogate(var5)) {
                                                break label121;
                                             }

                                             --var6;
                                             break;
                                          }

                                          if (!Character.isSurrogate(var5)) {
                                             --var6;
                                          } else {
                                             if (Character.isHighSurrogate(var5)) {
                                                break label121;
                                             }

                                             var14 = true;
                                          }
                                       }
                                    }
                                 }
                              }

                              var2 = -1;
                           }

                           label100: {
                              var7 = Math.max(var3, 0);
                              var9 = var1.length();
                              if (var8 >= 0 && var9 >= var8) {
                                 var3 = var8;
                                 var6 = var7;
                                 if (var7 >= 0) {
                                    label96:
                                    while(true) {
                                       var14 = false;

                                       while(true) {
                                          if (var6 == 0) {
                                             break label100;
                                          }

                                          if (var3 >= var9) {
                                             var3 = var9;
                                             if (!var14) {
                                                break label100;
                                             }
                                             break label96;
                                          }

                                          var5 = var1.charAt(var3);
                                          if (var14) {
                                             if (!Character.isLowSurrogate(var5)) {
                                                break label96;
                                             }

                                             --var6;
                                             ++var3;
                                             break;
                                          }

                                          if (!Character.isSurrogate(var5)) {
                                             --var6;
                                             ++var3;
                                          } else {
                                             if (Character.isLowSurrogate(var5)) {
                                                break label96;
                                             }

                                             ++var3;
                                             var14 = true;
                                          }
                                       }
                                    }
                                 }
                              }

                              var3 = -1;
                           }

                           var10 = var11;
                           if (var2 == -1) {
                              return var10;
                           }

                           var6 = var3;
                           if (var3 == -1) {
                              var10 = var11;
                              return var10;
                           }
                        } else {
                           var2 = Math.max(var6 - var2, 0);
                           var6 = Math.min(var8 + var3, var1.length());
                        }

                        H.A[] var12 = (H.A[])var1.getSpans(var2, var6, H.A.class);
                        var10 = var11;
                        if (var12 != null) {
                           var10 = var11;
                           if (var12.length > 0) {
                              var7 = var12.length;

                              for(var3 = 0; var3 < var7; ++var3) {
                                 H.A var13 = var12[var3];
                                 var9 = var1.getSpanStart(var13);
                                 var8 = var1.getSpanEnd(var13);
                                 var2 = Math.min(var9, var2);
                                 var6 = Math.max(var8, var6);
                              }

                              var2 = Math.max(var2, 0);
                              var3 = Math.min(var6, var1.length());
                              var0.beginBatchEdit();
                              var1.delete(var2, var3);
                              var0.endBatchEdit();
                              var10 = true;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var10;
   }

   private final void f() {
   }

   private final void g(int var1, Serializable var2) {
   }

   public void a(int var1, int var2, int var3, boolean var4) {
   }

   public void b(int var1, int var2, int var3, int var4) {
   }

   public Signature[] c(PackageManager var1, String var2) {
      return var1.getPackageInfo(var2, 64).signatures;
   }

   public boolean e(CharSequence var1) {
      return false;
   }

   public void m(int var1, Serializable var2) {
      switch (this.a) {
         default:
            String var3;
            switch (var1) {
               case 1:
                  var3 = "RESULT_INSTALL_SUCCESS";
                  break;
               case 2:
                  var3 = "RESULT_ALREADY_INSTALLED";
                  break;
               case 3:
                  var3 = "RESULT_UNSUPPORTED_ART_VERSION";
                  break;
               case 4:
                  var3 = "RESULT_NOT_WRITABLE";
                  break;
               case 5:
                  var3 = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                  break;
               case 6:
                  var3 = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                  break;
               case 7:
                  var3 = "RESULT_IO_EXCEPTION";
                  break;
               case 8:
                  var3 = "RESULT_PARSE_EXCEPTION";
                  break;
               case 9:
               default:
                  var3 = "";
                  break;
               case 10:
                  var3 = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                  break;
               case 11:
                  var3 = "RESULT_DELETE_SKIP_FILE_SUCCESS";
            }

            if (var1 != 6 && var1 != 7 && var1 != 8) {
               Log.d("ProfileInstaller", var3);
            } else {
               Log.e("ProfileInstaller", var3, (Throwable)var2);
            }
         case 9:
      }
   }

   public void p() {
      switch (this.a) {
         default:
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
         case 9:
      }
   }
}
