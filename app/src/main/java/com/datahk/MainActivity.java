package com.datahk;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MainActivity extends Activity {
    WebView wv;
    @Override protected void onCreate(Bundle b){
        super.onCreate(b);
        wv=new WebView(this); setContentView(wv);
        WebSettings s=wv.getSettings();
        s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("file:///android_asset/index.html");
    }
    @Override public void onBackPressed(){ if(wv.canGoBack()) wv.goBack(); else super.onBackPressed(); }
}
