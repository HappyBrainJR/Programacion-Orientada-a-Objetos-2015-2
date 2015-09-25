
public class rectangulo {
	// ATRIBUTOS 
	private double ancho = 1;
	private double largo = 1;
	//MÉTODOS
	double area(){
		return ancho * largo;
		}
	
	double perimetro(){
		return 2 * (largo + ancho);
		}
	public void setDimensiones(double larg, double anch){
		if (larg > 0 && larg <= 20 && anch > 0 && anch<= 20){
			largo = larg;
			ancho = anch;
		}
		else {
			//se dejan las medidas por defecto del rectangulo
			largo = 1;
			ancho = 1;
			System.out.println("ERROR: el largo y el ancho deben ser > 0 y <= 20 ");
		}
	}
}
