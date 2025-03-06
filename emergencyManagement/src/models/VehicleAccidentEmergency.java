package models;


import utils.EnumSeverityPriority;

public class VehicleAccidentEmergency extends Emergency {

    public VehicleAccidentEmergency(String location, EnumSeverityPriority severity, int timeResponse ) {
        super("ACCIDENTE VEHICULAR", location, severity, timeResponse, false);
    }

   
}