import java.util.Scanner;

public class PruebaGitHub {
	int a = 2;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		byte n;
		n = in.nextByte();
		if (n > 0 && n <= 5) {
			do {
				System.out.println("Hola mundo.");
				n -= 1;
			} while (n > 0);
		}
		in.close();
	}

}
