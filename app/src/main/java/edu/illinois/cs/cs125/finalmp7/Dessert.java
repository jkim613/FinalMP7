package edu.illinois.cs.cs125.finalmp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dessert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);
        Button button1 = findViewById(R.id.DesRec1);
        Button button2 = findViewById(R.id.DesRec2);

        button1.setOnClickListener((View.OnClickListener) this);
        button2.setOnClickListener((View.OnClickListener) this);
    }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.DesRec1:
                openDesRec1();
                break;
            case R.id.DesRec2:
                openDesRec2();
                break;
        }
    }
    public void openDesRec1() {
        Intent intent = new Intent(this, DesRec1.class);
        startActivity(intent);
    }
    public void openDesRec2() {
        Intent intent = new Intent(this, DesRec2.class);
        startActivity(intent);
    }
}
