package ru.mirea.bryazgin.mireaproject;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewFragment  extends WebViewClient {
    @SuppressWarnings("deprecation")
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url){
        view.loadUrl(url);
        return true;
    }
}
