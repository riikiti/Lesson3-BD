package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.content.Intent;
import android.widget.EditText;
import android.widget.RadioButton;
import android.database.sqlite.SQLiteDatabase;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Res(View view) {

        Comp f1 = new Comp();
        int multiply = 5;
        try {
            EditText name = (EditText) findViewById(R.id.name);
            f1.setName(name.getText().toString());

            //checbox
            CheckBox rf = findViewById(R.id.checkBoxP1);
            if (rf.isChecked()) {
                f1.setMultiply(multiply);
            }
            //mouse
            RadioButton rf1 = findViewById(R.id.radioButtonM1);
            if (rf1.isChecked()) f1.setMouse("logitech", 1000);

            rf1 = findViewById(R.id.radioButtonM2);
            if (rf1.isChecked()) f1.setMouse("Razer", 2500);

            rf1 = findViewById(R.id.radioButtonM3);
            if (rf1.isChecked()) f1.setMouse("Sven", 5);

            //headphones
            rf1 = findViewById(R.id.radioButtonH1);
            if (rf1.isChecked()) f1.setHeadphones("Hyper ekes bookes ekes",1);

            rf1 = findViewById(R.id.radioButtonH2);
            if (rf1.isChecked()) f1.setHeadphones("Senhesiser",2);

            rf1 = findViewById(R.id.radioButtonH3);
            if (rf1.isChecked()) {
                f1.setHeadphones("Phileps",3);
            }
            rf1 = findViewById(R.id.radioButtonH4);
            if (rf1.isChecked()) {
                f1.setHeadphones("Marshall",4);
            }
            //Pubg

            rf1 = findViewById(R.id.radioButton1);
            if (rf1.isChecked()) {
                f1.setPubg("Fortinayte",30);
            }
            rf1 = findViewById(R.id.radioButton2);
            if (rf1.isChecked()) {
                f1.setPubg("pubdje",25);
            }

            Intent intent = new Intent(this, Result.class);
            intent.putExtra(Comp.class.getSimpleName(), f1);
            startActivity(intent);


        } catch (Exception err) {
        }

    }

}