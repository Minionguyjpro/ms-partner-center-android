package com.tappx.a;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import com.tappx.a.g1;
import com.tappx.a.i1;
import com.tappx.a.l0;
import com.tappx.a.m1;
import com.tappx.a.p0;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private final Context f778a;

    private static final class a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f779a;

        public a(Context context) {
            this.f779a = context;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            p0.b.a(this.f779a).a();
            m1.a.a(this.f779a).b();
            i1.a.a(this.f779a).a();
            l0.a.a(this.f779a).a();
            g1.b.a(this.f779a).a();
            return null;
        }
    }

    public p(Context context) {
        this.f778a = context.getApplicationContext();
    }

    public void a() {
        a aVar = new a(this.f778a);
        if (Build.VERSION.SDK_INT >= 11) {
            aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else {
            aVar.execute(new Void[0]);
        }
    }
}
