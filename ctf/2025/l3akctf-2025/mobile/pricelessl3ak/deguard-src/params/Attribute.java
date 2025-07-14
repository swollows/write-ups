package params;

public final class Attribute
{
  public static String getString(l paramL)
  {
    String str = paramL.getClass().getGenericInterfaces()[0].toString();
    paramL = str;
    if (str.startsWith("kotlin.jvm.functions.")) {
      paramL = str.substring(21);
    }
    return paramL;
  }
}
