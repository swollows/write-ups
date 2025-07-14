package android.support.v4.media;

import androidx.core.opml.RemoteActionCompat;
import bsh.ByteVector;

public final class RemoteActionCompatParcelizer
  extends androidx.core.opml.RemoteActionCompatParcelizer
{
  public RemoteActionCompatParcelizer() {}
  
  public static RemoteActionCompat read(ByteVector paramByteVector)
  {
    return androidx.core.opml.RemoteActionCompatParcelizer.read(paramByteVector);
  }
  
  public static void write(RemoteActionCompat paramRemoteActionCompat, ByteVector paramByteVector)
  {
    androidx.core.opml.RemoteActionCompatParcelizer.write(paramRemoteActionCompat, paramByteVector);
  }
}
