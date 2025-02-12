package models;


import utils.EnumSeverityPriority;

public class FireEmergency extends Emergency {

    public FireEmergency(String location, EnumSeverityPriority severity, int timeResponse) {
        super("INCENDIO", location, severity, timeResponse, false);
        
    }
  
}
