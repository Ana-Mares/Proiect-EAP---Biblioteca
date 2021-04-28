package validari;

public class ValidareAbonament {
    public boolean validareId (String idCard ) {
        return Integer.parseInt(idCard) >= 0;
    }
}
