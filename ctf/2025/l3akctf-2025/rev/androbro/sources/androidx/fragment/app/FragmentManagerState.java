package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Parcelable.Creator<FragmentManagerState>() {
        public FragmentManagerState createFromParcel(Parcel in) {
            return new FragmentManagerState(in);
        }

        public FragmentManagerState[] newArray(int size) {
            return new FragmentManagerState[size];
        }
    };
    ArrayList<String> mActive;
    ArrayList<String> mAdded;
    BackStackRecordState[] mBackStack;
    int mBackStackIndex;
    ArrayList<String> mBackStackStateKeys = new ArrayList<>();
    ArrayList<BackStackState> mBackStackStates = new ArrayList<>();
    ArrayList<FragmentManager.LaunchedFragmentInfo> mLaunchedFragments;
    String mPrimaryNavActiveWho = null;

    public FragmentManagerState() {
    }

    public FragmentManagerState(Parcel in) {
        this.mActive = in.createStringArrayList();
        this.mAdded = in.createStringArrayList();
        this.mBackStack = (BackStackRecordState[]) in.createTypedArray(BackStackRecordState.CREATOR);
        this.mBackStackIndex = in.readInt();
        this.mPrimaryNavActiveWho = in.readString();
        this.mBackStackStateKeys = in.createStringArrayList();
        this.mBackStackStates = in.createTypedArrayList(BackStackState.CREATOR);
        this.mLaunchedFragments = in.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringList(this.mActive);
        dest.writeStringList(this.mAdded);
        dest.writeTypedArray(this.mBackStack, flags);
        dest.writeInt(this.mBackStackIndex);
        dest.writeString(this.mPrimaryNavActiveWho);
        dest.writeStringList(this.mBackStackStateKeys);
        dest.writeTypedList(this.mBackStackStates);
        dest.writeTypedList(this.mLaunchedFragments);
    }
}
