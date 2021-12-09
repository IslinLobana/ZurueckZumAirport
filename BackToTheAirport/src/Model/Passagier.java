package Model;

public class Passagier extends Flugzeuge {

    int _maxPassagiere;
    int _momPassagiere;



    public Passagier(int maxPassagiere, int momPassagiere, String flugzeugnummer, String airline){
        super(flugzeugnummer, airline);
        setMaxPassagiere(maxPassagiere);
        setMomPassagiere(momPassagiere);
    }

    public String prepareStart() {
        if(getMomPassagiere() > getMaxPassagiere()){
            return "Zu viele Passagiere";
        }
        else {
            return "Alles gut";
        }
    }

    public void setMaxPassagiere(int _maxPassagiere) {
        this._maxPassagiere = _maxPassagiere;
    }

    public void setMomPassagiere(int _momPassagiere) {
        this._momPassagiere = _momPassagiere;
    }

    public int getMaxPassagiere() {
        return _maxPassagiere;
    }

    public int getMomPassagiere() {
        return _momPassagiere;
    }

    
}
