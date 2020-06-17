package com.example.gymhelper.databinding;
import com.example.gymhelper.R;
import com.example.gymhelper.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ProgramsListItemBindingImpl extends ProgramsListItemBinding implements com.example.gymhelper.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ProgramsListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ProgramsListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.deleteProgramIb.setTag(null);
        this.isTrainingProgramCheckedIv.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.trainingProgramTv.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.gymhelper.generated.callback.OnClickListener(this, 2);
        mCallback2 = new com.example.gymhelper.generated.callback.OnClickListener(this, 1);
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
        if (BR.programListClickListener == variableId) {
            setProgramListClickListener((com.example.gymhelper.adapters.ProgramListClickListener) variable);
        }
        else if (BR.deleteProgramClickListener == variableId) {
            setDeleteProgramClickListener((com.example.gymhelper.adapters.DeleteProgramClickListener) variable);
        }
        else if (BR.trainingProgram == variableId) {
            setTrainingProgram((com.example.gymhelper.model.TrainingProgramWithDetails) variable);
        }
        else if (BR.isProgramChecked == variableId) {
            setIsProgramChecked((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProgramListClickListener(@Nullable com.example.gymhelper.adapters.ProgramListClickListener ProgramListClickListener) {
        this.mProgramListClickListener = ProgramListClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.programListClickListener);
        super.requestRebind();
    }
    public void setDeleteProgramClickListener(@Nullable com.example.gymhelper.adapters.DeleteProgramClickListener DeleteProgramClickListener) {
        this.mDeleteProgramClickListener = DeleteProgramClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.deleteProgramClickListener);
        super.requestRebind();
    }
    public void setTrainingProgram(@Nullable com.example.gymhelper.model.TrainingProgramWithDetails TrainingProgram) {
        this.mTrainingProgram = TrainingProgram;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.trainingProgram);
        super.requestRebind();
    }
    public void setIsProgramChecked(@Nullable java.lang.Boolean IsProgramChecked) {
        this.mIsProgramChecked = IsProgramChecked;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.isProgramChecked);
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
        java.lang.String trainingProgramTrainingProgramName = null;
        int isProgramCheckedViewVISIBLEViewGONE = 0;
        com.example.gymhelper.adapters.ProgramListClickListener programListClickListener = mProgramListClickListener;
        com.example.gymhelper.db.TrainingProgram trainingProgramTrainingProgram = null;
        com.example.gymhelper.adapters.DeleteProgramClickListener deleteProgramClickListener = mDeleteProgramClickListener;
        com.example.gymhelper.model.TrainingProgramWithDetails trainingProgram = mTrainingProgram;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsProgramChecked = false;
        java.lang.Boolean isProgramChecked = mIsProgramChecked;

        if ((dirtyFlags & 0x14L) != 0) {



                if (trainingProgram != null) {
                    // read trainingProgram.trainingProgram
                    trainingProgramTrainingProgram = trainingProgram.getTrainingProgram();
                }


                if (trainingProgramTrainingProgram != null) {
                    // read trainingProgram.trainingProgram.name
                    trainingProgramTrainingProgramName = trainingProgramTrainingProgram.getName();
                }
        }
        if ((dirtyFlags & 0x18L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isProgramChecked)
                androidxDatabindingViewDataBindingSafeUnboxIsProgramChecked = androidx.databinding.ViewDataBinding.safeUnbox(isProgramChecked);
            if((dirtyFlags & 0x18L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsProgramChecked) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isProgramChecked) ? View.VISIBLE : View.GONE
                isProgramCheckedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsProgramChecked) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.deleteProgramIb.setOnClickListener(mCallback3);
            this.mboundView0.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.isTrainingProgramCheckedIv.setVisibility(isProgramCheckedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.trainingProgramTv.setText(trainingProgramTrainingProgramName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // deleteProgramClickListener
                com.example.gymhelper.adapters.DeleteProgramClickListener deleteProgramClickListener = mDeleteProgramClickListener;
                // trainingProgram
                com.example.gymhelper.model.TrainingProgramWithDetails trainingProgram = mTrainingProgram;
                // deleteProgramClickListener != null
                boolean deleteProgramClickListenerJavaLangObjectNull = false;



                deleteProgramClickListenerJavaLangObjectNull = (deleteProgramClickListener) != (null);
                if (deleteProgramClickListenerJavaLangObjectNull) {



                    deleteProgramClickListener.onClick(trainingProgram);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // programListClickListener != null
                boolean programListClickListenerJavaLangObjectNull = false;
                // programListClickListener
                com.example.gymhelper.adapters.ProgramListClickListener programListClickListener = mProgramListClickListener;
                // trainingProgram
                com.example.gymhelper.model.TrainingProgramWithDetails trainingProgram = mTrainingProgram;



                programListClickListenerJavaLangObjectNull = (programListClickListener) != (null);
                if (programListClickListenerJavaLangObjectNull) {



                    programListClickListener.onClick(trainingProgram);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): programListClickListener
        flag 1 (0x2L): deleteProgramClickListener
        flag 2 (0x3L): trainingProgram
        flag 3 (0x4L): isProgramChecked
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(isProgramChecked) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(isProgramChecked) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}