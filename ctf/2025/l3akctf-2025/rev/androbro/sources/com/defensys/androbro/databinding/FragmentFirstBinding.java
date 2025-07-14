package com.defensys.androbro.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.defensys.androbro.R;

public final class FragmentFirstBinding implements ViewBinding {
    public final Button buttonCheck;
    public final EditText editTextInput;
    private final LinearLayout rootView;

    private FragmentFirstBinding(LinearLayout rootView2, Button buttonCheck2, EditText editTextInput2) {
        this.rootView = rootView2;
        this.buttonCheck = buttonCheck2;
        this.editTextInput = editTextInput2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentFirstBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static FragmentFirstBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_first, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static FragmentFirstBinding bind(View rootView2) {
        int id = R.id.buttonCheck;
        Button buttonCheck2 = (Button) ViewBindings.findChildViewById(rootView2, id);
        if (buttonCheck2 != null) {
            id = R.id.editTextInput;
            EditText editTextInput2 = (EditText) ViewBindings.findChildViewById(rootView2, id);
            if (editTextInput2 != null) {
                return new FragmentFirstBinding((LinearLayout) rootView2, buttonCheck2, editTextInput2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
