package herencias;


public class Principal {
	public static void main(String[] args) {
		Animal[] animales = new Animal[2];
		animales[0] = new Perro();
		animales[1] = new Gato();
		for (int i = 0; i < animales.length; i++) {
			animales[i].sonido();
		}
	}
}