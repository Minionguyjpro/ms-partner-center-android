package com.truenet.android;

import a.a.b.a.b;
import a.a.b.b.h;
import java.lang.Thread;

/* compiled from: StartAppSDK */
final class d implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ b f916a;

    d(b bVar) {
        this.f916a = bVar;
    }

    public final /* synthetic */ void uncaughtException(Thread thread, Throwable th) {
        h.a(this.f916a.a(thread, th), "invoke(...)");
    }
}
