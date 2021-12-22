package cuenta;

public class CajaAhorro extends CuentaBancaria{

	public CajaAhorro(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super(historialDeMovimientos, notificador, saldo);
	}

	@Override
	protected boolean condicionDeExtraccion(Integer monto) {
		return this.saldo >= monto;
	}
	
	/*
	 * La Caja de ahorro y cuenta corriente tiene duplicate code
	 * Se puede cambiar utilizando un temple method en la superclass
	 */
	

}
