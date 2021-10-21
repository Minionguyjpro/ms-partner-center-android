package com.google.android.play.core.internal;

final class ak extends ah {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ aq f157a;

    ak(aq aqVar) {
        this.f157a = aqVar;
    }

    public final void a() {
        if (this.f157a.l != null) {
            this.f157a.c.d("Unbind from service.", new Object[0]);
            this.f157a.b.unbindService(this.f157a.k);
            this.f157a.f = false;
            this.f157a.l = null;
            this.f157a.k = null;
        }
    }
}
