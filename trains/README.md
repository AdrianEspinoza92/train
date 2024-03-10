# Train System Problem Solver

Este proyecto es una implementación en Java de un solucionador de problemas de un sistema de trenes. Permite resolver varios tipos de consultas sobre una red de rutas ferroviarias predefinidas.

## Contenido del Proyecto

El proyecto consta de tres clases principales:

1. `Graph`: Representa el grafo que contiene las conexiones entre las diferentes ciudades.
2. `Route`: Representa una ruta entre dos ciudades, con su respectiva distancia.
3. `TrainProblemSolver`: Clase que proporciona métodos para resolver diferentes tipos de problemas en el sistema de trenes, como encontrar la distancia entre ciudades, calcular rutas con un número máximo o exacto de paradas, encontrar la ruta más corta, etc.

## Uso

1. **Compilación**: Para compilar el proyecto, asegúrate de tener instalado Java JDK en tu sistema y ejecuta el comando `javac *.java` en el directorio raíz del proyecto.
2. **Ejecución**: Después de compilar, puedes ejecutar el programa con el comando `java org.group.TrainSystem`.
3. **Interacción**: El programa imprimirá en la consola los resultados de varias consultas predefinidas en el método `main` de la clase `TrainSystem`. Puedes modificar estas consultas según sea necesario para probar diferentes casos de uso.
4. **Personalización**: Si deseas utilizar tus propios datos o realizar consultas adicionales, puedes modificar el método `buildGraph` en la clase `TrainSystem` para agregar nuevas rutas o ajustar las existentes.

## Ejemplos de Consulta

Aquí hay algunos ejemplos de consultas que se pueden realizar utilizando este solucionador de problemas:

1. Calcular la distancia de una ruta específica, por ejemplo, "ABC".
2. Encontrar el número de rutas que comienzan en una ciudad y terminan en otra, con un número máximo o exacto de paradas.
3. Encontrar la ruta más corta entre dos ciudades.
4. Determinar el número de rutas posibles entre dos ciudades dentro de una distancia máxima.

## Contribuciones

¡Las contribuciones son bienvenidas! Si encuentras algún error o deseas mejorar este proyecto, siéntete libre de crear un "issue" o enviar un "pull request" en GitHub.
