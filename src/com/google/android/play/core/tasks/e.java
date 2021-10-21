package com.google.android.play.core.tasks;

final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Task f177a;
    final /* synthetic */ f b;

    e(f fVar, Task task) {
        this.b = fVar;
        this.f177a = task;
    }

    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.onSuccess(this.f177a.getResult());
            }
        }
    }
}
