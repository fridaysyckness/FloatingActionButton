package com.example.floatingactionbutton;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    CoordinatorLayout coordinatorLayout;
    FloatingActionButton fab;
    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar = Snackbar
                        .make(coordinatorLayout, R.string.snackBar, Snackbar.LENGTH_LONG)
                        .setAction("UNDO", new View.OnClickListener() {

                            @Override
                            public void onClick(View view) {
                                Snackbar snackbar = Snackbar.make(coordinatorLayout, "Message is restored!", Snackbar.LENGTH_SHORT);
                                snackbar.show();
                            }
                        });
                snackbar.show();
            }
        });
    }
}