package A;

import C.b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class f {
   public static final m.j a = new m.j(2);
   public static final d b = new Object();

   public static l a(Context var0, List var1) {
      C.b.d("FontProvider.getFontFamilyResult");

      Throwable var10000;
      label300: {
         ArrayList var3;
         boolean var10001;
         try {
            var3 = new ArrayList();
         } catch (Throwable var35) {
            var10000 = var35;
            var10001 = false;
            break label300;
         }

         int var2 = 0;

         l var36;
         while(true) {
            g var4;
            ProviderInfo var5;
            try {
               if (var2 >= var1.size()) {
                  break;
               }

               var4 = (g)var1.get(var2);
               var5 = b(var0.getPackageManager(), var4, var0.getResources());
            } catch (Throwable var34) {
               var10000 = var34;
               var10001 = false;
               break label300;
            }

            if (var5 == null) {
               try {
                  var36 = new l();
               } catch (Throwable var31) {
                  var10000 = var31;
                  var10001 = false;
                  break label300;
               }

               Trace.endSection();
               return var36;
            }

            try {
               var3.add(c(var0, var4, var5.authority));
            } catch (Throwable var33) {
               var10000 = var33;
               var10001 = false;
               break label300;
            }

            ++var2;
         }

         try {
            var36 = new l(var3);
         } catch (Throwable var32) {
            var10000 = var32;
            var10001 = false;
            break label300;
         }

         Trace.endSection();
         return var36;
      }

      Throwable var37 = var10000;
      Trace.endSection();
      throw var37;
   }

   public static ProviderInfo b(PackageManager var0, g var1, Resources var2) {
      C.b.d("FontProvider.getProvider");

      label1704: {
         Throwable var10000;
         label1708: {
            List var5;
            boolean var10001;
            try {
               var5 = var1.d;
            } catch (Throwable var187) {
               var10000 = var187;
               var10001 = false;
               break label1708;
            }

            String var6 = var1.a;
            String var7 = var1.b;
            List var194;
            if (var5 != null) {
               var194 = var5;
            } else {
               try {
                  var194 = v.b.d(var2, 0);
               } catch (Throwable var186) {
                  var10000 = var186;
                  var10001 = false;
                  break label1708;
               }
            }

            e var197;
            try {
               var197 = new e();
               var197.a = var6;
               var197.b = var7;
               var197.c = var194;
            } catch (Throwable var185) {
               var10000 = var185;
               var10001 = false;
               break label1708;
            }

            m.j var195 = a;

            ProviderInfo var8;
            try {
               var8 = (ProviderInfo)var195.a(var197);
            } catch (Throwable var184) {
               var10000 = var184;
               var10001 = false;
               break label1708;
            }

            if (var8 != null) {
               Trace.endSection();
               return var8;
            }

            try {
               var8 = var0.resolveContentProvider(var6, 0);
            } catch (Throwable var183) {
               var10000 = var183;
               var10001 = false;
               break label1708;
            }

            StringBuilder var196;
            PackageManager.NameNotFoundException var191;
            if (var8 == null) {
               label1647:
               try {
                  var196 = new StringBuilder("No package found for authority: ");
                  var196.append(var6);
                  var191 = new PackageManager.NameNotFoundException(var196.toString());
                  throw var191;
               } catch (Throwable var180) {
                  var10000 = var180;
                  var10001 = false;
                  break label1647;
               }
            } else {
               label1711: {
                  ArrayList var192;
                  int var4;
                  Signature[] var198;
                  label1698: {
                     try {
                        if (var8.packageName.equals(var7)) {
                           var198 = var0.getPackageInfo(var8.packageName, 64).signatures;
                           var192 = new ArrayList();
                           var4 = var198.length;
                           break label1698;
                        }
                     } catch (Throwable var190) {
                        var10000 = var190;
                        var10001 = false;
                        break label1711;
                     }

                     try {
                        var196 = new StringBuilder("Found content provider ");
                        var196.append(var6);
                        var196.append(", but package was not ");
                        var196.append(var7);
                        var191 = new PackageManager.NameNotFoundException(var196.toString());
                        throw var191;
                     } catch (Throwable var179) {
                        var10000 = var179;
                        var10001 = false;
                        break label1711;
                     }
                  }

                  int var3;
                  for(var3 = 0; var3 < var4; ++var3) {
                     try {
                        var192.add(var198[var3].toByteArray());
                     } catch (Throwable var182) {
                        var10000 = var182;
                        var10001 = false;
                        break label1711;
                     }
                  }

                  d var200 = b;

                  try {
                     Collections.sort(var192, var200);
                  } catch (Throwable var181) {
                     var10000 = var181;
                     var10001 = false;
                     break label1711;
                  }

                  var3 = 0;

                  label1683:
                  while(true) {
                     label1710: {
                        ArrayList var199;
                        try {
                           if (var3 >= var194.size()) {
                              break label1704;
                           }

                           var199 = new ArrayList((Collection)var194.get(var3));
                           Collections.sort(var199, var200);
                           if (var192.size() != var199.size()) {
                              break label1710;
                           }
                        } catch (Throwable var189) {
                           var10000 = var189;
                           var10001 = false;
                           break label1711;
                        }

                        var4 = 0;

                        while(true) {
                           try {
                              if (var4 >= var192.size()) {
                                 break label1683;
                              }

                              if (!Arrays.equals((byte[])var192.get(var4), (byte[])var199.get(var4))) {
                                 break;
                              }
                           } catch (Throwable var188) {
                              var10000 = var188;
                              var10001 = false;
                              break label1711;
                           }

                           ++var4;
                        }
                     }

                     ++var3;
                  }

                  try {
                     var195.b(var197, var8);
                  } catch (Throwable var178) {
                     var10000 = var178;
                     var10001 = false;
                     break label1711;
                  }

                  Trace.endSection();
                  return var8;
               }
            }
         }

         Throwable var193 = var10000;
         Trace.endSection();
         throw var193;
      }

      Trace.endSection();
      return null;
   }

   public static m[] c(Context param0, g param1, String param2) {
      // $FF: Couldn't be decompiled
   }
}
