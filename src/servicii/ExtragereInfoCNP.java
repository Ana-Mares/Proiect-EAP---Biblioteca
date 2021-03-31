package servicii;

import clase.Data;

public class ExtragereInfoCNP {
    Data data;
    public ExtragereInfoCNP(String cnp) { data = this.extragereInfo(cnp); };

    public Data extragereInfo(String cnp){
        String prefixAn;
        String sufixAn;
        Integer luna;
        Integer zi;
        String an;
        Data data = null;

        if(cnp.length() != 13) {
            System.out.println("CNP invalid");
        } else {
            int genInt = Integer.parseInt(cnp.substring(0,1));
            if(genInt == 1 || genInt == 2) {
                prefixAn = "19";
            } else {
                prefixAn = "20";
            }

            sufixAn = cnp.substring(1, 3);
            an = prefixAn + sufixAn;
            luna = new Integer(cnp.substring(3, 5));
            zi = new Integer(cnp.substring(5,7));
            data.setZi(zi);
            data.setLuna(luna);
            data.setAn(Integer.valueOf(an));

        }
       return data;

    }
}
