# Patrón de Diseño para sistema de gestión de tareas

El patron de diseño seleccionado para cubrir las necesidades del problema: Compose

## Justificación

Se ve adecuado implementar este patrón de diseño estructural, ya que permite componer objetos en estructuras de árbol, lo cual hace que su estructura se pueda manejar como si fueran objetos independientes. 

Siguiendo esta idea, el sistema de gestión de tareas puede representarse bajo este tipo de jerarquia, donde se pueden encapsular las acciones o comandos de crear, editar, completar y eliminar una tarea en objetos separados. 

Esto hace que se pueda trabajar con un intermediario que separa las acciones que los usuarios quieren realizar con la forma en que se ejecutan por detrás. Asimismo, facilita implementar operaciones de reversión y se está abierto a la expensión de nuevas funciones a incluir en el futuro.

## UML
![Diagrama de clase](GestionTareas.png)