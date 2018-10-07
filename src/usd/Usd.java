package usd;

public class Usd {
    private double rub, kurs;

    public void setRub(double rub) {
        this.rub = rub;
    }

    public double getRub() {
        return rub;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    public double getKurs() {
        return kurs;
    }
    public double result () {return rub/kurs;}

    public Usd (double rub, double kurs){
        this.rub = rub;
        this.kurs = kurs;

    }


}
