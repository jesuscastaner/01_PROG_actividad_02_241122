package main;

import java.time.LocalDate;
import java.time.LocalTime;

import javabeans.Fiesta;
import javabeans.FiestaLocalDateTime;

public class Principal {

	public static void main(String[] args) {
		
		/**
		 * Creo una Fiesta (fiesta1) con el constructor parametrizado.
		 */
		Fiesta fiesta1 = new Fiesta(
									"Cumpleaños",
									"Calle Mayor, 4, 2ºB, 28100 Madrid",
									15,
									15,
									30,
									"2024-11-25",
									"14:30"
									);
		
		/**
		 * Creo otra Fiesta (fiesta2) con el constructor vacío.
		 * Después, establezco sus atributos uno a uno con setters.
		 */
		Fiesta fiesta2 = new Fiesta();
		fiesta2.setTipoFiesta("Disfraces");
		fiesta2.setDireccion("Calle Escobedos, 16, 5ºA, 22807, Alcalá de Henares");
		fiesta2.setBocadillos(26);
		fiesta2.setBebidas(39);
		fiesta2.setInvitados(13);
		fiesta2.setFecha("2024-04-10");
		fiesta2.setHora("22:00");
		
		/**
		 * Creo una FiestaLocalDateTime (fiesta3) con el constructor vacío, igual
		 * que con fiesta2, pero en este caso se utilizan LocalDate y LocalTime
		 * para modificar el valor por defecto del atributo fechaHora.
		 */
		FiestaLocalDateTime fiesta3 = new FiestaLocalDateTime();
		fiesta3.setTipoFiesta("Año Nuevo");
		fiesta3.setDireccion("Puerta del Sol, 28013 Madrid");
		fiesta3.setBocadillos(400);
		fiesta3.setBebidas(600);
		fiesta3.setInvitados(200);
		LocalDate fecha = LocalDate.of(2024, 12, 31);
		LocalTime hora = LocalTime.of(23, 0);
		fiesta3.setFecha(fecha);
		fiesta3.setHora(hora);
		
		/**
		 * Imprimo en la consola los datos de las tres Fiestas convertidos en String.
		 */
		System.out.println("DATOS DE LA FIESTA 1:\n" + fiesta1.toString());
		System.out.println("DATOS DE LA FIESTA 2:\n" + fiesta2.toString());
		System.out.println("DATOS DE LA FIESTA 3:\n" + fiesta3.toString());
		
		/**
		 * Añado 3 invitados de uno en uno a la primera Fiesta con el método
		 * invitar(). A continuación resto 2 invitados de uno en uno con el
		 * método cancelarInvitacion().
		 */
		System.out.println(
						   "En la FIESTA 1 hay ahora " + fiesta1.getInvitados() +
						   " invitados."
						   );
		fiesta1.invitar();
		System.out.println(
						   "++ Se ha añadido un invitado. Ahora hay " + fiesta1.getInvitados()
						   + " invitados."
						   );
		fiesta1.invitar();
		System.out.println(
						   "++ Y uno más. Ahora hay " + fiesta1.getInvitados()
						   + " invitados."
						   );
		fiesta1.invitar();
		System.out.println(
						   "++ Y otro más. Ahora hay " + fiesta1.getInvitados() +
						   " invitados."
						   );
		
		fiesta1.cancelarInvitacion();
		System.out.println(
						   "-- Se ha eliminado un invitado. Ahora hay " + fiesta1.getInvitados() +
						   " invitados."
						   );
		fiesta1.cancelarInvitacion();
		System.out.println(
						   "-- Y otro más. Ahora hay " + fiesta1.getInvitados() +
						   " invitados."
						   );

		/**
		 * Añado 100 invitados de golpe a la segunda Fiesta con el método
		 * invitar(). A continuación resto 50 invitados de golpe con el
		 * método cancelarInvitacion().
		 */
		System.out.println(
						   "\nEn la FIESTA 2 hay ahora " + fiesta2.getInvitados() +
						   " invitados."
						   );
		int invitadosAgregados = 100;
		fiesta2.invitar(invitadosAgregados);
		System.out.println(
						   "++ Se han añadido " + invitadosAgregados + " invitados. Ahora hay " +
						   fiesta2.getInvitados() + " invitados."
						   );
		
		int invitadosCancelados = 50;
		fiesta2.cancelarInvitacion(invitadosCancelados);
		System.out.println(
						   "-- Se han eliminado " + invitadosCancelados + " invitados. Ahora hay " +
						   fiesta1.getInvitados() + " invitados."
						   );
		
		/**
		 * Imprimo en la consola los precios de cada una de las fiestas utilizando
		 * el método precioFiesta().
		 */
		System.out.println("\nPRECIO DE LA FIESTA 1: " + fiesta1.precioFiesta() + "€.");
		System.out.println("PRECIO DE LA FIESTA 2: " + fiesta2.precioFiesta() + "€.");
		System.out.println("PRECIO DE LA FIESTA 3: " + fiesta3.precioFiesta() + "€.");
	}
}