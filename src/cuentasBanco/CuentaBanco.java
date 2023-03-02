package cuentasBanco;

/**
 * 
 * @author Sergio Ruiz Cuenca
 * @version 1.0
 * 
 *
 **/


public class CuentaBanco {
	 /**
     * 
     * Cuenta del banco  con distintos atributos: nombre, cuenta , saldo, tipo de interés.
     *
     */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
   
/**
 * Método cuenta banco
 * @param nom nombre de la persona
 * @param cue cuenta del banco
 * @param sal saldo 
 * @param tipo de interes
 */
    public CuentaBanco(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
  /** 
   * Método para mostrar el estado de la cuenta, devolviendo el saldo correspondiente
   * @return devuelve el estado de la cuenta, es decir, el saldo de esta
   */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para ingresar la cantidad de dinero
     * @param cantidad nombre para ingresar la cantidad de dinero en la cuenta
     * @throws Exception Esta excepción sucede si la cantidad de dinero ingresada es negativa
     */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Método para retirar la cantidad de dinero
 * @param cantidad nombre para reitirar la cantidad de dinero en la cuenta
 * @throws Exception Esta excepción sucede si la cantidad de dinero retirada es negativa o igual a 0
 *                   Se lanza otra excepción en caso de que la cantidad a retirar sea mayor que el estado de la cuenta, indicará 
 *                    que no hay suficiente saldo
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**
 *  Método para devolver el nombre de la persona
 * @return nombre de la persona
 *
 */
	public String getNombre() {
		return nombre;
	}
/**
 * Método para cambiar el nombre de la persona 
 * @param nombre de la persona
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * Método para devolver la cuenta del banco
 * @return cuenta del banco
 */
	public String getCuenta() {
		return cuenta;
	}
/**
 * Método para cambiar la cuenta del banco
 * @param cuenta del banco
 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * Método para devolver el saldo de la cuenta
 * @return saldo de la cuenta
 */
	public double getSaldo() {
		return saldo;
	}
/**
 * Método para cambiar el saldo de la cuenta
 * @param saldo de la cuenta
 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * Método para devolver el tipo de interés
 * @return tipoInteres El tipo de interés que se va a devolver
 */
	public double getTipoInteres() {
		return tipoInteres;
	}
/**
 * Método para cambiar el tipo de interés
 * @param tipoInteres El tipo de interés que se puede cambiar
 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}


