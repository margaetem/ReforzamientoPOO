package cl.awakelab.web;
import cl.awakelab.poo.*;

public class Ejecutalo {

	public static void main(String[] args) {
		
		MediosDeTransporte m1 = new MediosDeTransporte(200, 25, 5, 250);
		// System.out.println("Velocidad Maxima:" + m1.getVelocidadMaxima() );
		
		
		ElefanteGenerico e1 = new ElefanteGenerico(50, 200, 4, 400, 20);
		m1.setAutonomia(350);
		
	
		
		ElefanteAfricano dumbito = new ElefanteAfricano();
		dumbito.setKilosDePopo(10);
		dumbito.setAutonomia(10);
		
		// System.out.println("Autonomía m1: " + m1.getAutonomia());
		//System.out.println("Autonomía e1: " + e1.getAutonomia());
		//System.out.println("Autonomía dumbito:" + dumbito.getAutonomia());
		
		Auto fiat = new Auto();
		fiat.validarbuenEstadoDeFrenos();
		
		acelerar(dumbito,2);
		
		cuentaPax(fiat);
		
	}
	
	public static void acelerar(MediosDeTransporte mdt, int incremento) {
		for (int i = 0; i < incremento; i++) {
			mdt.avanzar();
		}
	}
	
	public static void cuentaPax(IVehiculo veh) {
		System.out.println("Este vehiculo tiene capacidad para " + veh.contarPasajerosDentro() + " pax");
	}

}
