package Z;

import C.b;
import i0.d;
import j0.a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class f extends AbstractList implements List, a {
   public static final Object[] d = new Object[0];
   public int a;
   public Object[] b;
   public int c;

   public f() {
      this.b = d;
   }

   public final void a(int var1, Collection var2) {
      Iterator var4 = var2.iterator();

      int var3;
      for(var3 = this.b.length; var1 < var3 && var4.hasNext(); ++var1) {
         this.b[var1] = var4.next();
      }

      var3 = this.a;

      for(var1 = 0; var1 < var3 && var4.hasNext(); ++var1) {
         this.b[var1] = var4.next();
      }

      var1 = this.c;
      this.c = var2.size() + var1;
   }

   public final void add(int var1, Object var2) {
      int var3 = this.c;
      if (var1 >= 0 && var1 <= var3) {
         if (var1 == var3) {
            this.addLast(var2);
         } else if (var1 == 0) {
            this.addFirst(var2);
         } else {
            this.g();
            this.b(this.c + 1);
            var3 = this.f(this.a + var1);
            int var4 = this.c;
            Object[] var5;
            if (var1 < var4 + 1 >> 1) {
               var1 = var3;
               if (var3 == 0) {
                  var5 = this.b;
                  i0.d.e(var5, "<this>");
                  var1 = var5.length;
               }

               var3 = var1 - 1;
               var1 = this.a;
               if (var1 == 0) {
                  var5 = this.b;
                  i0.d.e(var5, "<this>");
                  var1 = var5.length - 1;
               } else {
                  --var1;
               }

               var4 = this.a;
               if (var3 >= var4) {
                  var5 = this.b;
                  var5[var1] = var5[var4];
                  g.M(var5, var5, var4, var4 + 1, var3 + 1);
               } else {
                  var5 = this.b;
                  g.M(var5, var5, var4 - 1, var4, var5.length);
                  var5 = this.b;
                  var5[var5.length - 1] = var5[0];
                  g.M(var5, var5, 0, 1, var3 + 1);
               }

               this.b[var3] = var2;
               this.a = var1;
            } else {
               var1 = this.f(this.a + var4);
               if (var3 < var1) {
                  var5 = this.b;
                  g.M(var5, var5, var3 + 1, var3, var1);
               } else {
                  var5 = this.b;
                  g.M(var5, var5, 1, 0, var1);
                  var5 = this.b;
                  var5[0] = var5[var5.length - 1];
                  g.M(var5, var5, var3 + 1, var3, var5.length - 1);
               }

               this.b[var3] = var2;
            }

            ++this.c;
         }
      } else {
         StringBuilder var6 = new StringBuilder("index: ");
         var6.append(var1);
         var6.append(", size: ");
         var6.append(var3);
         throw new IndexOutOfBoundsException(var6.toString());
      }
   }

   public final boolean add(Object var1) {
      this.addLast(var1);
      return true;
   }

   public final boolean addAll(int var1, Collection var2) {
      i0.d.e(var2, "elements");
      int var3 = this.c;
      if (var1 >= 0 && var1 <= var3) {
         if (var2.isEmpty()) {
            return false;
         } else if (var1 == this.c) {
            return this.addAll(var2);
         } else {
            this.g();
            var3 = this.c;
            this.b(var2.size() + var3);
            int var5 = this.f(this.a + this.c);
            var3 = this.f(this.a + var1);
            int var4 = var2.size();
            Object[] var7;
            if (var1 < this.c + 1 >> 1) {
               var5 = this.a;
               var1 = var5 - var4;
               if (var3 >= var5) {
                  if (var1 >= 0) {
                     var7 = this.b;
                     g.M(var7, var7, var1, var5, var3);
                  } else {
                     var7 = this.b;
                     var1 += var7.length;
                     int var6 = var7.length - var1;
                     if (var6 >= var3 - var5) {
                        g.M(var7, var7, var1, var5, var3);
                     } else {
                        g.M(var7, var7, var1, var5, var5 + var6);
                        var7 = this.b;
                        g.M(var7, var7, 0, this.a + var6, var3);
                     }
                  }
               } else {
                  var7 = this.b;
                  g.M(var7, var7, var1, var5, var7.length);
                  if (var4 >= var3) {
                     var7 = this.b;
                     g.M(var7, var7, var7.length - var4, 0, var3);
                  } else {
                     var7 = this.b;
                     g.M(var7, var7, var7.length - var4, 0, var4);
                     var7 = this.b;
                     g.M(var7, var7, 0, var4, var3);
                  }
               }

               this.a = var1;
               this.a(this.d(var3 - var4), var2);
            } else {
               var1 = var3 + var4;
               if (var3 < var5) {
                  var4 += var5;
                  var7 = this.b;
                  if (var4 <= var7.length) {
                     g.M(var7, var7, var1, var3, var5);
                  } else if (var1 >= var7.length) {
                     g.M(var7, var7, var1 - var7.length, var3, var5);
                  } else {
                     var4 = var5 - (var4 - var7.length);
                     g.M(var7, var7, 0, var4, var5);
                     var7 = this.b;
                     g.M(var7, var7, var1, var3, var4);
                  }
               } else {
                  var7 = this.b;
                  g.M(var7, var7, var4, 0, var5);
                  var7 = this.b;
                  if (var1 >= var7.length) {
                     g.M(var7, var7, var1 - var7.length, var3, var7.length);
                  } else {
                     g.M(var7, var7, 0, var7.length - var4, var7.length);
                     var7 = this.b;
                     g.M(var7, var7, var1, var3, var7.length - var4);
                  }
               }

               this.a(var3, var2);
            }

            return true;
         }
      } else {
         StringBuilder var8 = new StringBuilder("index: ");
         var8.append(var1);
         var8.append(", size: ");
         var8.append(var3);
         throw new IndexOutOfBoundsException(var8.toString());
      }
   }

   public final boolean addAll(Collection var1) {
      i0.d.e(var1, "elements");
      if (var1.isEmpty()) {
         return false;
      } else {
         this.g();
         int var2 = this.c;
         this.b(var1.size() + var2);
         this.a(this.f(this.a + this.c), var1);
         return true;
      }
   }

   public final void addFirst(Object var1) {
      this.g();
      this.b(this.c + 1);
      int var3 = this.a;
      int var2 = var3;
      if (var3 == 0) {
         Object[] var4 = this.b;
         i0.d.e(var4, "<this>");
         var2 = var4.length;
      }

      --var2;
      this.a = var2;
      this.b[var2] = var1;
      ++this.c;
   }

   public final void addLast(Object var1) {
      this.g();
      this.b(this.c + 1);
      this.b[this.f(this.a + this.c)] = var1;
      ++this.c;
   }

   public final void b(int var1) {
      if (var1 >= 0) {
         Object[] var5 = this.b;
         if (var1 > var5.length) {
            int var2;
            if (var5 == d) {
               var2 = var1;
               if (var1 < 10) {
                  var2 = 10;
               }

               this.b = new Object[var2];
            } else {
               var2 = var5.length;
               int var3 = var2 + (var2 >> 1);
               var2 = var3;
               if (var3 - var1 < 0) {
                  var2 = var1;
               }

               var3 = var2;
               if (var2 - 2147483639 > 0) {
                  if (var1 > 2147483639) {
                     var3 = Integer.MAX_VALUE;
                  } else {
                     var3 = 2147483639;
                  }
               }

               Object[] var4 = new Object[var3];
               g.M(var5, var4, 0, this.a, var5.length);
               var5 = this.b;
               var1 = var5.length;
               var2 = this.a;
               g.M(var5, var4, var1 - var2, 0, var2);
               this.a = 0;
               this.b = var4;
            }
         }
      } else {
         throw new IllegalStateException("Deque is too big.");
      }
   }

   public final int c(int var1) {
      Object[] var2 = this.b;
      i0.d.e(var2, "<this>");
      if (var1 == var2.length - 1) {
         var1 = 0;
      } else {
         ++var1;
      }

      return var1;
   }

   public final void clear() {
      if (!this.isEmpty()) {
         this.g();
         int var1 = this.f(this.a + this.c);
         this.e(this.a, var1);
      }

      this.a = 0;
      this.c = 0;
   }

   public final boolean contains(Object var1) {
      boolean var2;
      if (this.indexOf(var1) != -1) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public final int d(int var1) {
      int var2 = var1;
      if (var1 < 0) {
         var2 = var1 + this.b.length;
      }

      return var2;
   }

   public final void e(int var1, int var2) {
      Object[] var3;
      if (var1 < var2) {
         var3 = this.b;
         i0.d.e(var3, "<this>");
         Arrays.fill(var3, var1, var2, (Object)null);
      } else {
         var3 = this.b;
         Arrays.fill(var3, var1, var3.length, (Object)null);
         var3 = this.b;
         i0.d.e(var3, "<this>");
         Arrays.fill(var3, 0, var2, (Object)null);
      }

   }

   public final int f(int var1) {
      Object[] var3 = this.b;
      int var2 = var1;
      if (var1 >= var3.length) {
         var2 = var1 - var3.length;
      }

      return var2;
   }

   public final void g() {
      ++super.modCount;
   }

   public final Object get(int var1) {
      int var2 = this.c;
      if (var1 >= 0 && var1 < var2) {
         return this.b[this.f(this.a + var1)];
      } else {
         StringBuilder var3 = new StringBuilder("index: ");
         var3.append(var1);
         var3.append(", size: ");
         var3.append(var2);
         throw new IndexOutOfBoundsException(var3.toString());
      }
   }

   public final int indexOf(Object var1) {
      int var3 = this.f(this.a + this.c);
      int var2 = this.a;
      if (var2 < var3) {
         while(true) {
            if (var2 >= var3) {
               return -1;
            }

            if (i0.d.a(var1, this.b[var2])) {
               var3 = this.a;
               break;
            }

            ++var2;
         }
      } else {
         if (var2 < var3) {
            return -1;
         }

         int var4 = this.b.length;

         while(true) {
            if (var2 >= var4) {
               for(var2 = 0; var2 < var3; ++var2) {
                  if (i0.d.a(var1, this.b[var2])) {
                     var2 += this.b.length;
                     var3 = this.a;
                     return var2 - var3;
                  }
               }

               return -1;
            }

            if (i0.d.a(var1, this.b[var2])) {
               var3 = this.a;
               break;
            }

            ++var2;
         }
      }

      return var2 - var3;
   }

   public final boolean isEmpty() {
      boolean var1;
      if (this.c == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final int lastIndexOf(Object var1) {
      int var2 = this.f(this.a + this.c);
      int var3 = this.a;
      if (var3 < var2) {
         --var2;
         if (var3 > var2) {
            return -1;
         }

         while(!i0.d.a(var1, this.b[var2])) {
            if (var2 == var3) {
               return -1;
            }

            --var2;
         }

         var3 = this.a;
      } else {
         if (var3 <= var2) {
            return -1;
         }

         --var2;

         while(true) {
            if (-1 >= var2) {
               Object[] var4 = this.b;
               i0.d.e(var4, "<this>");
               var2 = var4.length - 1;
               var3 = this.a;
               if (var3 > var2) {
                  return -1;
               }

               while(!i0.d.a(var1, this.b[var2])) {
                  if (var2 == var3) {
                     return -1;
                  }

                  --var2;
               }

               var3 = this.a;
               break;
            }

            if (i0.d.a(var1, this.b[var2])) {
               var2 += this.b.length;
               var3 = this.a;
               break;
            }

            --var2;
         }
      }

      return var2 - var3;
   }

   public final Object remove(int var1) {
      int var2 = this.c;
      if (var1 >= 0 && var1 < var2) {
         Object var6;
         if (var1 == var2 - 1) {
            var6 = this.removeLast();
         } else if (var1 == 0) {
            var6 = this.removeFirst();
         } else {
            this.g();
            var2 = this.f(this.a + var1);
            Object[] var5 = this.b;
            var6 = var5[var2];
            int var3 = this.c;
            if (var1 < var3 >> 1) {
               var1 = this.a;
               if (var2 >= var1) {
                  g.M(var5, var5, var1 + 1, var1, var2);
               } else {
                  g.M(var5, var5, 1, 0, var2);
                  var5 = this.b;
                  var5[0] = var5[var5.length - 1];
                  var1 = this.a;
                  g.M(var5, var5, var1 + 1, var1, var5.length - 1);
               }

               var5 = this.b;
               var1 = this.a;
               var5[var1] = null;
               this.a = this.c(var1);
            } else {
               var1 = this.f(var3 - 1 + this.a);
               if (var2 <= var1) {
                  var5 = this.b;
                  g.M(var5, var5, var2, var2 + 1, var1 + 1);
               } else {
                  var5 = this.b;
                  g.M(var5, var5, var2, var2 + 1, var5.length);
                  var5 = this.b;
                  var5[var5.length - 1] = var5[0];
                  g.M(var5, var5, 0, 1, var1 + 1);
               }

               this.b[var1] = null;
            }

            --this.c;
         }

         return var6;
      } else {
         StringBuilder var4 = new StringBuilder("index: ");
         var4.append(var1);
         var4.append(", size: ");
         var4.append(var2);
         throw new IndexOutOfBoundsException(var4.toString());
      }
   }

   public final boolean remove(Object var1) {
      int var2 = this.indexOf(var1);
      if (var2 == -1) {
         return false;
      } else {
         this.remove(var2);
         return true;
      }
   }

   public final boolean removeAll(Collection var1) {
      i0.d.e(var1, "elements");
      boolean var10 = this.isEmpty();
      byte var4 = 0;
      boolean var9 = false;
      boolean var7 = false;
      boolean var8 = var9;
      if (!var10) {
         if (this.b.length == 0) {
            var8 = var9;
         } else {
            int var5 = this.f(this.a + this.c);
            int var2 = this.a;
            int var3;
            Object var14;
            if (var2 < var5) {
               for(var3 = var2; var2 < var5; ++var2) {
                  var14 = this.b[var2];
                  if (!var1.contains(var14)) {
                     this.b[var3] = var14;
                     ++var3;
                  } else {
                     var7 = true;
                  }
               }

               Object[] var13 = this.b;
               i0.d.e(var13, "<this>");
               Arrays.fill(var13, var3, var5, (Object)null);
               var2 = var3;
            } else {
               int var6 = this.b.length;
               var7 = false;

               for(var3 = var2; var2 < var6; ++var2) {
                  Object[] var11 = this.b;
                  Object var12 = var11[var2];
                  var11[var2] = null;
                  if (!var1.contains(var12)) {
                     this.b[var3] = var12;
                     ++var3;
                  } else {
                     var7 = true;
                  }
               }

               var2 = this.f(var3);

               for(var3 = var4; var3 < var5; ++var3) {
                  Object[] var15 = this.b;
                  var14 = var15[var3];
                  var15[var3] = null;
                  if (!var1.contains(var14)) {
                     this.b[var2] = var14;
                     var2 = this.c(var2);
                  } else {
                     var7 = true;
                  }
               }
            }

            var8 = var7;
            if (var7) {
               this.g();
               this.c = this.d(var2 - this.a);
               var8 = var7;
            }
         }
      }

      return var8;
   }

   public final Object removeFirst() {
      if (!this.isEmpty()) {
         this.g();
         Object[] var3 = this.b;
         int var1 = this.a;
         Object var2 = var3[var1];
         var3[var1] = null;
         this.a = this.c(var1);
         --this.c;
         return var2;
      } else {
         throw new NoSuchElementException("ArrayDeque is empty.");
      }
   }

   public final Object removeLast() {
      if (!this.isEmpty()) {
         this.g();
         int var1 = this.a;
         var1 = this.f(this.c - 1 + var1);
         Object[] var2 = this.b;
         Object var3 = var2[var1];
         var2[var1] = null;
         --this.c;
         return var3;
      } else {
         throw new NoSuchElementException("ArrayDeque is empty.");
      }
   }

   public final void removeRange(int var1, int var2) {
      C.b.g(var1, var2, this.c);
      int var6 = var2 - var1;
      if (var6 != 0) {
         if (var6 == this.c) {
            this.clear();
         } else if (var6 == 1) {
            this.remove(var1);
         } else {
            this.g();
            int var3;
            int var4;
            int var5;
            Object[] var7;
            if (var1 < this.c - var2) {
               var4 = this.f(var1 - 1 + this.a);
               var3 = this.f(var2 - 1 + this.a);

               for(var2 = var4; var1 > 0; var1 -= var4) {
                  var5 = var2 + 1;
                  var4 = Math.min(var1, Math.min(var5, var3 + 1));
                  var7 = this.b;
                  var3 -= var4;
                  var2 -= var4;
                  g.M(var7, var7, var3 + 1, var2 + 1, var5);
                  var2 = this.d(var2);
                  var3 = this.d(var3);
               }

               var1 = this.f(this.a + var6);
               this.e(this.a, var1);
               this.a = var1;
            } else {
               var5 = this.f(this.a + var2);
               var1 = this.f(this.a + var1);
               var4 = this.c;
               var3 = var2;
               var2 = var5;

               while(true) {
                  var4 -= var3;
                  if (var4 <= 0) {
                     var1 = this.f(this.a + this.c);
                     this.e(this.d(var1 - var6), var1);
                     break;
                  }

                  var7 = this.b;
                  var3 = Math.min(var4, Math.min(var7.length - var2, var7.length - var1));
                  var7 = this.b;
                  var5 = var2 + var3;
                  g.M(var7, var7, var1, var2, var5);
                  var2 = this.f(var5);
                  var1 = this.f(var1 + var3);
               }
            }

            this.c -= var6;
         }
      }
   }

   public final boolean retainAll(Collection var1) {
      i0.d.e(var1, "elements");
      boolean var10 = this.isEmpty();
      byte var4 = 0;
      boolean var7 = false;
      boolean var9 = false;
      boolean var8 = var7;
      if (!var10) {
         if (this.b.length == 0) {
            var8 = var7;
         } else {
            int var5 = this.f(this.a + this.c);
            int var2 = this.a;
            int var3;
            if (var2 < var5) {
               var3 = var2;

               for(var7 = var9; var2 < var5; ++var2) {
                  Object var14 = this.b[var2];
                  if (var1.contains(var14)) {
                     this.b[var3] = var14;
                     ++var3;
                  } else {
                     var7 = true;
                  }
               }

               Object[] var13 = this.b;
               i0.d.e(var13, "<this>");
               Arrays.fill(var13, var3, var5, (Object)null);
               var2 = var3;
            } else {
               int var6 = this.b.length;
               var7 = false;

               Object[] var11;
               Object var12;
               for(var3 = var2; var2 < var6; ++var2) {
                  var11 = this.b;
                  var12 = var11[var2];
                  var11[var2] = null;
                  if (var1.contains(var12)) {
                     this.b[var3] = var12;
                     ++var3;
                  } else {
                     var7 = true;
                  }
               }

               var2 = this.f(var3);

               for(var3 = var4; var3 < var5; ++var3) {
                  var11 = this.b;
                  var12 = var11[var3];
                  var11[var3] = null;
                  if (var1.contains(var12)) {
                     this.b[var2] = var12;
                     var2 = this.c(var2);
                  } else {
                     var7 = true;
                  }
               }
            }

            var8 = var7;
            if (var7) {
               this.g();
               this.c = this.d(var2 - this.a);
               var8 = var7;
            }
         }
      }

      return var8;
   }

   public final Object set(int var1, Object var2) {
      int var3 = this.c;
      if (var1 >= 0 && var1 < var3) {
         var1 = this.f(this.a + var1);
         Object[] var4 = this.b;
         Object var5 = var4[var1];
         var4[var1] = var2;
         return var5;
      } else {
         StringBuilder var6 = new StringBuilder("index: ");
         var6.append(var1);
         var6.append(", size: ");
         var6.append(var3);
         throw new IndexOutOfBoundsException(var6.toString());
      }
   }

   public final int size() {
      return this.c;
   }

   public final Object[] toArray() {
      return this.toArray(new Object[this.c]);
   }

   public final Object[] toArray(Object[] var1) {
      i0.d.e(var1, "array");
      int var3 = var1.length;
      int var2 = this.c;
      if (var3 < var2) {
         Object var5 = Array.newInstance(var1.getClass().getComponentType(), var2);
         i0.d.c(var5, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
         var1 = (Object[])var5;
      }

      var3 = this.f(this.a + this.c);
      var2 = this.a;
      if (var2 < var3) {
         g.O(this.b, var1, var2, var3, 2);
      } else if (!this.isEmpty()) {
         Object[] var4 = this.b;
         g.M(var4, var1, 0, this.a, var4.length);
         var4 = this.b;
         g.M(var4, var1, var4.length - this.a, 0, var3);
      }

      var2 = this.c;
      if (var2 < var1.length) {
         var1[var2] = null;
      }

      return var1;
   }
}
