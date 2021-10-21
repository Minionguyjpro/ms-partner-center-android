package com.yandex.metrica;

import java.io.IOException;
import java.util.Arrays;

public interface c {

    public static final class a extends com.yandex.metrica.impl.ob.d {
        public f b;
        public d[] c;
        public C0039a[] d;
        public C0040c[] e;
        public String[] f;
        public e[] g;

        public static final class f extends com.yandex.metrica.impl.ob.d {
            public long b;
            public int c;
            public long d;

            public f() {
                d();
            }

            public f d() {
                this.b = 0;
                this.c = 0;
                this.d = 0;
                this.f1079a = -1;
                return this;
            }

            public void a(com.yandex.metrica.impl.ob.b bVar) throws IOException {
                bVar.a(1, this.b);
                bVar.c(2, this.c);
                long j = this.d;
                if (j != 0) {
                    bVar.b(3, j);
                }
                super.a(bVar);
            }

            /* access modifiers changed from: protected */
            public int c() {
                int c2 = super.c() + com.yandex.metrica.impl.ob.b.c(1, this.b) + com.yandex.metrica.impl.ob.b.f(2, this.c);
                long j = this.d;
                return j != 0 ? c2 + com.yandex.metrica.impl.ob.b.d(3, j) : c2;
            }
        }

        public static final class b extends com.yandex.metrica.impl.ob.d {
            public double b;
            public double c;
            public long d;
            public int e;
            public int f;
            public int g;
            public int h;
            public int i;

            public b() {
                d();
            }

            public b d() {
                this.b = 0.0d;
                this.c = 0.0d;
                this.d = 0;
                this.e = 0;
                this.f = 0;
                this.g = 0;
                this.h = 0;
                this.i = 0;
                this.f1079a = -1;
                return this;
            }

            public void a(com.yandex.metrica.impl.ob.b bVar) throws IOException {
                bVar.a(1, this.b);
                bVar.a(2, this.c);
                long j = this.d;
                if (j != 0) {
                    bVar.a(3, j);
                }
                int i2 = this.e;
                if (i2 != 0) {
                    bVar.b(4, i2);
                }
                int i3 = this.f;
                if (i3 != 0) {
                    bVar.b(5, i3);
                }
                int i4 = this.g;
                if (i4 != 0) {
                    bVar.b(6, i4);
                }
                int i5 = this.h;
                if (i5 != 0) {
                    bVar.a(7, i5);
                }
                int i6 = this.i;
                if (i6 != 0) {
                    bVar.a(8, i6);
                }
                super.a(bVar);
            }

            /* access modifiers changed from: protected */
            public int c() {
                int c2 = super.c() + com.yandex.metrica.impl.ob.b.d(1) + com.yandex.metrica.impl.ob.b.d(2);
                long j = this.d;
                if (j != 0) {
                    c2 += com.yandex.metrica.impl.ob.b.c(3, j);
                }
                int i2 = this.e;
                if (i2 != 0) {
                    c2 += com.yandex.metrica.impl.ob.b.e(4, i2);
                }
                int i3 = this.f;
                if (i3 != 0) {
                    c2 += com.yandex.metrica.impl.ob.b.e(5, i3);
                }
                int i4 = this.g;
                if (i4 != 0) {
                    c2 += com.yandex.metrica.impl.ob.b.e(6, i4);
                }
                int i5 = this.h;
                if (i5 != 0) {
                    c2 += com.yandex.metrica.impl.ob.b.d(7, i5);
                }
                int i6 = this.i;
                return i6 != 0 ? c2 + com.yandex.metrica.impl.ob.b.d(8, i6) : c2;
            }
        }

        public static final class d extends com.yandex.metrica.impl.ob.d {
            private static volatile d[] e;
            public long b;
            public b c;
            public C0041a[] d;

