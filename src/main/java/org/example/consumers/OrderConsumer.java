package org.example.consumers;
import org.example.events.Order;

//Vieleicht zu viel aber nur das ich es nicht vergesse (denksnat0ß: jeder konsument soll eine doer annehmen)
public interface OrderConsumer {
    void handle(Order order);

}
