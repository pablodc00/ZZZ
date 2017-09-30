package com.dummy.herencias;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculoPerimetro {

	public static void main(String[] args) throws IOException {

		System.out.println("TRABAJO PRÁCTICO 3 - Cálculo de perímetro");
		System.out.println("Seleccione la figura con la que desea trabajar");
		System.out.println("A. Cuadrado");
		System.out.println("B. Rectángulo");
		System.out.println("C. Triángulo");
		System.out.println("D. Salir");
		String figuraSeleccionada = null;
		char opcionFigura; // línea 1

		do
		{
			System.out.println("Seleccione una opción (A, B, C, D): ");
			opcionFigura = (char) System.in.read();
			System.out.println("Opción seleccionada: " + opcionFigura);
			System.in.read(); // Se elimina del buffer de entrada el caracter <Enter>

			switch (opcionFigura) // línea 2
			{
			case 'A':
				figuraSeleccionada = "Cuadrado";
				break; // línea 3
			case 'B':
				figuraSeleccionada = "Rectángulo";
				break; // línea 4
			case 'C':
				figuraSeleccionada = "Triángulo";
				break; // línea 5
			case 'D':
				System.out.println("Saliendo de la aplicación");
				break;
			default: // línea 6
				System.out.println("Opción ingresada incorrecta.");
			}
		}
		while (opcionFigura != 'A' && opcionFigura != 'B' && opcionFigura != 'C' && opcionFigura != 'D'); // línea 7

		if (figuraSeleccionada != null) {
			// Ingreso de datos sobre la figura
			System.out.println("Usted decidió calcular el perímetro de un: "+ figuraSeleccionada);
			float perimetroFigura = 0; // línea 8
			System.out.println("Ingrese los datos solicitados");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			// línea 9
			if (figuraSeleccionada.equals("Cuadrado")) {
				System.out.println("Ingrese el largo de un lado del Cuadrado: ");
				float lado_Cuadrado = Float.parseFloat(br.readLine());
				perimetroFigura = lado_Cuadrado * 4;
			} else if (figuraSeleccionada.equals("Rectángulo")) {
				System.out.println("Ingrese el largo del lado más corto del Rectángulo: ");
				float ladoCorto_Rectangulo = Float.parseFloat(br.readLine());
				System.out.println("Ingrese el largo del lado más largo del Rectángulo: ");
				float ladoLargo_Rectangulo = Float.parseFloat(br.readLine());
				perimetroFigura = (ladoCorto_Rectangulo * 2) + (ladoLargo_Rectangulo * 2);

			} else if (figuraSeleccionada.equals("Triángulo")) {
				System.out.println("Ingrese el largo del lado 1 del Triángulo: ");
				float lado1_Triangulo = Float.parseFloat(br.readLine());
				System.out.println("Ingrese el largo del lado 2 del Triángulo: ");
				float lado2_Triangulo = Float.parseFloat(br.readLine());
				System.out.println("Ingrese el largo del lado 3 del Triángulo: ");
				float lado3_Triangulo = Float.parseFloat(br.readLine());
				perimetroFigura = lado1_Triangulo + lado2_Triangulo + lado3_Triangulo;

			}

			System.out.println("RESULTADO");
			System.out.println("El perímetro de la figura "+ figuraSeleccionada + " es igual a: " + perimetroFigura);
		}
	}

}
