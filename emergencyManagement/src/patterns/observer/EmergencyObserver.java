package patterns.observer;

import models.Emergency;

public interface EmergencyObserver {
    void update(Emergency emergency);
}
