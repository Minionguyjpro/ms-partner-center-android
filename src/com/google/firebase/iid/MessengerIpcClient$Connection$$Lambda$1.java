package com.google.firebase.iid;

import com.google.firebase.iid.MessengerIpcClient;

/* compiled from: com.google.firebase:firebase-iid@@20.2.3 */
final /* synthetic */ class MessengerIpcClient$Connection$$Lambda$1 implements Runnable {
    private final MessengerIpcClient.Connection arg$1;

    MessengerIpcClient$Connection$$Lambda$1(MessengerIpcClient.Connection connection) {
        this.arg$1 = connection;
    }

    public final void run() {
        this.arg$1.timeoutConnection();
    }
}
