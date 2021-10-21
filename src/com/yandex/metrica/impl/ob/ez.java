package com.yandex.metrica.impl.ob;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public class ez {

    /* renamed from: a  reason: collision with root package name */
    private fk f1130a;

    public ez(fk fkVar) {
        this.f1130a = fkVar;
    }

    public SSLContext a() throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init((KeyManager[]) null, new TrustManager[]{this.f1130a}, (SecureRandom) null);
        return instance;
    }
}
