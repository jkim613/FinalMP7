package edu.illinois.cs.cs125.finalmp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lunch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
        Button button1 = findViewById(R.id.LunchRec1);
        Button button2 = findViewById(R.id.LunchRec2);

        button1.setOnClickListener((View.OnClickListener) this);
        button2.setOnClickListener((View.OnClickListener) this);
    }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.LunchRec1:
                openLunchRec1();
                break;
            case R.id.LunchRec2:
                openLunchRec2();
                break;
        }
    }
    public void openLunchRec1() {
        Intent intent = new Intent(this, LunchRec1.class);
        startActivity(intent);
    }
    public void openLunchRec2() {
        Intent intent = new Intent(this, LunchRec2.class);
        startActivity(intent);
    }
}
