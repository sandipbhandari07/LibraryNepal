// Generated by view binder compiler. Do not edit!
package library.files.librarynepal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.ads.AdView;
import com.google.android.material.navigation.NavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import library.files.librarynepal.R;

public final class ActivitySecondaryBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final AdView adView;

  @NonNull
  public final ImageView backBtnSec;

  @NonNull
  public final DrawerLayout drawerLayoutSec;

  @NonNull
  public final ImageView imageView26;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final LinearLayout linearlayoutprimary;

  @NonNull
  public final NavigationView navViewSec;

  @NonNull
  public final Button secondaryGarde10;

  @NonNull
  public final Button secondaryGrade9;

  @NonNull
  public final TextView secondaryHighersecondary;

  @NonNull
  public final TextView secondaryLowersecondary;

  @NonNull
  public final TextView secondaryPrimary;

  @NonNull
  public final TextView textView44;

  @NonNull
  public final Toolbar toolbarSec;

  private ActivitySecondaryBinding(@NonNull DrawerLayout rootView, @NonNull AdView adView,
      @NonNull ImageView backBtnSec, @NonNull DrawerLayout drawerLayoutSec,
      @NonNull ImageView imageView26, @NonNull ImageView imageView8,
      @NonNull LinearLayout linearlayoutprimary, @NonNull NavigationView navViewSec,
      @NonNull Button secondaryGarde10, @NonNull Button secondaryGrade9,
      @NonNull TextView secondaryHighersecondary, @NonNull TextView secondaryLowersecondary,
      @NonNull TextView secondaryPrimary, @NonNull TextView textView44,
      @NonNull Toolbar toolbarSec) {
    this.rootView = rootView;
    this.adView = adView;
    this.backBtnSec = backBtnSec;
    this.drawerLayoutSec = drawerLayoutSec;
    this.imageView26 = imageView26;
    this.imageView8 = imageView8;
    this.linearlayoutprimary = linearlayoutprimary;
    this.navViewSec = navViewSec;
    this.secondaryGarde10 = secondaryGarde10;
    this.secondaryGrade9 = secondaryGrade9;
    this.secondaryHighersecondary = secondaryHighersecondary;
    this.secondaryLowersecondary = secondaryLowersecondary;
    this.secondaryPrimary = secondaryPrimary;
    this.textView44 = textView44;
    this.toolbarSec = toolbarSec;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySecondaryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySecondaryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_secondary, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySecondaryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adView;
      AdView adView = ViewBindings.findChildViewById(rootView, id);
      if (adView == null) {
        break missingId;
      }

      id = R.id.back_btn_sec;
      ImageView backBtnSec = ViewBindings.findChildViewById(rootView, id);
      if (backBtnSec == null) {
        break missingId;
      }

      DrawerLayout drawerLayoutSec = (DrawerLayout) rootView;

      id = R.id.imageView26;
      ImageView imageView26 = ViewBindings.findChildViewById(rootView, id);
      if (imageView26 == null) {
        break missingId;
      }

      id = R.id.imageView8;
      ImageView imageView8 = ViewBindings.findChildViewById(rootView, id);
      if (imageView8 == null) {
        break missingId;
      }

      id = R.id.linearlayoutprimary;
      LinearLayout linearlayoutprimary = ViewBindings.findChildViewById(rootView, id);
      if (linearlayoutprimary == null) {
        break missingId;
      }

      id = R.id.nav_view_sec;
      NavigationView navViewSec = ViewBindings.findChildViewById(rootView, id);
      if (navViewSec == null) {
        break missingId;
      }

      id = R.id.secondary_garde10;
      Button secondaryGarde10 = ViewBindings.findChildViewById(rootView, id);
      if (secondaryGarde10 == null) {
        break missingId;
      }

      id = R.id.secondary_grade9;
      Button secondaryGrade9 = ViewBindings.findChildViewById(rootView, id);
      if (secondaryGrade9 == null) {
        break missingId;
      }

      id = R.id.secondary_highersecondary;
      TextView secondaryHighersecondary = ViewBindings.findChildViewById(rootView, id);
      if (secondaryHighersecondary == null) {
        break missingId;
      }

      id = R.id.secondary_lowersecondary;
      TextView secondaryLowersecondary = ViewBindings.findChildViewById(rootView, id);
      if (secondaryLowersecondary == null) {
        break missingId;
      }

      id = R.id.secondary_primary;
      TextView secondaryPrimary = ViewBindings.findChildViewById(rootView, id);
      if (secondaryPrimary == null) {
        break missingId;
      }

      id = R.id.textView44;
      TextView textView44 = ViewBindings.findChildViewById(rootView, id);
      if (textView44 == null) {
        break missingId;
      }

      id = R.id.toolbar_sec;
      Toolbar toolbarSec = ViewBindings.findChildViewById(rootView, id);
      if (toolbarSec == null) {
        break missingId;
      }

      return new ActivitySecondaryBinding((DrawerLayout) rootView, adView, backBtnSec,
          drawerLayoutSec, imageView26, imageView8, linearlayoutprimary, navViewSec,
          secondaryGarde10, secondaryGrade9, secondaryHighersecondary, secondaryLowersecondary,
          secondaryPrimary, textView44, toolbarSec);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
