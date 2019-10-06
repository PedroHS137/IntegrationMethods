package Methods;

public class SimpsonMethod implements Integral {
	
	@Override
	public double integrate(double a, double b, int n, Function function) {
		/** El siguiente método devuelve el valor de la integral de la funcion resivida como parametro , 
		 * ademas tambien resibe dos parametros reales de 64 bits los cuales representan los limites de integracion
		 *  y una variable n la cual determina la presicion de la aproximacion ,
		 * este metodo devuleve un area(double) el cual es calcula mediante el metodo de integracion de Simpson */
		double area=0;
		if(a>b) {
			throw new IllegalArgumentException("pusiste los limites mal");
		}
		double h=(b-a)/n;
		area=(function.f(a) + function.f(b));
		for(int i=0;i<n;i++) {
			double x=a+ h*i;
			if(i%2==0) {
				area += function.f(x) *2;
			}else {
				area += function.f(x) *4;
			}
		}
		return (Math.round((area*(h/3)*100000.0))/100000.0);
		}
	}


