package Model;

public class Transport extends Flugzeuge{


    int _maxZuladung;
    int momZuladung;


    public Transport(int maxZuladung, int momZuladung, String flugzeugnummer, String airline){
        super(flugzeugnummer, airline);
        setMaxZuladung(maxZuladung);
        setMomZuladung(momZuladung);
    }

    public String prepareStart(){
        if(getMomZuladung() > getMaxZuladung()){
            return "Zu voll";
        }
        else {
            return "Alles gut";
        }
    }



    public void setMomZuladung(int momZuladung) {
        this.momZuladung = momZuladung;
    }

    public void setMaxZuladung(int _maxZuladung) {
        this._maxZuladung = _maxZuladung;
    }

    public int getMomZuladung() {
        return momZuladung;
    }

    public int getMaxZuladung() {
        return _maxZuladung;
    }

}