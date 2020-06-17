package com.example.gymhelper;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.gymhelper.databinding.ActivityMainBindingImpl;
import com.example.gymhelper.databinding.ExcersizeVariantsListItemBindingImpl;
import com.example.gymhelper.databinding.FragmentExcersizeVariantsBindingImpl;
import com.example.gymhelper.databinding.FragmentExcersizeViewBindingImpl;
import com.example.gymhelper.databinding.FragmentExcersizesListBindingImpl;
import com.example.gymhelper.databinding.FragmentProfileEditBindingImpl;
import com.example.gymhelper.databinding.FragmentProfilesListBindingImpl;
import com.example.gymhelper.databinding.FragmentProgramEditBindingImpl;
import com.example.gymhelper.databinding.FragmentProgramViewBindingImpl;
import com.example.gymhelper.databinding.FragmentProgramsListBindingImpl;
import com.example.gymhelper.databinding.PhotoItemBindingImpl;
import com.example.gymhelper.databinding.ProfilesListItemBindingImpl;
import com.example.gymhelper.databinding.ProgramsListItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_EXCERSIZEVARIANTSLISTITEM = 2;

  private static final int LAYOUT_FRAGMENTEXCERSIZEVARIANTS = 3;

  private static final int LAYOUT_FRAGMENTEXCERSIZEVIEW = 4;

  private static final int LAYOUT_FRAGMENTEXCERSIZESLIST = 5;

  private static final int LAYOUT_FRAGMENTPROFILEEDIT = 6;

  private static final int LAYOUT_FRAGMENTPROFILESLIST = 7;

  private static final int LAYOUT_FRAGMENTPROGRAMEDIT = 8;

  private static final int LAYOUT_FRAGMENTPROGRAMVIEW = 9;

  private static final int LAYOUT_FRAGMENTPROGRAMSLIST = 10;

  private static final int LAYOUT_PHOTOITEM = 11;

  private static final int LAYOUT_PROFILESLISTITEM = 12;

  private static final int LAYOUT_PROGRAMSLISTITEM = 13;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(13);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.gymhelper.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.gymhelper.R.layout.excersize_variants_list_item, LAYOUT_EXCERSIZEVARIANTSLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.gymhelper.R.layout.fragment_excersize_variants, LAYOUT_FRAGMENTEXCERSIZEVARIANTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.gymhelper.R.layout.fragment_excersize_view, LAYOUT_FRAGMENTEXCERSIZEVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.gymhelper.R.layout.fragment_excersizes_list, LAYOUT_FRAGMENTEXCERSIZESLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.gymhelper.R.layout.fragment_profile_edit, LAYOUT_FRAGMENTPROFILEEDIT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.gymhelper.R.layout.fragment_profiles_list, LAYOUT_FRAGMENTPROFILESLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.gymhelper.R.layout.fragment_program_edit, LAYOUT_FRAGMENTPROGRAMEDIT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.gymhelper.R.layout.fragment_program_view, LAYOUT_FRAGMENTPROGRAMVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.gymhelper.R.layout.fragment_programs_list, LAYOUT_FRAGMENTPROGRAMSLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.gymhelper.R.layout.photo_item, LAYOUT_PHOTOITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.gymhelper.R.layout.profiles_list_item, LAYOUT_PROFILESLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.gymhelper.R.layout.programs_list_item, LAYOUT_PROGRAMSLISTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_EXCERSIZEVARIANTSLISTITEM: {
          if ("layout/excersize_variants_list_item_0".equals(tag)) {
            return new ExcersizeVariantsListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for excersize_variants_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEXCERSIZEVARIANTS: {
          if ("layout/fragment_excersize_variants_0".equals(tag)) {
            return new FragmentExcersizeVariantsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_excersize_variants is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEXCERSIZEVIEW: {
          if ("layout/fragment_excersize_view_0".equals(tag)) {
            return new FragmentExcersizeViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_excersize_view is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEXCERSIZESLIST: {
          if ("layout/fragment_excersizes_list_0".equals(tag)) {
            return new FragmentExcersizesListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_excersizes_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILEEDIT: {
          if ("layout/fragment_profile_edit_0".equals(tag)) {
            return new FragmentProfileEditBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile_edit is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILESLIST: {
          if ("layout/fragment_profiles_list_0".equals(tag)) {
            return new FragmentProfilesListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profiles_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROGRAMEDIT: {
          if ("layout/fragment_program_edit_0".equals(tag)) {
            return new FragmentProgramEditBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_program_edit is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROGRAMVIEW: {
          if ("layout/fragment_program_view_0".equals(tag)) {
            return new FragmentProgramViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_program_view is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROGRAMSLIST: {
          if ("layout/fragment_programs_list_0".equals(tag)) {
            return new FragmentProgramsListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_programs_list is invalid. Received: " + tag);
        }
        case  LAYOUT_PHOTOITEM: {
          if ("layout/photo_item_0".equals(tag)) {
            return new PhotoItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for photo_item is invalid. Received: " + tag);
        }
        case  LAYOUT_PROFILESLISTITEM: {
          if ("layout/profiles_list_item_0".equals(tag)) {
            return new ProfilesListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for profiles_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_PROGRAMSLISTITEM: {
          if ("layout/programs_list_item_0".equals(tag)) {
            return new ProgramsListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for programs_list_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(17);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "deleteProfileClickListener");
      sKeys.put(2, "deleteProgramClickListener");
      sKeys.put(3, "excersize");
      sKeys.put(4, "excersizeVariantClickListener");
      sKeys.put(5, "excersizeViewViewModel");
      sKeys.put(6, "fragmentExcersizesListViewModel");
      sKeys.put(7, "isProfileChecked");
      sKeys.put(8, "isProgramChecked");
      sKeys.put(9, "path");
      sKeys.put(10, "profileEditViewModel");
      sKeys.put(11, "profileListClickListener");
      sKeys.put(12, "programEditViewModel");
      sKeys.put(13, "programListClickListener");
      sKeys.put(14, "trainingProfile");
      sKeys.put(15, "trainingProgram");
      sKeys.put(16, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(13);

    static {
      sKeys.put("layout/activity_main_0", com.example.gymhelper.R.layout.activity_main);
      sKeys.put("layout/excersize_variants_list_item_0", com.example.gymhelper.R.layout.excersize_variants_list_item);
      sKeys.put("layout/fragment_excersize_variants_0", com.example.gymhelper.R.layout.fragment_excersize_variants);
      sKeys.put("layout/fragment_excersize_view_0", com.example.gymhelper.R.layout.fragment_excersize_view);
      sKeys.put("layout/fragment_excersizes_list_0", com.example.gymhelper.R.layout.fragment_excersizes_list);
      sKeys.put("layout/fragment_profile_edit_0", com.example.gymhelper.R.layout.fragment_profile_edit);
      sKeys.put("layout/fragment_profiles_list_0", com.example.gymhelper.R.layout.fragment_profiles_list);
      sKeys.put("layout/fragment_program_edit_0", com.example.gymhelper.R.layout.fragment_program_edit);
      sKeys.put("layout/fragment_program_view_0", com.example.gymhelper.R.layout.fragment_program_view);
      sKeys.put("layout/fragment_programs_list_0", com.example.gymhelper.R.layout.fragment_programs_list);
      sKeys.put("layout/photo_item_0", com.example.gymhelper.R.layout.photo_item);
      sKeys.put("layout/profiles_list_item_0", com.example.gymhelper.R.layout.profiles_list_item);
      sKeys.put("layout/programs_list_item_0", com.example.gymhelper.R.layout.programs_list_item);
    }
  }
}
