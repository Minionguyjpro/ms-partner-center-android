package com.tappx.a;

import android.content.Context;
import android.webkit.WebView;

public class s1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f811a;

    public s1(Context context) {
        this.f811a = context;
    }

    private void b() {
        try {
            new WebView(this.f811a).destroy();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void a() {
        b();
    }
}
