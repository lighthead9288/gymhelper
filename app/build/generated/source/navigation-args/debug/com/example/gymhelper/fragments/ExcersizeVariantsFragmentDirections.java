package com.example.gymhelper.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.gymhelper.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ExcersizeVariantsFragmentDirections {
  private ExcersizeVariantsFragmentDirections() {
  }

  @NonNull
  public static ActionExcersizeVariantsFragmentToExcersizeViewFragment actionExcersizeVariantsFragmentToExcersizeViewFragment(
      long excersizeId) {
    return new ActionExcersizeVariantsFragmentToExcersizeViewFragment(excersizeId);
  }

  public static class ActionExcersizeVariantsFragmentToExcersizeViewFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionExcersizeVariantsFragmentToExcersizeViewFragment(long excersizeId) {
      this.arguments.put("excersizeId", excersizeId);
    }

    @NonNull
    public ActionExcersizeVariantsFragmentToExcersizeViewFragment setExcersizeId(long excersizeId) {
      this.arguments.put("excersizeId", excersizeId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("excersizeId")) {
        long excersizeId = (long) arguments.get("excersizeId");
        __result.putLong("excersizeId", excersizeId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_excersizeVariantsFragment_to_excersizeViewFragment;
    }

    @SuppressWarnings("unchecked")
    public long getExcersizeId() {
      return (long) arguments.get("excersizeId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionExcersizeVariantsFragmentToExcersizeViewFragment that = (ActionExcersizeVariantsFragmentToExcersizeViewFragment) object;
      if (arguments.containsKey("excersizeId") != that.arguments.containsKey("excersizeId")) {
        return false;
      }
      if (getExcersizeId() != that.getExcersizeId()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (int)(getExcersizeId() ^ (getExcersizeId() >>> 32));
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionExcersizeVariantsFragmentToExcersizeViewFragment(actionId=" + getActionId() + "){"
          + "excersizeId=" + getExcersizeId()
          + "}";
    }
  }
}
