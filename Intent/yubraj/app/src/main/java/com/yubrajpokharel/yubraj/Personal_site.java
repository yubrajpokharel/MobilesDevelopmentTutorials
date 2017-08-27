package com.yubrajpokharel.yubraj;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Personal_site extends AppCompatActivity {

    WebView personalSite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_site);

        personalSite = (WebView) findViewById(R.id.personal_site);
        personalSite.loadUrl("https://www.yubrajpokharel.com");
        personalSite.getSettings().setJavaScriptEnabled(true);
        personalSite.setWebViewClient(new WebViewClient());
        personalSite.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon)
            {
                // TODO show you progress image
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url)
            {
                // TODO hide your progress image
                super.onPageFinished(view, url);
            }
        });
    }
}
