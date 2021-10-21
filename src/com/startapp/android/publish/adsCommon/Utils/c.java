package com.startapp.android.publish.adsCommon.Utils;

import com.startapp.common.e;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StartAppSDK */
public class c extends e {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f413a;

    public c() {
        this.f413a = null;
        this.f413a = new JSONObject();
    }

    public void a(String str, Object obj, boolean z, boolean z2) {
        if (z && obj == null) {
            throw new e("Required key: [" + str + "] is missing", (Throwable) null);
        } else if (obj != null && !obj.toString().equals("")) {
            try {
                this.f413a.put(str, obj);
            } catch (JSONException e) {
                if (z) {
                    throw new e("failed converting to json object value: [" + obj + "]", e);
                }
            }
        }
    }

    public void a(String str, Set<String> set, boolean z, boolean z2) {
        if (z && (set == null || set.size() == 0)) {
            throw new e("Required key: [" + str + "] is missing", (Throwable) null);
        } else if (set != null && set.size() > 0) {
            try {
                this.f413a.put(str, new JSONArray(set));
            } catch (JSONException e) {
                if (z) {
                    throw new e("failed converting to json array values: [" + set + "]", e);
                }
            }
        }
    }

    public String toString() {
        return this.f413a.toString();
    }
}
