package com.t3ch.shaj.androidalertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button exitButton;
    private AlertDialog.Builder alertBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitButton = findViewById(R.id.BTN_ID);

        exitButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        alertBuilder = new AlertDialog.Builder(MainActivity.this);


        alertBuilder.setTitle(R.string.title_text);
        alertBuilder.setMessage(R.string.MSG_text);
        alertBuilder.setIcon(R.drawable.warning);

        alertBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();

            }
        });

        alertBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "You clicked over No", Toast.LENGTH_SHORT).show();

            }
        });

        alertBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "You clicked over Cancel", Toast.LENGTH_SHORT).show();

            }
        });


        AlertDialog alertDialog = alertBuilder.create();
        alertDialog.show();
    }
}
