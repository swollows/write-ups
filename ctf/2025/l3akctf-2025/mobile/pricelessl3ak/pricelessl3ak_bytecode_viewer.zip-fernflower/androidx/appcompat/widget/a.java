package androidx.appcompat.widget;

public final class a implements D.a0 {
   public boolean a;
   public int b;
   public final ActionBarContextView c;

   public a(ActionBarContextView var1) {
      this.c = var1;
      this.a = false;
   }

   public final void a() {
      if (!this.a) {
         ActionBarContextView var1 = this.c;
         var1.f = null;
         ActionBarContextView.b(var1, this.b);
      }
   }

   public final void b() {
      this.a = true;
   }

   public final void c() {
      ActionBarContextView.a(this.c);
      this.a = false;
   }
}
