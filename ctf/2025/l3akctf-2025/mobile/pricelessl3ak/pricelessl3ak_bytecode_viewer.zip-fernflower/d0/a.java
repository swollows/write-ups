package d0;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface a {
   String c() default "";

   String f() default "";

   int[] l() default {};

   String m() default "";

   int v() default 1;
}
