package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

final /* synthetic */ class ch implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    private final String f107a;

    ch(String str) {
        this.f107a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f107a).concat("-")) && str.endsWith(".apk");
    }
}
