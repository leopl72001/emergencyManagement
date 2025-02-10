package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class EmergencySubject {
    private List<EmergencyObserver> observers = new ArrayList<>(); // Lista de observadores

    // Método para agregar un observador
    public void addObserver(EmergencyObserver observer) {
        observers.add(observer);
    }

    // Método para notificar a todos los observadores
    public void notifyObservers(String emergencyType) {
        for (EmergencyObserver observer : observers) {
            observer.update(emergencyType); // Llama al método update de cada observador
        }
    }
}