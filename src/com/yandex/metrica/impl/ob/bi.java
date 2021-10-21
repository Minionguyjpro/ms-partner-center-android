package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.h;
import com.yandex.metrica.impl.p;

public class bi {

    /* renamed from: a  reason: collision with root package name */
    private be f1027a;
    private bc b;
    private t c;

    public bi(t tVar, ca caVar) {
        this.c = tVar;
        this.f1027a = new be(tVar, new bf(caVar));
        this.b = new bc(tVar, new bd(caVar));
    }

    public void a() {
        this.f1027a.i();
    }

    public void b() {
        this.f1027a.h();
        this.b.h();
    }

    public boolean a(h hVar) {
        return a(hVar, this.f1027a, this.b);
    }

    public boolean b(h hVar) {
        if (!this.f1027a.f()) {
            return a(hVar, this.b, this.f1027a);
        }
        return false;
    }

    private boolean a(h hVar, bg bgVar, bg bgVar2) {
        if (!bgVar.f()) {
            if (bgVar.k()) {
                this.c.a(h.a(hVar, p.a.EVENT_TYPE_ALIVE), a(bgVar));
                bgVar.a(false);
            } else if (bgVar2.k()) {
                this.c.a(h.a(hVar, p.a.EVENT_TYPE_ALIVE), a(bgVar2));
                bgVar2.a(false);
            }
            bgVar2.h();
            bgVar.d();
            return true;
        }
        bgVar.i();
        return false;
    }

    public void a(boolean z) {
        f().a(z);
    }

    public long[] c() {
        return new long[]{this.b.c(), this.f1027a.c()};
    }

    public bj d() {
        bg f = f();
        return new bj().a(f.c()).b(f.j()).c(f.g()).a(f.a());
    }

    private bg f() {
        return this.f1027a.f() ? this.f1027a : this.b;
    }

    /* access modifiers changed from: package-private */
    public bj a(bg bgVar) {
        return new bj().a(bgVar.c()).a(bgVar.a()).b(bgVar.j()).c(bgVar.e());
    }

    public bj e() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        this.c.i().a(currentTimeMillis, bl.BACKGROUND);
        return new bj().a(currentTimeMillis).a(bl.BACKGROUND).b(0).c(0);
    }
}
