package androidx.viewbinding;

import android.view.View;
import android.view.ViewGroup;

public class ViewBindings {
    private ViewBindings() {
    }

    public static <T extends View> T findChildViewById(View rootView, int id) {
        if (!(rootView instanceof ViewGroup)) {
            return null;
        }
        ViewGroup rootViewGroup = (ViewGroup) rootView;
        int childCount = rootViewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            T view = rootViewGroup.getChildAt(i).findViewById(id);
            if (view != null) {
                return view;
            }
        }
        return null;
    }
}
