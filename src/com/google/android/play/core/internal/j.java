package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class j implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f170a;
    private final String b;

    protected j(IBinder iBinder, String str) {
        this.f170a = iBinder;
        this.b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f170a;
    }

    /* access modifiers changed from: protected */
    public final void b(int i, Parcel parcel) throws RemoteException {
        try {
            this.f170a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
