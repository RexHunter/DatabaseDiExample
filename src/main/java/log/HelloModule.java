package log;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = LogService.class
)
class HelloModule {
    @Provides
    Logger provideLogger() {
        return new Logger();
    }
}
