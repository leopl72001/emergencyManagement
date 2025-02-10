package models;

public class VehicleAccidentEmergency extends Emergency {
    private int accidentSeverity; // Nivel de intensidad del fuego

    public VehicleAccidentEmergency(String location, int severity, int accidentSeverity) {
        super(location, severity);
        this.accidentSeverity = accidentSeverity;
    }

    public int getAccidentSeverity() {
        return accidentSeverity;
    }

    @Override
    public void handleEmergency() {
        System.out.println("🚑 Enviando ambulancia a " + location + " con accidente de grado: " + accidentSeverity);
    }
}