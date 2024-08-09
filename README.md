# Patrones de Diseño

## Integrantes
+ Juan David Cetina Gomez
+ Juliana Isabel Espinel Cortes
+ Ana Lucia Quintero Vargas

## Objetivo
Identificar un patrón de diseño que solucione los problemas presentados en cada punto y codificar la solución del ejercicio junto con su diagrama de clases (UML).

Por medio de las carpetas que van del punto 1 al 5, se pueden encontrar los códigos del ejercicio junto con sus respectivos diagramas de clases, que fueron diseñados a partir del tipo de patrón de diseño seleccionado para cubrir las necesidades de sus problemas.

## Solución punto 1


## Solución punto 2


## Solución punto 3

### Patrón de diseño para sistema de gestión de restaurantes

El patrón de diseño seleccionado para cubrir las necesidades del problema es Template Method.

### Justificación

Se eligió este patrón de diseño de comportamiento para el problema de gestión de restaurantes, debido a que este define el esqueleto de un algoritmo en una clase padre (procesamiento de órdenes) y permite que sus clases hijas puedan sobreescribir código sin alterar su estructura (pasos específicos según el tipo de pedido).

Esto evita la duplicación de código y la mala práctica de tener un exceso de condicionales, fomentando el uso de polimorfismo.

### UML

![Diagrama de clase](soluciones/punto3/GestionOrdenes.png)

Como se puede observar en el diagrama anterior, la clase abstracta Order define una estructura común para el procesamiento de órdenes, donde establece unos atributos y métodos enfocados en la toma del pedido, la preparación, la verificación de disponibilidad, el total del pedido, entre otros. Esta clase maneja un ArrayList de tipo Product, en el cual se puede agregar las comidas, bebidas o postres según se indique de acuerdo al tipo de pedido, siendo todas estas clases independientes que extienden de la clase abstracta Product.

De igual forma, se cuenta con clases que extienden de Order y que representan los tres tipos de pedidos que se manejan hasta el momento, las cuales son capaces de especificar sus propios comportamientos en ciertos métodos heredados como son la de verificar disponibilidad, preparar la orden y calcular el total del pedido.


## Solución punto 4

# Patrón de diseño para sistema de gestión de tareas

El patrón de diseño seleccionado para cubrir las necesidades del problema es Command.

## Justificación

Se ve adecuado implementar este patrón de diseño de comportamiento, ya que permite encapsular las acciones de comandos como crear, editar, completar y eliminar una tarea en objetos separados. Esto hace que se pueda trabajar con un intermediario que separa las acciones que los usuarios quieren realizar con la forma en que se ejecutan por detrás. De igual forma, facilita implementar operaciones de reversión y se está abierto a la expensión de nuevas funciones que se deseen incluir en el futuro sin la necesidad de modificar el código existente.

## UML
![Diagrama de clase](soluciones/punto4/GestionTareas.png)

Como se vislumbra en el diagrama de clases, se puede observar la clase abstracta Command que se encarga de declarar un método execute() para ejecutar la operación que le indique el usuario desde la clase User, que actua como el Invoker, que mantiene una referencia a un objeto Command y lo ejecuta. A partir de Command se pueden extender comandos concretos como el de crear, editar, completar y eliminar tareas. Asimismo, esta clase abstracta se encuentra asociada a la clase TaskOperation, que es la que tiene la lógica de negocio para saber cómo realizar las operaciones sobre una tarea.


## Solución punto 5

