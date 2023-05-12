package reservation;
import aeroport.Vol;
import aeroport.Compagnie;
import aeroport.Aeroport;
import aeroport.Escale;
import aeroport.Vol;
import java.util.ArrayList;

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
