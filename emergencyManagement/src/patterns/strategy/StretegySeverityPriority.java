package patterns.strategy;

import models.Emergency;
import utils.EnumSeverityPriority;

public class StretegySeverityPriority implements StrategyPriority {

    @Override
    public int calculatePriority(Emergency emergency) {
        try {
            EnumSeverityPriority enumSeverityPriority = emergency.getSeverityPriority();
            switch (enumSeverityPriority) {
                case HIGH:
                    return 3;
                case MEDIUM:
                    return 2;
                case LOW:
                    return 1;

                default:
                    return 1;

            }
        } catch (Exception e) {
            System.err.println("Error al calcular prioridad: " + e.getMessage());
            return -1; // Valor en caso de error }
        }

    }
}
