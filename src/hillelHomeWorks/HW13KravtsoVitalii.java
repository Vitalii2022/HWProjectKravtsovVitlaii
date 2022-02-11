package hillelHomeWorks;

/*
Для класса Box из предыдущих домашек добавить дочерний класс ColorBox и вынести в него свойство color,
а из класса Box это свойство убрать. Все методы для работы с этим свойством тоже перенести из класса Box в класс ColorBox.
Свойства color в классе ColorBox и material в Box переделать на Enum'ы (создать перечисления для цветов и материалов
и задать хотя бы по несколько возможных значений)
 */

public class HW13KravtsoVitalii {

    public static void main(String[] args) {

        try {

            ColorBox cb = new ColorBox(2, 3, 4, Material.PAPER, Color.BLACK);
            System.out.println("\nVolume: " + cb.getVolume() + "\nColor: " + cb.getColor() + "\nMaterial: " + cb.getMaterial());
            System.out.println(cb);

            cb.setWidth(5);
            cb.setHeight(6);
            cb.setLength(7);
            cb.setColor(Color.RED);
            cb.setMaterial(Material.WOOD);
            System.out.println("\nVolume: " + cb.getVolume() +  "\nColor: " + cb.getColor() + "\nMaterial: " + cb.getMaterial());
            System.out.println(cb);

            cb = new ColorBox(2, -3, 4, Material.PAPER, Color.BLACK);
            System.out.println(cb);

        } catch (IllegalArgumentException ex) {
            System.out.println("\n" + ex.getMessage());
        }

    }

}

enum Material {
    WOOD, PAPER, IRON
}

enum Color {
    WHITE, BLACK, RED, BROWN
}

class ColorBox extends Box {

    private Color color;

    public ColorBox(double newWidth, double newHeight, double newLengt, Material newMaterial) {
        super(newWidth, newHeight, newLengt, newMaterial);
    }

    public ColorBox(double newWidth, double newHeight, double newLength, Material newMaterial, Color newColor) {
        super(newWidth, newHeight, newLength, newMaterial);
        color = newColor;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public Color getColor() {
        return color;
    }

    public Material getMaterial() {
        return material;
    }

    public void setWidth(double newWidth) {
        if (newWidth > 0) {
            width = newWidth;
        } else {
            System.out.println("newWidth must be positive");
        }
    }

    public void setHeight(double newHeight) {
        if (newHeight > 0) {
            height = newHeight;
        } else {
            System.out.println("newHeight must be positive");
        }
    }

    public void setLength(double newLength) {
        if (newLength > 0) {
            length = newLength;
        } else {
            System.out.println("newLength must be positive");
        }
    }

    public void setMaterial(Material newMaterial) {
        material = newMaterial;
    }

    public void setColor(Color newColor) {
        color = newColor;
    }

    @Override
    public String toString() {
        return "ColorBox: [" + "width: " + width + " height: " + height + " length: " + length + " material: " + material + " color: " + color + "]";
    }

}
