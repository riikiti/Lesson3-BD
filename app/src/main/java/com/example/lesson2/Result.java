package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import android.content.Intent;


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
        int sum = 0;
        switch (comp1.getMouse()) {
            case "logitech":
                s += "logitech mouse\n";
                sum += comp1.getpMouse();
                break;
            case "Razer":
                s += "Razer mouse\n";
                sum += comp1.getpMouse();
                break;
            case "Sven":
                s += "Sven mouse\n";
                sum += comp1.getpMouse();
                break;
            case "none":
                s += "none mouse\n";
                break;
        }
        switch (comp1.getHeadphones()) {
            case "Hyper ekes bookes ekes":
                s += "Hyper ekes bookes ekes headphones\n";
                sum += comp1.getpHeadphones();
                break;
            case "Senhesiser":
                s += "Senhesiser headphones\n";
                sum += comp1.getpHeadphones();
                break;
            case "Phileps":
                s += "Phileps headphones\n";
                sum += comp1.getpHeadphones();
                break;
            case "Marshall":
                s += "Marshall headphones\n";
                sum += comp1.getpHeadphones();
                break;
            case "none":
                s += "none headphones\n";
                break;
        }

        switch (comp1.getPubg()) {
            case "Fortinayte":
                s += "and fotinaite\n";
                sum += comp1.getpPubg();
                break;
            case "pubdje":
                s += "and pubg \n";
                sum += comp1.getpPubg();
                break;
            case "none":
                s += "none jupapi munyany\n";
                break;
        }

        if (comp1.getMultiply() == 5) {
            s += "its for free my friends \n";
            sum *= comp1.getMultiply();
        }

        SQLiteDatabase db = getBaseContext().openOrCreateDatabase("app.db", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS lots2 (lots TEXT, name TEXT, lotPrice INTEGER );");
        db.execSQL("INSERT OR IGNORE INTO lots2 VALUES ('" + s + "','" + comp1.getName() + "','"+ sum +"') ");


        TextView t = findViewById(R.id.res1);
        t.setText(s);
        TextView t1 = findViewById(R.id.res2);
        t1.setText(String.valueOf(sum));
        TextView t2 = findViewById(R.id.res);
        t2.setText(comp1.getName());
    }

    public void AllResults(View view) {
        Intent intent = new Intent(this, DBResults.class);
        startActivity(intent);
    }
}