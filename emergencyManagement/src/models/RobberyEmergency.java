package models;

import utils.EnumSeverityPriority;

public class RobberyEmergency extends Emergency {

    public RobberyEmergency(String location, EnumSeverityPriority severity, int timeResponse) {
        super("ROBO", location, severity, timeResponse, false);
    }

}
