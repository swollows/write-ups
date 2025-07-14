package asm;

import drupal.Context;
import java.util.Set;

public abstract class FieldVisitor
{
  public static Set visitEnd()
  {
    return Context.get();
  }
}
