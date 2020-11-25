package com.example.sharingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Select(View view){
        TextView values_of_types = findViewById(R.id.values_of_types);
        Spinner type_values = findViewById(R.id.type_values);
        String set_values_of_types = String.valueOf(type_values.getSelectedItem());
        values_of_types.setText(set_values_of_types);
    }

    public void Share(View view){
        TextView messageView = findViewById(R.id.values_of_types);
        String messageText = messageView.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        startActivity(intent);
    }
}