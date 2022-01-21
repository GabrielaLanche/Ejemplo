package Paquete;

public class Calcula {
	 //Atributos
	int n1,n2,n3;
	int resultado;
	//Constructores 
	public Calcula (int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	public Calcula(int n1,int n2,int n3)
	{
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
	}
	//Métodos
	public int Suma() {
		resultado = n1+n2;
		return resultado;
	}
	
	public int Resta() {
			resultado= n1-n2;
			return resultado;
	}
	public int Multiplica()
	{
		resultado= n1*n2;
		return resultado;
	}
	public int Divide()
	{
		resultado= n1/n2;
		return resultado;
	}
}
