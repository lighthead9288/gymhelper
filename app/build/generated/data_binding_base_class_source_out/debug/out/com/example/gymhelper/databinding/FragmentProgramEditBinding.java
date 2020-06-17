// Generated by data binding compiler. Do not edit!
package com.example.gymhelper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.gymhelper.R;
import com.example.gymhelper.viewmodel.ProgramEditViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentProgramEditBinding extends ViewDataBinding {
  @NonNull
  public final Button addDayBtn;

  @NonNull
  public final Button assignCurProgramBtn;

  @NonNull
  public final ExpandableListView curProgramEdLv;

  @Bindable
  protected ProgramEditViewModel mProgramEditViewModel;

  protected FragmentProgramEditBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button addDayBtn, Button assignCurProgramBtn, ExpandableListView curProgramEdLv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addDayBtn = addDayBtn;
    this.assignCurProgramBtn = assignCurProgramBtn;
    this.curProgramEdLv = curProgramEdLv;
  }

  public abstract void setProgramEditViewModel(@Nullable ProgramEditViewModel programEditViewModel);

  @Nullable
  public ProgramEditViewModel getProgramEditViewModel() {
    return mProgramEditViewModel;
  }

  @NonNull
  public static FragmentProgramEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_program_edit, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProgramEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentProgramEditBinding>inflateInternal(inflater, R.layout.fragment_program_edit, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProgramEditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_program_edit, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProgramEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentProgramEditBinding>inflateInternal(inflater, R.layout.fragment_program_edit, null, false, component);
  }

  public static FragmentProgramEditBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentProgramEditBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentProgramEditBinding)bind(component, view, R.layout.fragment_program_edit);
  }
}
