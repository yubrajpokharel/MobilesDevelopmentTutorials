package com.yubrajpokharel.androidbasic1;

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
        homeBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(!isBackgroundSet){
                    mainContainer.setBackgroundResource(background);
                    isBackgroundSet = true;
                    Toast.makeText(getApplicationContext(), "Background Set!!", Toast.LENGTH_LONG).show();
                }else{
                    mainContainer.setBackgroundColor(0);
                    isBackgroundSet = false;
                    Toast.makeText(getApplicationContext(), "Background Removed!!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
