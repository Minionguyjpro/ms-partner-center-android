package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.h;
import com.yandex.metrica.impl.p;

public class ap extends af {

    /* renamed from: a  reason: collision with root package name */
    private by f1021a;

    public ap(t tVar) {
        super(tVar);
        this.f1021a = tVar.C();
    }

    public boolean a(h hVar) {
        h hVar2;
        t a2 = a();
        if (this.f1021a.c()) {
            return false;
        }
        if (a2.j().y()) {
            hVar2 = h.a(hVar, p.a.EVENT_TYPE_APP_UPDATE);
        } else {
            hVar2 = h.a(hVar, p.a.EVENT_TYPE_INIT);
        }
        a2.d(hVar2.c(this.f1021a.d("")));
        a2.b(true);
        this.f1021a.a();
        this.f1021a.e();
        return false;
    }
}
