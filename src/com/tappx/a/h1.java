package com.tappx.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class h1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f692a;

    public h1(Context context) {
        this.f692a = context;
    }

    public boolean a() {
        if (!d3.a(this.f692a, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f692a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }
}
