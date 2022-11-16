package bootnative;

import static bootnative.NativeHintsUtils.registerConstructor;

import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.lang.Nullable;

public class HibernateNativeHints implements RuntimeHintsRegistrar {

  @Override
  public void registerHints(RuntimeHints hints, @Nullable ClassLoader classLoader) {
    registerConstructor(hints, org.hibernate.tuple.CreationTimestampGeneration.class);
    registerConstructor(hints, org.hibernate.tuple.UpdateTimestampGeneration.class);
  }
}
