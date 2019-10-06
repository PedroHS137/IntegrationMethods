package Methods;

public class trapezeMethod implements Integral{
	public static final double INCREMENTO = 1E-4;
	
	

	@Override
	public double integrate(double a, double b, int n, Function function) { //area trapecio = ((B+b)*h)/2
		/** El siguiente método devuelve el valor de la integral de la funcion resivida como parametro , 
		 * ademas tambien resibe dos parametros reales de 64 bits los cuales representan los limites de integracion,
		 * este metodo devuleve un area(double) el cual es calcula mediante el metodo de integracion de trapecio */
		double area=0;
		if(a>b) {
			throw new IllegalArgumentException("pusiste los limites mal");
		}
		for(double i = a+ INCREMENTO; i < b ; i+=INCREMENTO) {
			double distDesdeA=i-a;
			area+= (INCREMENTO/2)*(function.f(a+distDesdeA) + function.f(a+distDesdeA-INCREMENTO));
			// incremento es el dezplazamiento en x o la base del trapecio
			//distDesdeA es la distancia desde el punto a 
			//f(a+distDesdeA) es la base mayor del trapecio y f(a+distDesdeA-INCREMENTO) es la base menor
		}
		return (Math.round(area*100000.0)/100000.0);
	}

}
