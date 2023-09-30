package HW3.DIP;

public class DieselEngine extends Engine {
    private boolean isFuelPump;

    public DieselEngine() {
        this.isRunning = false;
        this.isFuelPump = false;
    }


    @Override
    protected void startPrepare() {
        this.isFuelPump = true;
    }

    @Override
    protected void stopPrepare() {
        this.isFuelPump = false;
    }
}
