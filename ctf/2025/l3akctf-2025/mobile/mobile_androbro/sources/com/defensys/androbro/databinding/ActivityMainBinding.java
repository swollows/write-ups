package com.defensys.androbro.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.defensys.androbro.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class ActivityMainBinding implements ViewBinding {
    public final FloatingActionButton fab;
    private final CoordinatorLayout rootView;
    public final MaterialToolbar toolbar;

    private ActivityMainBinding(CoordinatorLayout rootView2, FloatingActionButton fab2, MaterialToolbar toolbar2) {
        this.rootView = rootView2;
        this.fab = fab2;
        this.toolbar = toolbar2;
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_main, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityMainBinding bind(View rootView2) {
        int id = R.id.fab;
        FloatingActionButton fab2 = (FloatingActionButton) ViewBindings.findChildViewById(rootView2, id);
        if (fab2 != null) {
            id = R.id.toolbar;
            MaterialToolbar toolbar2 = (MaterialToolbar) ViewBindings.findChildViewById(rootView2, id);
            if (toolbar2 != null) {
                return new ActivityMainBinding((CoordinatorLayout) rootView2, fab2, toolbar2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
