package com.tappx.sdk.android;

import android.app.Activity;
import android.os.Bundle;
import com.tappx.a.l2;

public class PrivacyConsentActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private l2 f887a;

    public void onBackPressed() {
        if (!this.f887a.a()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l2 l2Var = new l2(this);
        this.f887a = l2Var;
        l2Var.a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f887a.b();
    }
}
