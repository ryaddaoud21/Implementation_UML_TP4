package aeroport;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Escale {
    private Date depart,arrivee;

    private Vol vol;

    private Aeroport aeroport;

    public Date getDepart() {
        return depart;
    }

    public void setDepart(Date depart) {
        this.depart = depart;
    }

    public Date getArrivee() {
        return arrivee;
    }

    public void setArrivee(Date arrivee) {
        this.arrivee = arrivee;
    }


    public Aeroport getAeroport() {
        return this.aeroport;
    }

    public void setAeroport(Aeroport aeroport) {
       
        this.aeroport = aeroport;
    }





    public Vol getVol() {
        return this.vol;
    }

    public void setVol(Vol vol) {

        this.vol = vol;
    }


    public Duration obtenirDuree() {
        if(this.depart != null && this.arrivee != null) {
            return Duration.of( depart.getTime() - arrivee.getTime(), ChronoUnit.MILLIS);
        }
	else {
        return null;
		}

    }





}
