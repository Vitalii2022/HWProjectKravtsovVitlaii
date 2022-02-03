package hillelHomeWorks;

// Добавить в класс Box из предыдущей домашки несколько новых свойств (цвет и материал).
// Реализовать новый конструктор (дополнительно к существующему), который будет устанавливать все поля,
// также добавить геттеры и сеттеры на каждое поле. В сеттеры добавить логику на установку значений высоты,
// ширины и длинны - чтобы нельзя было установить значение меньше, либо равное нулю

public class HW12KravtsoVitalii {

    public static void main(String[] args) {

        NewBox nb = new NewBox(2, 3, 4, "white", "paper");
        System.out.println("\nVolume: " + nb.getVolume() + "\nColor: " + nb.getColor() + "\nMaterial: " + nb.getMaterial());

        nb.setWidth(5);
        nb.setHeight(6);
        nb.setLength(7);
        nb.setColor("red");
        nb.setMaterial("wood");
        System.out.println("\nVolume: " + nb.getVolume() +  "\nColor: " + nb.getColor() + "\nMaterial: " + nb.getMaterial());
    }
}

class NewBox extends Box {

    private String color, material;

    public NewBox(double newWidth, double newHeight, double newLengt) {
        super(newWidth, newHeight, newLengt);
    }

    public NewBox(double newWidth, double newHeight, double newLength, String newColor, String newMaterial) {
        super(newWidth, newHeight, newLength);
        color = newColor;
        material = newMaterial;
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
    public String getColor() {
        return color;
    }
    public String getMaterial() {
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
    public void setColor(String newColor) {
        color = newColor;
    }
    public void setMaterial(String newMaterial) {
        material = newMaterial;
    }
}
