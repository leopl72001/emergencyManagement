package models;

public class FireEmergency extends Emergency {
    private int fireIntensity; // Nivel de intensidad del fuego

    public FireEmergency(String location, int severity, int fireIntensity) {
        super(location, severity);
        this.fireIntensity = fireIntensity;
    }

    public int getFireIntensity() {
        return fireIntensity;
    }

    @Override
    public void handleEmergency() {
        System.out.println("🔥 Enviando bomberos a " + location + " con nivel de fuego: " + fireIntensity);
    }
}
