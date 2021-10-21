package androidx.media2.exoplayer.external.util;

import android.os.Trace;

public final class TraceUtil {
    public static void beginSection(String str) {
        if (Util.SDK_INT >= 18) {
            beginSectionV18(str);
        }
    }

    public static void endSection() {
        if (Util.SDK_INT >= 18) {
            endSectionV18();
        }
    }

    private static void beginSectionV18(String str) {
        Trace.beginSection(str);
    }

    private static void endSectionV18() {
        Trace.endSection();
    }
}