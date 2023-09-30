package HW3.DIP;
/**
 * в данном примере показан принцип инверсии зависимостей
 * реализован абстрактный класс Engine, в котором есть методы start/stop, а также переменная состояния isRunning
 * логика проверки состояния и запуска/останова двигателя не зависит от его типа
 * однако для каждого конкретного типа двигателя для этого потребуется выполнить разный набор действий
 * например для двигателя на жидком топливе мы запускаем топливный насос. для электродвигателя это не требуется
 *
 */


public class Main {
    public static void main(String[] args) {
        DieselEngine kamaz1 = new DieselEngine();
        kamaz1.startEngine();
        kamaz1.startEngine();
        kamaz1.stopEngine();
        ElectricEngine tesla1 = new ElectricEngine();
        tesla1.stopEngine();
        tesla1.startEngine();
        tesla1.stopEngine();
    }
}
