package com.google.android.play.core.assetpacks;

final /* synthetic */ class ao implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ar f69a;
    private final AssetPackState b;

    ao(ar arVar, AssetPackState assetPackState) {
        this.f69a = arVar;
        this.b = assetPackState;
    }

    public final void run() {
        this.f69a.i(this.b);
    }
}
