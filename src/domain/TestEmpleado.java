package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestEmpleado {
	public static void main(String[] args) {
		// atributos
		int idEmpleado;
		String puesto;
		String nombre;
		String apellido;
		int edad;
		double salario;

		// creacion de la lista EMpleados

		List<Empleado> listaEmpleados = new ArrayList();
		int indice, menu;
		Scanner consola = new Scanner(System.in);

//do while se jecuita una ves entrando al do y de ahi hasta que se cumpla la condicion del while		
		do {
			System.out.println("\nMenu de empleados");
			System.out.println("1- Alta");
			System.out.println("2- Editar");
			System.out.println("3- Buscar");
			System.out.println("4- Eliminar");
			System.out.println("5- Mostrar todos los empleados");
			System.out.println("6- Lista de empleados por indice");
			System.out.println("7- SALIR");
			menu = consola.nextInt();
//Inicializa el objeto tipo empleado
			Empleado empleado;
			
			
//entra bucle Switch
			switch (menu) {
			case 1:
				   System.out.println("ingresa numero de empleado: ");
				   consola = new Scanner(System.in);
				   idEmpleado =consola.nextInt();
				   
				   System.out.println("ingresa nombre del empleado: ");
				   consola = new Scanner(System.in);
				   nombre =consola.nextLine();
				   
				   System.out.println("ingresa apelllido del empleado: ");
				   consola = new Scanner(System.in);
				   apellido =consola.nextLine();
				   
				   System.out.println("ingresa edad del empleado: ");
				   consola = new Scanner(System.in);
				   edad =consola.nextInt();
				   
				   System.out.println("ingresa salario del empleado: ");
				   consola = new Scanner(System.in);
				   salario =consola.nextDouble();
				   
				   System.out.println("ingresa puesto de empleado: ");
				   consola = new Scanner(System.in);
				   puesto =consola.nextLine();
				   
				   //inicializa y agrega contenido a los atributos
				 
				   empleado = new Empleado(idEmpleado, nombre , apellido, edad, salario, puesto);
				   listaEmpleados.add(empleado);
				   
				break;
				
			case 2:
				System.out.println("Ingresa el indice de empleado a editar: ");
				consola = new Scanner(System.in);
				indice = consola.nextInt();
				empleado = listaEmpleados.get(indice);
				
				System.out.println("Ingresa el idEmpleado de empleado nuevo: ");
				consola = new Scanner(System.in);
				idEmpleado = consola.nextInt();
				
				empleado.setIdEmpleado(idEmpleado);
				
				System.out.println("Ingresa el nombre de empleado: ");
				consola = new Scanner(System.in);
				nombre = consola.nextLine();
				
				empleado.setNombre(nombre);
				
				System.out.println("Ingresa el apelllido de empleado a editar: ");
				consola = new Scanner(System.in);
				apellido = consola.nextLine();
				
				empleado.setApellido(apellido);//aqui se asigna el valor recogido en consola al atributo del objeto empleado
				
				System.out.println("Ingresa el edad de empleado a editar: ");
				consola = new Scanner(System.in);
				edad = consola.nextInt();
				
				empleado.setEdad(edad);
				
				System.out.println("Ingresa el salario de empleado a editar: ");
				consola = new Scanner(System.in);
				salario = consola.nextDouble();
				
				empleado.setSalario(salario);
				
				System.out.println("Ingresa el puesto de empleado a editar: ");
				consola = new Scanner(System.in);
				puesto = consola.nextLine();
				
				empleado.setPuesto(puesto);
				break;

			case 3:
				System.out.println("Ingresa indice de empleado a buscar");
				consola = new Scanner(System.in);
				indice = consola.nextInt();
				
				empleado = listaEmpleados.get(indice);
				System.out.println(empleado);
				
				break;
			case 4:
				System.out.println("Ingresa numero de empleado a eliminar");
				consola=new Scanner(System.in);
				indice = consola.nextInt();
				
				empleado = listaEmpleados.get(indice);
				listaEmpleados.remove(indice);
				
				System.out.println("El empleado ha sido eliminado:\n "+empleado);
				
				break;
			case 5:
				System.out.println(" Muestra de lista de empleados:\n"+listaEmpleados);
				break;
			
			case 6:
				for (int i = 0; i < listaEmpleados.size(); i++) {
					System.out.printf("\n[%d] => "+ listaEmpleados.get(i).getNombre()+"- Apellido: "+
				                      listaEmpleados.get(i).getApellido(),i );
				}
				break;
			case 7:
				break;
				
			default:
				System.out.println("Opcion invalida intenta de nuevo");
				break;
			}

		} while (menu != 7);

	}
}
