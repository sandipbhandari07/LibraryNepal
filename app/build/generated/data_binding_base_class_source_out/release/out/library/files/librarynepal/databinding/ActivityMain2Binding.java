// Generated by view binder compiler. Do not edit!
package library.files.librarynepal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import library.files.librarynepal.R;

public final class ActivityMain2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button Register;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final Button login;

  @NonNull
  public final TextView skip;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView4;

  private ActivityMain2Binding(@NonNull ConstraintLayout rootView, @NonNull Button Register,
      @NonNull ImageView imageView4, @NonNull Button login, @NonNull TextView skip,
      @NonNull TextView textView14, @NonNull TextView textView4) {
    this.rootView = rootView;
    this.Register = Register;
    this.imageView4 = imageView4;
    this.login = login;
    this.skip = skip;
    this.textView14 = textView14;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Register;
      Button Register = ViewBindings.findChildViewById(rootView, id);
      if (Register == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.login;
      Button login = ViewBindings.findChildViewById(rootView, id);
      if (login == null) {
        break missingId;
      }

      id = R.id.skip;
      TextView skip = ViewBindings.findChildViewById(rootView, id);
      if (skip == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = ViewBindings.findChildViewById(rootView, id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new ActivityMain2Binding((ConstraintLayout) rootView, Register, imageView4, login,
          skip, textView14, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
