import java.util.Scanner;
import java.util.Locale;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		int x;
		x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "Domingo";
			break;

		case 2:
			dia = "Segunda";
			break;

		case 3:
			dia = "Terça";
			break;

		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
			
			default:
				dia = "Valor inválido";
				break;
			
		}
		System.out.println("Dia da semana é "+ dia);
        sc.close();
	}

}
