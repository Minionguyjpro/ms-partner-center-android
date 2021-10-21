package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.do  reason: invalid class name */
public class Cdo {

    /* renamed from: a  reason: collision with root package name */
    protected int f1085a = 0;
    private final int b;
    private boolean c;

    public Cdo(int i) {
        this.b = i;
    }

    public boolean b() {
        return this.c && this.f1085a < this.b;
    }

    public void a() {
        this.f1085a++;
        this.c = false;
    }

    public void c() {
        this.c = true;
    }
}