            /* renamed from: com.yandex.metrica.c$a$d$c  reason: collision with other inner class name */
            public static final class C0045c extends com.yandex.metrica.impl.ob.d {
                private static volatile C0045c[] f;
                public String b;
                public int c;
                public String d;
                public boolean e;

                public static C0045c[] d() {
                    if (f == null) {
                        synchronized (com.yandex.metrica.impl.ob.c.f1050a) {
                            if (f == null) {
                                f = new C0045c[0];
                            }
                        }
                    }
                    return f;
                }

                public C0045c() {
                    e();
                }

                public C0045c e() {
                    this.b = "";
                    this.c = 0;
                    this.d = "";
                    this.e = false;
                    this.f1079a = -1;
                    return this;
                }

                public void a(com.yandex.metrica.impl.ob.b bVar) throws IOException {
                    bVar.a(1, this.b);
                    int i = this.c;
                    if (i != 0) {
                        bVar.c(2, i);
                    }
                    if (!this.d.equals("")) {
                        bVar.a(3, this.d);
                    }
                    boolean z = this.e;
                    if (z) {
                        bVar.a(4, z);
                    }
                    super.a(bVar);
                }

                /* access modifiers changed from: protected */
                public int c() {
                    int c2 = super.c() + com.yandex.metrica.impl.ob.b.b(1, this.b);
                    int i = this.c;
                    if (i != 0) {
                        c2 += com.yandex.metrica.impl.ob.b.f(2, i);
                    }
                    if (!this.d.equals("")) {
                        c2 += com.yandex.metrica.impl.ob.b.b(3, this.d);
                    }
                    return this.e ? c2 + com.yandex.metrica.impl.ob.b.e(4) : c2;
                }
            }

            public static final class b extends com.yandex.metrica.impl.ob.d {
                public f b;
                public String c;
                public int d;

                public b() {
                    d();
                }

                public b d() {
                    this.b = null;
                    this.c = "";
                    this.d = 0;
                    this.f1079a = -1;
                    return this;
                }

                public void a(com.yandex.metrica.impl.ob.b bVar) throws IOException {
                    f fVar = this.b;
                    if (fVar != null) {
                        bVar.a(1, (com.yandex.metrica.impl.ob.d) fVar);
                    }
                    bVar.a(2, this.c);
                    int i = this.d;
                    if (i != 0) {
                        bVar.a(5, i);
                    }
                    super.a(bVar);
                }

                /* access modifiers changed from: protected */
                public int c() {
                    int c2 = super.c();
                    f fVar = this.b;
                    if (fVar != null) {
                        c2 += com.yandex.metrica.impl.ob.b.b(1, (com.yandex.metrica.impl.ob.d) fVar);
                    }
                    int b2 = c2 + com.yandex.metrica.impl.ob.b.b(2, this.c);
                    int i = this.d;
                    return i != 0 ? b2 + com.yandex.metrica.impl.ob.b.d(5, i) : b2;
                }
            }

            /* renamed from: com.yandex.metrica.c$a$d$a  reason: collision with other inner class name */
            public static final class C0041a extends com.yandex.metrica.impl.ob.d {
                private static volatile C0041a[] m;
                public long b;
                public long c;
                public int d;
                public String e;
                public byte[] f;
                public b g;
                public b h;
                public String i;
                public C0042a j;
                public int k;
                public int l;

                /* renamed from: com.yandex.metrica.c$a$d$a$b */
                public static final class b extends com.yandex.metrica.impl.ob.d {
                    public C0043a[] b;
                    public C0045c[] c;
                    public int d;
                    public String e;
                    public C0044b f;

                    /* renamed from: com.yandex.metrica.c$a$d$a$b$a  reason: collision with other inner class name */
                    public static final class C0043a extends com.yandex.metrica.impl.ob.d {
                        private static volatile C0043a[] k;
                        public int b;
                        public int c;
                        public int d;
                        public int e;
                        public int f;
                        public String g;
                        public boolean h;
                        public int i;
                        public int j;

