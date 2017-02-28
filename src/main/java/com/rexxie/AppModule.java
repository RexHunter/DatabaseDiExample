package com.rexxie;

import com.rexxie.db.DbModule;
import dagger.Module;
import dagger.Provides;
import com.rexxie.db.DbConfig;

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