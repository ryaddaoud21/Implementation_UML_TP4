import java.util.Date;

public class Vol {
    private int numero;
    private Date dateDepart;
    private Date dateArrivee;
    private long duree; 
    private boolean isOpen;

    public Vol(int numero, Date dateDepart, Date dateArrivee) {
        this.numero = numero;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.duree = dateArrivee.getTime() - dateDepart.getTime();
    }

    public void ouvrir() {


	isOpen = true;
      

    }

    public void fermer() {
       isOpen = false;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
        this.duree = dateArrivee.getTime() - dateDepart.getTime();
    }

    public long getDuree() {
        return duree;
    }
}


public class Escale {
    private Aeroport depart;
    private Aeroport arrivee;
    private int duree; 

    public Escale(Aeroport depart, Aeroport arrivee, int duree) {
        this.depart = depart;
        this.arrivee = arrivee;
        this.duree = duree;
    }

    
    public Aeroport getDepart() {
        return depart;
	}

public Aeroport getArrivee() {
        return arrivee;
	}

public int getDuree() {
        return duree;
	}

}