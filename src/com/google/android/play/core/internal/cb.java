package com.google.android.play.core.internal;

public final class cb<T> implements ce<T> {

    /* renamed from: a  reason: collision with root package name */
    private ce<T> f168a;

    public static <T> void b(ce<T> ceVar, ce<T> ceVar2) {
        bh.j(ceVar2);
        cb cbVar = (cb) ceVar;
        if (cbVar.f168a == null) {
            cbVar.f168a = ceVar2;
            return;
        }
        throw new IllegalStateException();
    }

    public final T a() {
        ce<T> ceVar = this.f168a;
        if (ceVar != null) {
            return ceVar.a();
        }
        throw new IllegalStateException();
    }
}
