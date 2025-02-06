package models;

public abstract class Emergency {
    protected String location;
    protected int severity; // Nivel de gravedad (1-10)

    public Emergency(String location, int severity) {
        this.location = location;
        this.severity = severity;
    }

    public String getLocation() {
        return location;
    }

    public int getSeverity() {
        return severity;
    }

    public abstract void handleEmergency(); // Método abstracto que cada tipo de emergencia debe implementar
}
