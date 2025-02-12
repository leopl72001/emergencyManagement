package services;

import models.Emergency;
import patterns.observer.EmergencyObserver;

public class FireFighter extends baseService {

    public FireFighter(String id, int availableStaff, int fuel) {
        super(id, availableStaff, fuel);  //TODO Auto-generated constructor stub
    }

    @Override
    public void addressEmergency(Emergency emergency) {
        System.out.println("🚨 Bomberos en camino!!!");
        System.out.println("-> [Bomberos" + getId() + "]: " + emergency.toString());
        assignStaff(5);
        assignFuel(10);
    }
   
    }
