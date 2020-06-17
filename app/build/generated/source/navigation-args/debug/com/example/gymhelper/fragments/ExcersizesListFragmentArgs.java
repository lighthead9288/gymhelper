package com.example.gymhelper.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.example.gymhelper.db.Excersize;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.util.HashMap;

public class ExcersizesListFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ExcersizesListFragmentArgs() {
  }

  private ExcersizesListFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ExcersizesListFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ExcersizesListFragmentArgs __result = new ExcersizesListFragmentArgs();
    bundle.setClassLoader(ExcersizesListFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("curDayExcersizes")) {
      Excersize[] curDayExcersizes;
      Parcelable[] __array = bundle.getParcelableArray("curDayExcersizes");
      if (__array != null) {
        curDayExcersizes = new Excersize[__array.length];
        System.arraycopy(__array, 0, curDayExcersizes, 0, __array.length);
      } else {
        curDayExcersizes = null;
      }
      if (curDayExcersizes == null) {
        throw new IllegalArgumentException("Argument \"curDayExcersizes\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("curDayExcersizes", curDayExcersizes);
    } else {
      throw new IllegalArgumentException("Required argument \"curDayExcersizes\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("trainingDayId")) {
      long trainingDayId;
      trainingDayId = bundle.getLong("trainingDayId");
      __result.arguments.put("trainingDayId", trainingDayId);
    } else {
      throw new IllegalArgumentException("Required argument \"trainingDayId\" is missing and does not have an android:defaultValue");
    }
    return __result;
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

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ExcersizesListFragmentArgs that = (ExcersizesListFragmentArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + java.util.Arrays.hashCode(getCurDayExcersizes());
    result = 31 * result + (int)(getTrainingDayId() ^ (getTrainingDayId() >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "ExcersizesListFragmentArgs{"
        + "curDayExcersizes=" + getCurDayExcersizes()
        + ", trainingDayId=" + getTrainingDayId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ExcersizesListFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Excersize[] curDayExcersizes, long trainingDayId) {
      if (curDayExcersizes == null) {
        throw new IllegalArgumentException("Argument \"curDayExcersizes\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("curDayExcersizes", curDayExcersizes);
      this.arguments.put("trainingDayId", trainingDayId);
    }

    @NonNull
    public ExcersizesListFragmentArgs build() {
      ExcersizesListFragmentArgs result = new ExcersizesListFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setCurDayExcersizes(@NonNull Excersize[] curDayExcersizes) {
      if (curDayExcersizes == null) {
        throw new IllegalArgumentException("Argument \"curDayExcersizes\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("curDayExcersizes", curDayExcersizes);
      return this;
    }

    @NonNull
    public Builder setTrainingDayId(long trainingDayId) {
      this.arguments.put("trainingDayId", trainingDayId);
      return this;
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
  }
}
