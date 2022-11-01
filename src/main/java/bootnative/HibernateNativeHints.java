package bootnative;

import java.lang.reflect.Constructor;
import org.springframework.aot.hint.ExecutableMode;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.lang.Nullable;
import org.springframework.util.ReflectionUtils;

public class HibernateNativeHints implements RuntimeHintsRegistrar {

  @Override
  public void registerHints(RuntimeHints hints, @Nullable ClassLoader classLoader) {
    registerConstructor(hints, org.hibernate.tuple.CreationTimestampGeneration.class);
    registerConstructor(hints, org.hibernate.tuple.UpdateTimestampGeneration.class);
  }

  private static <T> void registerConstructor(RuntimeHints hints, Class<T> clazz) {
    try {
      Constructor<T> constructor = ReflectionUtils.accessibleConstructor(clazz);
      hints.reflection().registerConstructor(constructor, ExecutableMode.INVOKE);
    } catch (NoSuchMethodException e) {
      throw new RuntimeException(e);
    }
  }
}
