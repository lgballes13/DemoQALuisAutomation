# Información General
Este proyecto es una automatización de pruebas para la pagina https://demoqa.com/ utilizando Serenity BDD con el patrón Screenplay en Java. Las pruebas se ejecutan en el navegador Chrome.

| N°  | Item              | Detalle          |
|-----|-------------------|------------------|
| 1   | Java              | 11.0.18          |
| 2   | Gradle            | 7.6              |
| 3   | Navegador         | Google Chrome    |
| 4   | Sistema Operativo | Windows 10 Pro   |
| 5   | Rama principal    | master           |

## Requisitos para la Ejecución

Antes de comenzar, asegúrate de tener instalados los siguientes componentes:

- [Java JDK 11] se deben configurar variables de entorno
- [Gradle 7.6] se debe configurar variable de entorno
- [IDE: IntelliJ o Eclipse]
- [ChromeDriver] el proyecto cuenta con un chromdriver para la versión 125.0.6422.141, si cuenta con una versión superior en su navegador de Google Chrome por favor descargar la versión correspondiente y reemplazar el archivho "chromedriver.exe" en la raiz del proyecto https://googlechromelabs.github.io/chrome-for-testing/
- [Plugin Cucumber for Java] se instala desde el IDE

## Descargar el código

**Clonar el repositorio:**
   ```bash
   git clone https://github.com/lgballes13/DemoQALuisAutomation.git

   cd DemoQALuisAutomation
  ```
## Ejecución de las pruebas

La herramienta de construcción y gestión de dependencias para este proyecto es Gradle. Para ejecutar las pruebas, utilice el siguiente comando en la raíz del proyecto.
  ```bash
  gradle clean test aggregate
  ```
## Reporte de las pruebas
El comando proporcionado para la ejecución de las pruebas generará un informe de prueba de Serenity en el archivo index.html ubicado en el directorio target/site/serenity. Además, puede encontrar las evidencias generadas por Cucumber en la ruta target/serenity-reports.

![image](https://github.com/user-attachments/assets/b0ab5d86-8cc4-47a3-8629-75e75c2a7426)


