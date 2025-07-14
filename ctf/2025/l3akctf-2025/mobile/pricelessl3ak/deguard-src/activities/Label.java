package activities;

public final class Label
  implements Pattern
{
  public static final Label a;
  public static final Label b;
  public static final Label c;
  
  public final String toString()
  {
    switch (d)
    {
    default: 
      return "StructuralEqualityPolicy";
    case 1: 
      return "ReferentialEqualityPolicy";
    }
    return "NeverEqualPolicy";
  }
}
