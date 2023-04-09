package com.example.classwork8;
import androidx.appcompat.app.AppCompatActivity;

import android.app.assist.AssistStructure;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    Switch switch1;
    View mainView;

    boolean toggleChecked;
    boolean switchChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 = findViewById(R.id.switch1);
        mainView = findViewById(R.id.view);
    }

    public void changeBackground(View view) {
        AssistStructure.ViewNode toggle = null;
        toggleChecked = toggle.isChecked();
        switchChecked = switch1.isChecked();

        if(toggleChecked && switchChecked) {
            mainView.setBackgroundColor(Color.RED);
        }
        else if(toggleChecked && !switchChecked) {
            mainView.setBackgroundColor(Color.CYAN);
        }
        else if(!toggleChecked && switchChecked) {
            mainView.setBackgroundColor(Color.GREEN);
        }
        else{
            mainView.setBackgroundColor(Color.YELLOW);
        }
    }
}