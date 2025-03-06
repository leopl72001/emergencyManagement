package services;

import models.Emergency;
import patterns.observer.EmergencyObserver;

public class Police extends baseService {

    public Police(String id, int availableStaff, int fuel) {
        super(id, availableStaff, fuel);

    }

    @Override
    public void addressEmergency(Emergency emergency) {
        System.out.println("🚨 Policia en camino!!!");
        // System.out.println("-> [Policia" + getId() + "]: " + emergency.toString());
        assignStaff(2);
        assignFuel(3);
    }

    @Override
    public String toString() {
        return getId() + " -> Patrulla: " + getPersonnelAvailable() + " Combustible: " + getFuel();
    }

}
