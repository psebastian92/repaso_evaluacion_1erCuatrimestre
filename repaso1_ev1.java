package repaso_ev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class repaso1_ev1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Paso 1: Crear listas para almacenar DNI y apellidos
		List<Integer> DNIs = new ArrayList<>();
		List<String> apellidos = new ArrayList<>();

		// Relleno la lista de DNI.
		for (int i = 0; i < apellidos.size(); i++) {
			System.out.println("Ingrese un numero de DNI: ");
			DNIs.add(entrada.nextInt());
		}

		// Relleno la lista de apellidos.
		for (int i = 0; i < apellidos.size(); i++) {
			System.out.println("Ingrese el apellido del DNI numero " + (i + 1) + ":");
			apellidos.add(entrada.next());
		}

		// Paso 2: Ordenar listas utilizando el algoritmo de ordenamiento burbuja
		int n = DNIs.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (DNIs.get(j) > DNIs.get(j + 1)) {
					// Intercambiar DNI
					int tempDNI = DNIs.get(j);
					DNIs.set(j, DNIs.get(j + 1));
					DNIs.set(j + 1, tempDNI);

					// Intercambiar apellidos
					String tempApellido = apellidos.get(j);
					apellidos.set(j, apellidos.get(j + 1));
					apellidos.set(j + 1, tempApellido);
				}
			}
		}

		// Paso 3: Mostrar las listas ordenadas
		System.out.println("Lista de DNI ordenada:");
		for (int i = 0; i < DNIs.size(); i++) {
			System.out.println("El DNI " + (i + 1) + " es: " + DNIs.get(i));
		}
		System.out.println("Lista de apellidos ordenada:");
		for (int i = 0; i < apellidos.size(); i++) {
			System.out.println("Apellido " + (i + 1) + ": " + apellidos.get(i));
		}

		// Paso 4: Buscar un DNI ingresado por el usuario
		boolean buscarOtro = true;
		while (buscarOtro) {
			System.out.println("\nIngrese un numero de DNI a buscar: ");
			int DNI_buscado = entrada.nextInt();

			boolean encontrado = false;
			for (int i = 0; i < DNIs.size(); i++) {
				if (DNI_buscado == DNIs.get(i)) {
					System.out.println("El DNI " + DNI_buscado + " pertenece a: " + apellidos.get(i));
					encontrado = true;

					// Paso 5: Ofrecer opciones al usuario
					System.out.println("Que desea hacer?");
					System.out.println("1. Eliminar");
					System.out.println("2. Modificar");
					System.out.println("3. Salir del programa");
					int opcion = entrada.nextInt();

					switch (opcion) {
					case 1:
						// Eliminar elemento encontrado
						DNIs.remove(i);
						apellidos.remove(i);
						System.out.println("DNI eliminado correctamente.");
						break;
					case 2:
						// Modificar DNI, Apellido o ambos
						System.out.println("Que desea modificar?");
						System.out.println("1. DNI");
						System.out.println("2. Apellido");
						System.out.println("3. Ambos");
						int opcionModificar = entrada.nextInt();
						if (opcionModificar == 1 || opcionModificar == 3) {
							System.out.println("Ingrese nuevo DNI:");
							int nuevoDNI = entrada.nextInt();
							DNIs.set(i, nuevoDNI);
						}
						if (opcionModificar == 2 || opcionModificar == 3) {
							System.out.println("Ingrese nuevo apellido:");
							String nuevoApellido = entrada.next();
							apellidos.set(i, nuevoApellido);
						}
						System.out.println("Modificacion realizada correctamente.");
						break;
					case 3:
						System.out.println("Saliendo del programa.");
						buscarOtro = false;
						break;
					default:
						System.out.println("Opcion no valida.");
						break;
					}
					break; // Salir del bucle al encontrar el DNI buscado
				}
			}

			if (!encontrado) {
				System.out.println("El DNI buscado no existe en este programa.");
			}

			// Preguntar si desea buscar otro DNI
			System.out.println("Desea buscar otro DNI? (S/N)");
			String respuesta = entrada.next();
			if (!respuesta.equalsIgnoreCase("S")) {
				buscarOtro = false;
			}
		}

		entrada.close();
	}
}
