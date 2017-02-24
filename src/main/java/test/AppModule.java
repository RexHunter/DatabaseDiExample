package test;

import dagger.Module;
import dagger.Provides;
import test.db.DbConfig;
import test.db.DbModule;

@Module(
        injects = Application.class,
        includes = DbModule.class
)
public class AppModule {

    @Provides
    DbConfig provideConfig() {
        return new DbConfig("config/db.config.json");
    }
}