package com.yubrajpokharel.androidbasic1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import static com.yubrajpokharel.androidbasic1.R.drawable.background;

public class MainActivity extends AppCompatActivity {

    Button homeBtn;
    private boolean isBackgroundSet = false;
    RelativeLayout mainContainer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainContainer = (RelativeLayout) findViewById(R.id.mainContainer);

        homeBtn = (Button) findViewById(R.id.homeBtn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
            }
        });

    }

}
