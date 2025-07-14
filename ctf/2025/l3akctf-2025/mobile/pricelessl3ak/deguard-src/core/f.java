package core;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

public final class f
{
  public Label[] a;
  public final byte[] b;
  public byte[] c;
  public boolean e = false;
  public final File f;
  public final Menu n;
  public final String t;
  public final Executor x;
  
  public f(AssetManager paramAssetManager, Executor paramExecutor, Menu paramMenu, String paramString, File paramFile)
  {
    x = paramExecutor;
    n = paramMenu;
    t = paramString;
    f = paramFile;
    int i = Build.VERSION.SDK_INT;
    if (i >= 31) {
      paramAssetManager = b.a;
    } else {
      switch (i)
      {
      default: 
        paramAssetManager = null;
        break;
      case 28: 
      case 29: 
      case 30: 
        paramAssetManager = b.f;
        break;
      case 27: 
        paramAssetManager = b.g;
        break;
      case 26: 
        paramAssetManager = b.h;
        break;
      case 24: 
      case 25: 
        paramAssetManager = b.b;
      }
    }
    b = paramAssetManager;
  }
  
  public final void add(int paramInt, Serializable paramSerializable)
  {
    paramSerializable = new NumberPicker.PressedStateHelper(this, paramInt, paramSerializable);
    x.execute(paramSerializable);
  }
  
  public final FileInputStream getItem(AssetManager paramAssetManager, String paramString)
  {
    try
    {
      paramAssetManager = paramAssetManager.openFd(paramString).createInputStream();
      return paramAssetManager;
    }
    catch (FileNotFoundException paramAssetManager)
    {
      paramAssetManager = paramAssetManager.getMessage();
      if ((paramAssetManager != null) && (paramAssetManager.contains("compressed"))) {
        n.clear();
      }
    }
    return null;
  }
}
