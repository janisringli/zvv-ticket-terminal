package ch.bbw.jr.zvvticketterminal.purchase;

import ch.bbw.jr.zvvticketterminal.purchase.model.Customer;
import ch.bbw.jr.zvvticketterminal.purchase.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ZvvTicketController {
    @Autowired
    Customer myCustomer;
    @Autowired
    Ticket myTicket;


    @GetMapping("/purchase")
    public String requestAttendee(Model model){
        model.addAttribute("customer", myCustomer);
        model.addAttribute("listOfOptions", myTicket.getAllTickets());
        System.out.println("listOfOptions" + myTicket.getAllTickets());
        return "purchase/ticketPurchase";
    }
    @PostMapping("/purchase")
    public String saveAttendee(@ModelAttribute Customer attendee) {
        myCustomer = attendee;
        System.out.println("saveAttendee(); " + myCustomer);
        return "redirect:/thankMessage.html";
    }
}
