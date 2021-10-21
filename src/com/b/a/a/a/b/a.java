package com.b.a.a.a.b;

import com.b.a.a.a.e.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final i f18a;

    private a(i iVar) {
        this.f18a = iVar;
    }

    public static a a(b bVar) {
        i iVar = (i) bVar;
        e.a((Object) bVar, "AdSession is null");
        e.d(iVar);
        e.b(iVar);
        a aVar = new a(iVar);
        iVar.f().a(aVar);
        return aVar;
    }

    public void a() {
        e.b(this.f18a);
        e.f(this.f18a);
        if (!this.f18a.i()) {
            try {
                this.f18a.a();
            } catch (Exception unused) {
            }
        }
        if (this.f18a.i()) {
            this.f18a.e();
        }
    }
}
