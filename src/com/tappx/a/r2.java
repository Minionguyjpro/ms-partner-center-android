package com.tappx.a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.tappx.sdk.android.TappxPrivacyManager;

final class r2 implements TappxPrivacyManager {

    /* renamed from: a  reason: collision with root package name */
    private final n2 f806a;

    r2(n2 n2Var) {
        new Handler(Looper.getMainLooper());
        this.f806a = n2Var;
    }

    public void checkAndShowPrivacyDisclaimer(Activity activity) {
        checkAndShowPrivacyDisclaimer(activity, (Runnable) null);
    }

    public void denyPersonalInfoConsent() {
        this.f806a.h();
    }

    public void grantPersonalInfoConsent() {
        this.f806a.i();
    }

    public void renewPrivacyConsent(Activity activity) {
        this.f806a.a((Context) activity);
    }

    public void setAutoPrivacyDisclaimerEnabled(boolean z) {
        this.f806a.a(z);
    }

    public void setGDPRConsent(String str) {
        this.f806a.a(str);
    }

    public void setUSPrivacy(String str) {
        this.f806a.b(str);
    }

    public void checkAndShowPrivacyDisclaimer(Activity activity, Runnable runnable) {
        this.f806a.a((Context) activity, runnable);
    }
}
