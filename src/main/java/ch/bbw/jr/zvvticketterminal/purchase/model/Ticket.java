package ch.bbw.jr.zvvticketterminal.purchase.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ticket
 * @author Janis Ringli
 * @version 07.07.2022
 */

@Component
public class Ticket {
    private List<String>allTickets = new ArrayList<>(Arrays.asList(
            "Zonenkarte 125",
            "Einzelfahrkarte",
            "10er Abo",
            "Stempelkarte"
            ));
    private String ticketType;
    private double price;
    private String ticketNumber;

    public List<String> getAllTickets() {
        return allTickets;
    }

    public String getTicketType() {
        return ticketType;
    }
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}
