package com.example.root.homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Button inserir = (Button) findViewById(R.id.insert);
        Button see_list = (Button) findViewById(R.id.see_list);
        Button about = (Button) findViewById(R.id.about);

        final Intent iInserir = new Intent(this,Insert.class);
        final Intent iSeeList = new Intent(this, EngWordList.class);
        final Intent iAbout = new Intent(this, About.class);

        inserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iInserir);
            }
        });

        see_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iSeeList);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iAbout);
            }
        });

    }
}
