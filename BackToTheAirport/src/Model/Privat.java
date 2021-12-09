package Model;

public class Privat extends Flugzeuge{

    String _typ;




    public Privat(String typ, String airline, String flugzeugnummer){
        super(flugzeugnummer, airline);
        setTyp(typ);
    }
    // || Oder
    // && Und
    public String prepareStart(){



        if(getTyp() == "Jet" || getTyp() == "jet"){
            return "Joa";
        }
        else{
           return "ne";
        } 
    }


    public void setTyp(String _typ) {
        this._typ = _typ;
    }

    public String getTyp() {
        return _typ;
    }

    
}
