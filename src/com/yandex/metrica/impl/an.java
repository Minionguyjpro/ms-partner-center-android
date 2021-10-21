package com.yandex.metrica.impl;

import android.text.TextUtils;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.impl.utils.j;
import org.json.JSONException;
import org.json.JSONObject;

public class an {

    /* renamed from: a  reason: collision with root package name */
    private PreloadInfo f960a;

    public an(PreloadInfo preloadInfo) {
        if (preloadInfo == null) {
            return;
        }
        if (TextUtils.isEmpty(preloadInfo.getTrackingId())) {
            j.f().c("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.");
        } else {
            this.f960a = preloadInfo;
        }
    }

    /* access modifiers changed from: package-private */
    public String a() {
        if (this.f960a == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("preloadInfo", b());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public JSONObject b() {
        if (this.f960a == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f960a.getTrackingId());
            if (!this.f960a.getAdditionalParams().isEmpty()) {
                jSONObject.put("additionalParams", new JSONObject(this.f960a.getAdditionalParams()));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
