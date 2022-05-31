package com.example.sportkalatest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpViews();
        bindNavigationView();
    }

    private void bindNavigationView() {
        bottomNavigationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.item_home:
                        Toast.makeText(MainActivity.this, "home", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.item_list:
                        Toast.makeText(MainActivity.this, "list", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.item_account:
                        Toast.makeText(MainActivity.this, "account", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.item_search:
                        Toast.makeText(MainActivity.this, "search", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    private void setUpViews() {
        bottomNavigationView=findViewById(R.id.main_bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.item_home);
    }
}