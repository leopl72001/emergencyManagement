package patterns.observer;

public interface EmergencyObserver {
    void update(String emergencyType); // Método que los observadores deben implementar
}