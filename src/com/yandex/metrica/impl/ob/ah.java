package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.h;
import com.yandex.metrica.impl.p;

public class ah extends af {

    /* renamed from: a  reason: collision with root package name */
    private by f1017a = a().C();

    public ah(t tVar) {
        super(tVar);
    }

    public boolean a(h hVar) {
        t a2 = a();
        if (this.f1017a.d()) {
            return false;
        }
        if (!this.f1017a.c()) {
            String b = hVar.b();
            this.f1017a.c(b);
            a2.d(h.a(hVar, p.a.EVENT_TYPE_FIRST_ACTIVATION).c(b));
            a2.b(true);
        }
        this.f1017a.b();
        return false;
    }
}
