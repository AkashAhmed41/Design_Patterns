public class TestingDemo {
    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.Error);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.Debug);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.Info);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.Info, "This is normal Console information");
        loggerChain.logMessage(AbstractLogger.Debug, "This is Debug level information");
        loggerChain.logMessage(AbstractLogger.Error, "This is Error level information");
    }
}
