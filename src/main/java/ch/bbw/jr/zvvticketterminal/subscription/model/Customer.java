package ch.bbw.jr.zvvticketterminal.subscription.model;

import org.springframework.stereotype.Component;


import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Component
public class Customer {

    private List<String>allSubscriptions = new ArrayList<>(Arrays.asList(
            "General Abonnement",
            "Halbtax"
    ));

    public List<String> getAllSubscriptions() {
        return allSubscriptions;
    }

    public void setAllSubscriptions(List<String> allSubscriptions) {
        this.allSubscriptions = allSubscriptions;
    }
    //SubscriptionType
    private String subscriptionType;
    public String getSubscriptionType() {
        return subscriptionType;
    }
    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }
    //First Name
    @NotEmpty(message = "First Name is required")
    private String firstName;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //Last Name
    @NotEmpty(message = "Last Name is required")

    private String lastName;

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //Email
    @Email
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", message = "Invalid email address")
    private String email;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
