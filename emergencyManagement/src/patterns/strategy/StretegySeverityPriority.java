package patterns.strategy;

import models.Emergency;
import utils.EnumSeverityPriority;

public class StretegySeverityPriority implements StrategyPriority {

    @Override
    public int calculatePriority(Emergency emergency) {
        try {
            EnumSeverityPriority severity = emergency.getSeverity(); 
            switch (severity) {
                case ALTA:
                    return 3;
                case MEDIO:
                    return 2;
                case BAJA:
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
