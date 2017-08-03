package com.example.root.homework;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by root on 02/08/17.
 */

public class Banco extends SQLiteOpenHelper {

    public Banco(Context context) {
        super(context, "engWord.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS words ( _id INTEGER PRIMARY KEY AUTOINCREMENT, word TEXT NOT NULL, significance TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS words");
        onCreate(db);
    }
}
