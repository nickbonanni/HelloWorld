package edu.temple.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView helloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        helloWorld = (TextView) findViewById(R.id.helloWorld);
        helloWorld.setText(R.string.my_greeting);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloWorld.setText(R.string.new_message);
            }
        });
    }



}