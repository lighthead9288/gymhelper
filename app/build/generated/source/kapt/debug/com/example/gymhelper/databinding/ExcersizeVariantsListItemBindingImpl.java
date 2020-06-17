package com.example.gymhelper.databinding;
import com.example.gymhelper.R;
import com.example.gymhelper.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ExcersizeVariantsListItemBindingImpl extends ExcersizeVariantsListItemBinding implements com.example.gymhelper.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ExcersizeVariantsListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ExcersizeVariantsListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            );
        this.excersizeVariantName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.example.gymhelper.generated.callback.OnClickListener(this, 1);
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
        if (BR.excersizeVariantClickListener == variableId) {
            setExcersizeVariantClickListener((com.example.gymhelper.adapters.ExcersizeVariantClickListener) variable);
        }
        else if (BR.excersize == variableId) {
            setExcersize((com.example.gymhelper.db.Excersize) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setExcersizeVariantClickListener(@Nullable com.example.gymhelper.adapters.ExcersizeVariantClickListener ExcersizeVariantClickListener) {
        this.mExcersizeVariantClickListener = ExcersizeVariantClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.excersizeVariantClickListener);
        super.requestRebind();
    }
    public void setExcersize(@Nullable com.example.gymhelper.db.Excersize Excersize) {
        this.mExcersize = Excersize;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.excersize);
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
        com.example.gymhelper.adapters.ExcersizeVariantClickListener excersizeVariantClickListener = mExcersizeVariantClickListener;
        com.example.gymhelper.db.Excersize excersize = mExcersize;
        java.lang.String excersizeName = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (excersize != null) {
                    // read excersize.name
                    excersizeName = excersize.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.excersizeVariantName, excersizeName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // excersizeVariantClickListener != null
        boolean excersizeVariantClickListenerJavaLangObjectNull = false;
        // excersizeVariantClickListener
        com.example.gymhelper.adapters.ExcersizeVariantClickListener excersizeVariantClickListener = mExcersizeVariantClickListener;
        // excersize
        com.example.gymhelper.db.Excersize excersize = mExcersize;



        excersizeVariantClickListenerJavaLangObjectNull = (excersizeVariantClickListener) != (null);
        if (excersizeVariantClickListenerJavaLangObjectNull) {



            excersizeVariantClickListener.onClick(excersize);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): excersizeVariantClickListener
        flag 1 (0x2L): excersize
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}