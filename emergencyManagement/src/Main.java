import models.Emergency; // Importar la clase Emergency
import patterns.factory.EmergencyFactory; // Importar la clase EmergencyFactory
import patterns.observer.EmergencySubject; // Importar la clase EmergencySubject
import patterns.ResourceController; // Importar la clase ResourceController
import services.FireFighter; // Importar la clase FireFighter
import services.Ambulance; // Importar la clase Ambulance
import services.Police; // Importar la clase Police

public class Main {
    public static void main(String[] args) {
        // Crear una emergencia usando Factory
        Emergency fire = EmergencyFactory.createEmergency("fire", "Centro Comercial", 7, 5);
        fire.handleEmergency();

        // Crear el sistema de observadores
        EmergencySubject emergencySubject = new EmergencySubject();
        FireFighter fireFighter = new FireFighter();
        Ambulance ambulance = new Ambulance();
        Police police = new Police();

        // Suscribir los servicios al sistema de alertas
        emergencySubject.addObserver(fireFighter);
        emergencySubject.addObserver(ambulance);
        emergencySubject.addObserver(police);

        // Notificar la emergencia
        emergencySubject.notifyObservers("fire");

        // Usar el Singleton para asignar recursos
        ResourceController resourceController = ResourceController.getInstance();
        resourceController.allocateResources("fire");
    }
}