                        public static C0043a[] d() {
                            if (k == null) {
                                synchronized (com.yandex.metrica.impl.ob.c.f1050a) {
                                    if (k == null) {
                                        k = new C0043a[0];
                                    }
                                }
                            }
                            return k;
                        }

                        public C0043a() {
                            e();
                        }

                        public C0043a e() {
                            this.b = -1;
                            this.c = 0;
                            this.d = -1;
                            this.e = -1;
                            this.f = -1;
                            this.g = "";
                            this.h = false;
                            this.i = 0;
                            this.j = -1;
                            this.f1079a = -1;
                            return this;
                        }

                        public void a(com.yandex.metrica.impl.ob.b bVar) throws IOException {
                            int i2 = this.b;
                            if (i2 != -1) {
                                bVar.b(1, i2);
                            }
                            int i3 = this.c;
                            if (i3 != 0) {
                                bVar.c(2, i3);
                            }
                            int i4 = this.d;
                            if (i4 != -1) {
                                bVar.b(3, i4);
                            }
                            int i5 = this.e;
                            if (i5 != -1) {
                                bVar.b(4, i5);
                            }
                            int i6 = this.f;
                            if (i6 != -1) {
                                bVar.b(5, i6);
                            }
                            if (!this.g.equals("")) {
                                bVar.a(6, this.g);
                            }
                            boolean z = this.h;
                            if (z) {
                                bVar.a(7, z);
                            }
                            int i7 = this.i;
                            if (i7 != 0) {
                                bVar.a(8, i7);
                            }
                            int i8 = this.j;
                            if (i8 != -1) {
                                bVar.b(9, i8);
                            }
                            super.a(bVar);
                        }

                        /* access modifiers changed from: protected */
                        public int c() {
                            int c2 = super.c();
                            int i2 = this.b;
                            if (i2 != -1) {
                                c2 += com.yandex.metrica.impl.ob.b.e(1, i2);
                            }
                            int i3 = this.c;
                            if (i3 != 0) {
                                c2 += com.yandex.metrica.impl.ob.b.f(2, i3);
                            }
                            int i4 = this.d;
                            if (i4 != -1) {
                                c2 += com.yandex.metrica.impl.ob.b.e(3, i4);
                            }
                            int i5 = this.e;
                            if (i5 != -1) {
                                c2 += com.yandex.metrica.impl.ob.b.e(4, i5);
                            }
                            int i6 = this.f;
                            if (i6 != -1) {
                                c2 += com.yandex.metrica.impl.ob.b.e(5, i6);
                            }
                            if (!this.g.equals("")) {
                                c2 += com.yandex.metrica.impl.ob.b.b(6, this.g);
                            }
                            if (this.h) {
                                c2 += com.yandex.metrica.impl.ob.b.e(7);
                            }
                            int i7 = this.i;
                            if (i7 != 0) {
                                c2 += com.yandex.metrica.impl.ob.b.d(8, i7);
                            }
                            int i8 = this.j;
                            return i8 != -1 ? c2 + com.yandex.metrica.impl.ob.b.e(9, i8) : c2;
                        }
                    }

                    /* renamed from: com.yandex.metrica.c$a$d$a$b$b  reason: collision with other inner class name */
                    public static final class C0044b extends com.yandex.metrica.impl.ob.d {
                        public String b;
                        public int c;

                        public C0044b() {
                            d();
                        }

                        public C0044b d() {
                            this.b = "";
                            this.c = 0;
                            this.f1079a = -1;
                            return this;
                        }

                        public void a(com.yandex.metrica.impl.ob.b bVar) throws IOException {
                            bVar.a(1, this.b);
                            int i = this.c;
                            if (i != 0) {
                                bVar.a(2, i);
                            }
                            super.a(bVar);
                        }

                        /* access modifiers changed from: protected */
                        public int c() {
                            int c2 = super.c() + com.yandex.metrica.impl.ob.b.b(1, this.b);
                            int i = this.c;
                            return i != 0 ? c2 + com.yandex.metrica.impl.ob.b.d(2, i) : c2;
                        }
                    }

