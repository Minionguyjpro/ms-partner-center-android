package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.bh;
import com.google.android.play.core.internal.ce;

public final class p implements ce<Context> {

    /* renamed from: a  reason: collision with root package name */
    private final l f142a;

    public p(l lVar) {
        this.f142a = lVar;
    }

    public static Context c(l lVar) {
        Context a2 = lVar.a();
        bh.k(a2);
        return a2;
    }

    /* renamed from: b */
    public final Context a() {
        return c(this.f142a);
    }
}
