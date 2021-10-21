package com.tappx.a;

public class l<E> {

    /* renamed from: a  reason: collision with root package name */
    private volatile E f736a;
    private final a<E> b;

    public interface a<E> {
        E a();
    }

    public l(a<E> aVar) {
        this.b = aVar;
    }

    public E a() {
        E e = this.f736a;
        if (e == null) {
            synchronized (this) {
                e = this.f736a;
                if (e == null) {
                    this.f736a = this.b.a();
                    e = this.f736a;
                }
            }
        }
        return e;
    }
}
