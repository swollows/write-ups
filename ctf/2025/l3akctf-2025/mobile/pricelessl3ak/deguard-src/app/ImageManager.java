package app;

import android.view.WindowInsets.Builder;
import util.Headers;

public class ImageManager
  extends DeltaBaseCache
{
  public final WindowInsets.Builder index;
  
  public ImageManager()
  {
    index = Log.fatal();
  }
  
  public ImageManager(TypeToken paramTypeToken)
  {
    super(paramTypeToken);
    paramTypeToken = paramTypeToken.unwrap();
    if (paramTypeToken != null) {
      paramTypeToken = Log.log(paramTypeToken);
    } else {
      paramTypeToken = Log.fatal();
    }
    index = paramTypeToken;
  }
  
  public TypeToken get()
  {
    put();
    TypeToken localTypeToken = TypeToken.get(Log.getID(index), null);
    a.set(null);
    return localTypeToken;
  }
  
  public void get(Headers paramHeaders)
  {
    Log.set(index, paramHeaders.get());
  }
  
  public void put(Headers paramHeaders)
  {
    Log.log(index, paramHeaders.get());
  }
}
