package com.cyw.a2018010303;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv1=(WebView)findViewById(R.id.webView);
        wv1.setWebViewClient(new WebViewClient());
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.loadUrl("file:///android_asset/index.html");
    }
}
