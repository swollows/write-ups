package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() {
        public BackStackState createFromParcel(Parcel in) {
            return new BackStackState(in);
        }

        public BackStackState[] newArray(int size) {
            return new BackStackState[size];
        }
    };
    final List<String> mFragments;
    final List<BackStackRecordState> mTransactions;

    BackStackState(List<String> fragments, List<BackStackRecordState> transactions) {
        this.mFragments = fragments;
        this.mTransactions = transactions;
    }

    BackStackState(Parcel in) {
        this.mFragments = in.createStringArrayList();
        this.mTransactions = in.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    /* access modifiers changed from: package-private */
    public List<BackStackRecord> instantiate(FragmentManager fm, Map<String, Fragment> pendingSavedFragments) {
        HashMap<String, Fragment> fragments = new HashMap<>(this.mFragments.size());
        for (String fWho : this.mFragments) {
            Fragment existingFragment = pendingSavedFragments.get(fWho);
            if (existingFragment != null) {
                fragments.put(existingFragment.mWho, existingFragment);
            } else {
                Bundle stateBundle = fm.getFragmentStore().setSavedState(fWho, (Bundle) null);
                if (stateBundle != null) {
                    ClassLoader classLoader = fm.getHost().getContext().getClassLoader();
                    Fragment fragment = ((FragmentState) stateBundle.getParcelable("state")).instantiate(fm.getFragmentFactory(), classLoader);
                    fragment.mSavedFragmentState = stateBundle;
                    if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
                        fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle arguments = stateBundle.getBundle("arguments");
                    if (arguments != null) {
                        arguments.setClassLoader(classLoader);
                    }
                    fragment.setArguments(arguments);
                    fragments.put(fragment.mWho, fragment);
                }
            }
        }
        ArrayList<BackStackRecord> transactions = new ArrayList<>();
        for (BackStackRecordState backStackRecordState : this.mTransactions) {
            transactions.add(backStackRecordState.instantiate(fm, fragments));
        }
        return transactions;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringList(this.mFragments);
        dest.writeTypedList(this.mTransactions);
    }
}
