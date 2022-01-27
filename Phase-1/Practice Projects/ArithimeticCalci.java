import java.util.*;

public class ArithimeticCalci {

	public static void main(String[] args) {
		int a, b, choice;
		float result = 0;

		try (Scanner buf = new Scanner(System.in)) {
			System.out.print(Messages.getString("ArithimeticCalci.0")); //$NON-NLS-1$
			a = buf.nextInt();

			System.out.print(Messages.getString("ArithimeticCalci.1")); //$NON-NLS-1$
			b = buf.nextInt();

			System.out.print(Messages.getString("ArithimeticCalci.2")); //$NON-NLS-1$

			System.out.print(Messages.getString("ArithimeticCalci.3")); //$NON-NLS-1$

			System.out.print(Messages.getString("ArithimeticCalci.4")); //$NON-NLS-1$

			System.out.print(Messages.getString("ArithimeticCalci.5")); //$NON-NLS-1$
			choice = buf.nextInt();
		}

		switch (choice) {
		case 1:
			result = (a + b);
			break;
		case 2:
			result = (a - b);
			break;
		case 3:
			result = (a * b);
			break;
		case 4:
			result = (float) ((float) a / (float) b);
			break;
		case 5:
			result = (a % b);
			break;
		default:
			System.out.println(Messages.getString("ArithimeticCalci.6")); //$NON-NLS-1$
		}
		if (choice >= 1 && choice <= 5)
			System.out.println(Messages.getString("ArithimeticCalci.7") + result); //$NON-NLS-1$
	}

}