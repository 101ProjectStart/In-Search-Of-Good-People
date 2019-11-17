package com.project101.insearchofgoodpeople.Activies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.project101.insearchofgoodpeople.R;

public class MainActivity extends AppCompatActivity {


    TextView titleTextView;
    Button changeTextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initContents();
        initListeners();

    }

    private void initListeners() {
        changeTextButton.setOnClickListener(view -> {
            titleTextView.setText("Button Clicked");
        });
    }

    private void initContents() {
        titleTextView.setText(getResources().getString(R.string.app_name));
    }

    private void initViews() {
        titleTextView = findViewById(R.id.titleTextView);
        changeTextButton = findViewById(R.id.changeTextButton);
    }
}
