package org.launchcode.codingevents.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class Event {
    private int id;
    private static int nextId;
    @Size(min= 3, max = 50, message = "Name must be between 3 and 50 characters.")
    @NotBlank(message= "Name is required!")
    private String name;
    @Size(max = 500, message = "Description too long.")
    private String description;
    @NotBlank(message= "Email is required.")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;


    public Event(String name, String description, String contactEmail) {
        this();
        this.name = name;
        this.description= description;
        this.contactEmail = contactEmail;

    }
    public Event(){
        this.id= nextId;
        nextId++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
