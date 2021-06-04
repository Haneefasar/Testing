package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myaarlibrary.LibraryClass;

public class MainActivity extends AppCompatActivity {

    EditText ha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ha = findViewById(R.id.ha);
    }

    public void han(View view) {
        LibraryClass libraryClass = new LibraryClass();
        String txt = ha.getText().toString().trim();
        String aa = libraryClass.printLog(txt);
        Toast.makeText(getApplicationContext(),aa, Toast.LENGTH_LONG).show();
    }
}