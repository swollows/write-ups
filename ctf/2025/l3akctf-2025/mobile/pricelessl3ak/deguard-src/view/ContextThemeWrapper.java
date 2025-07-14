package view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;

public final class ContextThemeWrapper
  extends ContextWrapper
{
  public static Configuration activity;
  public LayoutInflater mInflater;
  public Resources.Theme mTheme;
  public int mThemeResource;
  public Resources resources;
  public Configuration theme;
  
  public ContextThemeWrapper(Context paramContext, int paramInt)
  {
    super(paramContext);
    mThemeResource = paramInt;
  }
  
  public final void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
  }
  
  public final AssetManager getAssets()
  {
    return getResources().getAssets();
  }
  
  public final Resources getResources()
  {
    if (resources == null)
    {
      Configuration localConfiguration1 = theme;
      if (localConfiguration1 != null) {
        if (Build.VERSION.SDK_INT >= 26)
        {
          if (activity == null)
          {
            Configuration localConfiguration2 = new Configuration();
            fontScale = 0.0F;
            activity = localConfiguration2;
          }
          if (localConfiguration1.equals(activity)) {}
        }
        else
        {
          resources = createConfigurationContext(theme).getResources();
          break label86;
        }
      }
      resources = super.getResources();
    }
    label86:
    return resources;
  }
  
  public final Object getSystemService(String paramString)
  {
    if ("layout_inflater".equals(paramString))
    {
      if (mInflater == null) {
        mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
      }
      return mInflater;
    }
    return getBaseContext().getSystemService(paramString);
  }
  
  public final Resources.Theme getTheme()
  {
    Resources.Theme localTheme = mTheme;
    if (localTheme != null) {
      return localTheme;
    }
    if (mThemeResource == 0) {
      mThemeResource = 2131624197;
    }
    initializeTheme();
    return mTheme;
  }
  
  public final void getTheme(Configuration paramConfiguration)
  {
    if (resources == null)
    {
      if (theme == null)
      {
        theme = new Configuration(paramConfiguration);
        return;
      }
      throw new IllegalStateException("Override configuration has already been set");
    }
    throw new IllegalStateException("getResources() or getAssets() has already been called");
  }
  
  public final void initializeTheme()
  {
    if (mTheme == null)
    {
      mTheme = getResources().newTheme();
      Resources.Theme localTheme = getBaseContext().getTheme();
      if (localTheme != null) {
        mTheme.setTo(localTheme);
      }
    }
    mTheme.applyStyle(mThemeResource, true);
  }
  
  public final void setTheme(int paramInt)
  {
    if (mThemeResource != paramInt)
    {
      mThemeResource = paramInt;
      initializeTheme();
    }
  }
}
