import aeroport.Compagnie;
import aeroport.Escale;
import aeroport.Vol;
import reservation.Client;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Start {

    public static void main(String[] args) throws ParseException {
        Vol volFinal = new Vol();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        String dd = "21/10/2020 13:00";
        String da = "23/10/2020 02:15";

        try {
            volFinal.setDateDepart(format.parse(dd));
            volFinal.setDateArrivee(format.parse(da));
        } catch (Exception e) {
            throw new RuntimeException("Unable to format to date");
        }

        System.out.println(volFinal.getDateArrivee());
        System.out.println(volFinal.obtenirDuree().toString().substring(2));


        Escale escale = new Escale();

        String departEscale = "10/05/2023 17:00";
        String arriveEscale = "10/05/2023 14:15";


        try {

            escale.setDepart(format.parse(departEscale));
            escale.setArrivee(format.parse(arriveEscale));
        } catch (Exception e) {
            throw new RuntimeException("Unable to format to date");
        }

        System.out.print("aeroport.Escale date de depart : ");
        System.out.println(escale.getDepart());

        System.out.print("aeroport.Escale date de arrive : ");
        System.out.println(escale.getArrivee());


        Client client = new Client("Riyad", "FRXX001", "+33666");

        System.out.print("aeroport.reservation.Client nom : ");
        System.out.println(client.getNom());

        //Bidirectional
        Vol vol = new Vol();
        vol.setNumero("abc1");

        Vol vol2 = new Vol();
        vol2.setNumero("abc2");


        client.effectuerReservation(vol2, format.parse("10/05/2023 12:43"));

        Compagnie compagnie = new Compagnie();
        compagnie.setName("Air France");
        compagnie.addVol(vol);
        compagnie.addVol(vol2);

        for (Vol v : compagnie.getVols()) {
            System.out.println(v.getNumero());
        }

        System.out.println(vol.getCompagnie().getName());
        System.out.println(vol2.getCompagnie().getName());

        vol2.setCompagnie(null);
        System.out.println(vol2.getCompagnie());

        for (Vol v : compagnie.getVols()) {
            System.out.println(v.getNumero());
        }
    }
}
