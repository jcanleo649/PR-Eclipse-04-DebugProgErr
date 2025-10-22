# Práctica: Depuración de código en Eclipse.
---

## Errores identificados en el programa.

1. Al introducir el número de alumnos, si introduces el número 3, luego cuando te pida que introduzcas la nota de cada alumno y vas introduciendo la nota del alumno. Te llega a decir que introduzcas 4 alumnos en vez de 3, ya que el 0 tambien cuenta. Esto se debe porque la variable contador es igual a 0.
2. Si introducimos una nota de alumno mayor que 10 te da un error, pero aunque te de el error sigue ejecutando y puedes seguir poniendo las notas de los demas alumnos. Y al introducir todas las notas, te hace la media con el número introducido que era mayor que 10. Esto se debe a que la operación de sumar la nota esta dentro del bucle, donde se encuentra si la nota es mayor a 10 o menor que 0 te da un error. entonces suma todas las notas aunque sean mayor que 10 o menor que 0.



Hecho por: Jhonatan Cano León.
