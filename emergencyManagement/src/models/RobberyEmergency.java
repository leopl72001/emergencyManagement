package models;

public class RobberyEmergency extends Emergency {
    private int roberySeverity; // Nivel de intensidad del fuego

    public RobberyEmergency(String location, int severity, int roberySeverity) {
        super(location, severity);
        this.roberySeverity = roberySeverity;
    }

    public int getRoberySeverity() {
        return roberySeverity;
    }

    @Override
    public void handleEmergency() {
        System.out.println("👮 Enviando una patrulla de la policia a " + location + " Severidad del robo: " + roberySeverity);
    }
}

