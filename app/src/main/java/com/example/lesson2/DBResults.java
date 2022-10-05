package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class DBResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbresults);

        SQLiteDatabase db = getBaseContext().openOrCreateDatabase("app.db", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS lots3 (lots TEXT, name TEXT, lotPrice INTEGER );");
        Cursor query = db.rawQuery("SELECT * FROM lots3;", null);
        TextView textView = findViewById(R.id.textView6);
        textView.setText("");
        while(query.moveToNext()){
            String lots = query.getString(0);
            String name = query.getString(1);
            int price = query.getInt(2);
            textView.append("Lots: " + lots + "Name: " + name + " Price: " + price + "\n");
        }
        query.close();
        db.close();
    }
}