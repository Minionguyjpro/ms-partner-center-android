package com.google.android.play.core.internal;

import android.os.IBinder;

final /* synthetic */ class ai implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    private final aq f155a;

    ai(aq aqVar) {
        this.f155a = aqVar;
    }

    public final void binderDied() {
        this.f155a.n();
    }
}
