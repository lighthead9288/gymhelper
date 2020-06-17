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

public class ProgramsListFragmentDirections {
  private ProgramsListFragmentDirections() {
  }

  @NonNull
  public static ActionProgramsListFragmentToProgramEditFragment actionProgramsListFragmentToProgramEditFragment(
      long trainingProgramId) {
    return new ActionProgramsListFragmentToProgramEditFragment(trainingProgramId);
  }

  public static class ActionProgramsListFragmentToProgramEditFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionProgramsListFragmentToProgramEditFragment(long trainingProgramId) {
      this.arguments.put("trainingProgramId", trainingProgramId);
    }

    @NonNull
    public ActionProgramsListFragmentToProgramEditFragment setTrainingProgramId(
        long trainingProgramId) {
      this.arguments.put("trainingProgramId", trainingProgramId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("trainingProgramId")) {
        long trainingProgramId = (long) arguments.get("trainingProgramId");
        __result.putLong("trainingProgramId", trainingProgramId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_programsListFragment_to_programEditFragment;
    }

    @SuppressWarnings("unchecked")
    public long getTrainingProgramId() {
      return (long) arguments.get("trainingProgramId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionProgramsListFragmentToProgramEditFragment that = (ActionProgramsListFragmentToProgramEditFragment) object;
      if (arguments.containsKey("trainingProgramId") != that.arguments.containsKey("trainingProgramId")) {
        return false;
      }
      if (getTrainingProgramId() != that.getTrainingProgramId()) {
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
      result = 31 * result + (int)(getTrainingProgramId() ^ (getTrainingProgramId() >>> 32));
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionProgramsListFragmentToProgramEditFragment(actionId=" + getActionId() + "){"
          + "trainingProgramId=" + getTrainingProgramId()
          + "}";
    }
  }
}
