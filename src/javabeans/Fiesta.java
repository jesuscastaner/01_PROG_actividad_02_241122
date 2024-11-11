package javabeans;

public class Fiesta {
	
	/*
	 * Declaración de atributos con sus valores por defecto.
	 */
	private String tipoFiesta = "desconocido";
	private String direccion = "desconocida";
	private int bocadillos = 0;
	private int bebidas = 0;
	private int invitados = 0;
	private String fecha = "DD-MM-AAAA";
	private String hora = "00:00:00";
	
	/*
	 * Constantes que almacenan el precio en € por invitado, por bebida y por bocadillo.
	 * Útiles para calcular el precio total de la fiesta con el método precioFiesta().
	 */
    private static final int PRECIO_INVITADO = 5;
    private static final int PRECIO_BOCADILLO = 3;
    private static final int PRECIO_BEBIDA = 2;
	
	/*
	 * Constructor completo con parámetros.
	 */
	public Fiesta(String tipoFiesta, String direccion, int bocadillos, int bebidas, int invitados, String fecha, String hora) {
		this.tipoFiesta = tipoFiesta;
		this.direccion = direccion;
		this.bocadillos = bocadillos;
		this.bebidas = bebidas;
		this.invitados = invitados;
		this.fecha = fecha;
		this.hora = hora;
	}
	
	/*
	 * Constructor sin parámetros.
	 */
	public Fiesta() {}
	

	/*
	 * Método getter que devuelve el valor del atributo tipoFiesta.
	 */
	public String getTipoFiesta() {
		return tipoFiesta;
	}

	/*
	 * Método setter que establece el valor del atributo tipoFiesta.
	 */
	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}

	/*
	 * Método getter que devuelve el valor del atributo direccion.
	 */
	public String getDireccion() {
		return direccion;
	}

	/*
	 * Método setter que establece el valor del atributo direccion.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/*
	 * Método getter que devuelve el valor del atributo bocadillos.
	 */
	public int getBocadillos() {
		return bocadillos;
	}

	/*
	 * Método setter que establece el valor del atributo bocadillos.
	 */
	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	/*
	 * Método getter que devuelve el valor del atributo bebidas.
	 */
	public int getBebidas() {
		return bebidas;
	}

	/*
	 * método setter que establece el valor del atributo bebidas.
	 */
	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}

	/*
	 * Método getter que devuelve el valor del atributo invitados.
	 */
	public int getInvitados() {
		return invitados;
	}

	/*
	 * Método setter que establece el valor del atributo invitados.
	 */
	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}

	/*
	 * Método getter que devuelve el valor del atributo fecha.
	 */
	public String getFecha() {
		return fecha;
	}

	/*
	 * Método setter que establece el valor del atributo fecha.
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/*
	 * Método getter que devuelve el valor del atributo hora.
	 */
	public String getHora() {
		return hora;
	}

	/*
	 * Método setter que establece el valor del atributo hora.
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	/* 
	 * Método que reescribe el método toString() para devolver los valores de
	 * todos sus atributos encadenados en una sola String.
	 */
	@Override
	public String toString() {
		String datosFiesta =
				"Tipo de fiesta: " + tipoFiesta +
				". Dirección: " + direccion +
				". Nº bocadillos: " + bocadillos +
				". Nº bebidas: " + bebidas +
				". Nº invitados: " + invitados +
				". Fecha y hora: " + fecha + " a las " + hora + ".";
		return datosFiesta;
	}
	
	/*
	 * Método que añade 1 al valor del atributo invitados.
	 */
	public void invitar() {
		this.invitados++;
	}
	
	/*
	 * Método que resta 1 al valor del atributo invitados.
	 */
	public void cancelarInvitacion() {
		this.invitados --;
	}
	
	/* 
	 * Método que añade el valor del parámetro cantidad al valor del atributo
	 * invitados. Sobrecarga el método invitar().
	 */
	public void invitar(int cantidad) {
		this.invitados += cantidad;
	}
	
	/* 
	 * Método que resta el valor del parámetro cantidad al valor del atributo
	 * invitados. Sobrecarga el método cancelarInvitacion().
	 */
	public void cancelarInvitacion(int cantidad) {
		this.invitados -= cantidad;
	}
	
	/* 
	 * Método que devuelve el precio total de la fiesta, calculado a partir del
	 * valor almacenado en las constantes correspondientes.
	 */
	public int precioFiesta() {
		int precioFiesta =
				(this.invitados * PRECIO_INVITADO) +
				(this.bocadillos * PRECIO_BOCADILLO) +
				(this.bebidas * PRECIO_BEBIDA);
		return precioFiesta;
	}
	
}
