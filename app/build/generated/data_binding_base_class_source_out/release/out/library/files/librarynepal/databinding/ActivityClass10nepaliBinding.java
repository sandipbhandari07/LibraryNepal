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

public final class ActivityClass10nepaliBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final PDFView class10nepalipdfView;

  private ActivityClass10nepaliBinding(@NonNull ConstraintLayout rootView,
      @NonNull PDFView class10nepalipdfView) {
    this.rootView = rootView;
    this.class10nepalipdfView = class10nepalipdfView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityClass10nepaliBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityClass10nepaliBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_class10nepali, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityClass10nepaliBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.class10nepalipdfView;
      PDFView class10nepalipdfView = ViewBindings.findChildViewById(rootView, id);
      if (class10nepalipdfView == null) {
        break missingId;
      }

      return new ActivityClass10nepaliBinding((ConstraintLayout) rootView, class10nepalipdfView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}