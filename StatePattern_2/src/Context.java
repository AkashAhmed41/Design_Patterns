public class Context {
    private AlertState alertState;

    public Context(){
        alertState = null;
    }

    public void setAlertState(AlertState alertState) {
        this.alertState = alertState;
    }

    public AlertState getAlertState() {
        return alertState;
    }
}
