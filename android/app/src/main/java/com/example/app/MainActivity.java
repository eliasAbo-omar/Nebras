package com.example.app; // المسار الخاص بك

import android.os.Bundle;
import android.webkit.WebView;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // تفعيل فحص الـ WebView
        WebView.setWebContentsDebuggingEnabled(true);
    }
}