package servicii.fisiere;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class ServiceAudit {
    public static ServiceAudit instanta = null;

    private ServiceAudit() {}

    public static ServiceAudit getInstanta() {
        if(instanta == null)
            instanta = new ServiceAudit();
        return instanta;
    }

    public void audit(String actiune) {
        FileWriter scriereAudit = null;

        try {
            scriereAudit = new FileWriter("src\\\\servicii\\\\fisiere\\\\resurse\\\\audit.csv");
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            Timestamp tStamp = new Timestamp(System.currentTimeMillis());
            String timestamp = format.format(tStamp);

            scriereAudit.append(actiune);
            scriereAudit.append(",");
            scriereAudit.append((timestamp));
            scriereAudit.append("\n");
        }
        catch (Exception exception) {
            System.out.println("Eroare la scrierea in fisierul audit.csv");
        }

        try {
            scriereAudit.flush();
            scriereAudit.close();
        }
        catch (IOException exception){
            System.out.println("Eroare la inchiderea fisierului audit.csv");
        }
    }


}
