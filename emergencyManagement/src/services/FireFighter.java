package services;

import patterns.observer.EmergencyObserver;

public class FireFighter implements EmergencyObserver {
    @Override
    public void update(String emergencyType) {
        if (emergencyType.equalsIgnoreCase("fire")) {
            System.out.println("🚒 Bomberos en camino para apagar el incendio.");
        }
    }
}