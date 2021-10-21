package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.bc;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public abstract class cq {

    /* renamed from: a  reason: collision with root package name */
    private final String f1073a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f1074a = ((int) TimeUnit.SECONDS.toMillis(30));
    }

    public abstract boolean b();

    public cq(String str) {
        this.f1073a = str;
    }

    public HttpURLConnection a() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f1073a).openConnection();
        httpURLConnection.setConnectTimeout(a.f1074a);
        httpURLConnection.setReadTimeout(a.f1074a);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("User-Agent", bc.a("com.yandex.mobile.metrica.sdk"));
        return httpURLConnection;
    }
}
