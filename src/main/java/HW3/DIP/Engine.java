package HW3.DIP;

public abstract class Engine {
    protected boolean isRunning;

    public void startEngine() {
        if (isRunning) {
            System.out.println("Engine already running");
        } else {
            startPrepare();
            isRunning = true;
            System.out.println("Engine run");
        }
    }

    public void stopEngine() {
        if (!isRunning) {
            System.out.println("Engine already stopped");
        } else {
            stopPrepare();
            isRunning = false;
            System.out.println("Engine is stopped");
        }
    }
    protected abstract void startPrepare();
    protected abstract void stopPrepare();
}
