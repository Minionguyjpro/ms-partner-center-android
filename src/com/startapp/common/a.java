package com.startapp.common;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.startapp.common.a.d;
import com.startapp.common.g;

/* compiled from: StartAppSDK */
public class a {

    /* renamed from: a  reason: collision with root package name */
    String f564a;
    C0025a b;
    int c;

    /* renamed from: com.startapp.common.a$a  reason: collision with other inner class name */
    /* compiled from: StartAppSDK */
    public interface C0025a {
        void a(Bitmap bitmap, int i);
    }

    public a(String str, C0025a aVar, int i) {
        this.f564a = str;
        this.b = aVar;
        this.c = i;
    }

    public void a() {
        g.a(g.a.HIGH, (Runnable) new Runnable() {
            public void run() {
                final Bitmap b = d.b(a.this.f564a);
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        if (a.this.b != null) {
                            a.this.b.a(b, a.this.c);
                        }
                    }
                });
            }
        });
    }
}
