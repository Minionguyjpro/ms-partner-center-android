package com.startapp.android.publish.adsCommon.i;

import android.os.Bundle;

/* compiled from: StartAppSDK */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f498a;

    public b(Bundle bundle) {
        this.f498a = bundle;
    }

    public String a() {
        return this.f498a.getString("install_referrer");
    }

    public long b() {
        return this.f498a.getLong("referrer_click_timestamp_seconds");
    }

    public long c() {
        return this.f498a.getLong("install_begin_timestamp_seconds");
    }
}
