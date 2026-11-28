package org.example.events;

import org.example.consumers.OrderConsumer;
import java.util.ArrayList;
import java.util.List;

public class EventBus {

    //Danke KI für den TIpp, ich hab fast 45 minuten grbaurcht um eine lösung für das problem zu finden. So kann die lste eifnach objekte der klassen speihern übver das interface.
    private final List<OrderConsumer> consumers = new ArrayList<>();

    public void hinzu(OrderConsumer consumer) {
        consumers.add(consumer);
    }

    //So verteile ich an jeden aus der liste die reinkommende oder. Sollte wenn das klappt ja von jemweil den klassen ein objekt enthalten
    public void wietergabe(Order order) {
        //Muss das noch ansyncron machen, fehler abfragen und da sdead ding und auch retry hie vermutocuh noch machen
        for (OrderConsumer consumer : consumers) {
            consumer.handle(order);
        }
    }

}
