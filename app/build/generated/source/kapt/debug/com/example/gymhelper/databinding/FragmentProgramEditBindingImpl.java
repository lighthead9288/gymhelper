package com.example.gymhelper.databinding;
import com.example.gymhelper.R;
import com.example.gymhelper.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProgramEditBindingImpl extends FragmentProgramEditBinding implements com.example.gymhelper.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.addDayBtn, 2);
        sViewsWithIds.put(R.id.curProgramEdLv, 3);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProgramEditBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentProgramEditBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[1]
            , (android.widget.ExpandableListView) bindings[3]
            );
        this.assignCurProgramBtn.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.example.gymhelper.generated.callback.OnClickListener(this, 1);
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
        if (BR.programEditViewModel == variableId) {
            setProgramEditViewModel((com.example.gymhelper.viewmodel.ProgramEditViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProgramEditViewModel(@Nullable com.example.gymhelper.viewmodel.ProgramEditViewModel ProgramEditViewModel) {
        this.mProgramEditViewModel = ProgramEditViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.programEditViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProgramEditViewModelIsCurTrainingProgramSelected((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProgramEditViewModelIsCurTrainingProgramSelected(androidx.lifecycle.LiveData<java.lang.Boolean> ProgramEditViewModelIsCurTrainingProgramSelected, int fieldId) {
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
        boolean androidxDatabindingViewDataBindingSafeUnboxProgramEditViewModelIsCurTrainingProgramSelectedGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> programEditViewModelIsCurTrainingProgramSelected = null;
        java.lang.Boolean programEditViewModelIsCurTrainingProgramSelectedGetValue = null;
        com.example.gymhelper.viewmodel.ProgramEditViewModel programEditViewModel = mProgramEditViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (programEditViewModel != null) {
                    // read programEditViewModel.isCurTrainingProgramSelected
                    programEditViewModelIsCurTrainingProgramSelected = programEditViewModel.isCurTrainingProgramSelected();
                }
                updateLiveDataRegistration(0, programEditViewModelIsCurTrainingProgramSelected);


                if (programEditViewModelIsCurTrainingProgramSelected != null) {
                    // read programEditViewModel.isCurTrainingProgramSelected.getValue()
                    programEditViewModelIsCurTrainingProgramSelectedGetValue = programEditViewModelIsCurTrainingProgramSelected.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(programEditViewModel.isCurTrainingProgramSelected.getValue())
                androidxDatabindingViewDataBindingSafeUnboxProgramEditViewModelIsCurTrainingProgramSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(programEditViewModelIsCurTrainingProgramSelectedGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.assignCurProgramBtn.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.assignCurProgramBtn.setEnabled(androidxDatabindingViewDataBindingSafeUnboxProgramEditViewModelIsCurTrainingProgramSelectedGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // programEditViewModel != null
        boolean programEditViewModelJavaLangObjectNull = false;
        // programEditViewModel
        com.example.gymhelper.viewmodel.ProgramEditViewModel programEditViewModel = mProgramEditViewModel;



        programEditViewModelJavaLangObjectNull = (programEditViewModel) != (null);
        if (programEditViewModelJavaLangObjectNull) {


            programEditViewModel.assignCurTrainingProgram();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): programEditViewModel.isCurTrainingProgramSelected
        flag 1 (0x2L): programEditViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}