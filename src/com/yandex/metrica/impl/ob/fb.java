package com.yandex.metrica.impl.ob;

import android.util.Base64;
import java.util.HashSet;
import java.util.Set;

class fb {

    /* renamed from: a  reason: collision with root package name */
    private ev f1134a;
    private String b;

    fb(ev evVar, String str) {
        this(evVar, str, (String[]) null);
    }

    fb(ev evVar, String str, String[] strArr) {
        this.f1134a = evVar;
        this.b = str;
        if (strArr != null) {
            evVar.a(str, strArr);
        }
    }

    public void a() {
        this.f1134a.a(this.b, (Set<String>) new HashSet());
    }

    /* access modifiers changed from: package-private */
    public Set<String> b() {
        Set<String> a2 = this.f1134a.a(this.b);
        return a2 == null ? new HashSet() : a2;
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f1134a.a();
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f1134a.b();
    }

    public boolean a(String str) {
        if (Base64.decode(str, 2).length == 32) {
            return this.f1134a.a(this.b, str);
        }
        throw new IllegalArgumentException("pin has bad length");
    }
}
