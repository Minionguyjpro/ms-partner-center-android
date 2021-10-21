package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

final /* synthetic */ class da implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    static final FilenameFilter f126a = new da();

    private da() {
    }

    public final boolean accept(File file, String str) {
        return db.f127a.matcher(str).matches();
    }
}
