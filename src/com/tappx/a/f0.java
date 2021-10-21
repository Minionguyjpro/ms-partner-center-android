package com.tappx.a;

public class f0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f672a;
    public final a0 b;

    public interface a {
        void a(a0 a0Var);
    }

    public interface b<T> {
        void a(T t);
    }

    private f0(T t) {
        this.f672a = t;
        this.b = null;
    }

    public static <T> f0<T> a(T t) {
        return new f0<>(t);
    }

    public static <T> f0<T> a(a0 a0Var) {
        return new f0<>(a0Var);
    }

    public boolean a() {
        return this.b == null;
    }

    private f0(a0 a0Var) {
        this.f672a = null;
        this.b = a0Var;
    }
}
