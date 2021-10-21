package com.tappx.a;

class k2 {

    /* renamed from: a  reason: collision with root package name */
    private final v f728a;
    /* access modifiers changed from: private */
    public final t b;

    class a implements m<j2> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f729a;

        a(c cVar) {
            this.f729a = cVar;
        }

        public void a(j2 j2Var) {
            String c = j2Var.c();
            if (c != null) {
                k2.this.b.a(c);
            }
            if (j2Var.d()) {
                this.f729a.a(j2Var.a(), j2Var.b());
            } else {
                this.f729a.b();
            }
        }
    }

    class b implements h<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f730a;

        b(k2 k2Var, c cVar) {
            this.f730a = cVar;
        }

        public void a(Void voidR) {
            this.f730a.a();
        }
    }

    public interface c {
        void a();

        void a(String str, String str2);

        void b();
    }

    public k2(v vVar, t tVar) {
        this.f728a = vVar;
        this.b = tVar;
    }

    public void a(c cVar) {
        this.f728a.a(new a(cVar), new b(this, cVar));
    }
}
