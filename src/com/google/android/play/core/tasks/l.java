package com.google.android.play.core.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class l implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f181a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f181a.post(runnable);
    }
}
