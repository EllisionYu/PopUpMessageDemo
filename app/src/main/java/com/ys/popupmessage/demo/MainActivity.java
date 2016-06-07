package com.ys.popupmessage.demo;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

//Snackbar  https://developer.android.com/training/snackbar/showing.html
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Snackbar snackbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.floatingActionButton).setOnClickListener(this);
        snackbar = Snackbar.make(findViewById(R.id.myCoordinatorLayout), "this is a snackbar", Snackbar.LENGTH_SHORT);

        //adding an action to a message.
        snackbar.setAction("click", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
            }
        });
        snackbar.setActionTextColor(Color.RED);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                snackbar.show();
                break;
            case R.id.floatingActionButton:
                snackbar.show();
                break;
            default:
                break;
        }
    }
}
