package Paquete;

import java.util.Scanner;

public class Principal {
	 public static void main(String[] args) {
		//Variables necesarias
	        int opc;
	        int resultado, a, b;
	        Calcula calculadora;

	        Scanner leer = new Scanner(System.in);
	        //Opción del menú
	        System.out.println("MENU");
	        System.out.println("1.-Suma\n2.-Resta\n3.-Multiplicación\n4.-División\n5.-Salir");
	        System.out.println("Seleccione una operación : ");
	        opc = leer.nextInt();
	        do {
	            switch (opc) {
	                case 1:
	                    System.out.println("Suma");
	                    a = ingresaNumeros(leer);
	                    b = ingresaNumeros(leer);
	                    calculadora = new Calcula(a, b);
	                    resultado = calculadora.Suma();
	                    System.out.println("Resultado de sumar " + a + "+" + b + "= " + resultado);

	                    break;

	                case 2:
	                    System.out.println("Resta");
	                    a = ingresaNumeros(leer);
	                    b = ingresaNumeros(leer);
	                    calculadora = new Calcula(a, b);
	                    resultado = calculadora.Resta();
	                    System.out.println("Resultado de restar " + a + "-" + b + "= " + resultado);
	                    break;

	                case 3:
	                    System.out.print("Multiplicación.");
	                    a = ingresaNumeros(leer);
	                    b = ingresaNumeros(leer);
	                    calculadora = new Calcula(a, b);
	                    resultado = calculadora.Multiplica();
	                    System.out.println("Resultado de multiplicar " + a + "*" + b + "= " + resultado);
	                    break;
	                case 4:
	                    System.out.print("División.");
	                    a = ingresaNumeros(leer);
	                    b = ingresaNumeros(leer);
	                    calculadora = new Calcula(a, b);
	                    resultado = calculadora.Divide();
	                    System.out.println("Resultado de dividir " + a + "/" + b + "= " + resultado);
	                    break;
	                default:
	                    System.out.print("Opción inválida.");

	            }
	            System.out.println("MENU");
	            System.out.println("1.-Suma\n2.-Resta\n3.-Multiplicación\n4.-División\n5.-Salir");
	            System.out.println("Seleccione una operación : ");
	            opc = leer.nextInt();

	        } while (opc != 5);
	    }//Fin de principal
	 public static int ingresaNumeros(Scanner leer) {
	        int a;
	        System.out.println("Ingrese un número :");
	        a = leer.nextInt();
	        return a;
	    }
}
