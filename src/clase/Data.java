package clase;

public class Data {
    protected String zi;
    protected String luna;
    protected String an;

    public Data(String zi, String luna, String an) {
        this.zi = zi;
        this.luna = luna;
        this.an = an;
    }

    public String getZi() {
        return zi;
    }

    public void setZi(String zi) {
        this.zi = zi;
    }

    public String getLuna() {
        return luna;
    }

    public void setLuna(String luna) {
        this.luna = luna;
    }

    public String getAn() {
        return an;
    }

    public void setAn(String an) {
        this.an = an;
    }


    @Override
    public String toString() {
        return  zi + ' ' + luna + ' ' + an;
    }
}
