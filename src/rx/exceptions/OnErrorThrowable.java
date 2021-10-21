package rx.exceptions;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import rx.plugins.RxJavaPlugins;

public final class OnErrorThrowable extends RuntimeException {
    public static Throwable addValueAsLastCause(Throwable th, Object obj) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable finalCause = Exceptions.getFinalCause(th);
        if ((finalCause instanceof OnNextValue) && ((OnNextValue) finalCause).getValue() == obj) {
            return th;
        }
        Exceptions.addCause(th, new OnNextValue(obj));
        return th;
    }

    public static class OnNextValue extends RuntimeException {
        private final Object value;

        static final class Primitives {
            static final Set<Class<?>> INSTANCE = create();

            private static Set<Class<?>> create() {
                HashSet hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                return hashSet;
            }
        }

        public OnNextValue(Object obj) {
            super("OnError while emitting onNext value: " + renderValue(obj));
            if (!(obj instanceof Serializable)) {
                try {
                    obj = String.valueOf(obj);
                } catch (Throwable th) {
                    obj = th.getMessage();
                }
            }
            this.value = obj;
        }

        public Object getValue() {
            return this.value;
        }

        static String renderValue(Object obj) {
            if (obj == null) {
                return "null";
            }
            if (Primitives.INSTANCE.contains(obj.getClass())) {
                return obj.toString();
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Enum) {
                return ((Enum) obj).name();
            }
            String handleOnNextValueRendering = RxJavaPlugins.getInstance().getErrorHandler().handleOnNextValueRendering(obj);
            if (handleOnNextValueRendering != null) {
                return handleOnNextValueRendering;
            }
            return obj.getClass().getName() + ".class";
        }
    }
}
