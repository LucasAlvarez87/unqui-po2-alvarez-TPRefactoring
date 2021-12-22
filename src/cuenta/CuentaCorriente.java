package cuenta;

public class CuentaCorriente extends CuentaBancaria{
	private Integer limiteDescubierto;
	
	public CuentaCorriente(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo, Integer limiteDescubierto) {
		super(historialDeMovimientos, notificador, saldo);
		this.limiteDescubierto = limiteDescubierto;
	}
	
	
	@Override
	protected boolean condicionDeExtraccion(Integer monto) {
		return this.saldo + this.limiteDescubierto >= monto;
	}
	
	
	/*
	 * La Caja de ahorro y cuenta corriente tiene duplicate code
	 * Se puede cambiar utilizando un temple method en la superclass
	 */
	
}
