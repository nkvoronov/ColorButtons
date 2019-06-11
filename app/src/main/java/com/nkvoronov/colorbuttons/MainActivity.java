package com.nkvoronov.colorbuttons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mInfoTextView;
    private ConstraintLayout mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        mInfoTextView = (TextView) findViewById(R.id.textView);
        mInfoTextView.setText("");
        Button redButton = (Button) findViewById(R.id.button_red);
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mInfoTextView.setText(R.string.button_red);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.redColor));
            }
        });
        Button yellowButton = (Button) findViewById(R.id.button_yellow);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mInfoTextView.setText(R.string.button_yellow);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.yellowColor));
            }
        });
        Button greenButton = (Button) findViewById(R.id.button_green);
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mInfoTextView.setText(R.string.button_green);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.greenColor));
            }
        });
    }
}
