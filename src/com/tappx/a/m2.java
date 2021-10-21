package com.tappx.a;

import java.util.ArrayList;
import java.util.List;

public class m2 {

    /* renamed from: a  reason: collision with root package name */
    private final List<Runnable> f755a = new ArrayList();
    private boolean b;

    private void c() {
        ArrayList<Runnable> arrayList;
        synchronized (this.f755a) {
            arrayList = new ArrayList<>(this.f755a);
            this.f755a.clear();
        }
        for (Runnable run : arrayList) {
            run.run();
        }
    }

    public void a() {
        this.b = false;
        c();
    }

    public void b() {
        if (!this.b) {
            this.b = true;
        }
    }

    public void a(Runnable runnable) {
        if (this.b) {
            this.f755a.add(runnable);
        } else {
            runnable.run();
        }
    }
}
