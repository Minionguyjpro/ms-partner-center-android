package com.yandex.metrica.impl.utils;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f1188a;
    private final byte[] b;
    private final byte[] c;

    public a(String str, byte[] bArr, byte[] bArr2) {
        this.f1188a = str;
        this.b = bArr;
        this.c = bArr2;
    }

    public byte[] a(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.b, "AES");
        Cipher instance = Cipher.getInstance(this.f1188a);
        instance.init(1, secretKeySpec, new IvParameterSpec(this.c));
        return instance.doFinal(bArr);
    }
}
