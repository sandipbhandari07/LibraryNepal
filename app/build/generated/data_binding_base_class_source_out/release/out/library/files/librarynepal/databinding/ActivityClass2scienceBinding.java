// Generated by view binder compiler. Do not edit!
package library.files.librarynepal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.barteksc.pdfviewer.PDFView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import library.files.librarynepal.R;

public final class ActivityClass2scienceBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final PDFView class2sciencepdfView;

  private ActivityClass2scienceBinding(@NonNull ConstraintLayout rootView,
      @NonNull PDFView class2sciencepdfView) {
    this.rootView = rootView;
    this.class2sciencepdfView = class2sciencepdfView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityClass2scienceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityClass2scienceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_class2science, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityClass2scienceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.class2sciencepdfView;
      PDFView class2sciencepdfView = ViewBindings.findChildViewById(rootView, id);
      if (class2sciencepdfView == null) {
        break missingId;
      }

      return new ActivityClass2scienceBinding((ConstraintLayout) rootView, class2sciencepdfView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
