package com.example.gymhelper.databinding;
import com.example.gymhelper.R;
import com.example.gymhelper.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentExcersizesListBindingImpl extends FragmentExcersizesListBinding  {

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
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentExcersizesListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentExcersizesListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[1]
            , (android.widget.ExpandableListView) bindings[2]
            );
        this.dayNameEt.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.fragmentExcersizesListViewModel == variableId) {
            setFragmentExcersizesListViewModel((com.example.gymhelper.viewmodel.ExcersizesListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragmentExcersizesListViewModel(@Nullable com.example.gymhelper.viewmodel.ExcersizesListViewModel FragmentExcersizesListViewModel) {
        this.mFragmentExcersizesListViewModel = FragmentExcersizesListViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.fragmentExcersizesListViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFragmentExcersizesListViewModelDayName((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeFragmentExcersizesListViewModelDayName(androidx.lifecycle.LiveData<java.lang.String> FragmentExcersizesListViewModelDayName, int fieldId) {
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
        androidx.lifecycle.LiveData<java.lang.String> fragmentExcersizesListViewModelDayName = null;
        com.example.gymhelper.viewmodel.ExcersizesListViewModel fragmentExcersizesListViewModel = mFragmentExcersizesListViewModel;
        java.lang.String fragmentExcersizesListViewModelDayNameGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (fragmentExcersizesListViewModel != null) {
                    // read fragmentExcersizesListViewModel.dayName
                    fragmentExcersizesListViewModelDayName = fragmentExcersizesListViewModel.getDayName();
                }
                updateLiveDataRegistration(0, fragmentExcersizesListViewModelDayName);


                if (fragmentExcersizesListViewModelDayName != null) {
                    // read fragmentExcersizesListViewModel.dayName.getValue()
                    fragmentExcersizesListViewModelDayNameGetValue = fragmentExcersizesListViewModelDayName.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dayNameEt, fragmentExcersizesListViewModelDayNameGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fragmentExcersizesListViewModel.dayName
        flag 1 (0x2L): fragmentExcersizesListViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}