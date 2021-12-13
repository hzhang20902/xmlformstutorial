package org.launchcode.codingevents.models;

public enum EventType {

    CONFERENCE("Conference"),
    MEETUP("Meetup"),
    WORKSHOP("Workshop"),
    SOCIAL("Social");

    private final String displayName;

    //essentially what this does is refers to the ALLCAPS enum value and displays the String argument so;
    //as to be user friendly; it is plugged in in the XML file as the value, then the text displayed;
    // is the String
    EventType(String displayName) {
        this.displayName = displayName;
    }

    //only a getter, no setter bc they are CONSTANT
    public String getDisplayName() {
        return displayName;
    }
}
