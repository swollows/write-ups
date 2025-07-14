package P;

import D.z;
import android.content.Context;
import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public abstract class g {
   public static final z a = new z(9);
   public static final byte[] b = new byte[]{112, 114, 111, 0};
   public static final byte[] c = new byte[]{112, 114, 109, 0};
   public static final byte[] d = new byte[]{48, 49, 53, 0};
   public static final byte[] e = new byte[]{48, 49, 48, 0};
   public static final byte[] f = new byte[]{48, 48, 57, 0};
   public static final byte[] g = new byte[]{48, 48, 53, 0};
   public static final byte[] h = new byte[]{48, 48, 49, 0};
   public static final byte[] i = new byte[]{48, 48, 49, 0};
   public static final byte[] j = new byte[]{48, 48, 50, 0};

   public static byte[] a(byte[] var0) {
      Deflater var1 = new Deflater(1);
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();

      label298: {
         Throwable var46;
         Throwable var10000;
         label302: {
            DeflaterOutputStream var2;
            boolean var10001;
            try {
               var2 = new DeflaterOutputStream(var3, var1);
            } catch (Throwable var45) {
               var10000 = var45;
               var10001 = false;
               break label302;
            }

            try {
               var2.write(var0);
            } catch (Throwable var44) {
               var46 = var44;

               try {
                  var2.close();
               } catch (Throwable var42) {
                  Throwable var47 = var42;

                  label284:
                  try {
                     var46.addSuppressed(var47);
                     break label284;
                  } catch (Throwable var41) {
                     var10000 = var41;
                     var10001 = false;
                     break label302;
                  }
               }

               try {
                  throw var46;
               } catch (Throwable var40) {
                  var10000 = var40;
                  var10001 = false;
                  break label302;
               }
            }

            label291:
            try {
               var2.close();
               break label298;
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label291;
            }
         }

         var46 = var10000;
         var1.end();
         throw var46;
      }

      var1.end();
      return var3.toByteArray();
   }

   public static byte[] b(c[] var0, byte[] var1) {
      int var6 = var0.length;
      int var4 = 0;
      int var5 = 0;
      int var3 = 0;

      int var2;
      for(var2 = 0; var3 < var6; ++var3) {
         c var10 = var0[var3];
         int var9 = d(var10.a, var10.b, var1).getBytes(StandardCharsets.UTF_8).length;
         int var7 = var10.e;
         int var8 = var10.f;
         var2 += (var10.g * 2 + 7 & -8) / 8 + var7 * 2 + var9 + 16 + var8;
      }

      ByteArrayOutputStream var13 = new ByteArrayOutputStream(var2);
      c var11;
      if (Arrays.equals(var1, f)) {
         var4 = var0.length;

         for(var3 = var5; var3 < var4; ++var3) {
            var11 = var0[var3];
            q(var13, var11, d(var11.a, var11.b, var1));
            p(var13, var11);
         }
      } else {
         var5 = var0.length;

         for(var3 = 0; var3 < var5; ++var3) {
            var11 = var0[var3];
            q(var13, var11, d(var11.a, var11.b, var1));
         }

         var5 = var0.length;

         for(var3 = var4; var3 < var5; ++var3) {
            p(var13, var0[var3]);
         }
      }

      if (var13.size() == var2) {
         return var13.toByteArray();
      } else {
         StringBuilder var12 = new StringBuilder("The bytes saved do not match expectation. actual=");
         var12.append(var13.size());
         var12.append(" expected=");
         var12.append(var2);
         throw new IllegalStateException(var12.toString());
      }
   }

   public static boolean c(File var0) {
      if (!var0.isDirectory()) {
         var0.delete();
         return true;
      } else {
         File[] var4 = var0.listFiles();
         if (var4 == null) {
            return false;
         } else {
            int var2 = var4.length;
            int var1 = 0;

            boolean var3;
            for(var3 = true; var1 < var2; ++var1) {
               if (c(var4[var1]) && var3) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            return var3;
         }
      }
   }

   public static String d(String var0, String var1, byte[] var2) {
      byte[] var7 = h;
      boolean var3 = Arrays.equals(var2, var7);
      byte[] var6 = g;
      String var5 = "!";
      String var4;
      if (!var3 && !Arrays.equals(var2, var6)) {
         var4 = "!";
      } else {
         var4 = ":";
      }

      if (var0.length() <= 0) {
         if ("!".equals(var4)) {
            var0 = var1.replace(":", "!");
         } else {
            var0 = var1;
            if (":".equals(var4)) {
               var0 = var1.replace("!", ":");
            }
         }

         return var0;
      } else if (var1.equals("classes.dex")) {
         return var0;
      } else if (!var1.contains("!") && !var1.contains(":")) {
         if (var1.endsWith(".apk")) {
            return var1;
         } else {
            StringBuilder var8;
            label43: {
               var8 = new StringBuilder();
               var8.append(var0);
               if (!Arrays.equals(var2, var7)) {
                  var0 = var5;
                  if (!Arrays.equals(var2, var6)) {
                     break label43;
                  }
               }

               var0 = ":";
            }

            var8.append(var0);
            var8.append(var1);
            return var8.toString();
         }
      } else {
         if ("!".equals(var4)) {
            var0 = var1.replace(":", "!");
         } else {
            var0 = var1;
            if (":".equals(var4)) {
               var0 = var1.replace("!", ":");
            }
         }

         return var0;
      }
   }

   public static void e(PackageInfo var0, File var1) {
      File var3 = new File(var1, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");

      boolean var10001;
      DataOutputStream var23;
      try {
         FileOutputStream var2 = new FileOutputStream(var3);
         var23 = new DataOutputStream(var2);
      } catch (IOException var21) {
         var10001 = false;
         return;
      }

      try {
         var23.writeLong(var0.lastUpdateTime);
      } catch (Throwable var20) {
         Throwable var22 = var20;

         try {
            var23.close();
         } catch (Throwable var18) {
            Throwable var24 = var18;

            label116:
            try {
               var22.addSuppressed(var24);
               break label116;
            } catch (IOException var17) {
               var10001 = false;
               return;
            }
         }

         try {
            throw var22;
         } catch (IOException var16) {
            var10001 = false;
            return;
         }
      }

      try {
         var23.close();
      } catch (IOException var19) {
         var10001 = false;
      }

   }

   public static byte[] f(InputStream var0, int var1) {
      byte[] var4 = new byte[var1];

      int var3;
      for(int var2 = 0; var2 < var1; var2 += var3) {
         var3 = var0.read(var4, var2, var1 - var2);
         if (var3 < 0) {
            StringBuilder var5 = new StringBuilder("Not enough bytes to read: ");
            var5.append(var1);
            throw new IllegalStateException(var5.toString());
         }
      }

      return var4;
   }

   public static int[] g(ByteArrayInputStream var0, int var1) {
      int[] var4 = new int[var1];
      int var3 = 0;

      for(int var2 = 0; var3 < var1; ++var3) {
         var2 += (int)m(var0, 2);
         var4[var3] = var2;
      }

      return var4;
   }

   public static byte[] h(FileInputStream param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public static c[] i(FileInputStream var0, byte[] var1, byte[] var2, c[] var3) {
      byte[] var7 = i;
      int var4;
      long var5;
      ByteArrayInputStream var28;
      c[] var29;
      if (Arrays.equals(var1, var7)) {
         if (!Arrays.equals(d, var2)) {
            if (!Arrays.equals(var1, var7)) {
               throw new IllegalStateException("Unsupported meta version");
            } else {
               var4 = (int)m(var0, 1);
               var5 = m(var0, 4);
               var1 = h(var0, (int)m(var0, 4), (int)var5);
               if (var0.read() <= 0) {
                  var28 = new ByteArrayInputStream(var1);

                  try {
                     var29 = j(var28, var4, var3);
                  } catch (Throwable var25) {
                     try {
                        var28.close();
                     } catch (Throwable var24) {
                        var25.addSuppressed(var24);
                        throw var25;
                     }

                     throw var25;
                  }

                  var28.close();
                  return var29;
               } else {
                  throw new IllegalStateException("Content found after the end of file");
               }
            }
         } else {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
         }
      } else if (!Arrays.equals(var1, j)) {
         throw new IllegalStateException("Unsupported meta version");
      } else {
         var4 = (int)m(var0, 2);
         var5 = m(var0, 4);
         var1 = h(var0, (int)m(var0, 4), (int)var5);
         if (var0.read() <= 0) {
            var28 = new ByteArrayInputStream(var1);

            try {
               var29 = k(var28, var2, var4, var3);
            } catch (Throwable var27) {
               try {
                  var28.close();
               } catch (Throwable var26) {
                  var27.addSuppressed(var26);
                  throw var27;
               }

               throw var27;
            }

            var28.close();
            return var29;
         } else {
            throw new IllegalStateException("Content found after the end of file");
         }
      }
   }

   public static c[] j(ByteArrayInputStream var0, int var1, c[] var2) {
      int var3 = var0.available();
      byte var5 = 0;
      if (var3 == 0) {
         return new c[0];
      } else if (var1 != var2.length) {
         throw new IllegalStateException("Mismatched number of dex files found in metadata");
      } else {
         String[] var8 = new String[var1];
         int[] var6 = new int[var1];
         int var4 = 0;

         while(true) {
            var3 = var5;
            if (var4 >= var1) {
               while(var3 < var1) {
                  c var7 = var2[var3];
                  if (!var7.b.equals(var8[var3])) {
                     throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                  }

                  var4 = var6[var3];
                  var7.e = var4;
                  var7.h = g(var0, var4);
                  ++var3;
               }

               return var2;
            }

            var3 = (int)m(var0, 2);
            var6[var4] = (int)m(var0, 2);
            var8[var4] = new String(f(var0, var3), StandardCharsets.UTF_8);
            ++var4;
         }
      }
   }

   public static c[] k(ByteArrayInputStream var0, byte[] var1, int var2, c[] var3) {
      if (var0.available() == 0) {
         return new c[0];
      } else if (var2 != var3.length) {
         throw new IllegalStateException("Mismatched number of dex files found in metadata");
      } else {
         for(int var4 = 0; var4 < var2; ++var4) {
            m(var0, 2);
            String var12 = new String(f(var0, (int)m(var0, 2)), StandardCharsets.UTF_8);
            long var8 = m(var0, 4);
            int var7 = (int)m(var0, 2);
            int var5 = var3.length;
            Object var13 = null;
            c var10;
            if (var5 <= 0) {
               var10 = (c)var13;
            } else {
               int var6 = var12.indexOf("!");
               var5 = var6;
               if (var6 < 0) {
                  var5 = var12.indexOf(":");
               }

               String var11;
               if (var5 > 0) {
                  var11 = var12.substring(var5 + 1);
               } else {
                  var11 = var12;
               }

               var5 = 0;

               while(true) {
                  var10 = (c)var13;
                  if (var5 >= var3.length) {
                     break;
                  }

                  if (var3[var5].b.equals(var11)) {
                     var10 = var3[var5];
                     break;
                  }

                  ++var5;
               }
            }

            if (var10 == null) {
               throw new IllegalStateException("Missing profile key: ".concat(var12));
            }

            var10.d = var8;
            int[] var14 = g(var0, var7);
            if (Arrays.equals(var1, h)) {
               var10.e = var7;
               var10.h = var14;
            }
         }

         return var3;
      }
   }

   public static c[] l(FileInputStream var0, byte[] var1, String var2) {
      if (!Arrays.equals(var1, e)) {
         throw new IllegalStateException("Unsupported version");
      } else {
         int var3 = (int)m(var0, 1);
         long var4 = m(var0, 4);
         var1 = h(var0, (int)m(var0, 4), (int)var4);
         if (var0.read() <= 0) {
            ByteArrayInputStream var12 = new ByteArrayInputStream(var1);

            c[] var13;
            try {
               var13 = n(var12, var2, var3);
            } catch (Throwable var11) {
               try {
                  var12.close();
               } catch (Throwable var10) {
                  var11.addSuppressed(var10);
                  throw var11;
               }

               throw var11;
            }

            var12.close();
            return var13;
         } else {
            throw new IllegalStateException("Content found after the end of file");
         }
      }
   }

   public static long m(InputStream var0, int var1) {
      byte[] var5 = f(var0, var1);
      long var3 = 0L;

      for(int var2 = 0; var2 < var1; ++var2) {
         var3 += (long)(var5[var2] & 255) << var2 * 8;
      }

      return var3;
   }

   public static c[] n(ByteArrayInputStream var0, String var1, int var2) {
      if (var0.available() == 0) {
         return new c[0];
      } else {
         c[] var16 = new c[var2];

         int var3;
         int var4;
         int var5;
         for(var3 = 0; var3 < var2; ++var3) {
            var4 = (int)m(var0, 2);
            var5 = (int)m(var0, 2);
            long var9 = m(var0, 4);
            long var13 = m(var0, 4);
            long var11 = m(var0, 4);
            var16[var3] = new c(var1, new String(f(var0, var4), StandardCharsets.UTF_8), var13, var5, (int)var9, (int)var11, new int[var5], new TreeMap());
         }

         for(var4 = 0; var4 < var2; ++var4) {
            c var19 = var16[var4];
            int var8 = var0.available() - var19.f;
            var5 = 0;

            while(true) {
               var3 = var0.available();
               TreeMap var17 = var19.i;
               int var6;
               int var7;
               if (var3 <= var8) {
                  if (var0.available() != var8) {
                     throw new IllegalStateException("Read too much data during profile line parse");
                  }

                  var19.h = g(var0, var19.e);
                  var7 = var19.g;
                  BitSet var18 = BitSet.valueOf(f(var0, (var7 * 2 + 7 & -8) / 8));

                  for(var5 = 0; var5 < var7; ++var5) {
                     byte var21;
                     if (var18.get(var5)) {
                        var21 = 2;
                     } else {
                        var21 = 0;
                     }

                     var6 = var21;
                     if (var18.get(var5 + var7)) {
                        var6 = var21 | 4;
                     }

                     if (var6 != 0) {
                        Integer var15 = (Integer)var17.get(var5);
                        Integer var20 = var15;
                        if (var15 == null) {
                           var20 = 0;
                        }

                        var17.put(var5, var6 | var20);
                     }
                  }
                  break;
               }

               var7 = var5 + (int)m(var0, 2);
               var17.put(var7, 1);
               var3 = (int)m(var0, 2);

               while(true) {
                  var5 = var7;
                  if (var3 <= 0) {
                     break;
                  }

                  m(var0, 2);
                  var6 = (int)m(var0, 1);
                  if (var6 != 6) {
                     var5 = var6;
                     if (var6 != 7) {
                        while(var5 > 0) {
                           m(var0, 1);

                           for(var6 = (int)m(var0, 1); var6 > 0; --var6) {
                              m(var0, 2);
                           }

                           --var5;
                        }
                     }
                  }

                  --var3;
               }
            }
         }

         return var16;
      }
   }

   public static boolean o(ByteArrayOutputStream var0, byte[] var1, c[] var2) {
      byte[] var15 = d;
      int var3;
      int var4;
      int var5;
      int var6;
      if (Arrays.equals(var1, var15)) {
         ArrayList var1022 = new ArrayList(3);
         ArrayList var1018 = new ArrayList(3);
         ByteArrayOutputStream var1027 = new ByteArrayOutputStream();

         Throwable var10000;
         Throwable var1010;
         label11665: {
            boolean var10001;
            try {
               v(var1027, var2.length);
            } catch (Throwable var1009) {
               var10000 = var1009;
               var10001 = false;
               break label11665;
            }

            var4 = 0;
            var3 = 2;

            while(true) {
               try {
                  if (var4 >= var2.length) {
                     break;
                  }
               } catch (Throwable var1008) {
                  var10000 = var1008;
                  var10001 = false;
                  break label11665;
               }

               c var1028 = var2[var4];

               String var1030;
               Charset var17;
               try {
                  u(var1027, var1028.c, 4);
                  u(var1027, var1028.d, 4);
                  u(var1027, (long)var1028.g, 4);
                  var1030 = d(var1028.a, var1028.b, var15);
                  var17 = StandardCharsets.UTF_8;
                  var5 = var1030.getBytes(var17).length;
                  v(var1027, var5);
               } catch (Throwable var1007) {
                  var10000 = var1007;
                  var10001 = false;
                  break label11665;
               }

               var3 = var3 + 14 + var5;

               try {
                  var1027.write(var1030.getBytes(var17));
               } catch (Throwable var1006) {
                  var10000 = var1006;
                  var10001 = false;
                  break label11665;
               }

               ++var4;
            }

            try {
               var15 = var1027.toByteArray();
               var4 = var15.length;
            } catch (Throwable var1005) {
               var10000 = var1005;
               var10001 = false;
               break label11665;
            }

            StringBuilder var1011;
            IllegalStateException var1017;
            String var1021;
            if (var3 == var4) {
               label11667: {
                  m var1029;
                  try {
                     var1029 = new m(1, var15, false);
                  } catch (Throwable var1003) {
                     var10000 = var1003;
                     var10001 = false;
                     break label11667;
                  }

                  var1027.close();
                  var1022.add(var1029);
                  var1027 = new ByteArrayOutputStream();
                  var3 = 0;
                  var4 = 0;

                  while(true) {
                     var5 = 0;

                     c var1031;
                     label11669: {
                        label11670: {
                           label11689: {
                              try {
                                 if (var3 >= var2.length) {
                                    break label11689;
                                 }
                              } catch (Throwable var1002) {
                                 var10000 = var1002;
                                 var10001 = false;
                                 break label11670;
                              }

                              var1031 = var2[var3];

                              int var8;
                              int[] var1033;
                              try {
                                 v(var1027, var3);
                                 v(var1027, var1031.e);
                                 var6 = var4 + 4 + var1031.e * 2;
                                 var1033 = var1031.h;
                                 var8 = var1033.length;
                              } catch (Throwable var999) {
                                 var10000 = var999;
                                 var10001 = false;
                                 break label11670;
                              }

                              int var7;
                              for(var4 = 0; var5 < var8; var4 = var7) {
                                 var7 = var1033[var5];

                                 try {
                                    v(var1027, var7 - var4);
                                 } catch (Throwable var998) {
                                    var10000 = var998;
                                    var10001 = false;
                                    break label11670;
                                 }

                                 ++var5;
                              }

                              ++var3;
                              var4 = var6;
                              continue;
                           }

                           try {
                              var15 = var1027.toByteArray();
                              if (var4 == var15.length) {
                                 var1029 = new m(3, var15, true);
                                 break label11669;
                              }
                           } catch (Throwable var1001) {
                              var10000 = var1001;
                              var10001 = false;
                              break label11670;
                           }

                           label11582:
                           try {
                              var1011 = new StringBuilder();
                              var1011.append("Expected size ");
                              var1011.append(var4);
                              var1011.append(", does not match actual size ");
                              var1011.append(var15.length);
                              String var1012 = var1011.toString();
                              IllegalStateException var1019 = new IllegalStateException(var1012);
                              throw var1019;
                           } catch (Throwable var1000) {
                              var10000 = var1000;
                              var10001 = false;
                              break label11582;
                           }
                        }

                        var1010 = var10000;

                        try {
                           var1027.close();
                        } catch (Throwable var981) {
                           var1010.addSuppressed(var981);
                           throw var1010;
                        }

                        throw var1010;
                     }

                     var1027.close();
                     var1022.add(var1029);
                     var1027 = new ByteArrayOutputStream();
                     var4 = 0;
                     var3 = 0;

                     label11673: {
                        while(true) {
                           try {
                              if (var4 >= var2.length) {
                                 break;
                              }
                           } catch (Throwable var997) {
                              var10000 = var997;
                              var10001 = false;
                              break label11673;
                           }

                           var1031 = var2[var4];

                           Iterator var1034;
                           try {
                              var1034 = var1031.i.entrySet().iterator();
                           } catch (Throwable var994) {
                              var10000 = var994;
                              var10001 = false;
                              break label11673;
                           }

                           var5 = 0;

                           while(true) {
                              try {
                                 if (!var1034.hasNext()) {
                                    break;
                                 }

                                 var5 |= (Integer)((Map.Entry)var1034.next()).getValue();
                              } catch (Throwable var993) {
                                 var10000 = var993;
                                 var10001 = false;
                                 break label11673;
                              }
                           }

                           ByteArrayOutputStream var1035;
                           try {
                              var1035 = new ByteArrayOutputStream();
                           } catch (Throwable var992) {
                              var10000 = var992;
                              var10001 = false;
                              break label11673;
                           }

                           byte[] var1036;
                           Throwable var1020;
                           try {
                              r(var1035, var5, var1031);
                              var1036 = var1035.toByteArray();
                           } catch (Throwable var991) {
                              var1010 = var991;

                              try {
                                 var1035.close();
                              } catch (Throwable var987) {
                                 var1020 = var987;

                                 label11512:
                                 try {
                                    var1010.addSuppressed(var1020);
                                    break label11512;
                                 } catch (Throwable var986) {
                                    var10000 = var986;
                                    var10001 = false;
                                    break label11673;
                                 }
                              }

                              try {
                                 throw var1010;
                              } catch (Throwable var985) {
                                 var10000 = var985;
                                 var10001 = false;
                                 break label11673;
                              }
                           }

                           try {
                              var1035.close();
                              var1035 = new ByteArrayOutputStream();
                           } catch (Throwable var990) {
                              var10000 = var990;
                              var10001 = false;
                              break label11673;
                           }

                           try {
                              s(var1035, var1031);
                              var15 = var1035.toByteArray();
                           } catch (Throwable var989) {
                              var1010 = var989;

                              try {
                                 var1035.close();
                              } catch (Throwable var984) {
                                 var1020 = var984;

                                 label11503:
                                 try {
                                    var1010.addSuppressed(var1020);
                                    break label11503;
                                 } catch (Throwable var983) {
                                    var10000 = var983;
                                    var10001 = false;
                                    break label11673;
                                 }
                              }

                              try {
                                 throw var1010;
                              } catch (Throwable var982) {
                                 var10000 = var982;
                                 var10001 = false;
                                 break label11673;
                              }
                           }

                           try {
                              var1035.close();
                              v(var1027, var4);
                              var6 = var1036.length + 2 + var15.length;
                              u(var1027, (long)var6, 4);
                              v(var1027, var5);
                              var1027.write(var1036);
                              var1027.write(var15);
                           } catch (Throwable var988) {
                              var10000 = var988;
                              var10001 = false;
                              break label11673;
                           }

                           var3 = var3 + 6 + var6;
                           ++var4;
                        }

                        byte[] var1015;
                        m var1016;
                        label11555: {
                           try {
                              var1015 = var1027.toByteArray();
                              if (var3 == var1015.length) {
                                 var1016 = new m(4, var1015, true);
                                 break label11555;
                              }
                           } catch (Throwable var996) {
                              var10000 = var996;
                              var10001 = false;
                              break label11673;
                           }

                           try {
                              var1011 = new StringBuilder();
                              var1011.append("Expected size ");
                              var1011.append(var3);
                              var1011.append(", does not match actual size ");
                              var1011.append(var1015.length);
                              var1021 = var1011.toString();
                              var1017 = new IllegalStateException(var1021);
                              throw var1017;
                           } catch (Throwable var995) {
                              var10000 = var995;
                              var10001 = false;
                              break label11673;
                           }
                        }

                        var1027.close();
                        var1022.add(var1016);
                        long var9 = (long)4;
                        long var11 = var9 + var9 + 4L + (long)(var1022.size() * 16);
                        u(var0, (long)var1022.size(), 4);

                        for(var3 = 0; var3 < var1022.size(); ++var3) {
                           var1016 = (m)var1022.get(var3);
                           var4 = var1016.a;
                           if (var4 != 1) {
                              if (var4 != 2) {
                                 if (var4 != 3) {
                                    if (var4 != 4) {
                                       if (var4 != 5) {
                                          throw null;
                                       }

                                       var9 = 4L;
                                    } else {
                                       var9 = 3L;
                                    }
                                 } else {
                                    var9 = 2L;
                                 }
                              } else {
                                 var9 = 1L;
                              }
                           } else {
                              var9 = 0L;
                           }

                           u(var0, var9, 4);
                           u(var0, var11, 4);
                           byte[] var1032 = var1016.b;
                           if (var1016.c) {
                              var9 = (long)var1032.length;
                              var1015 = a(var1032);
                              var1018.add(var1015);
                              u(var0, (long)var1015.length, 4);
                              u(var0, var9, 4);
                              var4 = var1015.length;
                           } else {
                              var1018.add(var1032);
                              u(var0, (long)var1032.length, 4);
                              u(var0, 0L, 4);
                              var4 = var1032.length;
                           }

                           var11 += (long)var4;
                        }

                        for(var3 = 0; var3 < var1018.size(); ++var3) {
                           var0.write((byte[])var1018.get(var3));
                        }

                        return true;
                     }

                     var1010 = var10000;

                     try {
                        var1027.close();
                     } catch (Throwable var979) {
                        var1010.addSuppressed(var979);
                        throw var1010;
                     }

                     throw var1010;
                  }
               }
            } else {
               label11606:
               try {
                  var1011 = new StringBuilder();
                  var1011.append("Expected size ");
                  var1011.append(var3);
                  var1011.append(", does not match actual size ");
                  var1011.append(var15.length);
                  var1021 = var1011.toString();
                  var1017 = new IllegalStateException(var1021);
                  throw var1017;
               } catch (Throwable var1004) {
                  var10000 = var1004;
                  var10001 = false;
                  break label11606;
               }
            }
         }

         var1010 = var10000;

         try {
            var1027.close();
         } catch (Throwable var980) {
            var1010.addSuppressed(var980);
            throw var1010;
         }

         throw var1010;
      } else {
         byte[] var13 = e;
         if (Arrays.equals(var1, var13)) {
            var1 = b(var2, var13);
            u(var0, (long)var2.length, 1);
            u(var0, (long)var1.length, 4);
            var1 = a(var1);
            u(var0, (long)var1.length, 4);
            var0.write(var1);
            return true;
         } else {
            var13 = g;
            String var1026;
            c var1013;
            int[] var1014;
            Iterator var1023;
            if (Arrays.equals(var1, var13)) {
               u(var0, (long)var2.length, 1);
               var5 = var2.length;

               for(var3 = 0; var3 < var5; ++var3) {
                  var1013 = var2[var3];
                  var4 = var1013.i.size();
                  String var1024 = var1013.b;
                  var1026 = d(var1013.a, var1024, var13);
                  Charset var1025 = StandardCharsets.UTF_8;
                  v(var0, var1026.getBytes(var1025).length);
                  v(var0, var1013.h.length);
                  u(var0, (long)(var4 * 4), 4);
                  u(var0, var1013.c, 4);
                  var0.write(var1026.getBytes(var1025));
                  var1023 = var1013.i.keySet().iterator();

                  while(var1023.hasNext()) {
                     v(var0, (Integer)var1023.next());
                     v(var0, 0);
                  }

                  var1014 = var1013.h;
                  var6 = var1014.length;

                  for(var4 = 0; var4 < var6; ++var4) {
                     v(var0, var1014[var4]);
                  }
               }

               return true;
            } else {
               var13 = f;
               if (Arrays.equals(var1, var13)) {
                  var1 = b(var2, var13);
                  u(var0, (long)var2.length, 1);
                  u(var0, (long)var1.length, 4);
                  var1 = a(var1);
                  u(var0, (long)var1.length, 4);
                  var0.write(var1);
                  return true;
               } else {
                  var13 = h;
                  if (!Arrays.equals(var1, var13)) {
                     return false;
                  } else {
                     v(var0, var2.length);
                     var5 = var2.length;

                     for(var3 = 0; var3 < var5; ++var3) {
                        var1013 = var2[var3];
                        var1026 = d(var1013.a, var1013.b, var13);
                        Charset var16 = StandardCharsets.UTF_8;
                        v(var0, var1026.getBytes(var16).length);
                        TreeMap var14 = var1013.i;
                        v(var0, var14.size());
                        v(var0, var1013.h.length);
                        u(var0, var1013.c, 4);
                        var0.write(var1026.getBytes(var16));
                        var1023 = var14.keySet().iterator();

                        while(var1023.hasNext()) {
                           v(var0, (Integer)var1023.next());
                        }

                        var1014 = var1013.h;
                        var6 = var1014.length;

                        for(var4 = 0; var4 < var6; ++var4) {
                           v(var0, var1014[var4]);
                        }
                     }

                     return true;
                  }
               }
            }
         }
      }
   }

   public static void p(ByteArrayOutputStream var0, c var1) {
      s(var0, var1);
      int[] var6 = var1.h;
      int var5 = var6.length;
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var2 < var5; var3 = var4) {
         var4 = var6[var2];
         v(var0, var4 - var3);
         ++var2;
      }

      var2 = var1.g;
      byte[] var9 = new byte[(var2 * 2 + 7 & -8) / 8];
      Iterator var8 = var1.i.entrySet().iterator();

      while(var8.hasNext()) {
         Map.Entry var7 = (Map.Entry)var8.next();
         var5 = (Integer)var7.getKey();
         var3 = (Integer)var7.getValue();
         if ((var3 & 2) != 0) {
            var4 = var5 / 8;
            var9[var4] = (byte)(var9[var4] | 1 << var5 % 8);
         }

         if ((var3 & 4) != 0) {
            var4 = var5 + var2;
            var3 = var4 / 8;
            var9[var3] = (byte)(1 << var4 % 8 | var9[var3]);
         }
      }

      var0.write(var9);
   }

   public static void q(ByteArrayOutputStream var0, c var1, String var2) {
      Charset var3 = StandardCharsets.UTF_8;
      v(var0, var2.getBytes(var3).length);
      v(var0, var1.e);
      u(var0, (long)var1.f, 4);
      u(var0, var1.c, 4);
      u(var0, (long)var1.g, 4);
      var0.write(var2.getBytes(var3));
   }

   public static void r(ByteArrayOutputStream var0, int var1, c var2) {
      int var3 = Integer.bitCount(var1 & -2);
      int var5 = var2.g;
      byte[] var10 = new byte[(var3 * var5 + 7 & -8) / 8];
      Iterator var11 = var2.i.entrySet().iterator();

      while(var11.hasNext()) {
         Map.Entry var12 = (Map.Entry)var11.next();
         int var6 = (Integer)var12.getKey();
         int var7 = (Integer)var12.getValue();
         int var4 = 0;

         for(var3 = 1; var3 <= 4; var3 <<= 1) {
            if (var3 != 1 && (var3 & var1) != 0) {
               if ((var3 & var7) == var3) {
                  int var8 = var4 * var5 + var6;
                  int var9 = var8 / 8;
                  var10[var9] = (byte)(1 << var8 % 8 | var10[var9]);
               }

               ++var4;
            }
         }
      }

      var0.write(var10);
   }

   public static void s(ByteArrayOutputStream var0, c var1) {
      Iterator var4 = var1.i.entrySet().iterator();
      int var2 = 0;

      while(var4.hasNext()) {
         Map.Entry var5 = (Map.Entry)var4.next();
         int var3 = (Integer)var5.getKey();
         if (((Integer)var5.getValue() & 1) != 0) {
            v(var0, var3 - var2);
            v(var0, 0);
            var2 = var3;
         }
      }

   }

   public static void t(Context param0, Executor param1, f param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   public static void u(ByteArrayOutputStream var0, long var1, int var3) {
      byte[] var5 = new byte[var3];

      for(int var4 = 0; var4 < var3; ++var4) {
         var5[var4] = (byte)((int)(var1 >> var4 * 8 & 255L));
      }

      var0.write(var5);
   }

   public static void v(ByteArrayOutputStream var0, int var1) {
      u(var0, (long)var1, 2);
   }
}
