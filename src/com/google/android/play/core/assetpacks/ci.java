package com.google.android.play.core.assetpacks;

import android.content.Intent;

final /* synthetic */ class ci implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cj f108a;
    private final Intent b;

    ci(cj cjVar, Intent intent) {
        this.f108a = cjVar;
        this.b = intent;
    }

    public final void run() {
        this.f108a.l(this.b);
    }
}
