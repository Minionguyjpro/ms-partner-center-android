package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@17.3.0 */
public final class zaa extends ActivityLifecycleObserver {
    private final WeakReference<C0012zaa> zaa;

    public zaa(Activity activity) {
        this(C0012zaa.zab(activity));
    }

    private zaa(C0012zaa zaa2) {
        this.zaa = new WeakReference<>(zaa2);
    }

    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        C0012zaa zaa2 = (C0012zaa) this.zaa.get();
        if (zaa2 != null) {
            zaa2.zaa(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }

    /* renamed from: com.google.android.gms.common.api.internal.zaa$zaa  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-base@@17.3.0 */
    static class C0012zaa extends LifecycleCallback {
        private List<Runnable> zaa = new ArrayList();

        /* access modifiers changed from: private */
        public static C0012zaa zab(Activity activity) {
            C0012zaa zaa2;
            synchronized (activity) {
                LifecycleFragment fragment = getFragment(activity);
                zaa2 = (C0012zaa) fragment.getCallbackOrNull("LifecycleObserverOnStop", C0012zaa.class);
                if (zaa2 == null) {
                    zaa2 = new C0012zaa(fragment);
                }
            }
            return zaa2;
        }

        private C0012zaa(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
        }

        /* access modifiers changed from: private */
        public final synchronized void zaa(Runnable runnable) {
            this.zaa.add(runnable);
        }

        public void onStop() {
            List<Runnable> list;
            synchronized (this) {
                list = this.zaa;
                this.zaa = new ArrayList();
            }
            for (Runnable run : list) {
                run.run();
            }
        }
    }
}
