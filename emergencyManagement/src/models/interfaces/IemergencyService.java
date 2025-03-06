package models.interfaces;

import models.Emergency;

public interface IemergencyService {

    String getId();

    int getPersonnelAvailable();

    int getFuel();

    boolean isAvailable();

    void setAvailable(boolean available);

    void assignStaff(int quantity);

    void reducePersonnel(int quantity);

    void reduceFuel(int quantity);

    void assignFuel(int quantity);

    void addressEmergency(Emergency emergency);

}
