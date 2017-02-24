package log;

import javax.inject.Inject;

class LogService {
    @Inject
    Logger logger;

    public void log() {
        this.logger.log("LOGGER");
    }
}
