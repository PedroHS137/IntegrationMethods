package Methods;
import Methods.Function;
import Methods.Integral;
import Methods.SimpsonMethod;
import Methods.trapezeMethod;
public class UseIntegral {
	public static void main(String[]args) {
		
		trapezeMethod t0= new trapezeMethod();
		System.out.println("TRAPECIO  f(x)=x^2 , para 0<=X<=10\n = "+t0.integrate(0, 10, 0,x-> {
			return Math.pow(x, 2);
			}));
		trapezeMethod t1= new trapezeMethod();
		System.out.println("TRAPECIO  f(x)=sen(x) , para 0<=X<=pi/2\n = "+t1.integrate(0, 1.57079, 0, x-> {
			return Math.sin(x);
			}));
		
		SimpsonMethod s0= new SimpsonMethod();
		System.out.println("SIMPSON  f(x)=x^2 , para 0<=X<=10\n = "+t0.integrate(0, 10, 10000000,x-> {
			return Math.pow(x, 2);
			}));
		SimpsonMethod s1= new SimpsonMethod();
		System.out.println("SIMPSON  f(x)=sen(x) , para 0<=X<=pi/2\n = "+t1.integrate(0, 1.57079, 10000000, x-> {
			return Math.sin(x);
			}));
		
		
	}	
	
}
