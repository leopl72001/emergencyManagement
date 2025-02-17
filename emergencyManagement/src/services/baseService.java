package services;

import models.interfaces.IemergencyService;

public abstract class baseService implements IemergencyService {
    private String id;
    private int availableStaff;
    private int fuel;
    private boolean available;

    public baseService(String id, int availableStaff, int fuel) {
        this.id = id;
        this.availableStaff = availableStaff;
        this.fuel = fuel;
        this.available = true; // Inicialmente disponible
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getPersonnelAvailable() {
        return availableStaff;
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public boolean isAvailable() {
        return availableStaff > 0 && fuel > 0;
    }

    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public void assignStaff(int quantity) {  // Agregamos @Override
        this.availableStaff += quantity;
    }

    @Override
    public void reducePersonnel(int quantity) {
        this.availableStaff -= quantity;
        if (this.availableStaff < 0) {
            this.availableStaff = 0;
        }
    }

    @Override
    public void reduceFuel(int quantity) {
        this.fuel -= quantity;
        if (this.fuel < 0) {
            this.fuel = 0;
        }
    }

    @Override
    public void assignFuel(int quantity) { // Agregamos @Override
        this.fuel += quantity;
    }

    @Override
    public String toString() {
        return "ServicioBase [id=" + id + ", personalDisponible=" + availableStaff + ", combustible=" + fuel + "]";
    }
}