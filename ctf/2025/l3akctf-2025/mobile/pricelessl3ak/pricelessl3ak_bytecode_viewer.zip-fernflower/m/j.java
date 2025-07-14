package m;

import D.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class j {
   public final int a;
   public final D.d b;
   public final z c;
   public int d;
   public int e;
   public int f;

   public j(int var1) {
      this.a = var1;
      if (var1 > 0) {
         this.b = new D.d(17);
         this.c = new z(20);
      } else {
         throw new IllegalArgumentException("maxSize <= 0");
      }
   }

   public final Object a(Object var1) {
      i0.d.e(var1, "key");
      z var2 = this.c;
      synchronized(var2){}

      Throwable var10000;
      label114: {
         boolean var10001;
         try {
            D.d var3 = this.b;
            var3.getClass();
            var1 = ((LinkedHashMap)var3.b).get(var1);
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label114;
         }

         if (var1 != null) {
            label107: {
               try {
                  ++this.e;
               } catch (Throwable var13) {
                  var10000 = var13;
                  var10001 = false;
                  break label107;
               }

               return var1;
            }
         } else {
            label110: {
               try {
                  ++this.f;
               } catch (Throwable var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label110;
               }

               return null;
            }
         }
      }

      Throwable var16 = var10000;
      throw var16;
   }

   public final Object b(Object var1, Object var2) {
      i0.d.e(var1, "key");
      z var7 = this.c;
      synchronized(var7){}

      Throwable var10000;
      boolean var10001;
      Throwable var165;
      Object var168;
      label1569: {
         label1573: {
            try {
               ++this.d;
               D.d var6 = this.b;
               var6.getClass();
               var168 = ((LinkedHashMap)var6.b).put(var1, var2);
            } catch (Throwable var164) {
               var10000 = var164;
               var10001 = false;
               break label1573;
            }

            if (var168 == null) {
               break label1569;
            }

            label1564:
            try {
               --this.d;
               break label1569;
            } catch (Throwable var163) {
               var10000 = var163;
               var10001 = false;
               break label1564;
            }
         }

         var165 = var10000;
         throw var165;
      }

      int var4 = this.a;

      while(true) {
         z var166 = this.c;
         synchronized(var166){}

         label1555: {
            label1579: {
               try {
                  if (this.d < 0 || ((LinkedHashMap)this.b.b).isEmpty() && this.d != 0) {
                     break label1579;
                  }
               } catch (Throwable var162) {
                  var10000 = var162;
                  var10001 = false;
                  break label1555;
               }

               try {
                  if (this.d <= var4 || ((LinkedHashMap)this.b.b).isEmpty()) {
                     return var168;
                  }
               } catch (Throwable var161) {
                  var10000 = var161;
                  var10001 = false;
                  break label1555;
               }

               boolean var5;
               Set var169;
               try {
                  var169 = ((LinkedHashMap)this.b.b).entrySet();
                  i0.d.d(var169, "map.entries");
                  var5 = var169 instanceof List;
               } catch (Throwable var158) {
                  var10000 = var158;
                  var10001 = false;
                  break label1555;
               }

               var1 = null;
               if (var5) {
                  label1577: {
                     List var170;
                     try {
                        var170 = (List)var169;
                        if (var170.isEmpty()) {
                           break label1577;
                        }
                     } catch (Throwable var160) {
                        var10000 = var160;
                        var10001 = false;
                        break label1555;
                     }

                     try {
                        var1 = var170.get(0);
                     } catch (Throwable var157) {
                        var10000 = var157;
                        var10001 = false;
                        break label1555;
                     }
                  }
               } else {
                  label1525: {
                     Iterator var171;
                     try {
                        var171 = var169.iterator();
                        if (!var171.hasNext()) {
                           break label1525;
                        }
                     } catch (Throwable var159) {
                        var10000 = var159;
                        var10001 = false;
                        break label1555;
                     }

                     try {
                        var1 = var171.next();
                     } catch (Throwable var156) {
                        var10000 = var156;
                        var10001 = false;
                        break label1555;
                     }
                  }
               }

               Map.Entry var172;
               try {
                  var172 = (Map.Entry)var1;
               } catch (Throwable var155) {
                  var10000 = var155;
                  var10001 = false;
                  break label1555;
               }

               if (var172 == null) {
                  return var168;
               }

               try {
                  var1 = var172.getKey();
                  Object var8 = var172.getValue();
                  D.d var173 = this.b;
                  var173.getClass();
                  i0.d.e(var1, "key");
                  ((LinkedHashMap)var173.b).remove(var1);
                  int var3 = this.d;
                  i0.d.e(var8, "value");
                  this.d = var3 - 1;
                  continue;
               } catch (Throwable var153) {
                  var10000 = var153;
                  var10001 = false;
                  break label1555;
               }
            }

            label1510:
            try {
               IllegalStateException var167 = new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
               throw var167;
            } catch (Throwable var154) {
               var10000 = var154;
               var10001 = false;
               break label1510;
            }
         }

         var165 = var10000;
         throw var165;
      }
   }

   public final String toString() {
      z var3 = this.c;
      synchronized(var3){}

      Throwable var10000;
      label129: {
         int var1;
         boolean var10001;
         int var2;
         try {
            var1 = this.e;
            var2 = this.f + var1;
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label129;
         }

         if (var2 != 0) {
            try {
               var1 = var1 * 100 / var2;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label129;
            }
         } else {
            var1 = 0;
         }

         label116:
         try {
            StringBuilder var17 = new StringBuilder("LruCache[maxSize=");
            var17.append(this.a);
            var17.append(",hits=");
            var17.append(this.e);
            var17.append(",misses=");
            var17.append(this.f);
            var17.append(",hitRate=");
            var17.append(var1);
            var17.append("%]");
            String var18 = var17.toString();
            return var18;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label116;
         }
      }

      Throwable var4 = var10000;
      throw var4;
   }
}
