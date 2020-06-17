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

public class ProfilesListFragmentDirections {
  private ProfilesListFragmentDirections() {
  }

  @NonNull
  public static ActionProfilesListFragmentToProfileEditFragment actionProfilesListFragmentToProfileEditFragment(
      long trainingProfileId) {
    return new ActionProfilesListFragmentToProfileEditFragment(trainingProfileId);
  }

  public static class ActionProfilesListFragmentToProfileEditFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionProfilesListFragmentToProfileEditFragment(long trainingProfileId) {
      this.arguments.put("trainingProfileId", trainingProfileId);
    }

    @NonNull
    public ActionProfilesListFragmentToProfileEditFragment setTrainingProfileId(
        long trainingProfileId) {
      this.arguments.put("trainingProfileId", trainingProfileId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("trainingProfileId")) {
        long trainingProfileId = (long) arguments.get("trainingProfileId");
        __result.putLong("trainingProfileId", trainingProfileId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_profilesListFragment_to_profileEditFragment;
    }

    @SuppressWarnings("unchecked")
    public long getTrainingProfileId() {
      return (long) arguments.get("trainingProfileId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionProfilesListFragmentToProfileEditFragment that = (ActionProfilesListFragmentToProfileEditFragment) object;
      if (arguments.containsKey("trainingProfileId") != that.arguments.containsKey("trainingProfileId")) {
        return false;
      }
      if (getTrainingProfileId() != that.getTrainingProfileId()) {
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
      result = 31 * result + (int)(getTrainingProfileId() ^ (getTrainingProfileId() >>> 32));
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionProfilesListFragmentToProfileEditFragment(actionId=" + getActionId() + "){"
          + "trainingProfileId=" + getTrainingProfileId()
          + "}";
    }
  }
}
