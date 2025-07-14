package com.defensys.androbro.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.defensys.androbro.R;

public final class ContentMainBinding implements ViewBinding {
    private final ConstraintLayout rootView;

    private ContentMainBinding(ConstraintLayout rootView2) {
        this.rootView = rootView2;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ContentMainBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ContentMainBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.content_main, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ContentMainBinding bind(View rootView2) {
        if (rootView2 != null) {
            return new ContentMainBinding((ConstraintLayout) rootView2);
        }
        throw new NullPointerException("rootView");
    }
}
