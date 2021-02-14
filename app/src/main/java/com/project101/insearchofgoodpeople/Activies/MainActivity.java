package com.project101.insearchofgoodpeople.Activies;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.project101.insearchofgoodpeople.R;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initContents();
        initListeners();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                switch (menuItem.getItemId()){
//                    case R.id.nav_home:
//                }
                Toast.makeText(MainActivity.this,  menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }

    private void initListeners() {

    }

    private void initContents() {
    }

    private void initViews() {
        bottomNavigationView =findViewById(R.id.bottomNavigation);
    }
}
