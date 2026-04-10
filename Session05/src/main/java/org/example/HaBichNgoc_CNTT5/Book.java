package org.example.HaBichNgoc_CNTT5;

public class Book {
    private int mãsố;
    private double namebook;
    private double tácgiả;
    private double giábán;

    public int getMãsố() {
        return mãsố;
    }

    public void setMãsố(int mãsố) {
        this.mãsố = mãsố;
    }

    public double getNamebook() {
        return namebook;
    }

    public void setNamebook(double namebook) {
        this.namebook = namebook;
    }

    public double getTácgiả() {
        return tácgiả;
    }

    public void setTácgiả(double tácgiả) {
        this.tácgiả = tácgiả;
    }

    public double getGiábán() {
        return giábán;
    }

    public void setGiábán(double giábán) {
        this.giábán = giábán;
    }

    public Book(int mãsố, double namebook, double tácgiả, double giábán) {
        this.mãsố = mãsố;
        this.namebook = namebook;
        this.tácgiả = tácgiả;
        this.giábán = giábán;

    }
}
