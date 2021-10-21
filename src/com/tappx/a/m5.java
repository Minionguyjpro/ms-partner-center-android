package com.tappx.a;

import android.text.TextUtils;

public final class m5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f759a;
    private final String b;

    public m5(String str, String str2) {
        this.f759a = str;
        this.b = str2;
    }

    public final String a() {
        return this.f759a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m5.class != obj.getClass()) {
            return false;
        }
        m5 m5Var = (m5) obj;
        if (!TextUtils.equals(this.f759a, m5Var.f759a) || !TextUtils.equals(this.b, m5Var.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f759a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f759a + ",value=" + this.b + "]";
    }
}
