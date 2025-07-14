package H;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class y extends SpannableStringBuilder {
   public final Class a;
   public final ArrayList b = new ArrayList();

   public y(Class var1, y var2, int var3, int var4) {
      super(var2, var3, var4);
      C.b.f(var1, "watcherClass cannot be null");
      this.a = var1;
   }

   public y(Class var1, CharSequence var2) {
      super(var2);
      C.b.f(var1, "watcherClass cannot be null");
      this.a = var1;
   }

   public final void a() {
      int var1 = 0;

      while(true) {
         ArrayList var2 = this.b;
         if (var1 >= var2.size()) {
            return;
         }

         ((x)var2.get(var1)).b.incrementAndGet();
         ++var1;
      }
   }

   public final Editable append(char var1) {
      super.append(var1);
      return this;
   }

   public final Editable append(CharSequence var1) {
      super.append(var1);
      return this;
   }

   public final Editable append(CharSequence var1, int var2, int var3) {
      super.append(var1, var2, var3);
      return this;
   }

   public final SpannableStringBuilder append(char var1) {
      super.append(var1);
      return this;
   }

   public final SpannableStringBuilder append(CharSequence var1) {
      super.append(var1);
      return this;
   }

   public final SpannableStringBuilder append(CharSequence var1, int var2, int var3) {
      super.append(var1, var2, var3);
      return this;
   }

   public final SpannableStringBuilder append(CharSequence var1, Object var2, int var3) {
      super.append(var1, var2, var3);
      return this;
   }

   public final Appendable append(char var1) {
      super.append(var1);
      return this;
   }

   public final Appendable append(CharSequence var1) {
      super.append(var1);
      return this;
   }

   public final Appendable append(CharSequence var1, int var2, int var3) {
      super.append(var1, var2, var3);
      return this;
   }

   public final void b() {
      this.e();
      int var1 = 0;

      while(true) {
         ArrayList var2 = this.b;
         if (var1 >= var2.size()) {
            return;
         }

         ((x)var2.get(var1)).onTextChanged(this, 0, this.length(), this.length());
         ++var1;
      }
   }

   public final x c(Object var1) {
      int var2 = 0;

      while(true) {
         ArrayList var3 = this.b;
         if (var2 >= var3.size()) {
            return null;
         }

         x var4 = (x)var3.get(var2);
         if (var4.a == var1) {
            return var4;
         }

         ++var2;
      }
   }

   public final boolean d(Object var1) {
      boolean var2;
      if (var1 != null) {
         Class var3 = var1.getClass();
         if (this.a == var3) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   public final Editable delete(int var1, int var2) {
      super.delete(var1, var2);
      return this;
   }

   public final SpannableStringBuilder delete(int var1, int var2) {
      super.delete(var1, var2);
      return this;
   }

   public final void e() {
      int var1 = 0;

      while(true) {
         ArrayList var2 = this.b;
         if (var1 >= var2.size()) {
            return;
         }

         ((x)var2.get(var1)).b.decrementAndGet();
         ++var1;
      }
   }

   public final int getSpanEnd(Object var1) {
      Object var2 = var1;
      if (this.d(var1)) {
         x var3 = this.c(var1);
         var2 = var1;
         if (var3 != null) {
            var2 = var3;
         }
      }

      return super.getSpanEnd(var2);
   }

   public final int getSpanFlags(Object var1) {
      Object var2 = var1;
      if (this.d(var1)) {
         x var3 = this.c(var1);
         var2 = var1;
         if (var3 != null) {
            var2 = var3;
         }
      }

      return super.getSpanFlags(var2);
   }

   public final int getSpanStart(Object var1) {
      Object var2 = var1;
      if (this.d(var1)) {
         x var3 = this.c(var1);
         var2 = var1;
         if (var3 != null) {
            var2 = var3;
         }
      }

      return super.getSpanStart(var2);
   }

   public final Object[] getSpans(int var1, int var2, Class var3) {
      if (this.a != var3) {
         return super.getSpans(var1, var2, var3);
      } else {
         x[] var4 = (x[])super.getSpans(var1, var2, x.class);
         Object[] var5 = (Object[])Array.newInstance(var3, var4.length);

         for(var1 = 0; var1 < var4.length; ++var1) {
            var5[var1] = var4[var1].a;
         }

         return var5;
      }
   }

   public final Editable insert(int var1, CharSequence var2) {
      super.insert(var1, var2);
      return this;
   }

   public final Editable insert(int var1, CharSequence var2, int var3, int var4) {
      super.insert(var1, var2, var3, var4);
      return this;
   }

   public final SpannableStringBuilder insert(int var1, CharSequence var2) {
      super.insert(var1, var2);
      return this;
   }

   public final SpannableStringBuilder insert(int var1, CharSequence var2, int var3, int var4) {
      super.insert(var1, var2, var3, var4);
      return this;
   }

   public final int nextSpanTransition(int var1, int var2, Class var3) {
      Class var4;
      if (var3 != null) {
         var4 = var3;
         if (this.a != var3) {
            return super.nextSpanTransition(var1, var2, var4);
         }
      }

      var4 = x.class;
      return super.nextSpanTransition(var1, var2, var4);
   }

   public final void removeSpan(Object var1) {
      x var3;
      if (this.d(var1)) {
         x var2 = this.c(var1);
         var3 = var2;
         if (var2 != null) {
            var1 = var2;
            var3 = var2;
         }
      } else {
         var3 = null;
      }

      super.removeSpan(var1);
      if (var3 != null) {
         this.b.remove(var3);
      }

   }

   public final SpannableStringBuilder replace(int var1, int var2, CharSequence var3) {
      this.a();
      super.replace(var1, var2, var3);
      this.e();
      return this;
   }

   public final SpannableStringBuilder replace(int var1, int var2, CharSequence var3, int var4, int var5) {
      this.a();
      super.replace(var1, var2, var3, var4, var5);
      this.e();
      return this;
   }

   public final void setSpan(Object var1, int var2, int var3, int var4) {
      Object var5 = var1;
      if (this.d(var1)) {
         var5 = new x(var1);
         this.b.add(var5);
      }

      super.setSpan(var5, var2, var3, var4);
   }

   public final CharSequence subSequence(int var1, int var2) {
      return new y(this.a, this, var1, var2);
   }
}
