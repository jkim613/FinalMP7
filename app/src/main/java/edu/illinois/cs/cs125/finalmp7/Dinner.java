package edu.illinois.cs.cs125.finalmp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
        Button button1 = findViewById(R.id.DinRec1);
        Button button2 = findViewById(R.id.DinRec2);

        button1.setOnClickListener((View.OnClickListener) this);
        button2.setOnClickListener((View.OnClickListener) this);
    }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.DinRec1:
                openDinRec1();
                break;
            case R.id.DinRec2:
                openDinRec2();
                break;
        }
    }
    public void openDinRec1() {
        Intent intent = new Intent(this, DinRec1.class);
        startActivity(intent);
    }
    public void openDinRec2() {
        Intent intent = new Intent(this, DinRec2.class);
        startActivity(intent);
    }
}
