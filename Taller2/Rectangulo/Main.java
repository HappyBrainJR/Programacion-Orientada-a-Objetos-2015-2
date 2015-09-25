public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double largo = 2 , ancho = 3; 
		rectangulo r = new rectangulo();	
	System.out.println("Rectangulo por defecto");
	System.out.println("el area es: " +r.area() +" El perimetro es: " +r.perimetro());
	System.out.println("\nRectangulo largo 2 ancho 3");
	r.setDimensiones(largo, ancho);
	System.out.println("el area es: " +r.area() +" El perimetro es: " +r.perimetro());
	System.out.println("\nRectangulo largo 4 ancho 5");
	r.setDimensiones(largo = 4, ancho = 5);
	System.out.println("el area es: " +r.area() +" El perimetro es: " +r.perimetro());
	System.out.println("\nRectangulo largo 6 ancho 2");
	r.setDimensiones(largo = 6, ancho = 2);
	System.out.println("el area es: " +r.area() +" El perimetro es: " +r.perimetro());
	System.out.println("\nRectangulo largo 3 ancho 8");
	r.setDimensiones(largo = 3, ancho = 8);
	System.out.println("el area es: " +r.area() +" El perimetro es: " +r.perimetro());
	System.out.println("\nRectangulo largo 10 ancho 10");
	r.setDimensiones(largo = 10, ancho = 10);
	System.out.println("el area es: " +r.area() +" El perimetro es: " +r.perimetro());
	System.out.println("\nRectangulo largo 3.13 ancho 5.24");
	r.setDimensiones(largo = 3.13 , ancho = 5.24 );
	System.out.println("el area es: " +r.area() +" El perimetro es: " +r.perimetro());
	System.out.println("\nRectangulo largo 0 ancho 3");
	r.setDimensiones(largo = 0, ancho = 3);
	System.out.println("el area es: " +r.area() +" El perimetro es: " +r.perimetro());
	System.out.println("\nRectangulo largo 23 ancho 8");
	r.setDimensiones(largo = 23, ancho = 8);
	System.out.println("el area es: " +r.area() +" El perimetro es: " +r.perimetro());
	System.out.println("\nRectangulo largo -5 ancho 8");
	r.setDimensiones(largo = -5, ancho = 8);
	System.out.println("el area es: " +r.area() +" El perimetro es: " +r.perimetro());
	}
}
