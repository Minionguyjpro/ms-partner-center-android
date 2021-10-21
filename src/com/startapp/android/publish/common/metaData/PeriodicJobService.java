package com.startapp.android.publish.common.metaData;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.startapp.common.b.a;
import com.startapp.common.b.a.b;

/* compiled from: StartAppSDK */
public class PeriodicJobService extends JobService {

    /* renamed from: a  reason: collision with root package name */
    private static final String f548a = "PeriodicJobService";

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    public boolean onStartJob(final JobParameters jobParameters) {
        a.a((Context) this);
        boolean a2 = a.a(jobParameters, (b.C0027b) new b.C0027b() {
            public void a(b.a aVar) {
                PeriodicJobService.this.jobFinished(jobParameters, false);
            }
        });
        a.a(3, f548a, "onStartJob: RunnerManager.runJob" + a2, (Throwable) null);
        return a2;
    }
}
