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

public class ProfileEditFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ProfileEditFragmentArgs() {
  }

  private ProfileEditFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ProfileEditFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ProfileEditFragmentArgs __result = new ProfileEditFragmentArgs();
    bundle.setClassLoader(ProfileEditFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("trainingProfileId")) {
      long trainingProfileId;
      trainingProfileId = bundle.getLong("trainingProfileId");
      __result.arguments.put("trainingProfileId", trainingProfileId);
    } else {
      throw new IllegalArgumentException("Required argument \"trainingProfileId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public long getTrainingProfileId() {
    return (long) arguments.get("trainingProfileId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("trainingProfileId")) {
      long trainingProfileId = (long) arguments.get("trainingProfileId");
      __result.putLong("trainingProfileId", trainingProfileId);
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
    ProfileEditFragmentArgs that = (ProfileEditFragmentArgs) object;
    if (arguments.containsKey("trainingProfileId") != that.arguments.containsKey("trainingProfileId")) {
      return false;
    }
    if (getTrainingProfileId() != that.getTrainingProfileId()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (int)(getTrainingProfileId() ^ (getTrainingProfileId() >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "ProfileEditFragmentArgs{"
        + "trainingProfileId=" + getTrainingProfileId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ProfileEditFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(long trainingProfileId) {
      this.arguments.put("trainingProfileId", trainingProfileId);
    }

    @NonNull
    public ProfileEditFragmentArgs build() {
      ProfileEditFragmentArgs result = new ProfileEditFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setTrainingProfileId(long trainingProfileId) {
      this.arguments.put("trainingProfileId", trainingProfileId);
      return this;
    }

    @SuppressWarnings("unchecked")
    public long getTrainingProfileId() {
      return (long) arguments.get("trainingProfileId");
    }
  }
}
