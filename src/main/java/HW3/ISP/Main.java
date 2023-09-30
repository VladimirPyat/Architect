package HW3.ISP;

/**
 * данный пример демонстрирует принцип разделения интерфейсов
 * для 2-мерной фигуры понятие объема не применимо. потому для площади и для объема введены отдельные интерфейсы
 * если для 3 мерной фигуры нужно вычислить и площадь и объем - соответствующий класс может имплементировать два интерфейса
 *
 */

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(2, 3);
        System.out.println(triangle1);
        System.out.println("S="+triangle1.getArea());
        Pyramid3 pyramid = new Pyramid3(2, 3, 1);
        System.out.println(pyramid);
        System.out.println("V="+pyramid.getVolume());
    }
}
