package ch.bbw.jr.zvvticketterminal.purchase.model;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Ticket
 * @author Janis Ringli
 * @version 07.07.2022
 */
@Component
public class Customer {
    private String prename;
    private String lastname;

    public String getPrename() {
        return prename;
    }
    public void setPrename(String prename) {
        this.prename = prename;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @Override
    public String toString() {
        return "Attendee [prename=" + prename + ", lastname=" + lastname + "]";
    }


}
