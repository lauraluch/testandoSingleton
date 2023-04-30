public class myLogClient {
    public static void main(String[] args) {
        myLog.getInstance().setPriority(logLevel.ERROR);

        myLog.getInstance().log("testeMensagemWarning", logLevel.WARNING);
        myLog.getInstance().log("testeMensagemError", logLevel.ERROR);
        myLog.getInstance().log("testeMensagemInfo", logLevel.INFO);
    }
}
