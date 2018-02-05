// Generated code from Butter Knife. Do not modify!
package com.example.bottomsheetexample;

import android.support.design.widget.CoordinatorLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  public MainActivity_ViewBinding(T target, Finder finder, Object source) {
    this.target = target;

    target.coordinateText = finder.findRequiredViewAsType(source, R.id.bottom_sheet_coordinate, "field 'coordinateText'", TextView.class);
    target.timeText = finder.findRequiredViewAsType(source, R.id.bottom_sheet_time, "field 'timeText'", TextView.class);
    target.timeLayout = finder.findRequiredViewAsType(source, R.id.timeLayout, "field 'timeLayout'", LinearLayout.class);
    target.subtitleLayout = finder.findRequiredViewAsType(source, R.id.subtitleLayout, "field 'subtitleLayout'", LinearLayout.class);
    target.coordinateLayout = finder.findRequiredViewAsType(source, R.id.coordinateLayout, "field 'coordinateLayout'", LinearLayout.class);
    target.rootLayout = finder.findRequiredViewAsType(source, R.id.root_layout, "field 'rootLayout'", CoordinatorLayout.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.coordinateText = null;
    target.timeText = null;
    target.timeLayout = null;
    target.subtitleLayout = null;
    target.coordinateLayout = null;
    target.rootLayout = null;

    this.target = null;
  }
}
