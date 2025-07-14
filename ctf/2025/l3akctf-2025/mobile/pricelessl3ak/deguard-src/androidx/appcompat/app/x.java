package androidx.appcompat.app;

import VCard.Attribute;
import no.l3akctf.pricelessl3ak.MainActivity;
import tts.h;
import ui.AbstractGalleryActivity;

public final class x
  implements Attribute
{
  public x(MainActivity paramMainActivity)
  {
    a = paramMainActivity;
  }
  
  public final void a(AbstractGalleryActivity paramAbstractGalleryActivity)
  {
    paramAbstractGalleryActivity = a;
    f localF = paramAbstractGalleryActivity.getDelegate();
    localF.b();
    paramAbstractGalleryActivity.getSavedStateRegistry().a("androidx:appcompat");
    localF.onCreate();
  }
}
