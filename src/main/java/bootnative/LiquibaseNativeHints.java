package bootnative;

import java.lang.reflect.Constructor;

import org.springframework.aot.hint.ExecutableMode;
import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.lang.Nullable;
import org.springframework.util.ReflectionUtils;

public class LiquibaseNativeHints implements RuntimeHintsRegistrar {

    @Override
    public void registerHints(RuntimeHints hints, @Nullable ClassLoader classLoader) {
        registerPublicMethods(hints, liquibase.AbstractExtensibleObject.class);
        registerPublicMethods(hints, liquibase.change.AbstractChange.class);
        registerPublicMethods(hints, liquibase.change.AbstractSQLChange.class);
        registerPublicMethods(hints, liquibase.change.AbstractTableChange.class);

        registerPublicMethods(hints, liquibase.change.core.AbstractModifyDataChange.class);
        registerPublicMethods(hints, liquibase.change.core.AddAutoIncrementChange.class);
        registerPublicMethods(hints, liquibase.change.core.AddColumnChange.class);
        registerPublicMethods(hints, liquibase.change.core.AddDefaultValueChange.class);
        registerPublicMethods(hints, liquibase.change.core.AddForeignKeyConstraintChange.class);
        registerPublicMethods(hints, liquibase.change.core.AddLookupTableChange.class);
        registerPublicMethods(hints, liquibase.change.core.AddNotNullConstraintChange.class);
        registerPublicMethods(hints, liquibase.change.core.AddPrimaryKeyChange.class);
        registerPublicMethods(hints, liquibase.change.core.AddUniqueConstraintChange.class);
        registerPublicMethods(hints, liquibase.change.core.AlterSequenceChange.class);
        registerPublicMethods(hints, liquibase.change.core.CreateIndexChange.class);
        registerPublicMethods(hints, liquibase.change.core.CreateProcedureChange.class);
        registerPublicMethods(hints, liquibase.change.core.CreateSequenceChange.class);
        registerPublicMethods(hints, liquibase.change.core.CreateViewChange.class);
        registerPublicMethods(hints, liquibase.change.core.DeleteDataChange.class);
        registerPublicMethods(hints, liquibase.change.core.DropAllForeignKeyConstraintsChange.class);
        registerPublicMethods(hints, liquibase.change.core.DropColumnChange.class);
        registerPublicMethods(hints, liquibase.change.core.DropDefaultValueChange.class);
        registerPublicMethods(hints, liquibase.change.core.DropForeignKeyConstraintChange.class);
        registerPublicMethods(hints, liquibase.change.core.DropIndexChange.class);
        registerPublicMethods(hints, liquibase.change.core.DropNotNullConstraintChange.class);
        registerPublicMethods(hints, liquibase.change.core.DropPrimaryKeyChange.class);
        registerPublicMethods(hints, liquibase.change.core.DropProcedureChange.class);
        registerPublicMethods(hints, liquibase.change.core.DropSequenceChange.class);
        registerPublicMethods(hints, liquibase.change.core.DropTableChange.class);
        registerPublicMethods(hints, liquibase.change.core.DropUniqueConstraintChange.class);
        registerPublicMethods(hints, liquibase.change.core.DropViewChange.class);
        registerPublicMethods(hints, liquibase.change.core.EmptyChange.class);
        registerPublicMethods(hints, liquibase.change.core.ExecuteShellCommandChange.class);
        registerPublicMethods(hints, liquibase.change.core.LoadDataChange.class);
        registerPublicMethods(hints, liquibase.change.core.LoadUpdateDataChange.class);
        registerPublicMethods(hints, liquibase.change.core.MergeColumnChange.class);
        registerPublicMethods(hints, liquibase.change.core.ModifyDataTypeChange.class);
        registerPublicMethods(hints, liquibase.change.core.OutputChange.class);
        registerPublicMethods(hints, liquibase.change.core.RawSQLChange.class);
        registerPublicMethods(hints, liquibase.change.core.RenameColumnChange.class);
        registerPublicMethods(hints, liquibase.change.core.RenameSequenceChange.class);
        registerPublicMethods(hints, liquibase.change.core.RenameTableChange.class);
        registerPublicMethods(hints, liquibase.change.core.RenameViewChange.class);
        registerPublicMethods(hints, liquibase.change.core.SQLFileChange.class);
        registerPublicMethods(hints, liquibase.change.core.SetColumnRemarksChange.class);
        registerPublicMethods(hints, liquibase.change.core.SetTableRemarksChange.class);
        registerPublicMethods(hints, liquibase.change.core.StopChange.class);
        registerPublicMethods(hints, liquibase.change.core.TagDatabaseChange.class);
        registerPublicMethods(hints, liquibase.change.core.UpdateDataChange.class);
        registerPublicMethods(hints, liquibase.change.custom.CustomChangeWrapper.class);

        registerConstructorAndPublicMethdos(hints, liquibase.change.core.InsertDataChange.class);
        registerConstructorAndPublicMethdos(hints, liquibase.change.core.CreateTableChange.class);
        registerConstructorAndPublicMethdos(hints, liquibase.database.jvm.JdbcConnection.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.BigIntType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.BlobType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.BooleanType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.CharType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.ClobType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.CurrencyType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.DatabaseFunctionType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.DateTimeType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.DateType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.DecimalType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.DoubleType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.FloatType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.IntType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.MediumIntType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.NCharType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.NumberType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.NVarcharType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.SmallIntType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.TimestampType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.TimeType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.TinyIntType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.UnknownType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.UUIDType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.VarcharType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.datatype.core.XMLType.class);
        registerConstructorAndPublicMethdos(hints, liquibase.plugin.AbstractPlugin.class);

        // registerConstructor(hints, com.sun.org.apache.xerces.internal.impl.dv.xs.ExtendedSchemaDVFactoryImpl.class);
        // registerConstructor(hints, com.sun.org.apache.xerces.internal.impl.dv.xs.SchemaDVFactoryImpl.class);
        // registerConstructor(hints, com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl.class);
        // registerConstructor(hints, com.sun.xml.internal.stream.events.XMLEventFactoryImpl.class);
        registerConstructor(hints, liquibase.change.ChangeFactory.class);
        registerConstructor(hints, liquibase.Scope.class);

        registerConstructor(hints, liquibase.changelog.StandardChangeLogHistoryService.class);
        registerConstructor(hints, liquibase.configuration.LiquibaseConfiguration.class);
        registerConstructor(hints, liquibase.database.core.H2Database.class);
        registerConstructor(hints, liquibase.database.core.MariaDBDatabase.class);
        registerConstructor(hints, liquibase.database.core.MSSQLDatabase.class);
        registerConstructor(hints, liquibase.database.core.MySQLDatabase.class);
        registerConstructor(hints, liquibase.database.core.OracleDatabase.class);
        registerConstructor(hints, liquibase.database.core.PostgresDatabase.class);

        registerConstructor(hints, liquibase.executor.ExecutorService.class);
        registerConstructor(hints, liquibase.executor.jvm.JdbcExecutor.class);
        registerConstructor(hints, liquibase.hub.HubServiceFactory.class);
        registerConstructor(hints, liquibase.license.LicenseServiceFactory.class);
        registerConstructor(hints, liquibase.lockservice.StandardLockService.class);
        registerConstructor(hints, liquibase.logging.core.LogServiceFactory.class);
        registerConstructor(hints, liquibase.sql.visitor.AppendSqlVisitor.class);
        registerConstructor(hints, liquibase.sql.visitor.PrependSqlVisitor.class);
        registerConstructor(hints, liquibase.sql.visitor.RegExpReplaceSqlVisitor.class);
        registerConstructor(hints, liquibase.sql.visitor.ReplaceSqlVisitor.class);
        registerConstructor(hints, java.util.ArrayList.class);

        registerAll(hints, liquibase.configuration.ConfiguredValueModifierFactory.class);
        registerAll(hints, liquibase.change.AddColumnConfig.class);
        registerAll(hints, liquibase.change.ColumnConfig.class);

        hints.reflection().registerType(liquibase.change.ConstraintsConfig.class, MemberCategory.DECLARED_FIELDS);
        hints.reflection().registerType(liquibase.serializer.AbstractLiquibaseSerializable.class,
                MemberCategory.DECLARED_FIELDS);

        hints.resources().registerPattern("^liquibase.build.properties$");
        hints.resources().registerPattern("^www.liquibase.org/xml/ns/dbchangelog/.*xsd$");
        hints.resources().registerPattern("^db/changelog/.*$")
    }

    private static <T> void registerConstructor(RuntimeHints hints, Class<T> clazz) {
        try {
            Constructor<T> constructor = ReflectionUtils.accessibleConstructor(clazz);
            hints.reflection().registerConstructor(constructor, ExecutableMode.INVOKE);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private static <T> void registerPublicMethods(RuntimeHints hints, Class<T> clazz) {
        hints.reflection().registerType(clazz, MemberCategory.INVOKE_PUBLIC_METHODS);
    }

    private static <T> void registerConstructorAndPublicMethdos(RuntimeHints hints, Class<T> clazz) {
        registerConstructor(hints, clazz);
        registerPublicMethods(hints, clazz);
    }

    private static <T> void registerAll(RuntimeHints hints, Class<T> clazz) {
        registerConstructorAndPublicMethdos(hints, clazz);
        hints.reflection().registerType(clazz, MemberCategory.DECLARED_FIELDS);
    }

}
