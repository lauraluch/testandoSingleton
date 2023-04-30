public class myLog {

    private static myLog MYLOG;
    private logLevel priority;

    private myLog (){}

    public static myLog getInstance(){
        if (MYLOG == null){
            MYLOG = new myLog();
        }
        return MYLOG;
    }

    public void setPriority(logLevel priority){
        this.priority = priority;
    }

    public void log(String message, logLevel level){
        if (this.priority == logLevel.INFO){
            System.out.println("Message: " + message);
            return;
        }
        if (this.priority == logLevel.WARNING && level == logLevel.WARNING) {
            System.out.println("Warning message: " + message);
            return;
        }
        if ((this.priority == logLevel.WARNING && level == logLevel.ERROR) || (this.priority == logLevel.ERROR && level == logLevel.ERROR))
            System.out.println("Error message: " + message);
    }
}
