package internal;

import accessibility.Frame;
import android.app.AppOpsManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Size;
import android.util.SizeF;
import androidx.activity.result.ActivityResult;
import app.Element;
import concurrent.AbstractFuture;
import concurrent.AbstractFuture.Waiter;
import concurrent.State;
import data.Namespace;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import signature.PermissionChecker;
import widgets.Pair;

public abstract class Label
{
  public Label(int paramInt)
  {
    new ConcurrentHashMap();
  }
  
  public static Object a(String paramString, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 34) {
      return Frame.a(paramString, paramBundle);
    }
    paramString = paramBundle.getParcelable(paramString);
    if (ActivityResult.class.isInstance(paramString)) {
      return paramString;
    }
    return null;
  }
  
  public static final Bundle bundleOf(Pair... paramVarArgs)
  {
    Object localObject1 = new Bundle(paramVarArgs.length);
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      Object localObject2 = paramVarArgs[i];
      String str = (String)name;
      localObject2 = key;
      if (localObject2 == null)
      {
        ((BaseBundle)localObject1).putString(str, null);
      }
      else if ((localObject2 instanceof Boolean))
      {
        ((BaseBundle)localObject1).putBoolean(str, ((Boolean)localObject2).booleanValue());
      }
      else if ((localObject2 instanceof Byte))
      {
        ((Bundle)localObject1).putByte(str, ((Number)localObject2).byteValue());
      }
      else if ((localObject2 instanceof Character))
      {
        ((Bundle)localObject1).putChar(str, ((Character)localObject2).charValue());
      }
      else if ((localObject2 instanceof Double))
      {
        ((BaseBundle)localObject1).putDouble(str, ((Number)localObject2).doubleValue());
      }
      else if ((localObject2 instanceof Float))
      {
        ((Bundle)localObject1).putFloat(str, ((Number)localObject2).floatValue());
      }
      else if ((localObject2 instanceof Integer))
      {
        ((BaseBundle)localObject1).putInt(str, ((Number)localObject2).intValue());
      }
      else if ((localObject2 instanceof Long))
      {
        ((BaseBundle)localObject1).putLong(str, ((Number)localObject2).longValue());
      }
      else if ((localObject2 instanceof Short))
      {
        ((Bundle)localObject1).putShort(str, ((Number)localObject2).shortValue());
      }
      else if ((localObject2 instanceof Bundle))
      {
        ((Bundle)localObject1).putBundle(str, (Bundle)localObject2);
      }
      else if ((localObject2 instanceof CharSequence))
      {
        ((Bundle)localObject1).putCharSequence(str, (CharSequence)localObject2);
      }
      else if ((localObject2 instanceof Parcelable))
      {
        ((Bundle)localObject1).putParcelable(str, (Parcelable)localObject2);
      }
      else if ((localObject2 instanceof boolean[]))
      {
        ((BaseBundle)localObject1).putBooleanArray(str, (boolean[])localObject2);
      }
      else if ((localObject2 instanceof byte[]))
      {
        ((Bundle)localObject1).putByteArray(str, (byte[])localObject2);
      }
      else if ((localObject2 instanceof char[]))
      {
        ((Bundle)localObject1).putCharArray(str, (char[])localObject2);
      }
      else if ((localObject2 instanceof double[]))
      {
        ((BaseBundle)localObject1).putDoubleArray(str, (double[])localObject2);
      }
      else if ((localObject2 instanceof float[]))
      {
        ((Bundle)localObject1).putFloatArray(str, (float[])localObject2);
      }
      else if ((localObject2 instanceof int[]))
      {
        ((BaseBundle)localObject1).putIntArray(str, (int[])localObject2);
      }
      else if ((localObject2 instanceof long[]))
      {
        ((BaseBundle)localObject1).putLongArray(str, (long[])localObject2);
      }
      else if ((localObject2 instanceof short[]))
      {
        ((Bundle)localObject1).putShortArray(str, (short[])localObject2);
      }
      else if ((localObject2 instanceof Object[]))
      {
        Class localClass = localObject2.getClass().getComponentType();
        params.Log.get(localClass);
        if (Parcelable.class.isAssignableFrom(localClass))
        {
          ((Bundle)localObject1).putParcelableArray(str, (Parcelable[])localObject2);
        }
        else if (String.class.isAssignableFrom(localClass))
        {
          ((BaseBundle)localObject1).putStringArray(str, (String[])localObject2);
        }
        else if (CharSequence.class.isAssignableFrom(localClass))
        {
          ((Bundle)localObject1).putCharSequenceArray(str, (CharSequence[])localObject2);
        }
        else if (Serializable.class.isAssignableFrom(localClass))
        {
          ((Bundle)localObject1).putSerializable(str, (Serializable)localObject2);
        }
        else
        {
          paramVarArgs = localClass.getCanonicalName();
          localObject1 = new StringBuilder("Illegal value array type ");
          ((StringBuilder)localObject1).append(paramVarArgs);
          ((StringBuilder)localObject1).append(" for key \"");
          ((StringBuilder)localObject1).append(str);
          ((StringBuilder)localObject1).append('"');
          throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
        }
      }
      else if ((localObject2 instanceof Serializable))
      {
        ((Bundle)localObject1).putSerializable(str, (Serializable)localObject2);
      }
      else if ((localObject2 instanceof IBinder))
      {
        ((Bundle)localObject1).putBinder(str, (IBinder)localObject2);
      }
      else if ((localObject2 instanceof Size))
      {
        ((Bundle)localObject1).putSize(str, (Size)localObject2);
      }
      else
      {
        if (!(localObject2 instanceof SizeF)) {
          break label772;
        }
        ((Bundle)localObject1).putSizeF(str, (SizeF)localObject2);
      }
      i += 1;
      continue;
      label772:
      paramVarArgs = localObject2.getClass().getCanonicalName();
      localObject1 = new StringBuilder("Illegal value type ");
      ((StringBuilder)localObject1).append(paramVarArgs);
      ((StringBuilder)localObject1).append(" for key \"");
      ((StringBuilder)localObject1).append(str);
      ((StringBuilder)localObject1).append('"');
      throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
    }
    return localObject1;
  }
  
  public static int checkSelfPermission(Context paramContext, String paramString)
  {
    int i = Process.myPid();
    int k = Process.myUid();
    String str1 = paramContext.getPackageName();
    Object localObject = str1;
    if (paramContext.checkPermission(paramString, i, k) == -1) {
      return -1;
    }
    String str2 = AppOpsManager.permissionToOp(paramString);
    if (str2 == null) {}
    do
    {
      return 0;
      paramString = (String)localObject;
      if (str1 == null)
      {
        paramString = paramContext.getPackageManager().getPackagesForUid(k);
        if (paramString == null) {
          break;
        }
        if (paramString.length <= 0) {
          return -1;
        }
        paramString = paramString[0];
      }
      i = Process.myUid();
      localObject = paramContext.getPackageName();
      if ((i == k) && (Objects.equals(localObject, paramString)))
      {
        if (Build.VERSION.SDK_INT >= 29)
        {
          localObject = (AppOpsManager)paramContext.getSystemService(AppOpsManager.class);
          i = Binder.getCallingUid();
          int j = 1;
          if (localObject == null) {
            i = 1;
          } else {
            i = ((AppOpsManager)localObject).checkOpNoThrow(str2, i, paramString);
          }
          if (i == 0)
          {
            paramContext = PermissionChecker.checkPermission(paramContext);
            if (localObject == null) {
              i = j;
            } else {
              i = ((AppOpsManager)localObject).checkOpNoThrow(str2, k, paramContext);
            }
          }
        }
        else
        {
          i = ((AppOpsManager)paramContext.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str2, paramString);
        }
      }
      else {
        i = ((AppOpsManager)paramContext.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str2, paramString);
      }
    } while (i == 0);
    return -2;
    return -1;
  }
  
  public static void close(Closeable paramCloseable)
  {
    if (paramCloseable != null) {
      try
      {
        paramCloseable.close();
        return;
      }
      catch (IOException paramCloseable) {}
    }
  }
  
  public static boolean copy(File paramFile, Resources paramResources, int paramInt)
  {
    try
    {
      InputStream localInputStream = paramResources.openRawResource(paramInt);
      paramResources = localInputStream;
      try
      {
        boolean bool = copyFile(paramFile, localInputStream);
        close(localInputStream);
        return bool;
      }
      catch (Throwable paramFile) {}
      close(paramResources);
    }
    catch (Throwable paramFile)
    {
      paramResources = null;
    }
    throw paramFile;
  }
  
  public static boolean copyFile(File paramFile, InputStream paramInputStream)
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.allowThreadDiskWrites();
    StringBuilder localStringBuilder = null;
    Object localObject = null;
    try
    {
      paramFile = new FileOutputStream(paramFile, false);
      localObject = new byte['?'];
      try
      {
        for (;;)
        {
          int i = paramInputStream.read((byte[])localObject);
          if (i == -1) {
            break;
          }
          paramFile.write((byte[])localObject, 0, i);
        }
        close(paramFile);
      }
      catch (Throwable paramInputStream)
      {
        localObject = paramFile;
        paramFile = paramInputStream;
        break label137;
      }
      catch (IOException paramInputStream) {}
      StrictMode.setThreadPolicy(localThreadPolicy);
      return true;
    }
    catch (Throwable paramFile) {}catch (IOException paramInputStream)
    {
      paramFile = localStringBuilder;
      localObject = paramFile;
      localStringBuilder = new StringBuilder();
      localObject = paramFile;
      localStringBuilder.append("Error copying resource contents to temp file: ");
      localObject = paramFile;
      localStringBuilder.append(paramInputStream.getMessage());
      localObject = paramFile;
      android.util.Log.e("TypefaceCompatUtil", localStringBuilder.toString());
      close(paramFile);
      StrictMode.setThreadPolicy(localThreadPolicy);
      return false;
    }
    label137:
    close((Closeable)localObject);
    StrictMode.setThreadPolicy(localThreadPolicy);
    throw paramFile;
  }
  
  public static File open(Context paramContext)
  {
    paramContext = paramContext.getCacheDir();
    if (paramContext == null) {
      return null;
    }
    Object localObject1 = new StringBuilder(".font");
    ((StringBuilder)localObject1).append(Process.myPid());
    ((StringBuilder)localObject1).append("-");
    ((StringBuilder)localObject1).append(Process.myTid());
    ((StringBuilder)localObject1).append("-");
    localObject1 = ((StringBuilder)localObject1).toString();
    int i = 0;
    while (i < 100)
    {
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(i);
      localObject2 = new File(paramContext, ((StringBuilder)localObject2).toString());
      try
      {
        boolean bool = ((File)localObject2).createNewFile();
        if (bool) {
          return localObject2;
        }
      }
      catch (IOException localIOException)
      {
        for (;;) {}
      }
      i += 1;
    }
    return null;
  }
  
  public static MappedByteBuffer read(Context paramContext, Uri paramUri)
  {
    paramContext = paramContext.getContentResolver();
    try
    {
      paramContext = paramContext.openFileDescriptor(paramUri, "r", null);
      if (paramContext == null)
      {
        if (paramContext != null)
        {
          paramContext.close();
          return null;
        }
      }
      else {
        try
        {
          paramUri = new FileInputStream(paramContext.getFileDescriptor());
          try
          {
            Object localObject;
            long l;
            paramUri.addSuppressed(paramContext);
            throw paramUri;
          }
          catch (IOException paramContext) {}
        }
        catch (Throwable paramUri)
        {
          try
          {
            localObject = paramUri.getChannel();
            l = ((FileChannel)localObject).size();
            localObject = ((FileChannel)localObject).map(FileChannel.MapMode.READ_ONLY, 0L, l);
            paramUri.close();
          }
          catch (Throwable localThrowable)
          {
            try
            {
              paramUri.close();
            }
            catch (Throwable paramUri)
            {
              localThrowable.addSuppressed(paramUri);
            }
            throw localThrowable;
          }
          try
          {
            paramContext.close();
            return localObject;
          }
          catch (IOException paramContext)
          {
            return null;
          }
          paramUri = paramUri;
          try
          {
            paramContext.close();
          }
          catch (Throwable paramContext) {}
        }
      }
      return null;
    }
    catch (IOException paramContext)
    {
      return null;
    }
  }
  
  public Typeface a(Context paramContext, List paramList, int paramInt)
  {
    throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
  }
  
  public views.Item a(views.Item[] paramArrayOfItem, int paramInt)
  {
    new Element(21);
    int i;
    if ((paramInt & 0x1) == 0) {
      i = 400;
    } else {
      i = 700;
    }
    int i1;
    if ((paramInt & 0x2) != 0) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    int n = paramArrayOfItem.length;
    Object localObject = null;
    int j = Integer.MAX_VALUE;
    paramInt = 0;
    while (paramInt < n)
    {
      views.Item localItem = paramArrayOfItem[paramInt];
      int m = Math.abs(a - i);
      int k;
      if (b == i1) {
        k = 0;
      } else {
        k = 1;
      }
      m = m * 2 + k;
      if (localObject != null)
      {
        k = j;
        if (j <= m) {}
      }
      else
      {
        localObject = localItem;
        k = m;
      }
      paramInt += 1;
      j = k;
    }
    return localObject;
  }
  
  public abstract boolean add(AbstractFuture paramAbstractFuture, AbstractFuture.Waiter paramWaiter1, AbstractFuture.Waiter paramWaiter2);
  
  public abstract Item b();
  
  /* Error */
  public Typeface copy(Context paramContext, InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 529	internal/Label:open	(Landroid/content/Context;)Ljava/io/File;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +5 -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: aload_1
    //   12: aload_2
    //   13: invokestatic 383	internal/Label:copyFile	(Ljava/io/File;Ljava/io/InputStream;)Z
    //   16: istore_3
    //   17: iload_3
    //   18: ifne +10 -> 28
    //   21: aload_1
    //   22: invokevirtual 532	java/io/File:delete	()Z
    //   25: pop
    //   26: aconst_null
    //   27: areturn
    //   28: aload_1
    //   29: invokevirtual 535	java/io/File:getPath	()Ljava/lang/String;
    //   32: invokestatic 541	android/graphics/Typeface:createFromFile	(Ljava/lang/String;)Landroid/graphics/Typeface;
    //   35: astore_2
    //   36: aload_1
    //   37: invokevirtual 532	java/io/File:delete	()Z
    //   40: pop
    //   41: aload_2
    //   42: areturn
    //   43: astore_2
    //   44: aload_1
    //   45: invokevirtual 532	java/io/File:delete	()Z
    //   48: pop
    //   49: aload_2
    //   50: athrow
    //   51: aload_1
    //   52: invokevirtual 532	java/io/File:delete	()Z
    //   55: pop
    //   56: aconst_null
    //   57: areturn
    //   58: astore_2
    //   59: goto -8 -> 51
    //   62: astore_2
    //   63: goto -12 -> 51
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	Label
    //   0	66	1	paramContext	Context
    //   0	66	2	paramInputStream	InputStream
    //   16	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   11	17	43	java/lang/Throwable
    //   28	36	43	java/lang/Throwable
    //   11	17	58	java/lang/RuntimeException
    //   28	36	62	java/lang/RuntimeException
  }
  
  /* Error */
  public Typeface get(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 529	internal/Label:open	(Landroid/content/Context;)Ljava/io/File;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +5 -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: aload_1
    //   12: aload_2
    //   13: iload_3
    //   14: invokestatic 544	internal/Label:copy	(Ljava/io/File;Landroid/content/res/Resources;I)Z
    //   17: istore 6
    //   19: iload 6
    //   21: ifne +10 -> 31
    //   24: aload_1
    //   25: invokevirtual 532	java/io/File:delete	()Z
    //   28: pop
    //   29: aconst_null
    //   30: areturn
    //   31: aload_1
    //   32: invokevirtual 535	java/io/File:getPath	()Ljava/lang/String;
    //   35: invokestatic 541	android/graphics/Typeface:createFromFile	(Ljava/lang/String;)Landroid/graphics/Typeface;
    //   38: astore_2
    //   39: aload_1
    //   40: invokevirtual 532	java/io/File:delete	()Z
    //   43: pop
    //   44: aload_2
    //   45: areturn
    //   46: astore_2
    //   47: aload_1
    //   48: invokevirtual 532	java/io/File:delete	()Z
    //   51: pop
    //   52: aload_2
    //   53: athrow
    //   54: aload_1
    //   55: invokevirtual 532	java/io/File:delete	()Z
    //   58: pop
    //   59: aconst_null
    //   60: areturn
    //   61: astore_2
    //   62: goto -8 -> 54
    //   65: astore_2
    //   66: goto -12 -> 54
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	69	0	this	Label
    //   0	69	1	paramContext	Context
    //   0	69	2	paramResources	Resources
    //   0	69	3	paramInt1	int
    //   0	69	4	paramString	String
    //   0	69	5	paramInt2	int
    //   17	3	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   11	19	46	java/lang/Throwable
    //   31	39	46	java/lang/Throwable
    //   11	19	61	java/lang/RuntimeException
    //   31	39	65	java/lang/RuntimeException
  }
  
  public abstract Typeface get(Context paramContext, Namespace paramNamespace, Resources paramResources, int paramInt);
  
  public abstract void putNext(AbstractFuture.Waiter paramWaiter1, AbstractFuture.Waiter paramWaiter2);
  
  public abstract void putThread(AbstractFuture.Waiter paramWaiter, Thread paramThread);
  
  public abstract Typeface read(Context paramContext, views.Item[] paramArrayOfItem, int paramInt);
  
  public abstract boolean set(AbstractFuture paramAbstractFuture, State paramState);
  
  public abstract boolean set(AbstractFuture paramAbstractFuture, Object paramObject1, Object paramObject2);
}
