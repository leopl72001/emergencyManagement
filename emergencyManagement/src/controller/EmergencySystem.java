package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import models.Emergency;
import models.FireEmergency;
import models.RobberyEmergency;
import models.VehicleAccidentEmergency;
import models.interfaces.IemergencyService;
import patterns.observer.EmergencyObserver;
import patterns.observer.EmergencySubject;
import patterns.strategy.StrategyPriority;
import patterns.strategy.StretegySeverityPriority;
import services.Ambulance;
import services.FireFighter;

public class EmergencySystem implements EmergencySubject {
    private static EmergencySystem instance;
    private List<Emergency> emergencies;
    private List<IemergencyService> resources;
    private List<EmergencyObserver> observers;
    

    private StrategyPriority strategyPriority;

    private int emergencieaAttended;
    private long totalTimeAttention;

    private EmergencySystem() {
        strategyPriority = new StretegySeverityPriority();
        emergencies = new ArrayList<>();
        resources = new ArrayList<>();
        observers = new ArrayList<>();
        emergencieaAttended = 0;
        totalTimeAttention = 0;

    }

    public static EmergencySystem getInstance() {
        if (instance == null) {
            instance = new EmergencySystem();
        }
        return instance;
    }

    @Override
    public void addObserver(EmergencyObserver observer) {
        observers.add(observer);
    }

    

    @Override
    public void removeObserver(EmergencyObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Emergency emergency) {
        for (EmergencyObserver observerEmergency : observers) {
            observerEmergency.update(emergency);
        }
    }

    public void registerResource(IemergencyService resource) {
        resources.add(resource);
    }

    public void showResourceStatus() {
        System.out.println("Recursos disponibles: ");
        for (IemergencyService resource : resources) {
            System.out.println(resource.toString());
        }
    }

    public List<IemergencyService> filterResourcesAvailable() {
        return resources.stream()
                .filter(r -> r.isAvailable())
                .collect(Collectors.toList());
    }

    public void registerNewEmergency(Emergency e) {
        emergencies.add(e);
        notifyObservers(e);

    }

    public List<Emergency> getPendingEmergencies() {
        return emergencies.stream()
                .filter(e -> !e.isAttended())
                .collect(Collectors.toList());
    }

    public void assignResourcesEmergency(Emergency emergency) {
        List<IemergencyService> resourcesAvailable = filterResourcesAvailable();
        if (resourcesAvailable.isEmpty()) {
            System.out.println("No hay recursos disponibles para atender la emergencia");
            return;
        }
        System.out.println("Asignando recursos para la emergencia... ");
        if (emergency instanceof FireEmergency) {
            for (IemergencyService resource : resourcesAvailable) {
                if (resource instanceof FireFighter) {
                    resource.addressEmergency(emergency);
                    break;
                }
            }

        } else if (emergency instanceof VehicleAccidentEmergency) {
            for (IemergencyService resource : resourcesAvailable) {
                if (resource instanceof Ambulance) {
                    resource.addressEmergency(emergency);
                    break;
                }
            }
        } else if (emergency instanceof RobberyEmergency) {
            for (IemergencyService resource : resourcesAvailable) {
                if (resource instanceof Ambulance) {
                    resource.addressEmergency(emergency);
                    break;
                }
            }
        }
    }

    public void addressEmergency(Emergency e) {
        if (e.isAttended()) {
            System.out.println("La emergencia ya fue atendida");
            return;
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        e.endAttention();
        System.out.println("emergencia atendida: " + e.getDescription());
        emergencieaAttended++;
        totalTimeAttention += e.getTimeResponse();
    }

    public void showStatistics() {
        System.out.println(" \nEstadisticas: ");
        System.out.println("Emergencias atendidas: " + emergencieaAttended);

        long averageMs = 0;
        if (emergencieaAttended > 0) {
            averageMs = totalTimeAttention / emergencieaAttended;
        }
        double averageS = averageMs / 1000.0;
        System.out.println("Tiempo promedio de atencion: " + averageS + " segundos");
        long notAttended = emergencies.stream()
                .filter(e -> !e.isAttended())
                .count();
        System.out.println("Emergencias no atendidas: " + notAttended);
    }

    public void finalJornada() {
        showStatistics();
        System.out.println("guardando registro del día (simulado)...");
        System.out.println("Sistema preparado para siguiente ciclo. ");
        ;
    }

    public void setStrategyPrioridad(StrategyPriority nuwSrategy) {
       strategyPriority = nuwSrategy;
    }
}
