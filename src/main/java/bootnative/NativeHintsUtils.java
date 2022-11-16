package bootnative;

import java.lang.reflect.Constructor;

import org.springframework.aot.hint.ExecutableMode;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.util.ReflectionUtils;

public abstract class NativeHintsUtils {
    private NativeHintsUtils() {
    }

    static <T> void registerConstructor(RuntimeHints hints, Class<T> clazz) {
        try {
            Constructor<T> constructor = ReflectionUtils.accessibleConstructor(clazz);
            hints.reflection().registerConstructor(constructor, ExecutableMode.INVOKE);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
