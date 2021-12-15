package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class EventCategory extends AbstractEntity {

    @Size(min = 3, message = "Name must be at least 3 characters long")
    @NotBlank(message = "Must enter SOMETHING")
    @Valid
    private String name;

    @OneToMany(mappedBy = "eventCategory")
    private final List<Event> eventQueryOnCatId = new ArrayList<>();

    public EventCategory(String name){
        this.name = name;
    }

    //single no-arg constructor mandatory for this to function
    public EventCategory(){}


    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Event> getEvents() {
        return eventQueryOnCatId;
    }

    //Custom methods

    @Override
    public String toString() {
        return "EventCategory{" +
                "name='" + name + '\'' +
                '}';
    }
}
