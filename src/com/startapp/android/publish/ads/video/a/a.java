package com.startapp.android.publish.ads.video.a;

import java.util.List;

/* compiled from: StartAppSDK */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private List<String> f343a;
    private String b;

    public a(List<String> list, String str) {
        this.f343a = list;
        this.b = str;
    }

    public List<String> a() {
        return this.f343a;
    }

    public String toString() {
        return "[VideoEvent: tag=" + this.b + ", fullUrls=" + this.f343a.toString() + "]";
    }
}
