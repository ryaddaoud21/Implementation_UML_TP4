package reservation;

import aeroport.Vol;
import aeroport.Compagnie;
import aeroport.Aeroport;
import aeroport.Escale;
import aeroport.Vol;

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


