package Circle;

public class newCircle { // Создали класс

    public newCircle (int radius) { // конструктор который позволяет использовать
        // данный круг с заданным радиусом как готовый объект
        this.radius = radius;
    }
    private int radius; // описали свойство

    public void setRadius (int radius) { //задали метод
        this.radius = radius;
    }

    public int getRadius() { //метод который просит у пользователя ввести радиус
        return radius;
    }
    public double getSquare() { // метод который вычисляет площадь
        return Math.PI*radius*radius;
    }

    public double dlinaOkr (double radius1) { //лина окружности
        return 2*Math.PI*radius1;
    }
}
