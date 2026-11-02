Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Cálculo Geométrico (Herencia, Polimorfismo y Métodos de Cálculo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 📐 Simulación de Cálculo de Figuras Geométricas (Herencia y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema de cálculo matemático para figuras geométricas, implementando una jerarquía de clases mediante herencia para administrar formas bidimensionales (círculos y rectángulos) con reglas especializadas para el cálculo de áreas y perímetros. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la reutilización de constructores e invocación de métodos mediante `super`, la sobrescritura polimórfica de métodos (`@Override`) y el formato avanzado de salidas numéricas en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base general, sus respectivas subclases especializadas y un punto de ejecución:

* **`FiguraGeometrica`**: Clase base que centraliza los atributos y comportamientos comunes de cualquier forma geométrica.
* **Atributo protegido (`protected`)**: `color`, permitiendo que las clases hijas accedan directamente a la propiedad cromática de la figura.
* **Constructor**: Inicializa el color de la figura geométrica.
* **Métodos operativos**:
* `calcularArea()` / `calcularPerimetro()`: Métodos base que retornan un valor predeterminado (`0`), diseñados para ser sobrescritos por las subclases.
* `mostrarInformacion()`: Imprime por consola el color de la figura.




* **`Circulo`**: Extiende de `FiguraGeometrica` para modelar figuras circulares perfectas.
* **Atributo privado (`private`)**: `radio`.
* **Constructor**: Invoca a `super(color)` para inicializar el color heredado y configura el radio del círculo.
* **Sobrescritura (`@Override`)**:
* `calcularArea()`: Calcula el área utilizando la fórmula estándar (`Math.PI * radio * radio`).
* `calcularPerimetro()`: Calcula la longitud de la circunferencia (`2 * Math.PI * radio`).
* `mostrarInformacion()`: Reutiliza `super.mostrarInformacion()` y despliega por consola el radio, el área y el perímetro formateados a dos decimales.




* **`Rectangulo`**: Extiende de `FiguraGeometrica` para modelar polígonos de cuatro lados rectos.
* **Atributos privados (`private`)**: `base` y `altura`.
* **Constructor**: Utiliza `super(color)` y asigna la base y la altura del rectángulo.
* **Sobrescritura (`@Override`)**:
* `calcularArea()`: Calcula el área multiplicando la base por la altura.
* `calcularPerimetro()`: Calcula el perímetro sumando los lados mediante la fórmula `2 * (base + altura)`.
* `mostrarInformacion()`: Muestra el color mediante `super`, detalla las dimensiones de base y altura, y presenta el área y perímetro con formato de dos decimales.




* **`Main`**: Punto de entrada del programa. Instancia un círculo rojo y dos rectángulos (azul y verde) con medidas específicas, e invoca sus métodos de visualización para imprimir por consola las características completas de cada figura.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Cálculo Polimórfico de Métricas:** Cada figura implementa sus propios algoritmos matemáticos para calcular áreas y perímetros adaptados a su geometría particular.
2. **Formato Profesional de Salidas Numéricas:** El uso de `System.out.printf` permite redondear y presentar los resultados de áreas y perímetros de manera limpia y estandarizada a dos decimales.
3. **Reutilización Estructural con `super`:** Las subclases delegan la impresión del color a la clase base, evitando duplicación de código en la presentación de datos.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
===== FIGURAS GEOMÉTRICAS =====

--- CÍRCULO ---
Color: Rojo
Radio: 5.0
Área: 78,54
Perímetro: 31,42

--- RECTÁNGULO 1 ---
Color: Azul
Base: 10.0
Altura: 5.0
Área: 50,00
Perímetro: 30,00

--- RECTÁNGULO 2 ---
Color: Verde
Base: 8.0
Altura: 4.0
Área: 32,00
Perímetro: 24,00

```

---

## 🚀 Conceptos de Programación Aplicados

* **Jerarquía Geométrica:** Modelado de formas espaciales mediante una estructura limpia de herencia orientada a objetos.
* **Sobrescritura de Métodos (`@Override`):** Implementación dinámica de operaciones matemáticas especializadas según la naturaleza de cada figura.
* **Diseño Modular:** Clara separación entre la lógica del dominio matemático y la ejecución de pruebas en el cliente (`Main`).
