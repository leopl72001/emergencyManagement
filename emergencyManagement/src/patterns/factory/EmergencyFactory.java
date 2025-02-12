package patterns.factory;

import utils.EnumSeverityPriority;
import models.Emergency;
import utils.EnumTypeEmergency;
import models.FireEmergency;
import models.RobberyEmergency;
import models.VehicleAccidentEmergency;

public class EmergencyFactory {
    public static Emergency createEmergency(EnumTypeEmergency type, String location, EnumSeverityPriority severity, int timeResponse) {
        switch (type) {
            case ROBBERY:
                return new RobberyEmergency(location, severity, timeResponse);
            case VEHICULAR_ACCIDENT:
                return new VehicleAccidentEmergency(location, severity, timeResponse);
            case FIRE:
                return new FireEmergency(location, severity, timeResponse);
            default:
                return null;
        }

    }
}
