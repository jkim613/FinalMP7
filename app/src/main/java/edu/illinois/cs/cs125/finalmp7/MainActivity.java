package edu.illinois.cs.cs125.finalmp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.AppStart);
        Button button2 = findViewById(R.id.BFStart);
        Button button3 = findViewById(R.id.LunchStart);
        Button button4 = findViewById(R.id.DinStart);
        Button button5 = findViewById(R.id.DesStart);
        Button button6 = findViewById(R.id.API);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.AppStart:
                openAppitizers();
                break;
            case R.id.BFStart:
                openBreakfast();
                break;
            case R.id.LunchStart:
                openLunch();
                break;
            case R.id.DinStart:
                openDinner();
                break;
            case R.id.DesStart:
                openDessert();
                break;
            case R.id.API:
                openAPI();
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
    public void openLunch() {
        Intent intent = new Intent(this, Lunch.class);
        startActivity(intent);
    }
    public void openDinner() {
        Intent intent = new Intent(this, Dinner.class);
        startActivity(intent);
    }
    public void openDessert() {
        Intent intent = new Intent(this, Dessert.class);
        startActivity(intent);
    }
    public void openAPI() {
        Intent intent = new Intent(this, API.class);
        startActivity(intent);
    }

}
