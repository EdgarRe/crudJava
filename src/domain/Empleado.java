package domain;

public class Empleado {
	//atributos
	int idEmpleado;	
	String puesto;
	String nombre;
	String apellido;
	int edad;
	double salario;
	
	//constructores
	public Empleado() {
		
	}
	
	public Empleado(int idEmpleado, String nombre, String apellido, int edad, double salario , String puesto) {
		this.idEmpleado = idEmpleado;
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.puesto = puesto;
	}
	
	//metodo toString

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellido="
				+ apellido + ", edad=" + edad + ", salario=" + salario  + ", puesto=" + puesto+ "]\n";
	}
	
	
   //encapsulamiento creacion de metodo get y set


	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
	
	
	
	
	
}//termino de clase Empleado
