package clase;

public class Data implements Comparable<Data> {
    protected int zi;
    protected int luna;
    protected int an;

    public Data(int zi, int luna, int an) {
        this.zi = zi;
        this.luna = luna;
        this.an = an;
    }

    public int getZi() {
        return zi;
    }

    public void setZi(int zi) {
        this.zi = zi;
    }

    public int getLuna() {
        return luna;
    }

    public void setLuna(int luna) {
        this.luna = luna;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }


    @Override
    public String toString() {
        return  "Data: " + zi + '.' + luna + '.' + an;
    }

    @Override
    public int compareTo(Data d)
    {
        if (d.getAn() != this.getAn() ) return d.getAn()-this.getAn();
        else if (d.getLuna() != this.getLuna() ) return d.getLuna()-this.getLuna();
        else return d.getZi()-this.getZi();
    }
}
