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

public class ExcersizeVariantsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ExcersizeVariantsFragmentArgs() {
  }

  private ExcersizeVariantsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ExcersizeVariantsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ExcersizeVariantsFragmentArgs __result = new ExcersizeVariantsFragmentArgs();
    bundle.setClassLoader(ExcersizeVariantsFragmentArgs.class.getClassLoader());
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
    ExcersizeVariantsFragmentArgs that = (ExcersizeVariantsFragmentArgs) object;
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
    return "ExcersizeVariantsFragmentArgs{"
        + "excersizeId=" + getExcersizeId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ExcersizeVariantsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(long excersizeId) {
      this.arguments.put("excersizeId", excersizeId);
    }

    @NonNull
    public ExcersizeVariantsFragmentArgs build() {
      ExcersizeVariantsFragmentArgs result = new ExcersizeVariantsFragmentArgs(arguments);
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
