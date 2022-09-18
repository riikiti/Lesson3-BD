package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle arguments = getIntent().getExtras();
        Comp comp1;
        if (arguments != null) {
            comp1 = (Comp) arguments.getSerializable(Comp.class.getSimpleName());
            printRes(comp1);
        }
    }

    private void printRes(Comp comp1) {
        String s = " VI kypit  : \n";
        switch (comp1.getMouse()) {
            case 1:
                s += "logitech mouse\n";
            case 2:
                s += "Razer mouse\n";
            case 3:
                s += "Sven mouse\n";
        }
        switch (comp1.getHeadphones()) {
            case 1:
                s += "Hyper ekes bookes ekes headphones\n";
            case 2:
                s += "Senhesiser headphones\n";
            case 3:
                s += "Phileps headphones\n";
            case 4:
                s += "Marshall headphones\n";
        }

        switch (comp1.getPubg()) {
            case 1:
                s += "and fotinaite\n";
            case 2:
                s += "and pubg \n";
        }

        if (comp1.getMultiplay()==5){
            s += "its for free my friends \n";
        }
        TextView t = findViewById(R.id.res1);
        t.setText(s);
        TextView t1 = findViewById(R.id.res2);
        t1.setText("Molodec");
    }

}