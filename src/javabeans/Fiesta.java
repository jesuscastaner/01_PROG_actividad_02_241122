package javabeans;

public class Fiesta {
	
	/**
	 * Declaración de atributos.
	 */
	private String tipoFiesta;
	private String direccion;
	private int bocadillos;
	private int bebidas;
	private int invitados;
	private String fecha;
	private String hora;
	
	/**
	 * Constantes que almacenan el precio en € por invitado, bebida y bocadillo.
	 * Útiles para calcular el precio total de la fiesta con el método precioFiesta().
	 */
    private static final int PRECIO_INVITADO = 5;
    private static final int PRECIO_BOCADILLO = 3;
    private static final int PRECIO_BEBIDA = 2;
    
    /**
     * Constructor completo con parámetros.
     * @param tipoFiesta
     * @param direccion
     * @param bocadillos
     * @param bebidas
     * @param invitados
     * @param fecha
     * @param hora
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
	
	/**
	 * Constructor sin parámetros.
	 */
	public Fiesta() {
		
	}
	
	/**
	 * Método getter que devuelve el valor del atributo tipoFiesta.
	 * @return this.tipoFiesta
	 */
	public String getTipoFiesta() {
		return this.tipoFiesta;
	}

	/**
	 * Método setter que establece el valor del atributo tipoFiesta.
	 * @param tipoFiesta
	 */
	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}
	
	/**
	 * Método getter que devuelve el valor del atributo direccion.
	 * @return this.direccion
	 */
	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * Método setter que establece el valor del atributo direccion.
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Método getter que devuelve el valor del atributo bocadillos.
	 * @return this.bocadillos
	 */
	public int getBocadillos() {
		return this.bocadillos;
	}

	/**
	 * Método setter que establece el valor del atributo bocadillos.
	 * @param bocadillos
	 */
	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	/**
	 * Método getter que devuelve el valor del atributo bebidas.
	 * @return this.bebidas
	 */
	public int getBebidas() {
		return this.bebidas;
	}

	/**
	 * Método setter que establece el valor del atributo bebidas.
	 * @param bebidas
	 */
	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}

	/**
	 * Método getter que devuelve el valor del atributo invitados.
	 * @return this.invitados
	 */
	public int getInvitados() {
		return this.invitados;
	}

	/**
	 * Método setter que establece el valor del atributo invitados.
	 * @param invitados
	 */
	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}

	/**
	 * Método getter que devuelve el valor del atributo fecha.
	 * @return this.fecha
	 */
	public String getFecha() {
		return this.fecha;
	}

	/**
	 * Método setter que establece el valor del atributo fecha.
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * Método getter que devuelve el valor del atributo hora.
	 * @return this.hora
	 */
	public String getHora() {
		return this.hora;
	}

	/**
	 * Método setter que establece el valor del atributo hora.
	 * @param hora
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	/**
	 * Método que reescribe el método toString() para devolver los valores de
	 * todos sus atributos encadenados en una sola String.
	 */
	@Override
	public String toString() {
		String datosFiesta =  String.format("""
				  Tipo de fiesta:	%s.
				  Dirección:		%s.
				  Nº de bocadillos:	%d.
				  Nº de bebidas:	%d.
				  Nº de invitados:	%d.
				  Fecha y hora:		%s a las %s.
				""",
				this.tipoFiesta,
				this.direccion,
				this.bocadillos,
				this.bebidas,
				this.invitados,
				this.fecha, this.hora);
		return datosFiesta;
	}
	
	/**
	 * Método que añade 1 al valor del atributo invitados.
	 */
	public void invitar() {
		this.invitados++;
	}
	
	/**
	 * Método que resta 1 al valor del atributo invitados.
	 */
	public void cancelarInvitacion() {
		this.invitados --;
	}

	/**
	 * Método que añade el valor del parámetro cantidad al valor del atributo
	 * invitados. Sobrecarga el método invitar().
	 * @param cantidad
	 */
	public void invitar(int cantidad) {
		this.invitados += cantidad;
	}
	
	/**
	 * Método que resta el valor del parámetro cantidad al valor del atributo
	 * invitados. Sobrecarga el método cancelarInvitacion().
	 */
	public void cancelarInvitacion(int cantidad) {
		this.invitados -= cantidad;
	}
	
	/**
	 * Método que devuelve el precio total de la fiesta, calculado a partir del
	 * valor almacenado en las constantes correspondientes.
	 * @return precioFiesta
	 */
	public int precioFiesta() {
		int precioFiesta =
				(this.invitados * PRECIO_INVITADO) +
				(this.bocadillos * PRECIO_BOCADILLO) +
				(this.bebidas * PRECIO_BEBIDA);
		return precioFiesta;
	}
}