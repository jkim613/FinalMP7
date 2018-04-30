package edu.illinois.cs.cs125.finalmp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Breakfast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        Button button1 = findViewById(R.id.BFRec1);
        Button button2 = findViewById(R.id.BFRec2);

        button1.setOnClickListener((View.OnClickListener) this);
        button2.setOnClickListener((View.OnClickListener) this);

    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.BFRec1:
                openAppitizers();
                break;
            case R.id.BFRec2:
                openBreakfast();
                break;
        }

    }
    public void openAppitizers() {
        Intent intent = new Intent(this, Appitizers.class);
        startActivity(intent);
    }
    public void openBreakfast() {
        Intent intent = new Intent(this, Breakfast.class);
        startActivity(intent);
    }

}

