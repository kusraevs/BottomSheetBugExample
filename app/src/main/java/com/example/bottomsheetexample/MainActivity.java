package com.example.bottomsheetexample;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private BottomSheetBehavior bottomSheetBehavior;
    private NestedScrollView bottomSheetViewgroup;

    @BindView(R.id.bottom_sheet_coordinate)
    TextView coordinateText;
    @BindView(R.id.bottom_sheet_time)
    TextView timeText;
    @BindView(R.id.timeLayout)
    LinearLayout timeLayout;
    @BindView(R.id.subtitleLayout)
    LinearLayout subtitleLayout;
    @BindView(R.id.coordinateLayout)
    LinearLayout coordinateLayout;

    @BindView(R.id.root_layout)
    CoordinatorLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        bottomSheetViewgroup = (NestedScrollView) findViewById(R.id.map_bottom_sheet);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheetViewgroup);


        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimateParentHierarchy(false);
        layoutTransition.enableTransitionType(LayoutTransition.CHANGING);
        rootLayout.setLayoutTransition(layoutTransition);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeVisibility();
            }
        });
    }

    private void changeVisibility() {
        subtitleLayout.setVisibility(View.GONE);

        coordinateLayout.setVisibility(View.GONE);
        timeLayout.setVisibility(View.GONE);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
