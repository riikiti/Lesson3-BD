package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.CheckBox;
import android.content.Intent;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Res(View view) {
        Comp f1 = new Comp(0, 0, 0, 0);
        try {
            CheckBox rf = findViewById(R.id.checkBoxP1);
            if (rf.isChecked()) {f1.setMultiplay(5);}

            RadioButton rf1 = findViewById(R.id.radioButtonM1);
            if (rf1.isChecked()) f1.setMouse(1);
            rf1 = findViewById(R.id.radioButtonM2);

            if (rf1.isChecked()) f1.setMouse(2);
            rf1 = findViewById(R.id.radioButtonM3);

            if (rf1.isChecked()){f1.setMouse(3);}
            rf1 = findViewById(R.id.radioButtonH1);

            if (rf1.isChecked()){f1.setHeadphones(1);}
            rf1 = findViewById(R.id.radioButtonH2);
            if (rf1.isChecked()){f1.setHeadphones(2);}
            rf1 = findViewById(R.id.radioButtonH3);
            if (rf1.isChecked()){f1.setHeadphones(3);}
            rf1 = findViewById(R.id.radioButtonH4);
            if (rf1.isChecked()) {f1.setHeadphones(4);}

            rf1 = findViewById(R.id.radioButton1);
            if (rf1.isChecked()){f1.setPubg(1);}
            rf1 = findViewById(R.id.radioButton2);
            if (rf1.isChecked()){f1.setPubg(2);}

            Intent intent = new Intent(this, Result.class);
            intent.putExtra(Comp.class.getSimpleName(), f1);
            startActivity(intent);

        } catch (Exception err) {
        }

    }

}