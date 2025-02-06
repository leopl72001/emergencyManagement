package patterns;

public class ResourceController {
    private static ResourceController instance;

    private ResourceController() {} // Constructor privado

    public static ResourceController getInstance() {
        if (instance == null) {
            instance = new ResourceController();
        }
        return instance;
    }

    public void allocateResources(String emergencyType) {
        System.out.println("🚨 Asignando recursos para una emergencia de tipo: " + emergencyType);
    }
}