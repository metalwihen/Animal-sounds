package com.example.mwshuttl.animalsounds;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.mwshuttl.animalsounds.di.components.DaggerAnimalComponent;
import com.example.mwshuttl.animalsounds.soundbox.Dog;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Dog dog; // Field Injection

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add this line to enable field injection to take place
        DaggerAnimalComponent.create().inject(this);


        findViewById(R.id.bark_button_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.bark_sound)).setText(dog.bark());
                findViewById(R.id.bark_sound).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.bark_button_stop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.bark_sound)).setText(null);
                findViewById(R.id.bark_sound).setVisibility(View.GONE);
            }
        });
    }
}
