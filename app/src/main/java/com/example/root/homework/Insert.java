package com.example.root.homework;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class Insert extends AppCompatActivity {

    SQLiteDatabase database;
    Banco helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        final Context context = getApplicationContext();

        helper = new Banco(this);
        database = helper.getWritableDatabase();

        final EditText word = (EditText)findViewById(R.id.eng_word);
        final EditText significance = (EditText)findViewById(R.id.significance);
        Button inserir = (Button)findViewById(R.id.button_insert);

        inserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database.execSQL("INSERT INTO words(word, significance) VALUES('"+word.getText()+"','"+significance.getText()+"')");
                Toast.makeText(context,"Palavra inserida com sucesso", LENGTH_SHORT).show();

            }
        });
    }
}
