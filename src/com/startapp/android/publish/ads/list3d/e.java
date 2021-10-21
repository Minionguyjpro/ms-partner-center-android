package com.startapp.android.publish.ads.list3d;

import android.content.Context;
import android.graphics.Bitmap;
import com.startapp.android.publish.adsCommon.d.b;
import com.startapp.android.publish.common.model.AdDetails;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StartAppSDK */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private a f313a = new a();
    private List<ListItem> b;
    private String c = "";

    public void a() {
        this.b = new ArrayList();
        this.c = "";
    }

    public void a(AdDetails adDetails) {
        ListItem listItem = new ListItem(adDetails);
        this.b.add(listItem);
        this.f313a.a(this.b.size() - 1, listItem.a(), listItem.i());
    }

    public void b() {
        this.f313a.b();
    }

    public void c() {
        this.f313a.c();
    }

    public void d() {
        this.f313a.d();
    }

    public List<ListItem> e() {
        return this.b;
    }

    public Bitmap a(int i, String str, String str2) {
        return this.f313a.a(i, str, str2);
    }

    public void a(Context context, String str, String str2, b bVar, long j) {
        a aVar = this.f313a;
        aVar.a(context, str, str2 + this.c, bVar, j);
    }

    public void a(String str) {
        a aVar = this.f313a;
        aVar.a(str + this.c);
    }

    public void a(g gVar, boolean z) {
        this.f313a.a(gVar, z);
    }

    public void b(String str) {
        this.c = str;
    }
}
