package Paquete;

import java.util.Scanner;

public class Principal {
	 public static void main(String[] args) {
		//Variables necesarias
	        int opc;
	        int resultado, a, b;
	        Calcula calculadora;

	        Scanner leer = new Scanner(System.in);
	        //Opci�n del men�
	        System.out.println("MENU");
	        System.out.println("1.-Suma\n2.-Resta\n3.-Multiplicaci�n\n4.-Divisi�n\n5.-Salir");
	        System.out.println("Seleccione una operaci�n : ");
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
	                    System.out.print("Multiplicaci�n.");
	                    a = ingresaNumeros(leer);
	                    b = ingresaNumeros(leer);
	                    calculadora = new Calcula(a, b);
	                    resultado = calculadora.Multiplica();
	                    System.out.println("Resultado de multiplicar " + a + "*" + b + "= " + resultado);
	                    break;
	                case 4:
	                    System.out.print("Divisi�n.");
	                    a = ingresaNumeros(leer);
	                    b = ingresaNumeros(leer);
	                    calculadora = new Calcula(a, b);
	                    resultado = calculadora.Divide();
	                    System.out.println("Resultado de dividir " + a + "/" + b + "= " + resultado);
	                    break;
	                default:
	                    System.out.print("Opci�n inv�lida.");

	            }
	            System.out.println("MENU");
	            System.out.println("1.-Suma\n2.-Resta\n3.-Multiplicaci�n\n4.-Divisi�n\n5.-Salir");
	            System.out.println("Seleccione una operaci�n : ");
	            opc = leer.nextInt();

	        } while (opc != 5);
	    }//Fin de principal
	 public static int ingresaNumeros(Scanner leer) {
	        int a;
	        System.out.println("Ingrese un n�mero :");
	        a = leer.nextInt();
	        return a;
	    }
}
