package org.launchcode.codingevents.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.List;


@Controller

public class EventController{

    @RequestMapping("events")
    public String eventsList(Model model){

            List<String> events = new ArrayList<>();
            events.add("First Event");
            events.add("Second Event");
            events.add("Salsa Tasting");

            model.addAttribute("eventsJawn", events);
            return "events/index";
    }


}
