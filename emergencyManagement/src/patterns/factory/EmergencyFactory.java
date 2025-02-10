package patterns.factory;

import models.*;

public class EmergencyFactory {
    public static Emergency createEmergency(String type, String location, int severity, int additionalSeverity) {
        switch (type.toLowerCase()) {
            case "fire":
                return new FireEmergency(location, severity, additionalSeverity);
            case "robbery":
                return new RobberyEmergency(location, severity, additionalSeverity);
            case "accident":
                return new VehicleAccidentEmergency(location, severity, additionalSeverity);
            default:
                throw new IllegalArgumentException("Tipo de emergencia desconocido: " + type);
        }
    }
}