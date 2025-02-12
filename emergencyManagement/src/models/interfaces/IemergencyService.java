package models.interfaces;

import models.Emergency;

public interface IemergencyService {

    String getId();

    int getAvailableStaff();

    int getFuel();

    boolean isAvailable();

    void assignStaff(int quantity);

    void releaseStaff(int quantity);

    void wasteFuel(int quantity);

    void assignFuel(int quantity);

    void addressEmergency(Emergency emergency);

}
