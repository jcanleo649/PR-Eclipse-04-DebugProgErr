package tema2_debug;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        double suma = 0;
        int numAlumnos = 0;
        
        System.out.print("Introduce el número de alumnos: ");
	    numAlumnos = sc.nextInt();
        
        if (numAlumnos <= 0) {
        	do {
				System.out.println("Error: El numero introducido es menor o igual que 0");
				
			} while (numAlumnos > 0);{
				System.out.print("Introduce el número de alumnos: ");
			    numAlumnos = sc.nextInt();
			}
        }
        while (contador <= numAlumnos) {
            System.out.print("Introduce la nota del alumno " + contador + ": ");
            double nota = sc.nextDouble();
   
            if (nota <0 || nota  >10) {
            	System.out.println("Error: la nota debe estar entre 0 y 10");
            }
                else {
                	suma = suma + nota;
                	contador++;
                }
        }

        double media = suma / numAlumnos;
        System.out.printf("La media del grupo es: %.1f", media);
        
        
        double nota;
		do {
			System.out.print("Introduce la nota del alumno numAlumno: ");
			nota = sc.nextDouble();
		} while (nota < 0 || nota > 10);

        sc.close();
    }
}