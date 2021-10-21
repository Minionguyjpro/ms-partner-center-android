package com.yandex.metrica.impl.ob;

import java.security.cert.X509Certificate;

class ep implements er {

    /* renamed from: a  reason: collision with root package name */
    private final ek f1122a;
    private final ek b;

    public boolean b(X509Certificate[] x509CertificateArr) {
        return false;
    }

    ep(ey eyVar) {
        this.f1122a = new ek(eyVar.a());
        this.b = new ek(eyVar.c());
    }

    public boolean a(X509Certificate[] x509CertificateArr) {
        return this.f1122a.a(x509CertificateArr);
    }

    public boolean c(X509Certificate[] x509CertificateArr) {
        return this.b.a(x509CertificateArr);
    }
}
