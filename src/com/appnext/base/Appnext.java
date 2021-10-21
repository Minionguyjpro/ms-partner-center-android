package com.appnext.base;

import android.content.Context;
import com.appnext.base.a.a;
import com.appnext.base.a.b.c;
import com.appnext.base.b.d;
import com.appnext.base.b.e;
import com.appnext.base.b.g;
import com.appnext.base.b.i;
import com.appnext.base.b.j;
import com.appnext.base.services.OperationService;
import com.appnext.core.f;
import java.util.List;

public class Appnext {
    private static final Appnext dp = new Appnext();
    /* access modifiers changed from: private */

    /* renamed from: do  reason: not valid java name */
    public Context f0do = null;
    /* access modifiers changed from: private */
    public boolean dq = false;

    private Appnext() {
    }

    protected static Appnext T() {
        return dp;
    }

    private void b(Context context) throws ExceptionInInitializerError {
        if (context != null) {
            try {
                if (!this.dq || this.f0do == null) {
                    this.dq = true;
                    e.init(context);
                    this.f0do = context.getApplicationContext();
                    if (j.a(OperationService.class)) {
                        g.aN().b(new Runnable() {
                            public final void run() {
                                try {
                                    j.a(d.fp, f.b(e.getContext(), true), d.a.String);
                                    i.aR().init(Appnext.this.f0do);
                                    if (j.i(Appnext.this.f0do)) {
                                        boolean unused = Appnext.this.dq = false;
                                        i.aR().putBoolean(i.fC, true);
                                        return;
                                    }
                                    e.init(Appnext.this.f0do);
                                    i.aR().init(Appnext.this.f0do);
                                    Appnext.b(Appnext.this);
                                    Context a2 = Appnext.this.f0do;
                                    List<c> as = a.X().ab().as();
                                    if (as != null && as.size() == 0) {
                                        c cVar = new c(d.fe, "1", d.fj, "1", d.fn, "cdm", "cdm" + System.currentTimeMillis(), (String) null);
                                        a.X().ab().a(cVar);
                                        com.appnext.base.services.b.a.d(a2).a(cVar, true);
                                    }
                                } catch (Throwable unused2) {
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                this.f0do = context.getApplicationContext();
            } catch (Throwable unused) {
            }
        } else {
            throw new ExceptionInInitializerError("Cannot init Appnext with null context");
        }
    }

    public static void setParam(String str, String str2) {
        try {
            if (e.getContext() != null && str.hashCode() == 951500826) {
                j.a(d.fo, str2, d.a.Boolean);
            }
        } catch (Throwable unused) {
        }
    }

    private void U() {
        try {
            String b = f.b(this.f0do, true);
            if (!b.equals(i.aR().getString(i.fB, ""))) {
                i.aR().clear();
                i.aR().putString(i.fB, b);
            }
        } catch (Throwable unused) {
        }
    }

    public static void init(Context context) {
        Appnext appnext = dp;
        if (context != null) {
            try {
                if (!appnext.dq || appnext.f0do == null) {
                    appnext.dq = true;
                    e.init(context);
                    appnext.f0do = context.getApplicationContext();
                    if (j.a(OperationService.class)) {
                        g.aN().b(new Runnable() {
                            public final void run() {
                                try {
                                    j.a(d.fp, f.b(e.getContext(), true), d.a.String);
                                    i.aR().init(Appnext.this.f0do);
                                    if (j.i(Appnext.this.f0do)) {
                                        boolean unused = Appnext.this.dq = false;
                                        i.aR().putBoolean(i.fC, true);
                                        return;
                                    }
                                    e.init(Appnext.this.f0do);
                                    i.aR().init(Appnext.this.f0do);
                                    Appnext.b(Appnext.this);
                                    Context a2 = Appnext.this.f0do;
                                    List<c> as = a.X().ab().as();
                                    if (as != null && as.size() == 0) {
                                        c cVar = new c(d.fe, "1", d.fj, "1", d.fn, "cdm", "cdm" + System.currentTimeMillis(), (String) null);
                                        a.X().ab().a(cVar);
                                        com.appnext.base.services.b.a.d(a2).a(cVar, true);
                                    }
                                } catch (Throwable unused2) {
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                appnext.f0do = context.getApplicationContext();
            } catch (Throwable unused) {
            }
        } else {
            throw new ExceptionInInitializerError("Cannot init Appnext with null context");
        }
    }

    static /* synthetic */ void b(Appnext appnext) {
        try {
            String b = f.b(appnext.f0do, true);
            if (!b.equals(i.aR().getString(i.fB, ""))) {
                i.aR().clear();
                i.aR().putString(i.fB, b);
            }
        } catch (Throwable unused) {
        }
    }
}