                    public b() {
                        d();
                    }

                    public b d() {
                        this.b = C0043a.d();
                        this.c = C0045c.d();
                        this.d = 2;
                        this.e = "";
                        this.f = null;
                        this.f1079a = -1;
                        return this;
                    }

                    public void a(com.yandex.metrica.impl.ob.b bVar) throws IOException {
                        C0043a[] aVarArr = this.b;
                        int i = 0;
                        if (aVarArr != null && aVarArr.length > 0) {
                            int i2 = 0;
                            while (true) {
                                C0043a[] aVarArr2 = this.b;
                                if (i2 >= aVarArr2.length) {
                                    break;
                                }
                                C0043a aVar = aVarArr2[i2];
                                if (aVar != null) {
                                    bVar.a(1, (com.yandex.metrica.impl.ob.d) aVar);
                                }
                                i2++;
                            }
                        }
                        C0045c[] cVarArr = this.c;
                        if (cVarArr != null && cVarArr.length > 0) {
                            while (true) {
                                C0045c[] cVarArr2 = this.c;
                                if (i >= cVarArr2.length) {
                                    break;
                                }
                                C0045c cVar = cVarArr2[i];
                                if (cVar != null) {
                                    bVar.a(2, (com.yandex.metrica.impl.ob.d) cVar);
                                }
                                i++;
                            }
                        }
                        int i3 = this.d;
                        if (i3 != 2) {
                            bVar.a(3, i3);
                        }
                        if (!this.e.equals("")) {
                            bVar.a(4, this.e);
                        }
                        C0044b bVar2 = this.f;
                        if (bVar2 != null) {
                            bVar.a(5, (com.yandex.metrica.impl.ob.d) bVar2);
                        }
                        super.a(bVar);
                    }

                    /* access modifiers changed from: protected */
                    public int c() {
                        int c2 = super.c();
                        C0043a[] aVarArr = this.b;
                        int i = 0;
                        if (aVarArr != null && aVarArr.length > 0) {
                            int i2 = 0;
                            while (true) {
                                C0043a[] aVarArr2 = this.b;
                                if (i2 >= aVarArr2.length) {
                                    break;
                                }
                                C0043a aVar = aVarArr2[i2];
                                if (aVar != null) {
                                    c2 += com.yandex.metrica.impl.ob.b.b(1, (com.yandex.metrica.impl.ob.d) aVar);
                                }
                                i2++;
                            }
                        }
                        C0045c[] cVarArr = this.c;
                        if (cVarArr != null && cVarArr.length > 0) {
                            while (true) {
                                C0045c[] cVarArr2 = this.c;
                                if (i >= cVarArr2.length) {
                                    break;
                                }
                                C0045c cVar = cVarArr2[i];
                                if (cVar != null) {
                                    c2 += com.yandex.metrica.impl.ob.b.b(2, (com.yandex.metrica.impl.ob.d) cVar);
                                }
                                i++;
                            }
                        }
                        int i3 = this.d;
                        if (i3 != 2) {
                            c2 += com.yandex.metrica.impl.ob.b.d(3, i3);
                        }
                        if (!this.e.equals("")) {
                            c2 += com.yandex.metrica.impl.ob.b.b(4, this.e);
                        }
                        C0044b bVar = this.f;
                        return bVar != null ? c2 + com.yandex.metrica.impl.ob.b.b(5, (com.yandex.metrica.impl.ob.d) bVar) : c2;
                    }
                }

                /* renamed from: com.yandex.metrica.c$a$d$a$a  reason: collision with other inner class name */
                public static final class C0042a extends com.yandex.metrica.impl.ob.d {
                    public String b;
                    public String c;
                    public String d;

                    public C0042a() {
                        d();
                    }

                    public C0042a d() {
                        this.b = "";
                        this.c = "";
                        this.d = "";
                        this.f1079a = -1;
                        return this;
                    }

