package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.a;
import java.util.LinkedList;
import java.util.List;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private final t f1170a;
    private final db b;
    private List<e> c;

    s(t tVar, db dbVar) {
        this.f1170a = tVar;
        this.b = dbVar;
        LinkedList linkedList = new LinkedList();
        this.c = linkedList;
        linkedList.add(new b(this.f1170a, this.b));
        this.c.add(new d(this.f1170a, this.b));
        this.c.add(new c(this.f1170a));
        this.c.add(new a(this.f1170a));
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!db.f1081a.values().contains(this.f1170a.l().a())) {
            for (e d2 : this.c) {
                d2.d();
            }
        }
    }

    static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        private final df f1171a;
        private final ca b;

        a(t tVar) {
            super(tVar);
            this.f1171a = new df(tVar.m(), tVar.l().toString());
            this.b = tVar.F();
        }

        /* access modifiers changed from: protected */
        public boolean a() {
            return this.f1171a.g();
        }

        /* access modifiers changed from: protected */
        public void b() {
            long e = this.f1171a.e(-1);
            if (e != -1 && this.b.f(-1) == -1) {
                this.b.p(e);
            }
            long b2 = this.f1171a.b(Long.MIN_VALUE);
            if (b2 != Long.MIN_VALUE && this.b.b(Long.MIN_VALUE) == Long.MIN_VALUE) {
                this.b.l(b2);
            }
            long g = this.f1171a.g(0);
            if (g != 0 && this.b.h(0) == 0) {
                this.b.r(g);
            }
            long i = this.f1171a.i(0);
            if (i != 0 && this.b.j(0) == 0) {
                this.b.t(i);
            }
            long d = this.f1171a.d(-1);
            if (-1 != d && this.b.e(-1) == -1) {
                this.b.o(d);
            }
            boolean booleanValue = this.f1171a.a(true).booleanValue();
            if (!this.b.a(false) && booleanValue) {
                this.b.b(booleanValue);
            }
            long a2 = this.f1171a.a(Long.MIN_VALUE);
            if (a2 != Long.MIN_VALUE && this.b.a(Long.MIN_VALUE) == Long.MIN_VALUE) {
                this.b.k(a2);
            }
            long f = this.f1171a.f(0);
            if (f != 0 && this.b.g(0) == 0) {
                this.b.q(f);
            }
            long h = this.f1171a.h(0);
            if (h != 0 && this.b.i(0) == 0) {
                this.b.s(h);
            }
            a.C0046a a3 = this.f1171a.a();
            if (a3 != null) {
                this.b.a(a3);
            }
            String a4 = this.f1171a.a((String) null);
            if (!TextUtils.isEmpty(a4) && TextUtils.isEmpty(this.b.a((String) null))) {
                this.b.b(a4);
            }
            CounterConfiguration.a b3 = this.f1171a.b();
            if (b3 != CounterConfiguration.a.UNDEFINED && this.b.c() == CounterConfiguration.a.UNDEFINED) {
                this.b.a(b3);
            }
            long c = this.f1171a.c(Long.MIN_VALUE);
            if (c != Long.MIN_VALUE && this.b.c(Long.MIN_VALUE) == Long.MIN_VALUE) {
                this.b.m(c);
            }
            this.b.h();
            this.f1171a.l();
        }
    }

    static class c extends e {

        /* renamed from: a  reason: collision with root package name */
        private final dc f1172a;
        private final by b;

        c(t tVar) {
            super(tVar);
            this.f1172a = tVar.D();
            this.b = tVar.C();
        }

        /* access modifiers changed from: protected */
        public boolean a() {
            return "DONE".equals(this.f1172a.c((String) null)) || "DONE".equals(this.f1172a.b((String) null));
        }

        /* access modifiers changed from: protected */
        public void b() {
            if ("DONE".equals(this.f1172a.c((String) null))) {
                this.b.b();
            }
            String e = this.f1172a.e((String) null);
            if (!TextUtils.isEmpty(e)) {
                this.b.c(e);
            }
            if ("DONE".equals(this.f1172a.b((String) null))) {
                this.b.a();
            }
            this.f1172a.d();
            this.f1172a.e();
            this.f1172a.c();
        }
    }

    static class d extends f {
        d(t tVar, db dbVar) {
            super(tVar, dbVar);
        }

        /* access modifiers changed from: protected */
        public boolean a() {
            return c().C().a((String) null) == null;
        }

        /* access modifiers changed from: protected */
        public void b() {
            CounterConfiguration j = c().j();
            db e = e();
            if (j.C()) {
                e.c();
            } else {
                e.b();
            }
        }
    }

    static class b extends f {
        b(t tVar, db dbVar) {
            super(tVar, dbVar);
        }

        /* access modifiers changed from: protected */
        public boolean a() {
            return c().j().C();
        }

        /* access modifiers changed from: protected */
        public void b() {
            e().a();
        }
    }

    private static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        private db f1174a;

        f(t tVar, db dbVar) {
            super(tVar);
            this.f1174a = dbVar;
        }

        public db e() {
            return this.f1174a;
        }
    }

    private static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        private final t f1173a;

        /* access modifiers changed from: protected */
        public abstract boolean a();

        /* access modifiers changed from: protected */
        public abstract void b();

        e(t tVar) {
            this.f1173a = tVar;
        }

        /* access modifiers changed from: package-private */
        public t c() {
            return this.f1173a;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (a()) {
                b();
            }
        }
    }
}
