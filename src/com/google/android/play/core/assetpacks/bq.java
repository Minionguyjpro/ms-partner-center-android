package com.google.android.play.core.assetpacks;

import android.os.Bundle;

final /* synthetic */ class bq implements bz {

    /* renamed from: a  reason: collision with root package name */
    private final ca f94a;
    private final Bundle b;
    private final /* synthetic */ int c = 0;

    bq(ca caVar, Bundle bundle) {
        this.f94a = caVar;
        this.b = bundle;
    }

    bq(ca caVar, Bundle bundle, byte[] bArr) {
        this.f94a = caVar;
        this.b = bundle;
    }

    public final Object a() {
        return this.c != 0 ? this.f94a.l(this.b) : this.f94a.k(this.b);
    }
}
