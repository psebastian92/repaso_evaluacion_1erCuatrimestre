package repaso_ev;

import java.util.Scanner;

public class repaso2_ev {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Armo los arrays pedidos para las personas.
		String[] apellido = { "Perez", "Gomez", "Ugarte" };
		int[] edad = { 30, 26, 28 };
		int[] DNI = { 37589784, 42888567, 46947858 };

		// Armo los arrays pedidos para los autom�viles.
		String[] marca = { "Chevrolet", "Peugeot", "Renault" };
		String[] modelo = { "Corsa", "208", "Sandero" };
		int[] anio = { 2018, 2021, 2022 };
		String[] patente = { "AD178JK", "AD200RS", "AD202VW" };

		// Armo el for para que recorra los arrays.
		for (int i = 0; i < apellido.length; i++) {
			// Coloco en el IF las condiciones solicitadas.
			if (anio[i] > 2020 && edad[i] > 25) {
				System.out.println("El auto " + marca[i] + " " + modelo[i] + " con patente " + patente[i]
						+ ", año: " + anio[i] + ", pertenece a: " + apellido[i] + " con DNI: " + DNI[i]);

			}
		}

		// Elemento a modificar
		System.out.println("-------------");
		System.out.println("Desea modificar algun elemento? ");
		for (int i = 0; i < apellido.length; i++) {
			System.out.println((i + 1) + ".: " + patente[i]);
		}
		System.out.println("Ingrese opcion segun la lista de patentes dada: ");
		int OpcionPatenteIngresada = entrada.nextInt();

		System.out.println("Que dato desea modificar?");
		System.out.println("1. Apellido");
		System.out.println("2. Edad");
		System.out.println("3. DNI");
		System.out.println("4. Marca");
		System.out.println("5. Modelo");
		System.out.println("6. Año");
		System.out.println("7. Patente");
		System.out.println("8. NO MODFICAR");
		int OpcionAModificar = entrada.nextInt();

		for (int i = 0; i < patente.length; i++) {

			if (OpcionPatenteIngresada == i + 1) { // Buscamos la patente ingresada.
													// Sumamos 1 a "i", porque las opciones comienzan de 1, y los arrays
													// de 0.

				// A continuacion, se van a armar estructuras if - else if segun la opcion
				// ingresada. Podría armarse tambien con switch.

				switch (OpcionAModificar) {
				case 1:
					System.out.println("Ingresa nuevo apellido");
					apellido[i] = entrada.next();
					break;
				case 2:
					System.out.println("Ingresa nueva edad");
					edad[i] = entrada.nextInt();
					break;
				case 3:
					System.out.println("Ingresa nuevo DNI");
					DNI[i] = entrada.nextInt();
					break;
				case 4:
					System.out.println("Ingresa nueva marca del vehiculo");
					marca[i] = entrada.next();
					break;
				case 5:
					System.out.println("Ingresa nuevo modelo del vehiculo");
					modelo[i] = entrada.next();
					break;
				case 6:
					System.out.println("Ingresa nuevo año del vehiculo");
					anio[i] = entrada.nextInt();
					break;
				case 7:
					System.out.println("Ingresa nueva patente del vehiculo");
					patente[i] = entrada.next();
					break;
				case 8:
					System.err.println("SALIENDO DEL PROGRAMA.");
					return;
				default:
					System.out.println("Opcion no valida");
					break;
				}

				System.out.println("Registro completo modificado: ");
				System.out.println("El auto " + marca[i] + " " + modelo[i] + " con patente " + patente[i]
						+ ", año: " + anio[i] + ", pertenece a: " + apellido[i] + " con DNI: " + DNI[i]);
			}
		}

	}

}
