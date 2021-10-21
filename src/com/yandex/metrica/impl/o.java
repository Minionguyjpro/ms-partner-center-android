package com.yandex.metrica.impl;

import com.yandex.metrica.impl.utils.f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f1015a = new HashMap();
    private f b = new f();
    private f.a c;

    o(f.a aVar) {
        this.c = aVar;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2) {
        if (str2 == null) {
            this.f1015a.remove(str);
            return;
        }
        this.b.a(this.f1015a, str, str2, this.c, "Crash Environment");
    }

    /* access modifiers changed from: package-private */
    public String a() {
        if (this.f1015a.isEmpty()) {
            return null;
        }
        return new JSONObject(this.f1015a).toString();
    }
}
