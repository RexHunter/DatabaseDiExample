package log;

import dagger.ObjectGraph;

public class Application {
    public static void main(String[] args) {
        ObjectGraph objectGraph = ObjectGraph.create(new HelloModule());
        LogService logger = objectGraph.get(LogService.class);

        logger.log();
//        LogService ser = new LogService();

    }
}