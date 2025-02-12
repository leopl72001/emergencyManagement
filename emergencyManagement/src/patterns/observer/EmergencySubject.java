package patterns.observer;

import models.Emergency;

public interface EmergencySubject {
void addObserver(EmergencyObserver observer);
void removeObserver(EmergencyObserver observer);
void notifyObservers(Emergency emergency);

}
