package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;

public final class AlertController
{
  public Drawable a;
  public ImageView b;
  public TextView c;
  public CharSequence d;
  public View g;
  public final int h;
  public final int i;
  public ListAdapter mAdapter;
  public final int mAlertDialogLayout;
  public Button mButton;
  public int mCheckedItem;
  public final Context mContext;
  public final k mDialog;
  public final ExternalOpenVPNService.OpenVPNServiceHandler mHandler;
  public AlertController.RecycleListView mListView;
  public TextView mMessageView;
  public NestedScrollView mScrollView;
  public Button mTitleView;
  public Button mView;
  public final Window mWindow;
  public final boolean p;
  public final int r;
  public final c this$0;
  
  public AlertController(Context paramContext, k paramK, Window paramWindow) {}
  
  public static ViewGroup resolvePanel(View paramView1, View paramView2)
  {
    if (paramView1 == null)
    {
      paramView1 = paramView2;
      if ((paramView2 instanceof ViewStub)) {
        paramView1 = ((ViewStub)paramView2).inflate();
      }
      return (ViewGroup)paramView1;
    }
    if (paramView2 != null)
    {
      ViewParent localViewParent = paramView2.getParent();
      if ((localViewParent instanceof ViewGroup)) {
        ((ViewGroup)localViewParent).removeView(paramView2);
      }
    }
    paramView2 = paramView1;
    if ((paramView1 instanceof ViewStub)) {
      paramView2 = ((ViewStub)paramView1).inflate();
    }
    return (ViewGroup)paramView2;
  }
}
