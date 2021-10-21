package com.startapp.a.a.g;

import com.startapp.a.a.a.a;
import com.startapp.a.a.d.e;
import java.util.HashMap;
import java.util.Map;

/* compiled from: StartAppSDK */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, b> f258a;

    public c() {
        HashMap hashMap = new HashMap();
        this.f258a = hashMap;
        hashMap.put(a.ZERO, new g());
        this.f258a.put(a.THREE, new f());
        this.f258a.put(a.FOUR, new e());
        this.f258a.put(a.FIVE, new d());
    }

    public a a(a aVar) {
        return this.f258a.get(aVar).b();
    }

    public e b(a aVar) {
        return this.f258a.get(aVar).a();
    }
}
