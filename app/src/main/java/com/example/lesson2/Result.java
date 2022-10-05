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
        switch (comp1.getOc()) {
            case "Linux":
                s += "Linux\n";
                sum += comp1.getpOc();
                break;
            case "Убунту":
                s += "Убунту\n";
                sum += comp1.getpOc();
                break;
            case "Окно10 Домашняя":
                s += "Окно10 Домашняя\n";
                sum += comp1.getpOc();
                break;
            case "none":
                s += "none oc\n";
                break;
        }
        switch (comp1.getAnti()) {
            case "касперский":
                s += "касперский\n";
                sum += comp1.getpAnti();
                break;
            case "авасд":
                s += "авасд\n";
                sum += comp1.getpAnti();
                break;
            case "доктор веб":
                s += "доктор веб\n";
                sum += comp1.getpAnti();
                break;
            case "без защиты":
                s += "без защиты\n";
                sum += comp1.getpAnti();
                break;
            case "none":
                s += "none anti \n";
                break;
        }

        switch (comp1.getClear()) {
            case "да давайте":
                s += "and  да давайте уберу\n";
                sum += comp1.getpClear();
                break;
            case "нэ не надо":
                s += "and нэ не надо меня трогать \n";
                sum += comp1.getpClear();
                break;
            case "none":
                s += "none clear\n";
                break;
        }

        if (comp1.getMultiply() == 5) {
            s += " da troyani \n";
            sum *= comp1.getMultiply();
        }

        SQLiteDatabase db = getBaseContext().openOrCreateDatabase("app.db", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS lots3 (lots TEXT, name TEXT, lotPrice INTEGER );");
        db.execSQL("INSERT OR IGNORE INTO lots3 VALUES ('" + s + "','" + comp1.getName() + "','"+ sum +"') ");


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