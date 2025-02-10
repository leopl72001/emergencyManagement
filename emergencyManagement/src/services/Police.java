package services;

import patterns.observer.EmergencyObserver;

public class Police implements EmergencyObserver {
    @Override
    public void update(String emergencyType) {
        if (emergencyType.equalsIgnoreCase("robbery")) {
            System.out.println("🚓 Policía en camino para manejar el robo.");
        }
    }
}