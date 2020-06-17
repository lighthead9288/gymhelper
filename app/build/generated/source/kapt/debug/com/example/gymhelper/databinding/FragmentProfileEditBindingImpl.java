package com.example.gymhelper.databinding;
import com.example.gymhelper.R;
import com.example.gymhelper.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileEditBindingImpl extends FragmentProfileEditBinding implements com.example.gymhelper.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.excersizesListLv, 2);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProfileEditBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentProfileEditBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[1]
            , (android.widget.ExpandableListView) bindings[2]
            );
        this.assignCurProfileBtn.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.gymhelper.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.profileEditViewModel == variableId) {
            setProfileEditViewModel((com.example.gymhelper.viewmodel.ProfileEditViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProfileEditViewModel(@Nullable com.example.gymhelper.viewmodel.ProfileEditViewModel ProfileEditViewModel) {
        this.mProfileEditViewModel = ProfileEditViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.profileEditViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProfileEditViewModelIsCurTrainingProfileSelected((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProfileEditViewModelIsCurTrainingProfileSelected(androidx.lifecycle.LiveData<java.lang.Boolean> ProfileEditViewModelIsCurTrainingProfileSelected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean androidxDatabindingViewDataBindingSafeUnboxProfileEditViewModelIsCurTrainingProfileSelectedGetValue = false;
        com.example.gymhelper.viewmodel.ProfileEditViewModel profileEditViewModel = mProfileEditViewModel;
        java.lang.Boolean profileEditViewModelIsCurTrainingProfileSelectedGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> profileEditViewModelIsCurTrainingProfileSelected = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (profileEditViewModel != null) {
                    // read profileEditViewModel.isCurTrainingProfileSelected
                    profileEditViewModelIsCurTrainingProfileSelected = profileEditViewModel.isCurTrainingProfileSelected();
                }
                updateLiveDataRegistration(0, profileEditViewModelIsCurTrainingProfileSelected);


                if (profileEditViewModelIsCurTrainingProfileSelected != null) {
                    // read profileEditViewModel.isCurTrainingProfileSelected.getValue()
                    profileEditViewModelIsCurTrainingProfileSelectedGetValue = profileEditViewModelIsCurTrainingProfileSelected.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(profileEditViewModel.isCurTrainingProfileSelected.getValue())
                androidxDatabindingViewDataBindingSafeUnboxProfileEditViewModelIsCurTrainingProfileSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(profileEditViewModelIsCurTrainingProfileSelectedGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.assignCurProfileBtn.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.assignCurProfileBtn.setEnabled(androidxDatabindingViewDataBindingSafeUnboxProfileEditViewModelIsCurTrainingProfileSelectedGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // profileEditViewModel != null
        boolean profileEditViewModelJavaLangObjectNull = false;
        // profileEditViewModel
        com.example.gymhelper.viewmodel.ProfileEditViewModel profileEditViewModel = mProfileEditViewModel;



        profileEditViewModelJavaLangObjectNull = (profileEditViewModel) != (null);
        if (profileEditViewModelJavaLangObjectNull) {


            profileEditViewModel.assignCurTrainingProfile();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): profileEditViewModel.isCurTrainingProfileSelected
        flag 1 (0x2L): profileEditViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}