package patterns.strategy;

import models.Emergency;
import utils.EnumLocation;

public class StrategyPriorityProximity implements StrategyPriority {
    private static class UbanMap {
        public int calculateDistance(String location) {
            try {
                EnumLocation enumLocation = EnumLocation.valueOf(location.toLowerCase());
                switch (enumLocation) {
                    case ZONA_NORTH:
                        return 8;
                    case ZONA_SUR:
                        return 10;
                    case ZONA_CENTER:
                        return 5;
                    case ZONA_EAST:
                        return 15;
                    case ZONA_WESTERN:
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
