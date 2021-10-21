package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.List;

public class w<BaseHandler> extends x<BaseHandler> {

    /* renamed from: a  reason: collision with root package name */
    private final List<BaseHandler> f1178a;

    public w(List<BaseHandler> list) {
        this.f1178a = Collections.unmodifiableList(list);
    }

    public List<? extends BaseHandler> a() {
        return this.f1178a;
    }
}
