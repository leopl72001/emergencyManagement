package services;

import patterns.observer.EmergencyObserver;

public class Ambulance implements EmergencyObserver {
    @Override
    public void update(String emergencyType) {
        if (emergencyType.equalsIgnoreCase("accident")) {
            System.out.println("🚑 Ambulancia en camino para atender el accidente.");
        }
    }
}