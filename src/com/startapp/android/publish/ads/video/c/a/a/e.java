package com.startapp.android.publish.ads.video.c.a.a;

import java.util.ArrayList;
import java.util.List;

/* compiled from: StartAppSDK */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private String f361a;
    private List<String> b;
    private List<String> c;

    public String a() {
        return this.f361a;
    }

    public void a(String str) {
        this.f361a = str;
    }

    public List<String> b() {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        return this.b;
    }

    public List<String> c() {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        return this.c;
    }

    public String toString() {
        return "VASTVideoClicks [clickThrough=" + this.f361a + ", clickTracking=[" + this.b + "], customClick=[" + this.c + "] ]";
    }
}
