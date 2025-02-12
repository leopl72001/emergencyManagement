package services;

import models.interfaces.IemergencyService;

public abstract class baseService implements IemergencyService {
    private String id;
    private int availableStaff;
    private int fuel;

    public baseService(String id, int availableStaff, int fuel) {
        this.id = id;
        this.availableStaff = availableStaff;
        this.fuel = fuel;
    }

    @Override
    public String getId() {
        return id;
    }

    public int getAvailableStaff() {
        return availableStaff;
    }

    public int getFuel() {
        return fuel;
    }

    @Override
    public boolean isAvailable() {
        return availableStaff > 0 && fuel > 0;
    }

    @Override
    public void assignStaff(int quantity) {
        if (quantity <= availableStaff) {
            availableStaff -= quantity;
        } else
            System.out.println("No hay suficiente personal disponible en el servicio " + id);
    }

    @Override
    public void releaseStaff(int quantity) {
        availableStaff += quantity;
    }

    @Override
    public void wasteFuel(int quantity) {
        if (quantity <= fuel) {
            fuel -= quantity;
        } else
            System.out.println("No hay suficiente combustible disponible en el servicio " + id);
    }

    @Override
    public void assignFuel(int quantity) {
        if (quantity <= fuel) {
            fuel -= quantity;
        } else
            System.out.println("No hay suficiente combustible disponible en el servicio " + id);
    }

    @Override
    public String toString() {
        return "ServicioBase [id=" + id + ", personalDisponible=" + availableStaff + ", combustible=" + fuel + "]";
    }
    
}
