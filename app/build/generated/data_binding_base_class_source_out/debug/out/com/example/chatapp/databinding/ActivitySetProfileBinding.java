// Generated by view binder compiler. Do not edit!
package com.example.chatapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.chatapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySetProfileBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView getuserimage;

  @NonNull
  public final ImageView getuserimageinimageview;

  @NonNull
  public final EditText getusername;

  @NonNull
  public final ProgressBar progressbarofsetProfile;

  @NonNull
  public final Button saveProfile;

  private ActivitySetProfileBinding(@NonNull RelativeLayout rootView,
      @NonNull CardView getuserimage, @NonNull ImageView getuserimageinimageview,
      @NonNull EditText getusername, @NonNull ProgressBar progressbarofsetProfile,
      @NonNull Button saveProfile) {
    this.rootView = rootView;
    this.getuserimage = getuserimage;
    this.getuserimageinimageview = getuserimageinimageview;
    this.getusername = getusername;
    this.progressbarofsetProfile = progressbarofsetProfile;
    this.saveProfile = saveProfile;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySetProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySetProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_set_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySetProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.getuserimage;
      CardView getuserimage = ViewBindings.findChildViewById(rootView, id);
      if (getuserimage == null) {
        break missingId;
      }

      id = R.id.getuserimageinimageview;
      ImageView getuserimageinimageview = ViewBindings.findChildViewById(rootView, id);
      if (getuserimageinimageview == null) {
        break missingId;
      }

      id = R.id.getusername;
      EditText getusername = ViewBindings.findChildViewById(rootView, id);
      if (getusername == null) {
        break missingId;
      }

      id = R.id.progressbarofsetProfile;
      ProgressBar progressbarofsetProfile = ViewBindings.findChildViewById(rootView, id);
      if (progressbarofsetProfile == null) {
        break missingId;
      }

      id = R.id.saveProfile;
      Button saveProfile = ViewBindings.findChildViewById(rootView, id);
      if (saveProfile == null) {
        break missingId;
      }

      return new ActivitySetProfileBinding((RelativeLayout) rootView, getuserimage,
          getuserimageinimageview, getusername, progressbarofsetProfile, saveProfile);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
