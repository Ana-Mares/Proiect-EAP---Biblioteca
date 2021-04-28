package servicii;

public class Transformari {

    public String scriereMajuscula(String str) {
        String cuMajuscula = str.replace(str.substring(0,1), str.substring(0,1).toUpperCase());
        return cuMajuscula.replace(cuMajuscula.substring(0), cuMajuscula.substring(0).toLowerCase());
    }

    public String scriereMinuscule(String str) {
        return str.replace(str, str.substring(0).toLowerCase());
    }

    public String scriereMajuscule(String str) {
        return str.replace(str, str.substring(0).toUpperCase());
    }


}
