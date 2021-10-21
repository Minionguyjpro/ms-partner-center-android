package a.a.b.b;

import a.a.d.b;
import a.a.d.d;
import a.a.d.f;

/* compiled from: StartAppSDK */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static final o f9a;
    private static final b[] b = new b[0];

    static {
        o oVar = null;
        try {
            oVar = (o) Class.forName("truenet.kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (oVar == null) {
            oVar = new o();
        }
        f9a = oVar;
    }

    public static b a(Class cls) {
        return f9a.a(cls);
    }

    public static String a(i iVar) {
        return f9a.a(iVar);
    }

    public static d a(g gVar) {
        return f9a.a(gVar);
    }

    public static f a(k kVar) {
        return f9a.a(kVar);
    }
}
