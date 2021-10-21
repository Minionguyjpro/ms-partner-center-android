package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.OnSuccessListener;
import java.util.List;

final /* synthetic */ class f implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    private final au f132a;

    private f(au auVar) {
        this.f132a = auVar;
    }

    static OnSuccessListener a(au auVar) {
        return new f(auVar);
    }

    public final void onSuccess(Object obj) {
        this.f132a.A((List) obj);
    }
}
