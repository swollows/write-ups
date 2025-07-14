package H;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class j {
   public static final Object j = new Object();
   public static volatile j k;
   public final ReentrantReadWriteLock a;
   public final m.g b;
   public volatile int c;
   public final Handler d;
   public final f e;
   public final i f;
   public final D.z g;
   public final int h;
   public final d i;

   public j(u var1) {
      ReentrantReadWriteLock var4 = new ReentrantReadWriteLock();
      this.a = var4;
      this.c = 3;
      i var3 = var1.a;
      this.f = var3;
      int var2 = var1.b;
      this.h = var2;
      this.i = var1.c;
      this.d = new Handler(Looper.getMainLooper());
      this.b = new m.g();
      this.g = new D.z(2);
      f var12 = new f(this);
      this.e = var12;
      var4.writeLock().lock();
      if (var2 == 0) {
         boolean var9 = false;

         try {
            var9 = true;
            this.c = 0;
            var9 = false;
         } finally {
            if (var9) {
               this.a.writeLock().unlock();
            }
         }
      }

      var4.writeLock().unlock();
      if (this.b() == 0) {
         try {
            e var13 = new e(var12);
            var3.r(var13);
         } catch (Throwable var11) {
            this.d(var11);
            return;
         }
      }

   }

   public static j a() {
      Object var1 = j;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label196: {
         j var2;
         try {
            var2 = k;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label196;
         }

         boolean var0;
         if (var2 != null) {
            var0 = true;
         } else {
            var0 = false;
         }

         if (var0) {
            label185:
            try {
               return var2;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label185;
            }
         } else {
            label187:
            try {
               IllegalStateException var24 = new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
               throw var24;
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label187;
            }
         }
      }

      while(true) {
         Throwable var23 = var10000;

         try {
            throw var23;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            continue;
         }
      }
   }

   public final int b() {
      this.a.readLock().lock();

      int var1;
      try {
         var1 = this.c;
      } finally {
         this.a.readLock().unlock();
      }

      return var1;
   }

   public final void c() {
      boolean var1;
      if (this.h == 1) {
         var1 = true;
      } else {
         var1 = false;
      }

      if (!var1) {
         throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
      } else if (this.b() != 1) {
         this.a.writeLock().lock();

         Throwable var10000;
         label185: {
            int var17;
            boolean var10001;
            try {
               var17 = this.c;
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break label185;
            }

            if (var17 == 0) {
               this.a.writeLock().unlock();
               return;
            }

            try {
               this.c = 0;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label185;
            }

            this.a.writeLock().unlock();
            f var4 = this.e;
            j var18 = var4.a;

            try {
               e var3 = new e(var4);
               var18.f.r(var3);
            } catch (Throwable var14) {
               var18.d(var14);
               return;
            }

            return;
         }

         Throwable var2 = var10000;
         this.a.writeLock().unlock();
         throw var2;
      }
   }

   public final void d(Throwable var1) {
      ArrayList var2 = new ArrayList();
      this.a.writeLock().lock();

      try {
         this.c = 2;
         var2.addAll(this.b);
         this.b.clear();
      } finally {
         this.a.writeLock().unlock();
      }

      this.d.post(new h(var2, this.c, var1));
   }

   public final CharSequence e(CharSequence var1, int var2, int var3) {
      int var4 = this.b();
      byte var7 = 0;
      boolean var5 = true;
      boolean var170;
      if (var4 == 1) {
         var170 = true;
      } else {
         var170 = false;
      }

      if (var170) {
         if (var2 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
         } else if (var3 >= 0) {
            if (var2 <= var3) {
               var170 = true;
            } else {
               var170 = false;
            }

            if (!var170) {
               throw new IllegalArgumentException("start should be <= than end");
            } else {
               SpannableString var11 = null;
               if (var1 == null) {
                  return null;
               } else {
                  if (var2 <= var1.length()) {
                     var170 = true;
                  } else {
                     var170 = false;
                  }

                  if (var170) {
                     if (var3 <= var1.length()) {
                        var170 = var5;
                     } else {
                        var170 = false;
                     }

                     if (!var170) {
                        throw new IllegalArgumentException("end should be < than charSequence length");
                     } else if (var1.length() != 0 && var2 != var3) {
                        X.h var12 = this.e.b;
                        var12.getClass();
                        boolean var9 = var1 instanceof y;
                        if (var9) {
                           ((y)var1).a();
                        }

                        Throwable var10000;
                        label2481: {
                           C var10;
                           boolean var10001;
                           label2463: {
                              label2434: {
                                 if (!var9) {
                                    try {
                                       if (!(var1 instanceof Spannable)) {
                                          break label2434;
                                       }
                                    } catch (Throwable var169) {
                                       var10000 = var169;
                                       var10001 = false;
                                       break label2481;
                                    }
                                 }

                                 try {
                                    var10 = new C((Spannable)var1);
                                    break label2463;
                                 } catch (Throwable var165) {
                                    var10000 = var165;
                                    var10001 = false;
                                    break label2481;
                                 }
                              }

                              var10 = var11;

                              try {
                                 if (!(var1 instanceof Spanned)) {
                                    break label2463;
                                 }
                              } catch (Throwable var168) {
                                 var10000 = var168;
                                 var10001 = false;
                                 break label2481;
                              }

                              var10 = var11;

                              try {
                                 if (((Spanned)var1).nextSpanTransition(var2 - 1, var3 + 1, A.class) <= var3) {
                                    var10 = new C();
                                    var10.a = false;
                                    var11 = new SpannableString(var1);
                                    var10.b = var11;
                                 }
                              } catch (Throwable var164) {
                                 var10000 = var164;
                                 var10001 = false;
                                 break label2481;
                              }
                           }

                           int var6 = var2;
                           int var171 = var3;
                           if (var10 != null) {
                              A[] var13;
                              try {
                                 var13 = (A[])var10.b.getSpans(var2, var3, A.class);
                              } catch (Throwable var163) {
                                 var10000 = var163;
                                 var10001 = false;
                                 break label2481;
                              }

                              var6 = var2;
                              var171 = var3;
                              if (var13 != null) {
                                 label2464: {
                                    var6 = var2;
                                    var171 = var3;

                                    int var8;
                                    try {
                                       if (var13.length <= 0) {
                                          break label2464;
                                       }

                                       var8 = var13.length;
                                    } catch (Throwable var167) {
                                       var10000 = var167;
                                       var10001 = false;
                                       break label2481;
                                    }

                                    var4 = var7;

                                    while(true) {
                                       var6 = var2;
                                       var171 = var3;
                                       if (var4 >= var8) {
                                          break;
                                       }

                                       A var173 = var13[var4];

                                       try {
                                          var6 = var10.b.getSpanStart(var173);
                                          var171 = var10.b.getSpanEnd(var173);
                                       } catch (Throwable var162) {
                                          var10000 = var162;
                                          var10001 = false;
                                          break label2481;
                                       }

                                       if (var6 != var3) {
                                          try {
                                             var10.removeSpan(var173);
                                          } catch (Throwable var161) {
                                             var10000 = var161;
                                             var10001 = false;
                                             break label2481;
                                          }
                                       }

                                       try {
                                          var2 = Math.min(var6, var2);
                                          var3 = Math.max(var171, var3);
                                       } catch (Throwable var160) {
                                          var10000 = var160;
                                          var10001 = false;
                                          break label2481;
                                       }

                                       ++var4;
                                    }
                                 }
                              }
                           }

                           Object var172;
                           label2466: {
                              label2405: {
                                 if (var6 != var171) {
                                    try {
                                       if (var6 < var1.length()) {
                                          break label2405;
                                       }
                                    } catch (Throwable var166) {
                                       var10000 = var166;
                                       var10001 = false;
                                       break label2481;
                                    }
                                 }

                                 var172 = var1;
                                 if (!var9) {
                                    return (CharSequence)var172;
                                 }
                                 break label2466;
                              }

                              try {
                                 A.c var174 = new A.c(var10, (D.z)var12.a);
                                 var10 = (C)var12.n(var1, var6, var171, Integer.MAX_VALUE, false, var174);
                              } catch (Throwable var159) {
                                 var10000 = var159;
                                 var10001 = false;
                                 break label2481;
                              }

                              if (var10 != null) {
                                 try {
                                    var172 = var10.b;
                                 } catch (Throwable var158) {
                                    var10000 = var158;
                                    var10001 = false;
                                    break label2481;
                                 }

                                 if (var9) {
                                    ((y)var1).b();
                                 }

                                 return (CharSequence)var172;
                              }

                              var172 = var1;
                              if (!var9) {
                                 return (CharSequence)var172;
                              }
                           }

                           ((y)var1).b();
                           var172 = var1;
                           return (CharSequence)var172;
                        }

                        Throwable var175 = var10000;
                        if (var9) {
                           ((y)var1).b();
                        }

                        throw var175;
                     } else {
                        return var1;
                     }
                  } else {
                     throw new IllegalArgumentException("start should be < than charSequence length");
                  }
               }
            }
         } else {
            throw new IllegalArgumentException("end cannot be negative");
         }
      } else {
         throw new IllegalStateException("Not initialized yet");
      }
   }

   public final void f(g var1) {
      C.b.f(var1, "initCallback cannot be null");
      this.a.writeLock().lock();

      label135: {
         Throwable var10000;
         label134: {
            boolean var10001;
            label139: {
               try {
                  if (this.c != 1 && this.c != 2) {
                     break label139;
                  }
               } catch (Throwable var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label134;
               }

               try {
                  Handler var4 = this.d;
                  int var2 = this.c;
                  h var3 = new h(Arrays.asList(var1), var2, (Throwable)null);
                  var4.post(var3);
                  break label135;
               } catch (Throwable var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label134;
               }
            }

            label122:
            try {
               this.b.add(var1);
               break label135;
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label122;
            }
         }

         Throwable var17 = var10000;
         this.a.writeLock().unlock();
         throw var17;
      }

      this.a.writeLock().unlock();
   }
}
