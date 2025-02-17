package services;

import models.Emergency;
import patterns.observer.EmergencyObserver;

public class Ambulance extends baseService {

    public Ambulance(String id, int availableStaff, int fuel) {
        super(id, availableStaff, fuel);
    }

    @Override
    public void addressEmergency(Emergency emergency) {
        System.out.println("🚨 Ambulancia en camino!!!");
        System.out.println("-> [Ambulancia " + getId() + "]: " + emergency.toString());
    
        // Reducimos los recursos al atender la emergencia
        reducePersonnel(1); // Reducir 1 persona
        reduceFuel(10); // Reducir 10 de combustible
    
        // Verificamos si la ambulancia sigue disponible después de la emergencia
        if (getPersonnelAvailable() == 0) {
            setAvailable(false);
            System.out.println("❌ [Ambulancia " + getId() + "] ya no tiene personal disponible y se ha desactivado.");
        }
    }
}