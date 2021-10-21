package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.ah;
import com.google.android.play.core.internal.t;
import com.google.android.play.core.tasks.i;
import java.util.Map;

final class z extends ah {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Map f148a;
    final /* synthetic */ i b;
    final /* synthetic */ an c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    z(an anVar, i iVar, Map map, i iVar2) {
        super(iVar);
        this.c = anVar;
        this.f148a = map;
        this.b = iVar2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((t) this.c.e.c()).e(this.c.c, an.m(this.f148a), new ai(this.c, this.b));
        } catch (RemoteException e) {
            an.f68a.c(e, "syncPacks", new Object[0]);
            this.b.d(new RuntimeException(e));
        }
    }
}
