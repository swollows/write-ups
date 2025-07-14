package androidx.appcompat.view.menu;

import Console.R.styleable;
import a.ClassWriter;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import menu.f;
import menu.h;
import menu.m.a;

public class ListMenuItemView
  extends LinearLayout
  implements m.a, AbsListView.SelectionBoundsAdjuster
{
  public TextView a;
  public h b;
  public RadioButton c;
  public final Drawable close;
  public TextView d;
  public CheckBox e;
  public LinearLayout f;
  public ImageView g;
  public ImageView k;
  public final boolean l;
  public final Drawable mBackground;
  public boolean mForceShowIcon;
  public ImageView mIconView;
  public LayoutInflater mInflater;
  public boolean mPreserveIconSpacing;
  public final int mTextAppearance;
  public final Context mTextAppearanceContext;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = ClassWriter.obtainStyledAttributes(getContext(), paramAttributeSet, R.styleable.MenuView, 2130903207);
    mBackground = paramAttributeSet.getDrawable(5);
    TypedArray localTypedArray = (TypedArray)b;
    mTextAppearance = localTypedArray.getResourceId(1, -1);
    mPreserveIconSpacing = localTypedArray.getBoolean(7, false);
    mTextAppearanceContext = paramContext;
    close = paramAttributeSet.getDrawable(8);
    paramContext = paramContext.getTheme().obtainStyledAttributes(null, new int[] { 16843049 }, 2130903160, 0);
    l = paramContext.hasValue(0);
    paramAttributeSet.recycle();
    paramContext.recycle();
  }
  
  private LayoutInflater getInflater()
  {
    if (mInflater == null) {
      mInflater = LayoutInflater.from(getContext());
    }
    return mInflater;
  }
  
  private void setSubMenuArrowVisible(boolean paramBoolean)
  {
    ImageView localImageView = k;
    if (localImageView != null)
    {
      int i;
      if (paramBoolean) {
        i = 0;
      } else {
        i = 8;
      }
      localImageView.setVisibility(i);
    }
  }
  
  public final void a(h paramH)
  {
    b = paramH;
    boolean bool = paramH.isVisible();
    int j = 0;
    if (bool) {
      i = 0;
    } else {
      i = 8;
    }
    setVisibility(i);
    setTitle(a);
    setCheckable(paramH.isCheckable());
    if (b.b())
    {
      if (b.d()) {
        i = i;
      } else {
        i = h;
      }
      if (i != 0)
      {
        i = 1;
        break label92;
      }
    }
    int i = 0;
    label92:
    b.d();
    Object localObject;
    if (i != 0)
    {
      localObject = b;
      if (b.b())
      {
        if (b.d()) {
          i = i;
        } else {
          i = h;
        }
        if (i != 0)
        {
          i = 1;
          break label158;
        }
      }
      i = 0;
      label158:
      if (i != 0)
      {
        i = j;
        break label171;
      }
    }
    i = 8;
    label171:
    if (i == 0)
    {
      TextView localTextView = a;
      localObject = b;
      char c1;
      if (b.d()) {
        c1 = i;
      } else {
        c1 = h;
      }
      if (c1 == 0)
      {
        localObject = "";
      }
      else
      {
        f localF = b;
        Resources localResources = a.getResources();
        StringBuilder localStringBuilder = new StringBuilder();
        if (ViewConfiguration.get(a).hasPermanentMenuKey()) {
          localStringBuilder.append(localResources.getString(2131558417));
        }
        if (localF.d()) {
          j = l;
        } else {
          j = k;
        }
        h.add(localStringBuilder, j, 65536, localResources.getString(2131558413));
        h.add(localStringBuilder, j, 4096, localResources.getString(2131558409));
        h.add(localStringBuilder, j, 2, localResources.getString(2131558408));
        h.add(localStringBuilder, j, 1, localResources.getString(2131558414));
        h.add(localStringBuilder, j, 4, localResources.getString(2131558416));
        h.add(localStringBuilder, j, 8, localResources.getString(2131558412));
        if (c1 != '\b')
        {
          if (c1 != '\n')
          {
            if (c1 != ' ') {
              localStringBuilder.append(c1);
            } else {
              localStringBuilder.append(localResources.getString(2131558415));
            }
          }
          else {
            localStringBuilder.append(localResources.getString(2131558411));
          }
        }
        else {
          localStringBuilder.append(localResources.getString(2131558410));
        }
        localObject = localStringBuilder.toString();
      }
      localTextView.setText((CharSequence)localObject);
    }
    if (a.getVisibility() != i) {
      a.setVisibility(i);
    }
    setIcon(paramH.getIcon());
    setEnabled(paramH.isEnabled());
    setSubMenuArrowVisible(paramH.hasSubMenu());
    setContentDescription(u);
  }
  
  public final void adjustListItemSelectionBounds(Rect paramRect)
  {
    Object localObject = g;
    if ((localObject != null) && (((View)localObject).getVisibility() == 0))
    {
      localObject = (LinearLayout.LayoutParams)g.getLayoutParams();
      int i = top;
      top = (g.getHeight() + topMargin + bottomMargin + i);
    }
  }
  
  public h getItemData()
  {
    return b;
  }
  
  public final void onFinishInflate()
  {
    super.onFinishInflate();
    setBackground(mBackground);
    Object localObject = (TextView)findViewById(2131230897);
    d = ((TextView)localObject);
    int i = mTextAppearance;
    if (i != -1) {
      ((TextView)localObject).setTextAppearance(mTextAppearanceContext, i);
    }
    a = ((TextView)findViewById(2131230864));
    localObject = (ImageView)findViewById(2131230874);
    k = ((ImageView)localObject);
    if (localObject != null) {
      ((ImageView)localObject).setImageDrawable(close);
    }
    g = ((ImageView)findViewById(2131230812));
    f = ((LinearLayout)findViewById(2131230795));
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    if ((mIconView != null) && (mPreserveIconSpacing))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)mIconView.getLayoutParams();
      int i = height;
      if ((i > 0) && (width <= 0)) {
        width = i;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    if ((!paramBoolean) && (c == null) && (e == null)) {
      return;
    }
    Object localObject1;
    Object localObject2;
    if ((b.n & 0x4) != 0)
    {
      if (c == null)
      {
        localObject1 = (RadioButton)getInflater().inflate(2131427345, this, false);
        c = ((RadioButton)localObject1);
        localObject2 = f;
        if (localObject2 != null) {
          ((ViewGroup)localObject2).addView((View)localObject1, -1);
        } else {
          addView((View)localObject1, -1);
        }
      }
      localObject1 = c;
      localObject2 = e;
    }
    else
    {
      if (e == null)
      {
        localObject1 = (CheckBox)getInflater().inflate(2131427342, this, false);
        e = ((CheckBox)localObject1);
        localObject2 = f;
        if (localObject2 != null) {
          ((ViewGroup)localObject2).addView((View)localObject1, -1);
        } else {
          addView((View)localObject1, -1);
        }
      }
      localObject1 = e;
      localObject2 = c;
    }
    if (paramBoolean)
    {
      ((CompoundButton)localObject1).setChecked(b.isChecked());
      if (((View)localObject1).getVisibility() != 0) {
        ((View)localObject1).setVisibility(0);
      }
      if ((localObject2 != null) && (((View)localObject2).getVisibility() != 8)) {
        ((View)localObject2).setVisibility(8);
      }
    }
    else
    {
      localObject1 = e;
      if (localObject1 != null) {
        ((View)localObject1).setVisibility(8);
      }
      localObject1 = c;
      if (localObject1 != null) {
        ((View)localObject1).setVisibility(8);
      }
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    Object localObject;
    LinearLayout localLinearLayout;
    if ((b.n & 0x4) != 0)
    {
      if (c == null)
      {
        localObject = (RadioButton)getInflater().inflate(2131427345, this, false);
        c = ((RadioButton)localObject);
        localLinearLayout = f;
        if (localLinearLayout != null) {
          localLinearLayout.addView((View)localObject, -1);
        } else {
          addView((View)localObject, -1);
        }
      }
      localObject = c;
    }
    else
    {
      if (e == null)
      {
        localObject = (CheckBox)getInflater().inflate(2131427342, this, false);
        e = ((CheckBox)localObject);
        localLinearLayout = f;
        if (localLinearLayout != null) {
          localLinearLayout.addView((View)localObject, -1);
        } else {
          addView((View)localObject, -1);
        }
      }
      localObject = e;
    }
    ((CompoundButton)localObject).setChecked(paramBoolean);
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    mForceShowIcon = paramBoolean;
    mPreserveIconSpacing = paramBoolean;
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean)
  {
    ImageView localImageView = g;
    if (localImageView != null)
    {
      int i;
      if ((!l) && (paramBoolean)) {
        i = 0;
      } else {
        i = 8;
      }
      localImageView.setVisibility(i);
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    b.b.getClass();
    boolean bool = mForceShowIcon;
    if ((!bool) && (!mPreserveIconSpacing)) {
      return;
    }
    ImageView localImageView = mIconView;
    if ((localImageView == null) && (paramDrawable == null) && (!mPreserveIconSpacing)) {
      return;
    }
    if (localImageView == null)
    {
      localImageView = (ImageView)getInflater().inflate(2131427343, this, false);
      mIconView = localImageView;
      LinearLayout localLinearLayout = f;
      if (localLinearLayout != null) {
        localLinearLayout.addView(localImageView, 0);
      } else {
        addView(localImageView, 0);
      }
    }
    if ((paramDrawable == null) && (!mPreserveIconSpacing))
    {
      mIconView.setVisibility(8);
      return;
    }
    localImageView = mIconView;
    if (!bool) {
      paramDrawable = null;
    }
    localImageView.setImageDrawable(paramDrawable);
    if (mIconView.getVisibility() != 0) {
      mIconView.setVisibility(0);
    }
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
    {
      d.setText(paramCharSequence);
      if (d.getVisibility() != 0) {
        d.setVisibility(0);
      }
    }
    else if (d.getVisibility() != 8)
    {
      d.setVisibility(8);
    }
  }
}
