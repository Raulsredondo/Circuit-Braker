package Main;

import Main.CircuitBraker.prueba;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	prueba p1 = new prueba(10D, 1D, 10, 30, 13);		
	System.out.println(p1.getEstado());
	
	prueba p2 = new prueba(15D, 2D, 10, 30, 16);		
	System.out.println(p2.getEstado());
	
	prueba p3 = new prueba(3D, 7D, 10, 30, 21);		
	System.out.println(p3.getEstado());
	}

}
