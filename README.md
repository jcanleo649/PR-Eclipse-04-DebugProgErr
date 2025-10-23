# Práctica: Depuración de código en Eclipse.
---

## Errores identificados en el programa.

1. Al introducir el número de alumnos, si introduces el número 3, luego cuando te pida que introduzcas la nota de cada alumno y vas introduciendo la nota del alumno. Te llega a decir que introduzcas 4 alumnos en vez de 3, ya que el 0 tambien cuenta. Esto se debe porque la variable contador es igual a 0.
2. Si introducimos una nota de alumno mayor que 10 te da un error, pero aunque te de el error sigue ejecutando y puedes seguir poniendo las notas de los demas alumnos. Y al introducir todas las notas, te hace la media con el número introducido que era mayor que 10. Esto se debe a que la operación de sumar la nota esta dentro del bucle, donde se encuentra si la nota es mayor a 10 o menor que 0 te da un error. entonces suma todas las notas aunque sean mayor que 10 o menor que 0.
3. Si introducimos en el número de alumnos, un 0 o menos nos da por consola NaN. Esto se debe porque no hay ninguna funcion que te salga un error cuando introduzcas un número que sea igual o menor que 0.
4. Si introducimos en la nota del alumno un número con muchos decimales, nos hace la media con un monton de decimales. Esto se debe a que no hay un printf con %.1f que solo deje 1 decimal.

## ¿Como he detectado los errores?

Los he detectado depurando, mientras depuraba probaba valores que no deberia permitirse.

## Cambios que hice para corregirlos
1. Para corregir el apartado 1 de errores identificados, a la variable contador le quite el 0 y le añadi un 1. int contador = 1;
2. Para corregir el apartado 2 de errores identificados, donde estaba iel if de nota, lo deje tal cual, y seguido le puse un else que hacia lo siguiente: suma = suma + nota; contador ++;
3. Para corregir el apartado 3 de errores identificados, cree una variable de tipo entero numAlumnos = 0. Y luego cree un if que si el numero de alumnos era menor o igual a 0, entraba en un do que te daba un error, y un while que si era mas grande que 0 me pedia otra vez los numeros de alumnos.
4. Para corregir el apartado 4 de errores identificados, cambie el println que daba la media por un printf y dentro de las dobles comillas en la ultima parte del texto añadi %.1f", media. Esto daba la media con un solo decimal.

## Configura un breakpoint condicional

En mi caso queria añadir un breakpoint condicional en la siguiente función: 
if (nota <0 || nota  >10) {
            	System.out.println("Error: la nota debe estar entre 0 y 10");
            }
entonces cree en la linea del if un breakpoint, despues le di al click derecho del raton y me fui a "breakpoints propierties". Una vez dentro le di a la opción de "conditional" y "Suspend when true". Despues escribi en el cuadro de texto lo siguiente:
nota <0 || nota > 10. Por ultimo le di a "Apply and Close".

Hecho por: Jhonatan Cano León.
