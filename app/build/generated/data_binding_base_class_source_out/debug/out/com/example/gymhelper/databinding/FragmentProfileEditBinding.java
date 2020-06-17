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
import com.example.gymhelper.viewmodel.ProfileEditViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentProfileEditBinding extends ViewDataBinding {
  @NonNull
  public final Button assignCurProfileBtn;

  @NonNull
  public final ExpandableListView excersizesListLv;

  @Bindable
  protected ProfileEditViewModel mProfileEditViewModel;

  protected FragmentProfileEditBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button assignCurProfileBtn, ExpandableListView excersizesListLv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.assignCurProfileBtn = assignCurProfileBtn;
    this.excersizesListLv = excersizesListLv;
  }

  public abstract void setProfileEditViewModel(@Nullable ProfileEditViewModel profileEditViewModel);

  @Nullable
  public ProfileEditViewModel getProfileEditViewModel() {
    return mProfileEditViewModel;
  }

  @NonNull
  public static FragmentProfileEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profile_edit, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfileEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentProfileEditBinding>inflateInternal(inflater, R.layout.fragment_profile_edit, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProfileEditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profile_edit, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfileEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentProfileEditBinding>inflateInternal(inflater, R.layout.fragment_profile_edit, null, false, component);
  }

  public static FragmentProfileEditBinding bind(@NonNull View view) {
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
  public static FragmentProfileEditBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentProfileEditBinding)bind(component, view, R.layout.fragment_profile_edit);
  }
}