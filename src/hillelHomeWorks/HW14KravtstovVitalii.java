package hillelHomeWorks;

/* Для классов Box и ColorBox из предыдущей домашки переопределить метод toString класса Object,
в котором в реализации класса Box возвращать информацию о длине, ширине и высоте, а также материала коробки,
а для класса ColorBox - всю ту же информации плюс информацию о цвете коробки.
Добавить в конструктор класса Box генерацию исключения если хоть одна из сторон была задана неверно
(меньше либо равна нулю) и обрабатывать это исключение в месте создания экземпляра коробки (как Box так и ColorBox)
Также создать класс Склад (Warehouse, например), который будет в себе содержать массив коробок
(именно базовый тип коробок - Box) и количество коробок, которые уже добавлены в этот массив.
Массив создавать в конструкторе этого класса (размер массива принимать как параметр конструктора).
Реализовать метод в этом классе для добавления коробки в массив (тип брать опять же базовый - Box),
предусмотреть валидацию - проверять, можно ли ещё добавить в массив коробку, количество добавленных коробок не должно
превышать длину массива. Также переопределить метод toString для этого класса - который будет возвращать
информацию о всех коробках, которые хранит в себе склад.
В методе main создать экземпляр класса Склад (задать его вместимость с помощью конструктора).
Заполнить склад коробками (разными - как экземплярами Box, так и ColorBox) и вывести информацию о складе
(вызвать метод склада toString).
*/

public class HW14KravtstovVitalii {
    public static void main(String[] args) {

        Warehouse w = new Warehouse(5);

        try {

            w.add(new Box(1, 2, 3, Material.IRON));
            w.add(new Box(2, 5, 2, Material.WOOD));
            w.add(new Box(3, 1, 3, Material.PAPER));
            w.add(new Box(1, 1, 2, Material.WOOD));
            w.add(new Box(2, 2, 2, Material.WOOD));

            System.out.println(w);

            w.add(new Box(5, 5, 5, Material.IRON));

        } catch (IndexOutOfBoundsException ex) {
            System.out.println("\n" + ex.getMessage());
        }

    }

}


class Warehouse {

    private Box[] boxes;
    private int amount;

    public Warehouse(int size) {
        boxes = new Box[size];
        amount = 0;
    }

    public void add(Box b) {

        if (amount == boxes.length) {
            throw new IndexOutOfBoundsException("Max amount of boxes exceeded");
        }

        boxes[amount] = b;
        amount++;

    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder("Warehouse: {");

        for (int i = 0; i < boxes.length; i++) {
            result.append("\n\t").append(boxes[i]);
        }

        result.append("\n}");

        return result.toString();

    }

}
