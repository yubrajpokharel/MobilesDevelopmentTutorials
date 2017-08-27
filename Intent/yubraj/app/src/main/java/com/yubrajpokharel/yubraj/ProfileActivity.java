package com.yubrajpokharel.yubraj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    Button gotoHomeBtn;
    Button personalSite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        gotoHomeBtn = (Button) findViewById(R.id.gotoHomeBtn);
        personalSite = (Button) findViewById(R.id.personal_site);

        personalSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent personalSite = new Intent(ProfileActivity.this, Personal_site.class);
                startActivity(personalSite);
            }
        });

        gotoHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
    }
}
