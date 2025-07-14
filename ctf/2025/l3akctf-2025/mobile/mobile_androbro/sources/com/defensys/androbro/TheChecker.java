package com.defensys.androbro;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import com.defensys.androbro.databinding.FragmentFirstBinding;

public class TheChecker extends Fragment {
    private static Context appContext;
    private FragmentFirstBinding binding;

    public native boolean d(String str);

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.binding = FragmentFirstBinding.inflate(inflater, container, false);
        return this.binding.getRoot();
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((Button) view.findViewById(R.id.buttonCheck)).setOnClickListener(new TheChecker$$ExternalSyntheticLambda0(this, (EditText) view.findViewById(R.id.editTextInput)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onViewCreated$0$com-defensys-androbro-TheChecker  reason: not valid java name */
    public /* synthetic */ void m0lambda$onViewCreated$0$comdefensysandrobroTheChecker(EditText editTextInput, View v) {
        new AlertDialog.Builder(getContext()).setMessage((CharSequence) d(editTextInput.getText().toString()) ? "valid input" : "invalid input").setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) null).show();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    static {
        System.loadLibrary("ragnar");
    }
}
