package com.example.gymhelper.databinding;
import com.example.gymhelper.R;
import com.example.gymhelper.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentExcersizeViewBindingImpl extends FragmentExcersizeViewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.exParamsTl, 7);
        sViewsWithIds.put(R.id.exGroupTv, 8);
        sViewsWithIds.put(R.id.exSubGroupTv, 9);
        sViewsWithIds.put(R.id.exLevelTv, 10);
        sViewsWithIds.put(R.id.start_guideline, 11);
        sViewsWithIds.put(R.id.end_guideline, 12);
        sViewsWithIds.put(R.id.youtubeFb, 13);
        sViewsWithIds.put(R.id.excersizeVariantsFb, 14);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentExcersizeViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentExcersizeViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.Guideline) bindings[12]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TableLayout) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[3]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[14]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[11]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[13]
            );
        this.exDescriptionTv.setTag(null);
        this.exGroupNameTv.setTag(null);
        this.exLevelNameTv.setTag(null);
        this.exNameTv.setTag(null);
        this.exSubgroupNameTv.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.photosRv.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.excersizeViewViewModel == variableId) {
            setExcersizeViewViewModel((com.example.gymhelper.viewmodel.ExcersizeViewViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setExcersizeViewViewModel(@Nullable com.example.gymhelper.viewmodel.ExcersizeViewViewModel ExcersizeViewViewModel) {
        this.mExcersizeViewViewModel = ExcersizeViewViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.excersizeViewViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeExcersizeViewViewModelExcersize((androidx.lifecycle.LiveData<com.example.gymhelper.model.ExcersizeWithDetails>) object, fieldId);
            case 1 :
                return onChangeExcersizeViewViewModelPhotos((androidx.lifecycle.LiveData<java.util.List<java.lang.String>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeExcersizeViewViewModelExcersize(androidx.lifecycle.LiveData<com.example.gymhelper.model.ExcersizeWithDetails> ExcersizeViewViewModelExcersize, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeExcersizeViewViewModelPhotos(androidx.lifecycle.LiveData<java.util.List<java.lang.String>> ExcersizeViewViewModelPhotos, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        com.example.gymhelper.model.ExcersizeWithDetails excersizeViewViewModelExcersizeGetValue = null;
        com.example.gymhelper.db.Excersize excersizeViewViewModelExcersizeExcersize = null;
        java.lang.String excersizeViewViewModelExcersizeExcersizeName = null;
        java.lang.String excersizeViewViewModelExcersizeExcersizeGroup = null;
        java.lang.String excersizeViewViewModelExcersizeExcersizeDescription = null;
        androidx.lifecycle.LiveData<com.example.gymhelper.model.ExcersizeWithDetails> excersizeViewViewModelExcersize = null;
        java.lang.String excersizeViewViewModelExcersizeExcersizeLevel = null;
        androidx.lifecycle.LiveData<java.util.List<java.lang.String>> excersizeViewViewModelPhotos = null;
        java.util.List<java.lang.String> excersizeViewViewModelPhotosGetValue = null;
        java.lang.String excersizeViewViewModelExcersizeExcersizeSubgroup = null;
        com.example.gymhelper.viewmodel.ExcersizeViewViewModel excersizeViewViewModel = mExcersizeViewViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (excersizeViewViewModel != null) {
                        // read excersizeViewViewModel.excersize
                        excersizeViewViewModelExcersize = excersizeViewViewModel.getExcersize();
                    }
                    updateLiveDataRegistration(0, excersizeViewViewModelExcersize);


                    if (excersizeViewViewModelExcersize != null) {
                        // read excersizeViewViewModel.excersize.getValue()
                        excersizeViewViewModelExcersizeGetValue = excersizeViewViewModelExcersize.getValue();
                    }


                    if (excersizeViewViewModelExcersizeGetValue != null) {
                        // read excersizeViewViewModel.excersize.getValue().excersize
                        excersizeViewViewModelExcersizeExcersize = excersizeViewViewModelExcersizeGetValue.getExcersize();
                    }


                    if (excersizeViewViewModelExcersizeExcersize != null) {
                        // read excersizeViewViewModel.excersize.getValue().excersize.name
                        excersizeViewViewModelExcersizeExcersizeName = excersizeViewViewModelExcersizeExcersize.getName();
                        // read excersizeViewViewModel.excersize.getValue().excersize.group
                        excersizeViewViewModelExcersizeExcersizeGroup = excersizeViewViewModelExcersizeExcersize.getGroup();
                        // read excersizeViewViewModel.excersize.getValue().excersize.description
                        excersizeViewViewModelExcersizeExcersizeDescription = excersizeViewViewModelExcersizeExcersize.getDescription();
                        // read excersizeViewViewModel.excersize.getValue().excersize.level
                        excersizeViewViewModelExcersizeExcersizeLevel = excersizeViewViewModelExcersizeExcersize.getLevel();
                        // read excersizeViewViewModel.excersize.getValue().excersize.subgroup
                        excersizeViewViewModelExcersizeExcersizeSubgroup = excersizeViewViewModelExcersizeExcersize.getSubgroup();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (excersizeViewViewModel != null) {
                        // read excersizeViewViewModel.photos
                        excersizeViewViewModelPhotos = excersizeViewViewModel.getPhotos();
                    }
                    updateLiveDataRegistration(1, excersizeViewViewModelPhotos);


                    if (excersizeViewViewModelPhotos != null) {
                        // read excersizeViewViewModel.photos.getValue()
                        excersizeViewViewModelPhotosGetValue = excersizeViewViewModelPhotos.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.exDescriptionTv, excersizeViewViewModelExcersizeExcersizeDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.exGroupNameTv, excersizeViewViewModelExcersizeExcersizeGroup);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.exLevelNameTv, excersizeViewViewModelExcersizeExcersizeLevel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.exNameTv, excersizeViewViewModelExcersizeExcersizeName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.exSubgroupNameTv, excersizeViewViewModelExcersizeExcersizeSubgroup);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.example.gymhelper.utils.BindingAdaptersKt.bindRecyclerView(this.photosRv, excersizeViewViewModelPhotosGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): excersizeViewViewModel.excersize
        flag 1 (0x2L): excersizeViewViewModel.photos
        flag 2 (0x3L): excersizeViewViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}