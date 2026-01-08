public class switch_case {
	public static void main(String[] args) {
		int dia = 3;

		switch(dia) {
			case 1:
				System.out.println("Dilluns");
				break;
			case 2:
				System.out.println("Dimarts");
				break;
			case 3:
				System.out.println("Dimecres");
				break;
			case 4:
				System.out.println("Dijous");
				break;
			case 5:
				System.out.println("Divendres");
				break;
			case 6:
				System.out.println("Disabte");
				break;
			case 7:
				System.out.println("Diumenge");
				break;
			default:
				System.out.println("No hay tantas dias en una semana");
			}
	}
}