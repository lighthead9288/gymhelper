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

public class ExcersizesListFragmentDirections {
  private ExcersizesListFragmentDirections() {
  }

  @NonNull
  public static ActionExcersizesListFragmentToExcersizeViewFragment actionExcersizesListFragmentToExcersizeViewFragment(
      long excersizeId) {
    return new ActionExcersizesListFragmentToExcersizeViewFragment(excersizeId);
  }

  public static class ActionExcersizesListFragmentToExcersizeViewFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionExcersizesListFragmentToExcersizeViewFragment(long excersizeId) {
      this.arguments.put("excersizeId", excersizeId);
    }

    @NonNull
    public ActionExcersizesListFragmentToExcersizeViewFragment setExcersizeId(long excersizeId) {
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
      return R.id.action_excersizesListFragment_to_excersizeViewFragment;
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
      ActionExcersizesListFragmentToExcersizeViewFragment that = (ActionExcersizesListFragmentToExcersizeViewFragment) object;
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
      return "ActionExcersizesListFragmentToExcersizeViewFragment(actionId=" + getActionId() + "){"
          + "excersizeId=" + getExcersizeId()
          + "}";
    }
  }
}
