package com.moat.analytics.mobile.mpub;

import android.app.Application;
import com.moat.analytics.mobile.mpub.v;

public abstract class MoatAnalytics {

    /* renamed from: a  reason: collision with root package name */
    private static MoatAnalytics f187a;

    public static synchronized MoatAnalytics getInstance() {
        MoatAnalytics moatAnalytics;
        synchronized (MoatAnalytics.class) {
            if (f187a == null) {
                try {
                    f187a = new k();
                } catch (Exception e) {
                    n.a(e);
                    f187a = new v.a();
                }
            }
            moatAnalytics = f187a;
        }
        return moatAnalytics;
    }

    public abstract void prepareNativeDisplayTracking(String str);

    public abstract void start(Application application);

    public abstract void start(MoatOptions moatOptions, Application application);
}
