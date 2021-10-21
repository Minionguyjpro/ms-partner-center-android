package com.startapp.android.publish.ads.banner;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: StartAppSDK */
class b {

    /* renamed from: a  reason: collision with root package name */
    private Context f285a;
    private String b;

    b(Context context, AttributeSet attributeSet) {
        this.f285a = context;
        this.b = a(attributeSet, "adTag");
    }

    private String a(AttributeSet attributeSet, String str) {
        String str2;
        try {
            int attributeResourceValue = attributeSet.getAttributeResourceValue((String) null, str, -1);
            if (attributeResourceValue != -1) {
                str2 = this.f285a.getResources().getString(attributeResourceValue);
            } else {
                str2 = attributeSet.getAttributeValue((String) null, str);
            }
            return str2;
        } catch (Exception unused) {
            return null;
        }
    }

    public String a() {
        return this.b;
    }
}
