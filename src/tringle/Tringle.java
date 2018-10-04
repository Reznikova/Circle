package tringle;

public class Tringle {
    private int a, b, c; // описали свойство сторон треугольника

    public void setA (int aa) { //задали метод для каждой из сторон
        a = aa;
    }
    public int getA () { //метод для ввода данных
        return a;
    }
    public void setB (int b) {
        this.b = b;
    }
    public int getB () {
        return b;
    }
    public void setC (int c) {
        this.c = c;
    }
    public int getC () {
        return c;
    }
}
