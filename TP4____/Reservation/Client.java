import java.util.ArrayList;
import java.util.Date;

public class Client {
    private String nom;
    private String referencePaiement;
    private String contact;
    private ArrayList<Reservation> reservations;

    public Client(String nom, String referencePaiement, String contact) {
        this.nom = nom;
        this.referencePaiement = referencePaiement;
        this.contact = contact;
        this.reservations = new ArrayList<Reservation>();
    }

    public String getNom() {
        return nom;
    }

    public String getReferencePaiement() {
        return referencePaiement;
    }

    public String getContact() {
        return contact;
    }

    public void effectuerReservation(Vol vol, Date date) {
        Reservation reservation = new Reservation(vol, date);
        reservations.add(reservation);
    }
}

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
            vol.supprimerReservation(this);
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

public class Passager {
    private String nom;
    private ArrayList<Reservation> reservations;

    public Passager(String nom) {
        this.nom = nom;
        this.reservations = new ArrayList<Reservation>();
    }

    public String getNom() {
        return nom;
    }

    public void ajouterReservation(Reservation reservation) {
        reservations.add(reservation);
        reservation.ajouterPassager(this);
    }

    public void supprimerReservation(Reservation reservation) {
        reservations.remove(reservation);
    }
}
