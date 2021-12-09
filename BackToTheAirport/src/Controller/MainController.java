package Controller;

import Model.Privat;
import Model.Passagier;
import Model.Tower;
import Model.Millitaer;
import View.Output;
import Model.Transport;

//Erstellt 2 Passagierflugzeuge und lasst sie starten 

//Erweitert das Projekt um die Klasse Millitär (Eigenschaften wie davor, Propellerzahl)

//Lasst davon 2 Starten



public class MainController {
    public MainController(){

        Privat p = new Privat("AH-231", "Easyjet", "Jet");

        Passagier pa1 = new Passagier(250, 240, "AH-250", "Ryanair");

        Passagier pa2 = new Passagier(260, 230, "A-450", "Ryanair");

        Millitaer m1 = new Millitaer(2,"HF-240", "ARMY");

        Millitaer m2 = new Millitaer(4,"HF-120", "ARMY");

        Tower t = new Tower();

        Output o = new Output();

        Transport tp = new Transport(2000, 2005, "GH-341", "Airbus");

        o.printData(t.startPlane(tp));

        o.printData(t.startPlane(p));

        o.printData(t.startPlane(pa1));

        o.printData(t.startPlane(pa2));

        o.printData(t.startPlane(m1));

        o.printData(t.startPlane(m2));
    }
}
