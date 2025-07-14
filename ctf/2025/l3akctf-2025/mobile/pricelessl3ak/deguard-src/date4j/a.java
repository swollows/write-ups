package date4j;

import android.os.Bundle;
import androidx.lifecycle.ClassWriter;
import androidx.lifecycle.f;
import androidx.lifecycle.x;
import app.Element;
import java.util.LinkedHashMap;
import tts.p;

public final class a
{
  public final Element a;
  public final p b;
  public Bundle c;
  public final Object e;
  public boolean f;
  public final LinkedHashMap h;
  public boolean i;
  public boolean l;
  
  public a(tts.c paramC, p paramP)
  {
    e = paramC;
    b = paramP;
    a = new Element(13);
    h = new LinkedHashMap();
    i = true;
  }
  
  public final void a()
  {
    Object localObject = e;
    if (getLifecyclea == androidx.lifecycle.c.a)
    {
      if (!f)
      {
        b.a();
        ((x)localObject).getLifecycle().a(new ui.a(2, this));
        f = true;
        return;
      }
      throw new IllegalStateException("SavedStateRegistry was already attached.");
    }
    throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
  }
}
