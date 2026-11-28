package org.example;
import org.example.consumers.Lager;
import org.example.consumers.Rechnung;
import org.example.consumers.Versand;
import org.example.events.EventBus;
import org.example.events.Order;

import java.util.Scanner;

public class Main {


    static Order set_order(Scanner scanner, String name) {
        System.out.println("Anzahl:");
        int anzahl = scanner.nextInt();

        return new Order(anzahl, name);
    }

    static void main() {
        //Sollte normaler code werden wenn ich mich nicht irre: Reihenfolge: Bus, Konsumenten, anmelden, Publisher, bestellen
        //IDEE. erst konsolen fage blabla bestellen: aussuchen zwifhen sagen wir mal drei eimagen apfel banen brjne.
        //publischer sollte ein format haben womit sowohl verand und lager direkt abrieten können. denke ich mach einfach ne funktion draus.

        //Idee main -> gibts dem recodr (sollte der oublicher sein -> an bus -> bus reict duch an die klassen für lager und verand + rechnung (?),

        //einmal am afng erzuegen und mit den klassen füllen (was eine quel das bis hier war)
        Scanner scanner = new Scanner(System.in);


        EventBus bus = new EventBus();
        bus.hinzu(new Lager());
        bus.hinzu(new Rechnung());
        bus.hinzu(new Versand());

        System.out.println("Willkommen beim Kleinsten Obstonlineversand der Welt.\nWir bieten ein Sortiment von sagenhaften 3 Früchten.\n(vielleicht auch mehr je nachdem wie wir uns heute fühlen)\nEs Reicht lediglich die Nummer des Opstes und darauf die Anzahl einzugeben.\n");
        System.out.println("[1] Apfel\n[2] Birne\n[3] Melone\n");

        int obst_zahl = scanner.nextInt();

        switch (obst_zahl){
            case 1:{
                Order order = set_order(scanner,"Apfel");
                //Hier dann an bus übergeben:
            }
            break;

            case 2:{
                Order order = set_order(scanner,"Birne");
                //Hier dann an bus übergeben:
            }
            break;

            case 3: {
                Order order = set_order(scanner,"Melone");
                //Hier dann an bus übergeben:
            }
            break;

            default:{
                System.out.println("Die eingegebne Nummer passt zu keinem unserer Angebote!");
            }
            break;
        }
        scanner.close();



    }
}