                    public void a(com.yandex.metrica.impl.ob.b bVar) throws IOException {
                        bVar.a(1, this.b);
                        if (!this.c.equals("")) {
                            bVar.a(2, this.c);
                        }
                        if (!this.d.equals("")) {
                            bVar.a(3, this.d);
                        }
                        super.a(bVar);
                    }

                    /* access modifiers changed from: protected */
                    public int c() {
                        int c2 = super.c() + com.yandex.metrica.impl.ob.b.b(1, this.b);
                        if (!this.c.equals("")) {
                            c2 += com.yandex.metrica.impl.ob.b.b(2, this.c);
                        }
                        return !this.d.equals("") ? c2 + com.yandex.metrica.impl.ob.b.b(3, this.d) : c2;
                    }
                }

                public static C0041a[] d() {
                    if (m == null) {
                        synchronized (com.yandex.metrica.impl.ob.c.f1050a) {
                            if (m == null) {
                                m = new C0041a[0];
                            }
                        }
                    }
                    return m;
                }

                public C0041a() {
                    e();
                }

                public C0041a e() {
                    this.b = 0;
                    this.c = 0;
                    this.d = 0;
                    this.e = "";
                    this.f = com.yandex.metrica.impl.ob.f.b;
                    this.g = null;
                    this.h = null;
                    this.i = "";
                    this.j = null;
                    this.k = 0;
                    this.l = 0;
                    this.f1079a = -1;
                    return this;
                }

                public void a(com.yandex.metrica.impl.ob.b bVar) throws IOException {
                    bVar.a(1, this.b);
                    bVar.a(2, this.c);
                    bVar.b(3, this.d);
                    if (!this.e.equals("")) {
                        bVar.a(4, this.e);
                    }
                    if (!Arrays.equals(this.f, com.yandex.metrica.impl.ob.f.b)) {
                        bVar.a(5, this.f);
                    }
                    b bVar2 = this.g;
                    if (bVar2 != null) {
                        bVar.a(6, (com.yandex.metrica.impl.ob.d) bVar2);
                    }
                    b bVar3 = this.h;
                    if (bVar3 != null) {
                        bVar.a(7, (com.yandex.metrica.impl.ob.d) bVar3);
                    }
                    if (!this.i.equals("")) {
                        bVar.a(8, this.i);
                    }
                    C0042a aVar = this.j;
                    if (aVar != null) {
                        bVar.a(9, (com.yandex.metrica.impl.ob.d) aVar);
                    }
                    int i2 = this.k;
                    if (i2 != 0) {
                        bVar.b(10, i2);
                    }
                    int i3 = this.l;
                    if (i3 != 0) {
                        bVar.a(12, i3);
                    }
                    super.a(bVar);
                }

                /* access modifiers changed from: protected */
                public int c() {
                    int c2 = super.c() + com.yandex.metrica.impl.ob.b.c(1, this.b) + com.yandex.metrica.impl.ob.b.c(2, this.c) + com.yandex.metrica.impl.ob.b.e(3, this.d);
                    if (!this.e.equals("")) {
                        c2 += com.yandex.metrica.impl.ob.b.b(4, this.e);
                    }
                    if (!Arrays.equals(this.f, com.yandex.metrica.impl.ob.f.b)) {
                        c2 += com.yandex.metrica.impl.ob.b.b(5, this.f);
                    }
                    b bVar = this.g;
                    if (bVar != null) {
                        c2 += com.yandex.metrica.impl.ob.b.b(6, (com.yandex.metrica.impl.ob.d) bVar);
                    }
                    b bVar2 = this.h;
                    if (bVar2 != null) {
                        c2 += com.yandex.metrica.impl.ob.b.b(7, (com.yandex.metrica.impl.ob.d) bVar2);
                    }
                    if (!this.i.equals("")) {
                        c2 += com.yandex.metrica.impl.ob.b.b(8, this.i);
                    }
                    C0042a aVar = this.j;
                    if (aVar != null) {
                        c2 += com.yandex.metrica.impl.ob.b.b(9, (com.yandex.metrica.impl.ob.d) aVar);
                    }
                    int i2 = this.k;
                    if (i2 != 0) {
                        c2 += com.yandex.metrica.impl.ob.b.e(10, i2);
                    }
                    int i3 = this.l;
                    return i3 != 0 ? c2 + com.yandex.metrica.impl.ob.b.d(12, i3) : c2;
                }
            }

