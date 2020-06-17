package com.example.gymhelper.databinding;
import com.example.gymhelper.R;
import com.example.gymhelper.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ProfilesListItemBindingImpl extends ProfilesListItemBinding implements com.example.gymhelper.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ProfilesListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ProfilesListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.deleteProfileIb.setTag(null);
        this.isTrainingProfileCheckedIv.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.trainingProfileTv.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.example.gymhelper.generated.callback.OnClickListener(this, 2);
        mCallback6 = new com.example.gymhelper.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.isProfileChecked == variableId) {
            setIsProfileChecked((java.lang.Boolean) variable);
        }
        else if (BR.deleteProfileClickListener == variableId) {
            setDeleteProfileClickListener((com.example.gymhelper.adapters.DeleteProfileClickListener) variable);
        }
        else if (BR.profileListClickListener == variableId) {
            setProfileListClickListener((com.example.gymhelper.adapters.ProfileListClickListener) variable);
        }
        else if (BR.trainingProfile == variableId) {
            setTrainingProfile((com.example.gymhelper.model.TrainingProfileWithDetails) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsProfileChecked(@Nullable java.lang.Boolean IsProfileChecked) {
        this.mIsProfileChecked = IsProfileChecked;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isProfileChecked);
        super.requestRebind();
    }
    public void setDeleteProfileClickListener(@Nullable com.example.gymhelper.adapters.DeleteProfileClickListener DeleteProfileClickListener) {
        this.mDeleteProfileClickListener = DeleteProfileClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.deleteProfileClickListener);
        super.requestRebind();
    }
    public void setProfileListClickListener(@Nullable com.example.gymhelper.adapters.ProfileListClickListener ProfileListClickListener) {
        this.mProfileListClickListener = ProfileListClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.profileListClickListener);
        super.requestRebind();
    }
    public void setTrainingProfile(@Nullable com.example.gymhelper.model.TrainingProfileWithDetails TrainingProfile) {
        this.mTrainingProfile = TrainingProfile;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.trainingProfile);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        boolean androidxDatabindingViewDataBindingSafeUnboxIsProfileChecked = false;
        java.lang.String trainingProfileTrainingProfileName = null;
        java.lang.Boolean isProfileChecked = mIsProfileChecked;
        com.example.gymhelper.adapters.DeleteProfileClickListener deleteProfileClickListener = mDeleteProfileClickListener;
        com.example.gymhelper.adapters.ProfileListClickListener profileListClickListener = mProfileListClickListener;
        int isProfileCheckedViewVISIBLEViewGONE = 0;
        com.example.gymhelper.db.TrainingProfile trainingProfileTrainingProfile = null;
        com.example.gymhelper.model.TrainingProfileWithDetails trainingProfile = mTrainingProfile;

        if ((dirtyFlags & 0x11L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isProfileChecked)
                androidxDatabindingViewDataBindingSafeUnboxIsProfileChecked = androidx.databinding.ViewDataBinding.safeUnbox(isProfileChecked);
            if((dirtyFlags & 0x11L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsProfileChecked) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isProfileChecked) ? View.VISIBLE : View.GONE
                isProfileCheckedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsProfileChecked) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x18L) != 0) {



                if (trainingProfile != null) {
                    // read trainingProfile.trainingProfile
                    trainingProfileTrainingProfile = trainingProfile.getTrainingProfile();
                }


                if (trainingProfileTrainingProfile != null) {
                    // read trainingProfile.trainingProfile.name
                    trainingProfileTrainingProfileName = trainingProfileTrainingProfile.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.deleteProfileIb.setOnClickListener(mCallback7);
            this.mboundView0.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            this.isTrainingProfileCheckedIv.setVisibility(isProfileCheckedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.trainingProfileTv.setText(trainingProfileTrainingProfileName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // trainingProfile
                com.example.gymhelper.model.TrainingProfileWithDetails trainingProfile = mTrainingProfile;
                // deleteProfileClickListener != null
                boolean deleteProfileClickListenerJavaLangObjectNull = false;
                // deleteProfileClickListener
                com.example.gymhelper.adapters.DeleteProfileClickListener deleteProfileClickListener = mDeleteProfileClickListener;



                deleteProfileClickListenerJavaLangObjectNull = (deleteProfileClickListener) != (null);
                if (deleteProfileClickListenerJavaLangObjectNull) {



                    deleteProfileClickListener.onClick(trainingProfile);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // profileListClickListener
                com.example.gymhelper.adapters.ProfileListClickListener profileListClickListener = mProfileListClickListener;
                // trainingProfile
                com.example.gymhelper.model.TrainingProfileWithDetails trainingProfile = mTrainingProfile;
                // profileListClickListener != null
                boolean profileListClickListenerJavaLangObjectNull = false;



                profileListClickListenerJavaLangObjectNull = (profileListClickListener) != (null);
                if (profileListClickListenerJavaLangObjectNull) {



                    profileListClickListener.onClick(trainingProfile);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isProfileChecked
        flag 1 (0x2L): deleteProfileClickListener
        flag 2 (0x3L): profileListClickListener
        flag 3 (0x4L): trainingProfile
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(isProfileChecked) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(isProfileChecked) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}