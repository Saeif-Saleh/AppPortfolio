package com.example.sayyaf.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button popularMovies = (Button) findViewById(R.id.popularMovies);
        Button stockHawk = (Button) findViewById(R.id.stockHawk);
        Button buildItBigger = (Button) findViewById(R.id.buildItBigger);
        Button mkMaterial = (Button) findViewById(R.id.mkMaterial);
        Button goUbiquitous = (Button) findViewById(R.id.goUbiquitous);
        Button capstone = (Button) findViewById(R.id.capstone);

        popularMovies.setOnClickListener(this);
        stockHawk.setOnClickListener(this);
        buildItBigger.setOnClickListener(this);
        mkMaterial.setOnClickListener(this);
        goUbiquitous.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int viewId = view.getId();
        String projectName = "";
        switch (viewId) {
            case R.id.popularMovies:
                projectName = "Popular Movies";
                break;
            case R.id.stockHawk:
                projectName = "Stock Hawk";
                break;
            case R.id.buildItBigger:
                projectName = "Build It Bigger";
                break;
            case R.id.mkMaterial:
                projectName = "Make Your App Material";
                break;
            case R.id.goUbiquitous:
                projectName = "Go Ubiquitous";
                break;
            case R.id.capstone:
                projectName = "Capstone";
                break;


        }
        Toast.makeText(this, "The button will launch My " + projectName + " project", Toast.LENGTH_SHORT).show();
    }
}
