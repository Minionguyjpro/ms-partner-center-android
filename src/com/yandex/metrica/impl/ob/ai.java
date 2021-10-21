package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.h;

public class ai extends af {

    /* renamed from: a  reason: collision with root package name */
    private by f1018a;

    public ai(t tVar) {
        super(tVar);
        this.f1018a = tVar.C();
    }

    public boolean a(h hVar) {
        t a2 = a();
        if (!this.f1018a.d() || !a2.z()) {
            return false;
        }
        a2.e(h.a(a2, hVar));
        return false;
    }
}
