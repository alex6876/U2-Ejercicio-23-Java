# 📊 Simulación de Sistema de Generación de Reportes (POO e Interfaces en Java)

Este proyecto es una aplicación en Java que modela un sistema flexible de generación y exportación de reportes institucionales. Pone en práctica el uso de **interfaces**, **polimorfismo** y el patrón de diseño de comportamiento (Strategy) para intercambiar dinámicamente formatos de salida (PDF, Excel y HTML) en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza mediante una interfaz contractual y múltiples implementaciones concretas:

*   **`GeneradorReporte` (Interfaz)**: Define el contrato común que toda estrategia de reporte debe cumplir mediante el método `exportar(String contenido)`.
*   **`ReportePDF`**, **`ReporteExcel`** y **`ReporteHTML`**: Clases concretas que implementan la interfaz. Cada una define su propia estructura de presentación y formato específico para renderizar los datos por consola.
*   **`SistemaGestion`**: Actúa como el contexto o invocador principal que procesa la solicitud comercial.
    *   **Atributos:** Mantiene una referencia privada de tipo `GeneradorReporte`.
    *   **Métodos principales:** 
        *   `procesarReporte(String contenido)`: Delega la exportación al generador activo.
        *   `cambiarGenerador(GeneradorReporte generador)`: Permite actualizar la estrategia de formato de forma dinámica en tiempo de ejecución.
*   **`Main`**: Punto de entrada del programa. Instancia los distintos generadores de reportes, configura el sistema de gestión y simula exportaciones sucesivas cambiando el formato sobre la marcha.

---

## ⚙️ Conceptos Clave de POO y Patrones Aplicados

1. **Polimorfismo por Interfaces:** El `SistemaGestion` interactúa con los generadores a través del tipo genérico `GeneradorReporte`, desconociendo si el reporte final será PDF, Excel u HTML.
2. **Inyección de Dependencias y Patrón Strategy:** La estrategia de exportación se inyecta inicialmente por constructor y puede modificarse en tiempo de ejecución mediante `cambiarGenerador()`.
3. **Principio Abierto/Cerrado (OCP):** Es posible añadir nuevos formatos de exportación (ej. `ReporteJSON`, `ReporteCSV`) simplemente creando una nueva clase que implemente la interfaz, sin alterar el código existente del sistema de gestión.
4. **Desacoplamiento de Lógica de Negocio:** La lógica encargada de estructurar el formato de salida se encuentra encapsulada de forma independiente en cada clase específica.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera la siguiente salida formateada para cada formato:

```text
=== REPORTE PDF ===
Generando archivo PDF...
Contenido: Ventas: $150000, Clientes: 25, Productos: 80
Reporte PDF exportado con exito.

=== REPORTE EXCEL ===
Generando archivo Excel...
| Datos del reporte |
| Ventas: $150000, Clientes: 25, Productos: 80 |
Reporte Excel exportado con exito.

=== REPORTE HTML ===
<html>
<body>
<h1>Reporte</h1>
<p>Ventas: $150000, Clientes: 25, Productos: 80</p>
</body>
</html>
Reporte HTML exportado con exito.
