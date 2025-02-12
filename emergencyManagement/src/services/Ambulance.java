package services;

import models.Emergency;
import patterns.observer.EmergencyObserver;

public class Ambulance extends baseService {

    public Ambulance(String id, int availableStaff, int fuel) {
        super(id, availableStaff, fuel);
    }

    @Override
    public void addressEmergency(Emergency emergency) {
        System.out.println("🚨 Ambulacia en camino!!!");
        System.out.println("-> [Ambulancia" + getId() + "]: " + emergency.toString());
        assignStaff(3);
        assignFuel(5);
    }

}
