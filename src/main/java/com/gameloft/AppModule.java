package com.gameloft;

import com.gameloft.db.DbModule;
import dagger.Module;
import dagger.Provides;
import com.gameloft.db.DbConfig;

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