package ch.bbw.jr.zvvticketterminal.subscription;
import ch.bbw.jr.zvvticketterminal.subscription.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;


@Controller
public class SubscriptionController {
    @Autowired
    Customer myCustomer;

    @GetMapping("/subscription")
    public String requestSubscription(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("firstName",myCustomer.getFirstName());
        model.addAttribute("lastName",myCustomer.getLastName());
        model.addAttribute("email",myCustomer.getEmail());
        model.addAttribute("email",myCustomer.getSubscriptionType());
        model.addAttribute("listOfSubscriptions", myCustomer.getAllSubscriptions());
        return "subscription/subscription.html";
    }
    @PostMapping("/subscription")
    public String saveSubscription(@Valid @ModelAttribute("customer")Customer customer, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("firstName",myCustomer.getFirstName());
            model.addAttribute("lastName",myCustomer.getLastName());
            model.addAttribute("email",myCustomer.getEmail());
            model.addAttribute("email",myCustomer.getSubscriptionType());
            model.addAttribute("listOfSubscriptions", myCustomer.getAllSubscriptions());
            System.out.println("give me a fucking error");
            return "/subscription/subscription.html";
        }
        System.out.println("firstname: " + customer.getFirstName());
        System.out.println("lastname: " + customer.getLastName());
        System.out.println("email: " + customer.getEmail());
        System.out.println("subscription: " + customer.getSubscriptionType());
        return "redirect:/thankSubscription.html";
    }
}
