package edu.illinois.cs.cs125.finalmp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Appitizers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appitizers);

        Button button1 = findViewById(R.id.AppRec1);
        Button button2 = findViewById(R.id.AppRec2);

        button1.setOnClickListener((View.OnClickListener) this);
        button2.setOnClickListener((View.OnClickListener) this);
    }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.AppRec1:
                openAppRec1();
                break;
            case R.id.AppRec2:
                openAppRec2();
                break;
        }
    }
    public void openAppRec1() {
        Intent intent = new Intent(this, AppRec1.class);
        startActivity(intent);
    }
    public void openAppRec2() {
        Intent intent = new Intent(this, AppRec2.class);
        startActivity(intent);
    }
}
