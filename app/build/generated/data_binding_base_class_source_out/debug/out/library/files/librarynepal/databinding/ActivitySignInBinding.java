// Generated by view binder compiler. Do not edit!
package library.files.librarynepal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

public final class ActivitySignInBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnForget;

  @NonNull
  public final TextView dont;

  @NonNull
  public final EditText etPassword2;

  @NonNull
  public final EditText etUsername2;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final Button signin;

  @NonNull
  public final TextView textView15;

  @NonNull
  public final TextView textView16;

  private ActivitySignInBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnForget,
      @NonNull TextView dont, @NonNull EditText etPassword2, @NonNull EditText etUsername2,
      @NonNull ImageView imageView, @NonNull LinearLayout linearLayout3, @NonNull Button signin,
      @NonNull TextView textView15, @NonNull TextView textView16) {
    this.rootView = rootView;
    this.btnForget = btnForget;
    this.dont = dont;
    this.etPassword2 = etPassword2;
    this.etUsername2 = etUsername2;
    this.imageView = imageView;
    this.linearLayout3 = linearLayout3;
    this.signin = signin;
    this.textView15 = textView15;
    this.textView16 = textView16;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_forget;
      Button btnForget = ViewBindings.findChildViewById(rootView, id);
      if (btnForget == null) {
        break missingId;
      }

      id = R.id.dont;
      TextView dont = ViewBindings.findChildViewById(rootView, id);
      if (dont == null) {
        break missingId;
      }

      id = R.id.et_password2;
      EditText etPassword2 = ViewBindings.findChildViewById(rootView, id);
      if (etPassword2 == null) {
        break missingId;
      }

      id = R.id.et_username2;
      EditText etUsername2 = ViewBindings.findChildViewById(rootView, id);
      if (etUsername2 == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.linearLayout3;
      LinearLayout linearLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout3 == null) {
        break missingId;
      }

      id = R.id.signin;
      Button signin = ViewBindings.findChildViewById(rootView, id);
      if (signin == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = ViewBindings.findChildViewById(rootView, id);
      if (textView15 == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = ViewBindings.findChildViewById(rootView, id);
      if (textView16 == null) {
        break missingId;
      }

      return new ActivitySignInBinding((ConstraintLayout) rootView, btnForget, dont, etPassword2,
          etUsername2, imageView, linearLayout3, signin, textView15, textView16);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}