            public static d[] d() {
                if (e == null) {
                    synchronized (com.yandex.metrica.impl.ob.c.f1050a) {
                        if (e == null) {
                            e = new d[0];
                        }
                    }
                }
                return e;
            }

            public d() {
                e();
            }

            public d e() {
                this.b = 0;
                this.c = null;
                this.d = C0041a.d();
                this.f1079a = -1;
                return this;
            }

            public void a(com.yandex.metrica.impl.ob.b bVar) throws IOException {
                bVar.a(1, this.b);
                b bVar2 = this.c;
                if (bVar2 != null) {
                    bVar.a(2, (com.yandex.metrica.impl.ob.d) bVar2);
                }
                C0041a[] aVarArr = this.d;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        C0041a[] aVarArr2 = this.d;
                        if (i >= aVarArr2.length) {
                            break;
                        }
                        C0041a aVar = aVarArr2[i];
                        if (aVar != null) {
                            bVar.a(3, (com.yandex.metrica.impl.ob.d) aVar);
                        }
                        i++;
                    }
                }
                super.a(bVar);
            }

            /* access modifiers changed from: protected */
            public int c() {
                int c2 = super.c() + com.yandex.metrica.impl.ob.b.c(1, this.b);
                b bVar = this.c;
                if (bVar != null) {
                    c2 += com.yandex.metrica.impl.ob.b.b(2, (com.yandex.metrica.impl.ob.d) bVar);
                }
                C0041a[] aVarArr = this.d;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        C0041a[] aVarArr2 = this.d;
                        if (i >= aVarArr2.length) {
                            break;
                        }
                        C0041a aVar = aVarArr2[i];
                        if (aVar != null) {
                            c2 += com.yandex.metrica.impl.ob.b.b(3, (com.yandex.metrica.impl.ob.d) aVar);
                        }
                        i++;
                    }
                }
                return c2;
            }
        }

        /* renamed from: com.yandex.metrica.c$a$a  reason: collision with other inner class name */
        public static final class C0039a extends com.yandex.metrica.impl.ob.d {
            private static volatile C0039a[] d;
            public String b;
            public String c;

            public static C0039a[] d() {
                if (d == null) {
                    synchronized (com.yandex.metrica.impl.ob.c.f1050a) {
                        if (d == null) {
                            d = new C0039a[0];
                        }
                    }
                }
                return d;
            }

            public C0039a() {
                e();
            }

            public C0039a e() {
                this.b = "";
                this.c = "";
                this.f1079a = -1;
                return this;
            }

            public void a(com.yandex.metrica.impl.ob.b bVar) throws IOException {
                bVar.a(1, this.b);
                bVar.a(2, this.c);
                super.a(bVar);
            }

            /* access modifiers changed from: protected */
            public int c() {
                return super.c() + com.yandex.metrica.impl.ob.b.b(1, this.b) + com.yandex.metrica.impl.ob.b.b(2, this.c);
            }
        }

        /* renamed from: com.yandex.metrica.c$a$c  reason: collision with other inner class name */
        public static final class C0040c extends com.yandex.metrica.impl.ob.d {
            private static volatile C0040c[] d;
            public String b;
            public String c;

            public static C0040c[] d() {
                if (d == null) {
                    synchronized (com.yandex.metrica.impl.ob.c.f1050a) {
                        if (d == null) {
                            d = new C0040c[0];
                        }
                    }
                }
                return d;
            }

            public C0040c() {
                e();
            }

            public C0040c e() {
                this.b = "";
                this.c = "";
                this.f1079a = -1;
                return this;
            }

            public void a(com.yandex.metrica.impl.ob.b bVar) throws IOException {
                bVar.a(1, this.b);
                bVar.a(2, this.c);
                super.a(bVar);
            }

            /* access modifiers changed from: protected */
            public int c() {
                return super.c() + com.yandex.metrica.impl.ob.b.b(1, this.b) + com.yandex.metrica.impl.ob.b.b(2, this.c);
            }
        }

        public static final class e extends com.yandex.metrica.impl.ob.d {
            private static volatile e[] g;
            public int b;
            public int c;
            public String d;
            public boolean e;
            public String f;

            public static e[] d() {
                if (g == null) {
                    synchronized (com.yandex.metrica.impl.ob.c.f1050a) {
                        if (g == null) {
                            g = new e[0];
                        }
                    }
                }
                return g;
            }

            public e() {
                e();
            }

            public e e() {
                this.b = 0;
                this.c = 0;
                this.d = "";
                this.e = false;
                this.f = "";
                this.f1079a = -1;
                return this;
            }

            public void a(com.yandex.metrica.impl.ob.b bVar) throws IOException {
                int i = this.b;
                if (i != 0) {
                    bVar.b(1, i);
                }
                int i2 = this.c;
                if (i2 != 0) {
                    bVar.b(2, i2);
                }
                if (!this.d.equals("")) {
                    bVar.a(3, this.d);
                }
                boolean z = this.e;
                if (z) {
                    bVar.a(4, z);
                }
                if (!this.f.equals("")) {
                    bVar.a(5, this.f);
                }
                super.a(bVar);
            }

            /* access modifiers changed from: protected */
            public int c() {
                int c2 = super.c();
                int i = this.b;
                if (i != 0) {
                    c2 += com.yandex.metrica.impl.ob.b.e(1, i);
                }
                int i2 = this.c;
                if (i2 != 0) {
                    c2 += com.yandex.metrica.impl.ob.b.e(2, i2);
                }
                if (!this.d.equals("")) {
                    c2 += com.yandex.metrica.impl.ob.b.b(3, this.d);
                }
                if (this.e) {
                    c2 += com.yandex.metrica.impl.ob.b.e(4);
                }
                return !this.f.equals("") ? c2 + com.yandex.metrica.impl.ob.b.b(5, this.f) : c2;
            }
        }

        public a() {
            d();
        }

        public a d() {
            this.b = null;
            this.c = d.d();
            this.d = C0039a.d();
            this.e = C0040c.d();
            this.f = com.yandex.metrica.impl.ob.f.f1131a;
            this.g = e.d();
            this.f1079a = -1;
            return this;
        }

        public void a(com.yandex.metrica.impl.ob.b bVar) throws IOException {
            f fVar = this.b;
            if (fVar != null) {
                bVar.a(1, (com.yandex.metrica.impl.ob.d) fVar);
            }
            d[] dVarArr = this.c;
            int i = 0;
            if (dVarArr != null && dVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    d[] dVarArr2 = this.c;
                    if (i2 >= dVarArr2.length) {
                        break;
                    }
                    d dVar = dVarArr2[i2];
                    if (dVar != null) {
                        bVar.a(3, (com.yandex.metrica.impl.ob.d) dVar);
                    }
                    i2++;
                }
            }
            C0039a[] aVarArr = this.d;
            if (aVarArr != null && aVarArr.length > 0) {
                int i3 = 0;
                while (true) {
                    C0039a[] aVarArr2 = this.d;
                    if (i3 >= aVarArr2.length) {
                        break;
                    }
                    C0039a aVar = aVarArr2[i3];
                    if (aVar != null) {
                        bVar.a(7, (com.yandex.metrica.impl.ob.d) aVar);
                    }
                    i3++;
                }
            }
            C0040c[] cVarArr = this.e;
            if (cVarArr != null && cVarArr.length > 0) {
                int i4 = 0;
                while (true) {
                    C0040c[] cVarArr2 = this.e;
                    if (i4 >= cVarArr2.length) {
                        break;
                    }
                    C0040c cVar = cVarArr2[i4];
                    if (cVar != null) {
                        bVar.a(8, (com.yandex.metrica.impl.ob.d) cVar);
                    }
                    i4++;
                }
            }
            String[] strArr = this.f;
            if (strArr != null && strArr.length > 0) {
                int i5 = 0;
                while (true) {
                    String[] strArr2 = this.f;
                    if (i5 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i5];
                    if (str != null) {
                        bVar.a(9, str);
                    }
                    i5++;
                }
            }
            e[] eVarArr = this.g;
            if (eVarArr != null && eVarArr.length > 0) {
                while (true) {
                    e[] eVarArr2 = this.g;
                    if (i >= eVarArr2.length) {
                        break;
                    }
                    e eVar = eVarArr2[i];
                    if (eVar != null) {
                        bVar.a(10, (com.yandex.metrica.impl.ob.d) eVar);
                    }
                    i++;
                }
            }
            super.a(bVar);
        }

        /* access modifiers changed from: protected */
        public int c() {
            int c2 = super.c();
            f fVar = this.b;
            if (fVar != null) {
                c2 += com.yandex.metrica.impl.ob.b.b(1, (com.yandex.metrica.impl.ob.d) fVar);
            }
            d[] dVarArr = this.c;
            int i = 0;
            if (dVarArr != null && dVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    d[] dVarArr2 = this.c;
                    if (i2 >= dVarArr2.length) {
                        break;
                    }
                    d dVar = dVarArr2[i2];
                    if (dVar != null) {
                        c2 += com.yandex.metrica.impl.ob.b.b(3, (com.yandex.metrica.impl.ob.d) dVar);
                    }
                    i2++;
                }
            }
            C0039a[] aVarArr = this.d;
            if (aVarArr != null && aVarArr.length > 0) {
                int i3 = 0;
                while (true) {
                    C0039a[] aVarArr2 = this.d;
                    if (i3 >= aVarArr2.length) {
                        break;
                    }
                    C0039a aVar = aVarArr2[i3];
                    if (aVar != null) {
                        c2 += com.yandex.metrica.impl.ob.b.b(7, (com.yandex.metrica.impl.ob.d) aVar);
                    }
                    i3++;
                }
            }
            C0040c[] cVarArr = this.e;
            if (cVarArr != null && cVarArr.length > 0) {
                int i4 = 0;
                while (true) {
                    C0040c[] cVarArr2 = this.e;
                    if (i4 >= cVarArr2.length) {
                        break;
                    }
                    C0040c cVar = cVarArr2[i4];
                    if (cVar != null) {
                        c2 += com.yandex.metrica.impl.ob.b.b(8, (com.yandex.metrica.impl.ob.d) cVar);
                    }
                    i4++;
                }
            }
            String[] strArr = this.f;
            if (strArr != null && strArr.length > 0) {
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    String[] strArr2 = this.f;
                    if (i5 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i5];
                    if (str != null) {
                        i7++;
                        i6 += com.yandex.metrica.impl.ob.b.b(str);
                    }
                    i5++;
                }
                c2 = c2 + i6 + (i7 * 1);
            }
            e[] eVarArr = this.g;
            if (eVarArr != null && eVarArr.length > 0) {
                while (true) {
                    e[] eVarArr2 = this.g;
                    if (i >= eVarArr2.length) {
                        break;
                    }
                    e eVar = eVarArr2[i];
                    if (eVar != null) {
                        c2 += com.yandex.metrica.impl.ob.b.b(10, (com.yandex.metrica.impl.ob.d) eVar);
                    }
                    i++;
                }
            }
            return c2;
        }
    }
}
