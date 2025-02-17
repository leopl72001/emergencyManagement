package patterns.strategy;

import models.Emergency;
import utils.EnumLocation;

public class StrategyPriorityProximity implements StrategyPriority {
    private static class UbanMap {
        public int calculateDistance(String location) {
            try {
                EnumLocation enumLocation = EnumLocation.valueOf(location.toLowerCase());
                switch (enumLocation) {
                    case VILLA_MARIA:
                        return 8;
                    case VILLA_ADELA:
                        return 10;
                    case VILLA_REY:
                        return 5;
                    case VILLA_LINDA:
                        return 15;
                    case VILLA_SOL:
                        return 20;
                    default:
                        return 10;
                }
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("ubicacion no valida: " + location, e);
            }
        }

    }

    @Override
    public int calculatePriority(Emergency emergency) {
        UbanMap ubanMap = new UbanMap(); // Instancia de UbanMap
        int calculateDistance = ubanMap.calculateDistance(emergency.getLocation());
        return 10 - calculateDistance;

    }
}
