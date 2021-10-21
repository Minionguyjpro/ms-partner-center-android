package com.yandex.metrica.impl.ob;

import org.json.JSONException;
import org.json.JSONObject;

public final class cm {

    /* renamed from: a  reason: collision with root package name */
    private final String f1069a;
    private final int b;
    private final boolean c;

    public cm(JSONObject jSONObject) throws JSONException {
        this.f1069a = jSONObject.getString("name");
        this.c = jSONObject.getBoolean("required");
        this.b = jSONObject.optInt("version", -1);
    }

    public cm(String str, int i, boolean z) {
        this.f1069a = str;
        this.b = i;
        this.c = z;
    }

    public cm(String str, boolean z) {
        this(str, -1, z);
    }

    public JSONObject a() throws JSONException {
        JSONObject put = new JSONObject().put("name", this.f1069a).put("required", this.c);
        int i = this.b;
        if (i != -1) {
            put.put("version", i);
        }
        return put;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cm cmVar = (cm) obj;
            if (this.b != cmVar.b || this.c != cmVar.c) {
                return false;
            }
            String str = this.f1069a;
            String str2 = cmVar.f1069a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f1069a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + (this.c ? 1 : 0);
    }
}
