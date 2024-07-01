/*
 * Generá el algoritmo para las siguientes condiciones:
Se tienen tres arryas de tres propietarios con los siguientes datos:
Se tiene un array con los apellidos de los propietarios.
Se debe tener además, un  array con su edad.
Un último array con su numero de DNI.
Estos tres arrays, deben crearse por PROGRAMA.
Se poseen también cuatro arryas (también por programa) para  tres automóviles automóviles, con los siguientes datos:
Array con la marca del vehículo: 

BMW, Peugeot y Renault.
Array con el nombre del modelo: Z3, 208 y Sandero.
Array con el año del vehículo: 2021, 2018, 2022.
Array con la patente de cada auto: AD178JK, AD200RS, AD202VW.
Cada posición en el array, es importante para relacionarse con el resto de los 

arrays . Por ejemplo, el segundo auto es: Peugeot 208, año 2018, patente AD200RS.
El objetivo, es crear un algoritmo que muestre en pantalla únicamente a los modelos con año superior a 2020, y además donde el conductor tenga mas de 25 años.

Ejemplo: "El auto BMW Z3 del año 2021, patente AD178JK, pertenece a Muñoz, que tiene 30 años, y su DNI es 54789534".

Por último, preguntarle al usuario si desea modificar algún elemento. Para ello, mostrale todas las patentes disponibles, y solicitale que ingrese el número de patente del auto a modificar (1. AD178JK, 2. AD200RS, 3. AD202VW) . Preguntar qué desea cambiar (apellido, edad, dni, marca, modelo, año, o patente).  Podés armar otras opciones mostradas en el syso (1. Apellido, 2. Edad, 3. DNI, etc.), para facilitar la búsqueda. 

Finalmente, volver a mostrar en pantalla todos los datos.  

Ejemplo: "El auto BMW Z3 del año 2021, patente AD178JK, pertenece a Muñoz, que tiene 30 años, y su DNI es 54789534".
 * */

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
				System.out.println("El auto " + marca[i] + " " + modelo[i] + " con patente " + patente[i] + ", año: "
						+ anio[i] + ", pertenece a: " + apellido[i] + " con DNI: " + DNI[i]);

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

			if (OpcionPatenteIngresada == i + 1) { 

				// i+1 porque en el for, i al comienzo vale 0, pero las opciones dadas no fueron 0, 1, y 2, si no mas bien, 1, 2 y 3.
	
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
				System.out.println("El auto " + marca[i] + " " + modelo[i] + " con patente " + patente[i] + ", año: "
						+ anio[i] + ", pertenece a: " + apellido[i] + " con DNI: " + DNI[i]);
			}
		}

	}

}
