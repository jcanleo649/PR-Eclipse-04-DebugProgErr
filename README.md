# Práctica: Depuración de código en Eclipse.
---

## Errores identificados en el programa.

1. Al introducir el número de alumnos, si introduces el número 3, luego cuando te pida que introduzcas la nota de cada alumno y vas introduciendo la nota del alumno. Te llega a decir que introduzcas 4 alumnos en vez de 3, ya que el 0 tambien cuenta. Esto se debe porque la variable contador es igual a 0.
2. Si introducimos una nota de alumno mayor que 10 te da un error, pero aunque te de el error sigue ejecutando y puedes seguir poniendo las notas de los demas alumnos. Y al introducir todas las notas, te hace la media con el número introducido que era mayor que 10. Esto se debe a que la operación de sumar la nota esta dentro del bucle, donde se encuentra si la nota es mayor a 10 o menor que 0 te da un error. entonces suma todas las notas aunque sean mayor que 10 o menor que 0.
3. Si introducimos en el número de alumnos, un 0 o menos nos da por consola NaN. Esto se debe porque no hay ninguna funcion que te salga un error cuando introduzcas un número que sea igual o menor que 0.
4. Si introducimos en la nota del alumno un número con muchos decimales, nos hace la media con un monton de decimales. Esto se debe a que no hay un printf que solo deje 2 decimales.




Hecho por: Jhonatan Cano León.
