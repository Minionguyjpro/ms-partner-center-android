package com.tappx.a;

import com.tappx.a.f0;

public class u2 implements t2 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b0 f831a;

    private final class b implements f0.a {

        /* renamed from: a  reason: collision with root package name */
        private final v2 f832a;
        private int b;

        public void a(a0 a0Var) {
            int i = this.b + 1;
            this.b = i;
            if (i > 4) {
                j0.d("VVPuWC/9Kuu7F3i2uDo+EpXhKnuxQFx794EdWq4sqJx9G87i++pCpDIUbWEx83NA", Integer.valueOf(i - 1));
                return;
            }
            int a2 = a(i);
            j0.d("nLLZ8hYKbSEKzUbM0u+Pir24N5Oaw+Lx+MoBG+cviQs", String.valueOf(a2));
            u2.this.f831a.a(this.f832a, a2);
        }

        private b(v2 v2Var) {
            this.b = 0;
            this.f832a = v2Var;
        }

        private int a(int i) {
            return (int) (Math.pow(2.0d, (double) (((float) i) * 1.5f)) * 1000.0d);
        }
    }

    public u2(b0 b0Var) {
        this.f831a = b0Var;
    }

    public void a(String str) {
        if (str != null) {
            j0.d("0fBLEtCaOL9UAJMNctGOmg", str);
            v2 v2Var = new v2(str, (f0.b<Void>) null, (f0.a) null);
            v2Var.a((f0.a) new b(v2Var));
            this.f831a.a(v2Var);
        }
    }
}
