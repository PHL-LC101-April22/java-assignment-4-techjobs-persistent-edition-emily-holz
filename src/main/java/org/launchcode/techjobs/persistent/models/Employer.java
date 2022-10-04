package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "A location must be provided.")
    @Size(min = 2, max = 50, message = "Location must be between 2 and 50 characters.")
    private String location;

    public Employer() {}

    public Employer(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
