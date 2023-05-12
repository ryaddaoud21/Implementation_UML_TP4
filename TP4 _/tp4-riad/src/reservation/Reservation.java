package reservation;
import aeroport.Vol;
import aeroport.Compagnie;
import aeroport.Aeroport;
import aeroport.Escale;
import aeroport.Vol;
import java.util.Date;
public class Reservation {
    private static int numReservation = 0;
    private int numero;
    private Date date;
    private boolean confirmee;
    private Vol vol;
    private Passager passager;

    public Reservation(Vol vol, Date date) {
        this.numero = ++numReservation;
        this.date = date;
        this.vol = vol;
        this.confirmee = false;
    }

    public int getNumero() {
        return numero;
    }

    public Date getDate() {
        return date;
    }

    public boolean isConfirmee() {
        return confirmee;
    }

    public void confirmer() {
        this.confirmee = true;
    }

    public void annuler() {
        if (!confirmee) {
//            vol.supprimerReservation(this);
            passager.supprimerReservation(this);
        }
    }

    public void ajouterPassager(Passager passager) {
        this.passager = passager;
    }

    public Passager getPassager() {
        return passager;
    }
}