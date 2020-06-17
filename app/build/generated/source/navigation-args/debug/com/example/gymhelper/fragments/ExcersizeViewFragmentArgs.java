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

public class ExcersizeViewFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ExcersizeViewFragmentArgs() {
  }

  private ExcersizeViewFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ExcersizeViewFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ExcersizeViewFragmentArgs __result = new ExcersizeViewFragmentArgs();
    bundle.setClassLoader(ExcersizeViewFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("excersizeId")) {
      long excersizeId;
      excersizeId = bundle.getLong("excersizeId");
      __result.arguments.put("excersizeId", excersizeId);
    } else {
      throw new IllegalArgumentException("Required argument \"excersizeId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public long getExcersizeId() {
    return (long) arguments.get("excersizeId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("excersizeId")) {
      long excersizeId = (long) arguments.get("excersizeId");
      __result.putLong("excersizeId", excersizeId);
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
    ExcersizeViewFragmentArgs that = (ExcersizeViewFragmentArgs) object;
    if (arguments.containsKey("excersizeId") != that.arguments.containsKey("excersizeId")) {
      return false;
    }
    if (getExcersizeId() != that.getExcersizeId()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (int)(getExcersizeId() ^ (getExcersizeId() >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "ExcersizeViewFragmentArgs{"
        + "excersizeId=" + getExcersizeId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ExcersizeViewFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(long excersizeId) {
      this.arguments.put("excersizeId", excersizeId);
    }

    @NonNull
    public ExcersizeViewFragmentArgs build() {
      ExcersizeViewFragmentArgs result = new ExcersizeViewFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setExcersizeId(long excersizeId) {
      this.arguments.put("excersizeId", excersizeId);
      return this;
    }

    @SuppressWarnings("unchecked")
    public long getExcersizeId() {
      return (long) arguments.get("excersizeId");
    }
  }
}
