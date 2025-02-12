package view;

import java.util.List;
import java.util.Scanner;

import controller.EmergencySystem;
import models.Emergency; // Importar la clase Emergency
import patterns.factory.EmergencyFactory; // Importar la clase EmergencyFactory
import services.FireFighter; // Importar la clase FireFighter
import services.Ambulance; // Importar la clase Ambulance
import services.Police; // Importar la clase Police
import utils.EnumSeverityPriority;
import utils.EnumTypeEmergency;

public class Main {
    public static void main(String[] args) {
        EmergencySystem emergency = EmergencySystem.getInstance();
        initializeResources(emergency);
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n🚨 ===SISTEMA DE GESTIÓN DE EMERGENCIAS=== 🚨");
            System.out.println("1. Registrar una nueva emergencia");
            System.out.println("2. Ver estado de recursos disponibles");
            System.out.println("3. Atender una emergencia");
            System.out.println("4. Mostrar estadísticas del día");
            System.out.println("5. Finalizar jornada (cerrar sistema)");
            System.out.print("Seleccione una opción: ");

            int option = 0;
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Opción inválida. Intente de nuevo.");
                continue;
            }
            switch (option) {
                case 1:
                    registerEmergencyMenu(emergency, sc);
                    break;
                case 2:
                    emergency.showResourceStatus();
                    break;
                case 3:
                    attendEmergencyMenu(emergency, sc);
                    break;
                case 4:
                    emergency.showStatistics();
                    break;
                case 5:
                    System.out.println("Finalizando jornada...\n");
                    emergency.finalJornada();
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
        sc.close();
    }

    private static void initializeResources(EmergencySystem emergency) {
        emergency.registerResource(new Ambulance("AMB-2025-001 ", 4, 100));
        emergency.registerResource(new Ambulance("AMB-2025-002", 4, 100));
        emergency.registerResource(new Ambulance("AMB-2025-003", 4, 100));
        emergency.registerResource(new FireFighter("BOM-2025-001", 5, 100));
        emergency.registerResource(new FireFighter("BOM-2025-002", 5, 100));
        emergency.registerResource(new FireFighter("BOM-2025-003", 5, 100));
        emergency.registerResource(new Police("POL-2025-001", 5, 100));
        emergency.registerResource(new Police("POL-2025-002", 5, 100));
        emergency.registerResource(new Police("POL-2025-003", 5, 100));
    }

    private static void registerEmergencyMenu(EmergencySystem emergency, Scanner sc) {
        System.out.println("\n=== REGISTRAR NUEVA EMERGENCIA ===");
        System.out.println("1. Incendio");
        System.out.println("2. Accidente Vehicular");
        System.out.println("3. Robo");
        System.out.print("Seleccione el tipo: ");

        EnumTypeEmergency type = null;
        switch (Integer.parseInt(sc.nextLine())) {
            case 1:
                type = EnumTypeEmergency.FIRE;
                break;
            case 2:
                type = EnumTypeEmergency.VEHICULAR_ACCIDENT;
                break;
            case 3:
                type = EnumTypeEmergency.ROBBERY;
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        System.out.print(
                "Ingrese ubicación (ejemplo: villa maria, villa linda, villa sol, villa adela, villa rey): ");
        String location = sc.nextLine();

        System.out.print("Ingrese nivel de gravedad (1. Bajo, 2. Medio, 3. Alto): ");
        int severityOption = Integer.parseInt(sc.nextLine());

        EnumSeverityPriority severity = null;
        switch (severityOption) {
            case 1:
                severity = EnumSeverityPriority.BAJA;
                break;
            case 2:
                severity = EnumSeverityPriority.MEDIO;
                break;
            case 3:
                severity = EnumSeverityPriority.ALTA;
                break;
            default:
                System.out.println("Opción inválida, seleccione un valor entre 1 y 3.");
                return;
        }

        System.out.print("Ingrese tiempo de respuesta (en minutos): ");
        int timeResponse = Integer.parseInt(sc.nextLine());

        Emergency newEmergency = EmergencyFactory.createEmergency(type, location, severity, timeResponse);

        if (newEmergency == null) {
            System.out.println("Tipo de emergencia inválido.");
            return; // Termina el método si la emergencia no es válida
        }

        emergency.registerNewEmergency(newEmergency);
        System.out.println("Emergencia registrada: " + newEmergency);
    }

    private static void attendEmergencyMenu(EmergencySystem emergency, Scanner sc) {
        List<Emergency> emergencies = emergency.getPendingEmergencies();
        if (emergencies.isEmpty()) {
            System.out.println(" No hay emergencias pendientes.");
            return;
        }
        System.out.println("\n=== ATENDER EMERGENCIA ===");
        for (int i = 0; i < emergencies.size(); i++) {
            System.out.println(i + 1 + ". " + emergencies.get(i).toString());
        }
        System.out.print("Seleccione una emergencia: ");
        int option = Integer.parseInt(sc.nextLine());
        if (option < 1 || option > emergencies.size()) {
            System.out.println("Opción inválida");
            return;
        }
        Emergency emergencyToAttend = emergencies.get(option - 1);
        emergency.addressEmergency(emergencyToAttend);
    }

}