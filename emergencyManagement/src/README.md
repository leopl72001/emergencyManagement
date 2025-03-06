# Sistema de Gestión de Emergencias Urbanas 🚨 / Urban Emergency Management System 🚨

Este proyecto es una aplicación basada en consola que simula un sistema de gestión de emergencias urbanas. Permite registrar diferentes tipos de emergencias, asignar recursos (bomberos, ambulancias, policía), y monitorear el progreso de las emergencias en tiempo real. El sistema está diseñado para ayudar en la toma de decisiones rápidas y efectivas en situaciones críticas.

This project is a console-based application that simulates an urban emergency management system. It allows registering different types of emergencies, assigning resources (firefighters, ambulances, police), and monitoring the progress of emergencies in real-time. The system is designed to assist in making quick and effective decisions in critical situations.

## Características principales / Main Features

- **Registro de emergencias**: Permite registrar emergencias de tipo incendio, accidente vehicular y robo, especificando la ubicación, nivel de gravedad y tiempo de respuesta.
- **Asignación de recursos**: Asigna automáticamente los recursos disponibles (bomberos, ambulancias, policía) según la gravedad y tipo de emergencia.
- **Monitoreo de emergencias**: Muestra el progreso de las emergencias en tiempo real, indicando el porcentaje de resolución.
- **Estadísticas**: Al finalizar la jornada, el sistema genera un resumen con métricas clave como el número de emergencias atendidas, tiempo promedio de respuesta y recursos utilizados.

- **Emergency registration**: Allows registering emergencies of type fire, vehicular accident, and robbery, specifying the location, severity level, and response time.
- **Resource allocation**: Automatically assigns available resources (firefighters, ambulances, police) based on the severity and type of emergency.
- **Emergency monitoring**: Shows the progress of emergencies in real-time, indicating the resolution percentage.
- **Statistics**: At the end of the day, the system generates a summary with key metrics such as the number of emergencies attended, average response time, and resources used.

## Requisitos / Requirements

- **Java JDK 11 o superior**: El proyecto está desarrollado en Java, por lo que necesitarás tener instalado el JDK para compilar y ejecutar el código.
- **IDE recomendado**: IntelliJ IDEA, Eclipse o cualquier otro IDE que soporte Java.

- **Java JDK 11 or higher**: The project is developed in Java, so you will need to have the JDK installed to compile and run the code.
- **Recommended IDE**: IntelliJ IDEA, Eclipse, or any other IDE that supports Java.

## Estructura del proyecto / Project Structure

El proyecto está organizado en los siguientes paquetes:

The project is organized into the following packages:

- **controller**: Contiene la lógica principal del sistema, incluyendo la gestión de emergencias y recursos.
- **models**: Define las clases principales como `Emergency` que representa una emergencia.
- **patterns.factory**: Implementa el patrón de diseño Factory para crear instancias de emergencias según su tipo.
- **services**: Contiene las clases que representan los servicios de emergencia (bomberos, ambulancias, policía).
- **utils**: Define enumeraciones como `EnumLocation`, `EnumSeverityPriority` y `EnumTypeEmergency` para gestionar ubicaciones, niveles de gravedad y tipos de emergencia.
- **view**: Contiene la clase `Main` que maneja la interacción con el usuario a través de la consola.

- **controller**: Contains the main logic of the system, including emergency and resource management.
- **models**: Defines the main classes such as `Emergency` which represents an emergency.
- **patterns.factory**: Implements the Factory design pattern to create instances of emergencies based on their type.
- **services**: Contains the classes that represent emergency services (firefighters, ambulances, police).
- **utils**: Defines enumerations such as `EnumLocation`, `EnumSeverityPriority`, and `EnumTypeEmergency` to manage locations, severity levels, and types of emergencies.
- **view**: Contains the `Main` class that handles user interaction through the console.

## Ejecución del programa / Running the Program

1. Clona el repositorio o descarga el código fuente.
2. Abre el proyecto en tu IDE.
3. Ejecuta la clase `Main` ubicada en el paquete `view`.

1. Clone the repository or download the source code.
2. Open the project in your IDE.
3. Run the `Main` class located in the `view` package.

### Flujo del programa / Program Flow

1. **Inicio del sistema**: El sistema se inicia con una configuración inicial de recursos disponibles (bomberos, ambulancias, policía).
2. **Menú de opciones**:
   - **Registrar una nueva emergencia**: Permite ingresar detalles sobre la emergencia (tipo, ubicación, gravedad, tiempo de respuesta).
   - **Ver estado de recursos disponibles**: Muestra el estado actual de los recursos (vehículos, personal, combustible).
   - **Atender una emergencia**: Permite asignar recursos a una emergencia específica.
   - **Mostrar estadísticas del día**: Muestra métricas clave al finalizar la jornada.
   - **Finalizar jornada**: Cierra el sistema y genera un resumen de las operaciones realizadas.

1. **System startup**: The system starts with an initial configuration of available resources (firefighters, ambulances, police).
2. **Menu options**:
   - **Register a new emergency**: Allows entering details about the emergency (type, location, severity, response time).
   - **View available resource status**: Shows the current status of resources (vehicles, personnel, fuel).
   - **Attend an emergency**: Allows assigning resources to a specific emergency.
   - **Show daily statistics**: Displays key metrics at the end of the day.
   - **End day**: Closes the system and generates a summary of the operations performed.

## Ejemplo de uso / Example Usage

1. Al iniciar el programa, se mostrará un menú con las siguientes opciones:

2. Select option 1 to register a new emergency. The system will prompt you to enter the type of emergency, location, severity level, and response time.

3. Once the emergency is registered, you can select option 3 to attend it. The system will automatically assign the necessary resources.

4. At the end of the day, select option 5 to view the day's statistics and close the system.

## Contribuciones / Contributions

Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:

If you wish to contribute to this project, please follow these steps:

1. Haz un fork del repositorio.
2. Crea una rama para tu nueva funcionalidad (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -m 'Añadir nueva funcionalidad'`).
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

1. Fork the repository.
2. Create a branch for your new feature (`git checkout -b feature/new-feature`).
3. Make your changes and commit them (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature/new-feature`).
5. Open a Pull Request.

## Licencia / License

Este proyecto está bajo la licencia MIT. Para más detalles, consulta el archivo [LICENSE](LICENSE).

This project is licensed under the MIT License. For more details, see the [LICENSE](LICENSE) file.

## Contacto / Contact

Si tienes alguna pregunta o sugerencia, no dudes en contactarme a través de [correo electrónico](mailto:tuemail@example.com).

If you have any questions or suggestions, feel free to contact me via [email](mailto:youremail@example.com).
