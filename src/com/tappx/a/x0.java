package com.tappx.a;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.tappx.a.d1;

class x0 implements v0 {

    /* renamed from: a  reason: collision with root package name */
    private final InterstitialAd f857a;
    private boolean b = false;
    private d1.b c;

    class a extends AdListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d1.b f858a;
        final /* synthetic */ Runnable b;
        final /* synthetic */ d1 c;

        a(x0 x0Var, d1.b bVar, Runnable runnable, d1 d1Var) {
            this.f858a = bVar;
            this.b = runnable;
            this.c = d1Var;
        }

        public void onAdClosed() {
            this.f858a.d();
        }

        public void onAdFailedToLoad(int i) {
            j0.d("1HPYA2lkbaNURYCXsP4iRrPA2bcLu2GoZBfTi2x2iws", new Object[0]);
            this.f858a.a(a2.NO_FILL);
        }

        public void onAdLeftApplication() {
            this.f858a.a();
            this.f858a.c();
        }

        public void onAdLoaded() {
            this.b.run();
            j0.d("sQBMFfIvnZat9SH496KzHfKib626NzkhHKkXIfYGxxc", new Object[0]);
            this.f858a.a(this.c);
        }

        public void onAdOpened() {
            this.f858a.b();
        }
    }

    public x0(Context context) {
        this.f857a = new InterstitialAd(context);
    }

    public void a(String str) {
        try {
            j0.d("XqPsOXkCkiOwfSDmQAngCTOElG/CkYie3dvHgxY0q1o", str);
            this.f857a.setAdUnitId(str);
        } catch (Throwable unused) {
            this.b = true;
        }
    }

    public void destroy() {
        try {
            if (this.f857a != null) {
                this.f857a.setAdListener((AdListener) null);
            }
        } catch (Throwable unused) {
        }
    }

    public void loadAd() {
        if (this.b) {
            d1.b bVar = this.c;
            if (bVar != null) {
                bVar.a(a2.INTERNAL_ERROR);
                return;
            }
            return;
        }
        try {
            this.f857a.loadAd(new AdRequest.Builder().build());
        } catch (Throwable unused) {
        }
    }

    public void show() {
        try {
            if (this.f857a == null || !this.f857a.isLoaded()) {
                j0.d("E7DpZ5iKZ4wFqPfA8T/0xoaEEF1mb1e+vYW2ILlIGMBhCfsQnXB9y+crvSN476OS+43wU0ucLzr4quLmL9S5+Q", new Object[0]);
            } else {
                this.f857a.show();
            }
        } catch (Throwable unused) {
        }
    }

    public void a(d1.b bVar, d1 d1Var, Runnable runnable) {
        this.c = bVar;
        if (bVar == null) {
            try {
                this.f857a.setAdListener((AdListener) null);
            } catch (Throwable unused) {
                this.b = true;
            }
        } else {
            this.f857a.setAdListener(new a(this, bVar, runnable, d1Var));
        }
    }
}
