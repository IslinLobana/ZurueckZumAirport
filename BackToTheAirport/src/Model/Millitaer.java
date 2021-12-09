package Model;

public class Millitaer extends Flugzeuge{

    int _propellerzahl;
    


    public Millitaer(int propellerzahl, String flugzeugnummer, String airline){
        super(flugzeugnummer, airline);
        setPropellerzahl(propellerzahl);
    }

    public void setPropellerzahl(int _propellerzahl) {
        this._propellerzahl = _propellerzahl;
    }


    public int getPropellerzahl() {
        return _propellerzahl;
    }







    public String prepareStart(){



        if(getPropellerzahl() == 2 || getPropellerzahl() == 4){
            return "Joa";
        }
        else{
           return "ne";
        } 
    }
}
