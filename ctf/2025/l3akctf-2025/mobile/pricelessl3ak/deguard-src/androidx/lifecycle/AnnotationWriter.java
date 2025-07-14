package androidx.lifecycle;

import drupal.Context;
import handle.AnnotationVisitor;
import params.Item;

public class AnnotationWriter
  implements l
{
  public static AnnotationWriter g;
  
  public Label a(Class paramClass)
  {
    return Context.read(paramClass);
  }
  
  public Label a(Class paramClass, AnnotationVisitor paramAnnotationVisitor)
  {
    return a(paramClass);
  }
  
  public final Label a(Item paramItem, AnnotationVisitor paramAnnotationVisitor)
  {
    return a(Context.add(paramItem), paramAnnotationVisitor);
  }
}
