// Generated by view binder compiler. Do not edit!
package com.mobdeve.s14.villanueva.adrian.mco.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.mobdeve.s14.villanueva.adrian.mco.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HomeItemCategoryBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CircleImageView categoryImage;

  @NonNull
  public final TextView categoryLabel;

  private HomeItemCategoryBinding(@NonNull LinearLayout rootView,
      @NonNull CircleImageView categoryImage, @NonNull TextView categoryLabel) {
    this.rootView = rootView;
    this.categoryImage = categoryImage;
    this.categoryLabel = categoryLabel;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HomeItemCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomeItemCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.home_item_category, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomeItemCategoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.categoryImage;
      CircleImageView categoryImage = ViewBindings.findChildViewById(rootView, id);
      if (categoryImage == null) {
        break missingId;
      }

      id = R.id.categoryLabel;
      TextView categoryLabel = ViewBindings.findChildViewById(rootView, id);
      if (categoryLabel == null) {
        break missingId;
      }

      return new HomeItemCategoryBinding((LinearLayout) rootView, categoryImage, categoryLabel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
