package androidx.lifecycle;

import drupal.Context;
import handle.AnnotationVisitor;
import params.Item;

public abstract interface l
{
  public Label a(Class paramClass)
  {
    throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
  }
  
  public Label a(Class paramClass, AnnotationVisitor paramAnnotationVisitor)
  {
    return a(paramClass);
  }
  
  public Label a(Item paramItem, AnnotationVisitor paramAnnotationVisitor)
  {
    return a(Context.add(paramItem), paramAnnotationVisitor);
  }
}
