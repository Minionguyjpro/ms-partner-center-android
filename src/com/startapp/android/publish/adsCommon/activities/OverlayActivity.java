package com.startapp.android.publish.adsCommon.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.appnext.base.b.d;
import com.startapp.android.publish.ads.a.b;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.g;

/* compiled from: StartAppSDK */
public class OverlayActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private b f429a;
    private boolean b;
    private int c;
    private boolean d;
    private Bundle e;
    private boolean f = false;
    private int g = -1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        boolean z = false;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("videoAd", false);
        requestWindowFeature(1);
        if (getIntent().getBooleanExtra("fullscreen", false) || booleanExtra) {
            getWindow().setFlags(d.fb, d.fb);
        }
        g.a("AppWallActivity", 2, "AppWallActivity::onCreate");
        this.d = getIntent().getBooleanExtra("activityShouldLockOrientation", true);
        if (bundle == null && !booleanExtra) {
            com.startapp.common.b.a((Context) this).a(new Intent("com.startapp.android.ShowDisplayBroadcastListener"));
        }
        if (bundle != null) {
            this.g = bundle.getInt("activityLockedOrientation", -1);
            this.d = bundle.getBoolean("activityShouldLockOrientation", true);
        }
        this.c = getIntent().getIntExtra("orientation", getResources().getConfiguration().orientation);
        if (getResources().getConfiguration().orientation != this.c) {
            z = true;
        }
        this.b = z;
        if (!z) {
            a();
            this.f429a.a(bundle);
            return;
        }
        this.e = bundle;
    }

    private void a() {
        b a2 = b.a(this, getIntent(), AdPreferences.Placement.getByIndex(getIntent().getIntExtra("placement", 0)));
        this.f429a = a2;
        if (a2 == null) {
            finish();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.b) {
            a();
            this.f429a.a(this.e);
            this.f429a.u();
            this.b = false;
        }
        this.f429a.a(configuration);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        b bVar = this.f429a;
        if (bVar == null || bVar.a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        g.a("AppWallActivity", 2, "OverlayActivity::onPause");
        super.onPause();
        if (!this.b) {
            this.f429a.s();
            c.a((Context) this);
        }
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        g.a("AppWallActivity", 2, "AppWallActivity::onSaveInstanceState");
        super.onSaveInstanceState(bundle);
        if (!this.b) {
            this.f429a.b(bundle);
            bundle.putInt("activityLockedOrientation", this.g);
            bundle.putBoolean("activityShouldLockOrientation", this.d);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        g.a("AppWallActivity", 2, "AppWallActivity::onResume");
        super.onResume();
        if (this.f) {
            this.f429a.c();
        }
        int i = this.g;
        if (i == -1) {
            this.g = i.a((Activity) this, this.c, this.d);
        } else {
            com.startapp.common.a.c.a((Activity) this, i);
        }
        if (!this.b) {
            this.f429a.u();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        g.a("AppWallActivity", 2, "AppWallActivity::onStop");
        super.onStop();
        if (!this.b) {
            this.f429a.t();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        g.a("AppWallActivity", 2, "AppWallActivity::onDestroy");
        if (!this.b) {
            this.f429a.v();
            this.f429a = null;
            i.a((Activity) this, false);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f429a.r()) {
            super.onBackPressed();
        }
    }

    public void finish() {
        b bVar = this.f429a;
        if (bVar != null) {
            bVar.q();
        }
        super.finish();
    }
}
