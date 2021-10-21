package com.yandex.metrica.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.yandex.metrica.impl.ai;
import com.yandex.metrica.impl.ob.bz;
import com.yandex.metrica.impl.ob.de;
import com.yandex.metrica.impl.ob.dg;
import java.util.Map;

public class f extends ai {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final bz f999a;

    public f(bz bzVar) {
        this.f999a = bzVar;
    }

    /* access modifiers changed from: package-private */
    public SparseArray<ai.a> a() {
        return new SparseArray<ai.a>() {
            {
                put(46, new a(f.this.f999a));
            }
        };
    }

    /* access modifiers changed from: protected */
    public int a(dg dgVar) {
        return (int) this.f999a.c(-1);
    }

    /* access modifiers changed from: protected */
    public void a(dg dgVar, int i) {
        this.f999a.f((long) i);
        dgVar.c().k();
    }

    static class a implements ai.a {

        /* renamed from: a  reason: collision with root package name */
        private bz f1001a;

        private static boolean a(long j, long j2, long j3) {
            return j != j3 && j2 == j3;
        }

        public a(bz bzVar) {
            this.f1001a = bzVar;
        }

        public void a(Context context) {
            de deVar = new de(context);
            if (bk.a((Map) deVar.c())) {
                return;
            }
            if (this.f1001a.a((String) null) == null || this.f1001a.b((String) null) == null) {
                String b = deVar.b((String) null);
                if (a(b, this.f1001a.b((String) null))) {
                    this.f1001a.g(b);
                }
                String a2 = deVar.a();
                if (a(a2, this.f1001a.a())) {
                    this.f1001a.k(a2);
                }
                String a3 = deVar.a((String) null);
                if (a(a3, this.f1001a.a((String) null))) {
                    this.f1001a.f(a3);
                }
                String c = deVar.c((String) null);
                if (a(c, this.f1001a.c((String) null))) {
                    this.f1001a.h(c);
                }
                String d = deVar.d((String) null);
                if (a(d, this.f1001a.d((String) null))) {
                    this.f1001a.i(d);
                }
                String e = deVar.e((String) null);
                if (a(e, this.f1001a.e((String) null))) {
                    this.f1001a.j(e);
                }
                long a4 = deVar.a(-1);
                if (a(a4, this.f1001a.a(-1), -1)) {
                    this.f1001a.d(a4);
                }
                long b2 = deVar.b(-1);
                if (a(b2, this.f1001a.b(-1), -1)) {
                    this.f1001a.e(b2);
                }
                this.f1001a.h();
                deVar.b().k();
            }
        }

        private static boolean a(String str, String str2) {
            return !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2);
        }
    }
}
