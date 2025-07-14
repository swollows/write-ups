package X;

import C.b;
import H.A;
import H.p;
import H.r;
import H.v;
import H.w;
import H.z;
import I.a;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import androidx.appcompat.app.o;
import androidx.appcompat.widget.Z;
import androidx.appcompat.widget.y;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import m.j;
import org.xmlpull.v1.XmlPullParserException;
import v.k;

public final class h implements F.h {
   public static h d;
   public static h e;
   public Object a;
   public Object b;
   public Object c;

   public h(Context var1, TypedArray var2) {
      this.a = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   public h(Object var1, Object var2, Object var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      super();
   }

   public static boolean f(Editable var0, KeyEvent var1, boolean var2) {
      if (!KeyEvent.metaStateHasNoModifiers(var1.getMetaState())) {
         return false;
      } else {
         int var4 = Selection.getSelectionStart(var0);
         int var3 = Selection.getSelectionEnd(var0);
         if (var4 != -1 && var3 != -1 && var4 == var3) {
            A[] var9 = (A[])var0.getSpans(var4, var3, A.class);
            if (var9 != null && var9.length > 0) {
               int var5 = var9.length;

               for(var3 = 0; var3 < var5; ++var3) {
                  A var8 = var9[var3];
                  int var6 = var0.getSpanStart(var8);
                  int var7 = var0.getSpanEnd(var8);
                  if (var2 && var6 == var4 || !var2 && var7 == var4 || var4 > var6 && var4 < var7) {
                     var0.delete(var6, var7);
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }

   public static h k() {
      synchronized(h.class){}

      h var0;
      label144: {
         Throwable var10000;
         boolean var10001;
         label145: {
            try {
               if (d == null) {
                  var0 = new h();
                  ConcurrentHashMap var1 = new ConcurrentHashMap();
                  var0.a = var1;
                  AtomicInteger var15 = new AtomicInteger(0);
                  var0.c = var15;
                  new Handler(Looper.getMainLooper());
                  var1 = new ConcurrentHashMap();
                  var0.b = var1;
                  d = var0;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label145;
            }

            label132:
            try {
               var0 = d;
               break label144;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label132;
            }
         }

         while(true) {
            Throwable var14 = var10000;

            try {
               throw var14;
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               continue;
            }
         }
      }

      return var0;
   }

   public static h m(Context var0, AttributeSet var1, int[] var2, int var3) {
      return new h(var0, var0.obtainStyledAttributes(var1, var2, var3, 0));
   }

   public ClipDescription a() {
      return (ClipDescription)this.b;
   }

   public void b() {
   }

   public Uri c() {
      return (Uri)this.c;
   }

   public Object d() {
      return null;
   }

   public Uri e() {
      return (Uri)this.a;
   }

   public ColorStateList g(int var1) {
      TypedArray var3 = (TypedArray)this.b;
      if (var3.hasValue(var1)) {
         int var2 = var3.getResourceId(var1, 0);
         if (var2 != 0) {
            ColorStateList var4 = C.b.l((Context)this.a, var2);
            if (var4 != null) {
               return var4;
            }
         }
      }

      return var3.getColorStateList(var1);
   }

   public Drawable h(int var1) {
      TypedArray var3 = (TypedArray)this.b;
      if (var3.hasValue(var1)) {
         int var2 = var3.getResourceId(var1, 0);
         if (var2 != 0) {
            return C.b.n((Context)this.a, var2);
         }
      }

      return var3.getDrawable(var1);
   }

   public Drawable i(int var1) {
      if (((TypedArray)this.b).hasValue(var1)) {
         var1 = ((TypedArray)this.b).getResourceId(var1, 0);
         if (var1 != 0) {
            y var2 = y.a();
            Context var3 = (Context)this.a;
            synchronized(var2){}

            Drawable var11;
            try {
               var11 = var2.a.d(var3, var1, true);
            } catch (Throwable var9) {
               Throwable var10000 = var9;
               boolean var10001 = false;

               while(true) {
                  Throwable var10 = var10000;

                  try {
                     throw var10;
                  } catch (Throwable var8) {
                     var10000 = var8;
                     var10001 = false;
                     continue;
                  }
               }
            }

            return var11;
         }
      }

      return null;
   }

   public Typeface j(int var1, int var2, Z var3) {
      var1 = ((TypedArray)this.b).getResourceId(var1, 0);
      Typeface var5 = null;
      if (var1 == 0) {
         return null;
      } else {
         if ((TypedValue)this.c == null) {
            this.c = new TypedValue();
         }

         TypedValue var8 = (TypedValue)this.c;
         ThreadLocal var6 = k.a;
         Context var10 = (Context)this.a;
         Typeface var26;
         if (var10.isRestricted()) {
            var26 = var5;
         } else {
            Resources var9 = var10.getResources();
            var9.getValue(var1, var8, true);
            CharSequence var29 = var8.string;
            if (var29 == null) {
               StringBuilder var27 = new StringBuilder("Resource \"");
               var27.append(var9.getResourceName(var1));
               var27.append("\" (");
               var27.append(Integer.toHexString(var1));
               var27.append(") is not a Font: ");
               var27.append(var8);
               throw new Resources.NotFoundException(var27.toString());
            }

            String var7 = var29.toString();
            if (!var7.startsWith("res/")) {
               var3.a();
               var26 = var5;
            } else {
               int var4 = var8.assetCookie;
               j var11 = w.e.b;
               Typeface var31 = (Typeface)var11.a(w.e.b(var9, var1, var7, var4, var2));
               if (var31 != null) {
                  (new Handler(Looper.getMainLooper())).post(new o(var3, var31, 2));
                  var26 = var31;
               } else {
                  label124: {
                     label125: {
                        label126: {
                           label99: {
                              XmlPullParserException var35;
                              label98: {
                                 IOException var10000;
                                 label113: {
                                    boolean var10001;
                                    label96: {
                                       v.d var32;
                                       try {
                                          if (!var7.toLowerCase().endsWith(".xml")) {
                                             break label96;
                                          }

                                          var32 = v.b.c(var9.getXml(var1), var9);
                                       } catch (XmlPullParserException var24) {
                                          var35 = var24;
                                          var10001 = false;
                                          break label98;
                                       } catch (IOException var25) {
                                          var10000 = var25;
                                          var10001 = false;
                                          break label113;
                                       }

                                       if (var32 == null) {
                                          try {
                                             Log.e("ResourcesCompat", "Failed to find font-family tag");
                                             var3.a();
                                             break label124;
                                          } catch (XmlPullParserException var12) {
                                             var35 = var12;
                                             var10001 = false;
                                             break label98;
                                          } catch (IOException var13) {
                                             var10000 = var13;
                                             var10001 = false;
                                             break label113;
                                          }
                                       } else {
                                          try {
                                             var5 = w.e.a(var10, var32, var9, var1, var7, var8.assetCookie, var2, var3);
                                             break label125;
                                          } catch (XmlPullParserException var14) {
                                             var35 = var14;
                                             var10001 = false;
                                             break label98;
                                          } catch (IOException var15) {
                                             var10000 = var15;
                                             var10001 = false;
                                             break label113;
                                          }
                                       }
                                    }

                                    try {
                                       var4 = var8.assetCookie;
                                       var5 = w.e.a.m(var10, var9, var1, var7, var2);
                                    } catch (XmlPullParserException var22) {
                                       var35 = var22;
                                       var10001 = false;
                                       break label98;
                                    } catch (IOException var23) {
                                       var10000 = var23;
                                       var10001 = false;
                                       break label113;
                                    }

                                    if (var5 != null) {
                                       try {
                                          var11.b(w.e.b(var9, var1, var7, var4, var2), var5);
                                       } catch (XmlPullParserException var20) {
                                          var35 = var20;
                                          var10001 = false;
                                          break label98;
                                       } catch (IOException var21) {
                                          var10000 = var21;
                                          var10001 = false;
                                          break label113;
                                       }
                                    }

                                    if (var5 != null) {
                                       try {
                                          Handler var33 = new Handler(Looper.getMainLooper());
                                          o var34 = new o(var3, var5, 2);
                                          var33.post(var34);
                                          break label126;
                                       } catch (XmlPullParserException var16) {
                                          var35 = var16;
                                          var10001 = false;
                                          break label98;
                                       } catch (IOException var17) {
                                          var10000 = var17;
                                          var10001 = false;
                                       }
                                    } else {
                                       try {
                                          var3.a();
                                          break label126;
                                       } catch (XmlPullParserException var18) {
                                          var35 = var18;
                                          var10001 = false;
                                          break label98;
                                       } catch (IOException var19) {
                                          var10000 = var19;
                                          var10001 = false;
                                       }
                                    }
                                 }

                                 IOException var28 = var10000;
                                 Log.e("ResourcesCompat", "Failed to read xml resource ".concat(var7), var28);
                                 break label99;
                              }

                              XmlPullParserException var30 = var35;
                              Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(var7), var30);
                           }

                           var3.a();
                           var26 = null;
                           return var26;
                        }

                        var26 = var5;
                        return var26;
                     }

                     var26 = var5;
                     return var26;
                  }

                  var26 = var5;
               }
            }
         }

         return var26;
      }
   }

   public boolean l(CharSequence var1, int var2, int var3, z var4) {
      boolean var6 = true;
      if ((var4.c & 3) == 0) {
         H.d var8 = (H.d)this.c;
         a var9 = var4.c();
         int var5 = var9.a(8);
         if (var5 != 0) {
            ((ByteBuffer)var9.d).getShort(var5 + var9.a);
         }

         var8.getClass();
         ThreadLocal var12 = H.d.b;
         if (var12.get() == null) {
            var12.set(new StringBuilder());
         }

         StringBuilder var13 = (StringBuilder)var12.get();
         var13.setLength(0);

         while(var2 < var3) {
            var13.append(var1.charAt(var2));
            ++var2;
         }

         TextPaint var10 = var8.a;
         String var11 = var13.toString();
         var2 = w.d.a;
         boolean var7 = var10.hasGlyph(var11);
         var2 = var4.c & 4;
         if (var7) {
            var2 |= 2;
         } else {
            var2 |= 1;
         }

         var4.c = var2;
      }

      if ((var4.c & 3) != 2) {
         var6 = false;
      }

      return var6;
   }

   public Object n(CharSequence var1, int var2, int var3, int var4, boolean var5, p var6) {
      r var14 = new r((v)((w)this.b).c);
      int var7 = Character.codePointAt(var1, var2);
      boolean var12 = true;
      int var8 = 0;

      while(true) {
         int var9 = var2;
         int var10 = var7;
         var2 = var2;

         while(true) {
            int var11 = var2;
            if (var2 >= var3 || var8 >= var4 || !var12) {
               if (var14.a == 2 && var14.c.b != null && (var14.f > 1 || var14.b()) && var8 < var4 && var12 && (var5 || !this.l(var1, var9, var2, var14.c.b))) {
                  var6.f(var1, var9, var2, var14.c.b);
               }

               return var6.b();
            }

            SparseArray var13 = var14.c.a;
            v var16;
            if (var13 == null) {
               var16 = null;
            } else {
               var16 = (v)var13.get(var10);
            }

            byte var15;
            label103: {
               label102: {
                  label101: {
                     if (var14.a != 2) {
                        if (var16 == null) {
                           var14.a();
                           break label101;
                        }

                        var14.a = 2;
                        var14.c = var16;
                        var14.f = 1;
                     } else if (var16 != null) {
                        var14.c = var16;
                        ++var14.f;
                     } else {
                        if (var10 == 65038) {
                           var14.a();
                           break label101;
                        }

                        if (var10 != 65039) {
                           var16 = var14.c;
                           if (var16.b != null) {
                              if (var14.f != 1) {
                                 var14.d = var16;
                                 var14.a();
                                 break label102;
                              }

                              if (var14.b()) {
                                 var14.d = var14.c;
                                 var14.a();
                                 break label102;
                              }

                              var14.a();
                           } else {
                              var14.a();
                           }
                           break label101;
                        }
                     }

                     var15 = 2;
                     break label103;
                  }

                  var15 = 1;
                  break label103;
               }

               var15 = 3;
            }

            var14.e = var10;
            if (var15 == 1) {
               var9 += Character.charCount(Character.codePointAt(var1, var9));
               var2 = var9;
               var7 = var10;
               if (var9 < var3) {
                  var7 = Character.codePointAt(var1, var9);
                  var2 = var9;
               }
               break;
            }

            if (var15 != 2) {
               if (var15 == 3) {
                  if (!var5) {
                     var2 = var2;
                     var7 = var10;
                     if (this.l(var1, var9, var11, var14.d.b)) {
                        break;
                     }
                  }

                  var12 = var6.f(var1, var9, var2, var14.d.b);
                  ++var8;
                  var2 = var2;
                  var7 = var10;
                  break;
               }

               var2 = var2;
            } else {
               var2 += Character.charCount(var10);
               if (var2 < var3) {
                  var10 = Character.codePointAt(var1, var2);
               }
            }
         }
      }
   }

   public void o() {
      ((TypedArray)this.b).recycle();
   }
}
