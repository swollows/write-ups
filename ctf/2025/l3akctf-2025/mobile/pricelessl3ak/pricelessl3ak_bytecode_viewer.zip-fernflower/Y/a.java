package y;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import j.o;

public interface a extends MenuItem {
   a a(o var1);

   o b();

   int getAlphabeticModifiers();

   CharSequence getContentDescription();

   ColorStateList getIconTintList();

   PorterDuff.Mode getIconTintMode();

   int getNumericModifiers();

   CharSequence getTooltipText();

   MenuItem setAlphabeticShortcut(char var1, int var2);

   a setContentDescription(CharSequence var1);

   MenuItem setIconTintList(ColorStateList var1);

   MenuItem setIconTintMode(PorterDuff.Mode var1);

   MenuItem setNumericShortcut(char var1, int var2);

   MenuItem setShortcut(char var1, char var2, int var3, int var4);

   a setTooltipText(CharSequence var1);
}
