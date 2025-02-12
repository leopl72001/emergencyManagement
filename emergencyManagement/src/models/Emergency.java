package models;



import utils.EnumSeverityPriority;

public abstract class Emergency {
    private String type;
    private String location;
    private EnumSeverityPriority severity;
    private int timeResponse;
    private boolean attended;
    private long timeStartAttention;
    private long timeEndAttention;

    public Emergency(String type, String location, EnumSeverityPriority severity, int timeResponse, boolean attended) {
        this.type = type;
        this.location = location;
        this.severity = severity;
        this.timeResponse = timeResponse;
        this.attended = false;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public EnumSeverityPriority getSeverity() {
        return severity;
    }

    public void setSeverity(EnumSeverityPriority severity) {
        this.severity = severity;
    }

    public int getTimeResponse() {
        return timeResponse;
    }

    public void setTimeResponse(int timeResponse) {
        this.timeResponse = timeResponse;
    }

    public boolean isAttended() {
        return attended;
    }

    public void setAttended(boolean attended) {
        this.attended = attended;
    }

    public long getTimeStartAttention() {
        return timeStartAttention;
    }

    public void setTimeStartAttention(long timeStartAttention) {
        this.timeStartAttention = timeStartAttention;
    }

    public long getTimeEndAttention() {
        return timeEndAttention;
    }

    public void setTimeEndAttention(long timeEndAttention) {
        this.timeEndAttention = timeEndAttention;
    }

    public void startAttention() {
        this.timeStartAttention = System.currentTimeMillis();
    }

    public void endAttention() {
        this.attended = true;
        this.timeEndAttention = System.currentTimeMillis();
    }

    public long calculateTimeAttention() {
        return (timeEndAttention - timeStartAttention);
    }

    public String getDescription() {
        return String.format("%s en %s (gravedad: %s)", type, location, severity);
    }

    public String toString() {
        return getDescription() + "Tiempo estimado: " + timeResponse + " minutos ";
    }

}
