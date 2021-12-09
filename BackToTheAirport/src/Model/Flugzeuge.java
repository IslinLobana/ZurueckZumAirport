package Model;

public abstract class Flugzeuge{

    String _flugzeugnummer;
    String _airline;


    public Flugzeuge(String flugzeugnummer, String airline){
        setFlugzeugnummer(flugzeugnummer);
        setAirline(airline);
    }

    public abstract String prepareStart();

    public void setAirline(String _airline) {
        this._airline = _airline;
    }
    public void setFlugzeugnummer(String _flugzeugnummer) {
        this._flugzeugnummer = _flugzeugnummer;
    }

    public String getAirline() {
        return _airline;
    }

    public String getFlugzeugnummer() {
        return _flugzeugnummer;
    }

}


