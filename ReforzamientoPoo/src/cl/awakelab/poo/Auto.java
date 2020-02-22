package cl.awakelab.poo;

public class Auto extends MediosDeTransporte implements IVehiculo {

	@Override
	public int contarPasajerosDentro() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public boolean validarbuenEstadoDeFrenos() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void desechar() {
		// TODO Auto-generated method stub
		System.out.println("Estacionar en carretera y prenderle fuego.");
	}

}
