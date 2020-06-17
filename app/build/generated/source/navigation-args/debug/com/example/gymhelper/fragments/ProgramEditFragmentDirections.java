package com.example.gymhelper.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.gymhelper.R;
import com.example.gymhelper.db.Excersize;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ProgramEditFragmentDirections {
  private ProgramEditFragmentDirections() {
  }

  @NonNull
  public static ActionProgramEditFragmentToExcersizesListFragment actionProgramEditFragmentToExcersizesListFragment(
      @NonNull Excersize[] curDayExcersizes, long trainingDayId) {
    return new ActionProgramEditFragmentToExcersizesListFragment(curDayExcersizes, trainingDayId);
  }

  public static class ActionProgramEditFragmentToExcersizesListFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionProgramEditFragmentToExcersizesListFragment(@NonNull Excersize[] curDayExcersizes,
        long trainingDayId) {
      if (curDayExcersizes == null) {
        throw new IllegalArgumentException("Argument \"curDayExcersizes\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("curDayExcersizes", curDayExcersizes);
      this.arguments.put("trainingDayId", trainingDayId);
    }

    @NonNull
    public ActionProgramEditFragmentToExcersizesListFragment setCurDayExcersizes(
        @NonNull Excersize[] curDayExcersizes) {
      if (curDayExcersizes == null) {
        throw new IllegalArgumentException("Argument \"curDayExcersizes\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("curDayExcersizes", curDayExcersizes);
      return this;
    }

    @NonNull
    public ActionProgramEditFragmentToExcersizesListFragment setTrainingDayId(long trainingDayId) {
      this.arguments.put("trainingDayId", trainingDayId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("curDayExcersizes")) {
        Excersize[] curDayExcersizes = (Excersize[]) arguments.get("curDayExcersizes");
        __result.putParcelableArray("curDayExcersizes", curDayExcersizes);
      }
      if (arguments.containsKey("trainingDayId")) {
        long trainingDayId = (long) arguments.get("trainingDayId");
        __result.putLong("trainingDayId", trainingDayId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_programEditFragment_to_excersizesListFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Excersize[] getCurDayExcersizes() {
      return (Excersize[]) arguments.get("curDayExcersizes");
    }

    @SuppressWarnings("unchecked")
    public long getTrainingDayId() {
      return (long) arguments.get("trainingDayId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionProgramEditFragmentToExcersizesListFragment that = (ActionProgramEditFragmentToExcersizesListFragment) object;
      if (arguments.containsKey("curDayExcersizes") != that.arguments.containsKey("curDayExcersizes")) {
        return false;
      }
      if (getCurDayExcersizes() != null ? !getCurDayExcersizes().equals(that.getCurDayExcersizes()) : that.getCurDayExcersizes() != null) {
        return false;
      }
      if (arguments.containsKey("trainingDayId") != that.arguments.containsKey("trainingDayId")) {
        return false;
      }
      if (getTrainingDayId() != that.getTrainingDayId()) {
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
      result = 31 * result + java.util.Arrays.hashCode(getCurDayExcersizes());
      result = 31 * result + (int)(getTrainingDayId() ^ (getTrainingDayId() >>> 32));
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionProgramEditFragmentToExcersizesListFragment(actionId=" + getActionId() + "){"
          + "curDayExcersizes=" + getCurDayExcersizes()
          + ", trainingDayId=" + getTrainingDayId()
          + "}";
    }
  }
}
