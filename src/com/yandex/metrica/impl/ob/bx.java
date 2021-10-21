package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;

public class bx implements bv {

    /* renamed from: a  reason: collision with root package name */
    private final bo f1047a;

    public void a(SQLiteDatabase sQLiteDatabase) {
    }

    public bx(bo boVar) {
        this.f1047a = boVar;
    }

    public SQLiteDatabase a() {
        return this.f1047a.getWritableDatabase();
    }
}
