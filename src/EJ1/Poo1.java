package EJ1;
import java.util.Scanner;
public class Poo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		//Una llamada telefónica en cualquier teléfono público cuesta S/ 0.7 por los 2 primeros minutos o menos. 
		//Cada minuto adicional cuesta S/ 0.1. Calcule el monto de una llamada cualquiera.		
				
				
				double precio;
				
				System.out.print("Ingrese los minutos de esta llamada: ");
				int minutos = scanner.nextInt();
				
				if (minutos <= 2) {
					precio = 0.7;
				} else {
					precio = 0.7 + (minutos - 2 ) * 0.1;
				}
					 
					System.out.println("El monto de la llamada es: " + precio);	
				
		//Ejercicio 2
					//Dado tres longitudes, compruebe si pueden formar un triángulo y luego clasifique el triangulo según sus lados.
					
		       
					
					
					
					
		//Ejercicio 3
					// El rendimiento de un estudiante se califica de la siguiente manera:
					//Muy bueno, si la nota ingresada esta entre 17 y 20
					//Bueno, si la nota ingresada esta en 14 y 16
					//Regula , si la nota ingresada esta en 11 y 13
					//Deficiente, si la nota ingresada esta en 0 y 10
					
					System.out.println("Ingrese su nota: ");
					int nota = scanner.nextInt();
					
					if (nota >= 17 && nota <= 20) {
						System.out.print("Muy bueno");
						}else if (nota >= 14 && nota <= 16) {
							System.out.println("Bueno");
						} else if (nota >= 11 && nota <= 13) {
							System.out.println("Regular");
						} else {
							System.out.println("Deficiente");
						}
					
					
		//Ejercicio 4
					
					//El sueldo de un empleado es S/ 1000.00, a menos que se le descuente el 10% . Si el sueldo está
					//entre S/ 1000.00 y S/ 2000.00, se le descuenta el 5% sobre el adicional, y si el sueldo está arriba
					//del S/ 2000.00, el 3% sobre el adicional. Escriba un algoritmo que lea el suedo y muestre el
					//salario neto y el impuesto.
					
						double descuento = 0;
						
					
						System.out.println("Ingrese su sueldo: ");
						double sueldo = scanner.nextDouble();
						
							
							if (sueldo >= 1000.00 && sueldo <= 2000.00 ) {
								descuento = sueldo - (100 * 0.5);
							} else if (sueldo > 2000.00) {
								descuento = sueldo - (100 * 0.3);
							}
								System.out.println("Su nuevo sueldo despues del descuento es: " + descuento);
		//Ejercicio 5
								
				//Calcular la masa de aire, basado en la siguiente fórmula:
				//Masa = (presión * volumen) / (0.37 * (temperatura + 460))
					
							double masa;
							
							System.out.println("Ingrese el valor de la presion: ");
							double presion = scanner.nextDouble();
							
							System.out.println("Ingrese el valor del volumen: ");
							double volumen = scanner.nextDouble();
								
							System.out.println("Ingrese el valor de la temperatura: ");
							double temperatura = scanner.nextDouble();
							
							masa = (presion * volumen) / (0.37 * (temperatura + 460));
							
							System.out.println("La masa es: " + masa);
							
		
		
		
	}

}
