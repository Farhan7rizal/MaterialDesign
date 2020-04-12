package com.example.materialdesign;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv = null;
    int i = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv = findViewById(R.id.tv);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "What about some snack", Snackbar.LENGTH_LONG)
                        .setAction("Click Me", handleClick()).show();
                        //add handle click to the listener
            }
        });
    }

    //Add event to handle Click Me in floatingActionButton (fab)
    public View.OnClickListener handleClick(){
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(); //to update a number
            }
        };
        return listener;
    }

    private void updateText(){
        this.i = i+1;
        tv.setText("Click : "+i);
    }
}
