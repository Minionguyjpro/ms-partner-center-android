package com.google.android.play.core.tasks;

public final class i<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final m<ResultT> f180a = new m<>();

    public final void a(ResultT resultt) {
        this.f180a.a(resultt);
    }

    public final void b(Exception exc) {
        this.f180a.c(exc);
    }

    public final Task<ResultT> c() {
        return this.f180a;
    }

    public final void d(Exception exc) {
        this.f180a.d(exc);
    }

    public final void e(ResultT resultt) {
        this.f180a.b(resultt);
    }
}
