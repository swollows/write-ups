package o;

public final class c implements k {
   public static final c b = new c(0);
   public static final c c = new c(1);
   public static final c d = new c(2);
   public final int a;

   // $FF: synthetic method
   public c(int var1) {
      this.a = var1;
   }

   public final String toString() {
      switch (this.a) {
         case 0:
            return "NeverEqualPolicy";
         case 1:
            return "ReferentialEqualityPolicy";
         default:
            return "StructuralEqualityPolicy";
      }
   }
}
