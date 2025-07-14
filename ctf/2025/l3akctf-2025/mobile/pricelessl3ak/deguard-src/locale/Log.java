package locale;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Log
{
  int d();
  
  String getClassName();
  
  String getID();
  
  String message();
  
  int[] value();
}
