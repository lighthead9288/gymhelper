package com.example.gymhelper.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ProgramEditFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ProgramEditFragmentArgs() {
  }

  private ProgramEditFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ProgramEditFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ProgramEditFragmentArgs __result = new ProgramEditFragmentArgs();
    bundle.setClassLoader(ProgramEditFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("trainingProgramId")) {
      long trainingProgramId;
      trainingProgramId = bundle.getLong("trainingProgramId");
      __result.arguments.put("trainingProgramId", trainingProgramId);
    } else {
      throw new IllegalArgumentException("Required argument \"trainingProgramId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public long getTrainingProgramId() {
    return (long) arguments.get("trainingProgramId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("trainingProgramId")) {
      long trainingProgramId = (long) arguments.get("trainingProgramId");
      __result.putLong("trainingProgramId", trainingProgramId);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ProgramEditFragmentArgs that = (ProgramEditFragmentArgs) object;
    if (arguments.containsKey("trainingProgramId") != that.arguments.containsKey("trainingProgramId")) {
      return false;
    }
    if (getTrainingProgramId() != that.getTrainingProgramId()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (int)(getTrainingProgramId() ^ (getTrainingProgramId() >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "ProgramEditFragmentArgs{"
        + "trainingProgramId=" + getTrainingProgramId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ProgramEditFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(long trainingProgramId) {
      this.arguments.put("trainingProgramId", trainingProgramId);
    }

    @NonNull
    public ProgramEditFragmentArgs build() {
      ProgramEditFragmentArgs result = new ProgramEditFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setTrainingProgramId(long trainingProgramId) {
      this.arguments.put("trainingProgramId", trainingProgramId);
      return this;
    }

    @SuppressWarnings("unchecked")
    public long getTrainingProgramId() {
      return (long) arguments.get("trainingProgramId");
    }
  }
}
