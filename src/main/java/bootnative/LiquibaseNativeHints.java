package bootnative;

import static bootnative.NativeHintsUtils.registerConstructor;

import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.lang.Nullable;

public class LiquibaseNativeHints implements RuntimeHintsRegistrar {

    @Override
    public void registerHints(RuntimeHints hints, @Nullable ClassLoader classLoader) {
        registerConstructor(hints, liquibase.sql.visitor.AppendSqlVisitor.class);
        registerConstructor(hints, liquibase.sql.visitor.PrependSqlVisitor.class);
        registerConstructor(hints, liquibase.sql.visitor.RegExpReplaceSqlVisitor.class);
        registerConstructor(hints, liquibase.sql.visitor.ReplaceSqlVisitor.class);

        hints.resources().registerPattern("db/changelog/*");
    }
}
