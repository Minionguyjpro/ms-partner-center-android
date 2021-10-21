package com.google.android.play.core.assetpacks;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i f131a;
    private final /* synthetic */ int b = 1;

    e(i iVar, byte[] bArr) {
        this.f131a = iVar;
    }

    public final void run() {
        if (this.b != 0) {
            this.f131a.d();
        } else {
            this.f131a.c();
        }
    }
}
