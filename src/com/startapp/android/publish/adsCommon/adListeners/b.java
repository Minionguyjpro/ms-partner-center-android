package com.startapp.android.publish.adsCommon.adListeners;

import android.os.Handler;
import android.os.Looper;
import com.startapp.android.publish.adsCommon.Ad;

/* compiled from: StartAppSDK */
public class b implements AdEventListener {

    /* renamed from: a  reason: collision with root package name */
    AdEventListener f435a;

    public b(AdEventListener adEventListener) {
        this.f435a = adEventListener;
    }

    public void onReceiveAd(final Ad ad) {
        if (this.f435a != null) {
            Handler a2 = a();
            if (a2 != null) {
                a2.post(new Runnable() {
                    public void run() {
                        b.this.f435a.onReceiveAd(ad);
                    }
                });
            } else {
                this.f435a.onReceiveAd(ad);
            }
        }
    }

    public void onFailedToReceiveAd(final Ad ad) {
        if (this.f435a != null) {
            Handler a2 = a();
            if (a2 != null) {
                a2.post(new Runnable() {
                    public void run() {
                        b.this.f435a.onFailedToReceiveAd(ad);
                    }
                });
            } else {
                this.f435a.onFailedToReceiveAd(ad);
            }
        }
    }

    public Handler a() {
        return new Handler(Looper.getMainLooper());
    }
}
