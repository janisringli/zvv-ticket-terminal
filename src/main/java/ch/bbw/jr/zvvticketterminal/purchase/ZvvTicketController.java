package ch.bbw.jr.zvvticketterminal.purchase;

import ch.bbw.jr.zvvticketterminal.purchase.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import javax.validation.Constraint.*;

@Controller
public class ZvvTicketController {
    @Autowired
    Ticket myTicket;


    @GetMapping("/purchase")
    public String requestCustomer(Model model){
        model.addAttribute("ticket", new Ticket());
        model.addAttribute("listOfOptions", myTicket.getAllTickets());
        model.addAttribute("halbtax", myTicket.isHalbtax());
        model.addAttribute("halbtaxPrice", myTicket.getKlass());
        model.addAttribute("listOfKlasses", myTicket.getAllKlasses());
        return "purchase/ticketPurchase";
    }
    @PostMapping("/purchase")
    public String saveCustomer(@Valid @ModelAttribute("ticket")Ticket ticket, BindingResult bindingResult, Model model){
        System.out.println("Haltax: " + ticket.isHalbtax());
        System.out.println("Tickettype: " + ticket.getTicketType());
        System.out.println("Klasse: " + ticket.getKlass());
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult.getAllErrors());
            return "/purchase/ticketPurchase.html";
        }
        return "redirect:/thankTicket.html";
    }
}
