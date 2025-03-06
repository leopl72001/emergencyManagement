package services;

import models.Emergency;
import patterns.observer.EmergencyObserver;

public class FireFighter extends baseService {

    public FireFighter(String id, int availableStaff, int fuel) {
        super(id, availableStaff, fuel); // TODO Auto-generated constructor stub
    }

    @Override
    public void addressEmergency(Emergency emergency) {
        System.out.println("🚨 Bomberos en camino!!!");

        assignStaff(5);
        assignFuel(10);
    }

    @Override
    public String toString() {
        return  getId() + " -> Unidades de rescate: " + getPersonnelAvailable() + " Combustible: "
                + getFuel();
    }

}
