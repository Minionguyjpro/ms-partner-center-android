package com.startapp.android.publish.adsCommon.a;

import com.startapp.android.publish.common.model.AdPreferences;

/* compiled from: StartAppSDK */
public class a implements Comparable<a> {

    /* renamed from: a  reason: collision with root package name */
    private long f423a = System.currentTimeMillis();
    private AdPreferences.Placement b;
    private String c;

    public a(AdPreferences.Placement placement, String str) {
        this.b = placement;
        this.c = str == null ? "" : str;
    }

    public AdPreferences.Placement a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    /* renamed from: a */
    public int compareTo(a aVar) {
        long j = this.f423a - aVar.f423a;
        if (j > 0) {
            return 1;
        }
        return j == 0 ? 0 : -1;
    }

    public String toString() {
        return "AdDisplayEvent [displayTime=" + this.f423a + ", placement=" + this.b + ", adTag=" + this.c + "]";
    }
}
