package hillelHomeWorks;

// Создать класс Box с полями ширина, высота, длина.
// Определить метод класса, который вычисляет объем этой коробки (ширина * высоту * длину).
// Создать 5 конкретных объектов этого класса и задать с помощью конструктора конкретное состояние
// этих объектов (конкретные величины ширины, высоты и длины). Вывести на экран объемы этих коробок

public class HW11KravtsovVitalii {

    public static void main(String[] args) {

        Box b1 = new Box(1, 2, 3);
        Box b2 = new Box(2, 3, 4);
        Box b3 = new Box(3, 4, 5);
        Box b4 = new Box(4, 5, 6);
        Box b5 = new Box(5, 6, 7);

        System.out.println("Volume 1: " + b1.getVolume());
        System.out.println("Volume 2: " + b2.getVolume());
        System.out.println("Volume 3: " + b3.getVolume());
        System.out.println("Volume 4: " + b4.getVolume());
        System.out.println("Volume 5: " + b5.getVolume());
    }
}
class Box {
    private double width, height, length;
    public Box(double newWidth, double newHeight, double newLength) {
        width = newWidth;
        height = newHeight;
        length = newLength;
    }
    public double getVolume() {
        double volume = width * height * length;
        return volume;
    }
}

