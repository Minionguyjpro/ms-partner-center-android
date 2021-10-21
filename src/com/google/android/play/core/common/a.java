package com.google.android.play.core.common;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f150a = new HashMap();
    private final AtomicBoolean b = new AtomicBoolean(false);

    private final synchronized void b() {
        this.f150a.put("assetOnlyUpdates", false);
    }

    public final synchronized boolean a() {
        if (!this.b.get()) {
            b();
        }
        Object obj = this.f150a.get("assetOnlyUpdates");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }
}
