package com.google.android.play.core.assetpacks;

import android.os.Bundle;

final /* synthetic */ class aq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ar f71a;
    private final Bundle b;

    aq(ar arVar, Bundle bundle) {
        this.f71a = arVar;
        this.b = bundle;
    }

    public final void run() {
        this.f71a.c(this.b);
    }
}
