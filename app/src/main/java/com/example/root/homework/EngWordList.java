package com.example.root.homework;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class EngWordList extends AppCompatActivity {

    public CursorAdapter mAdapter;
    SQLiteDatabase database;
    Banco helper;
    String[] columns = {"_id","word","significance"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_word_list);

        helper = new Banco(this);
        database = helper.getWritableDatabase();

        ListView listView = (ListView) findViewById(R.id.list);

        Cursor cursorDB = database.query("words", columns, null, null, null, null, null);

        if(cursorDB.getCount() > 0){
            mAdapter = new SimpleCursorAdapter(this, R.layout.cursor_adapter,cursorDB, columns, new int[] {0,R.id.item1, R.id.item2},0);
            listView.setAdapter(mAdapter);
        }else{
            Toast.makeText(this, "Nenhum registro encontrado", Toast.LENGTH_SHORT).show();
        }

    }
}
