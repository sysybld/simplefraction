import java.util.Scanner;
import java.io.*;
class main {
	public static void main(String[] args) {
		System.out.println("ceci est un test");
		System.out.println("donner deux entiers, le deuxieme different de zero");
		Scanner clavier = new Scanner(System.in);
		int n = clavier.nextInt();
		int d = clavier.nextInt();
		
		System.out.println("ceci est un test methode to string");
		frac F=new frac(n,d);
		System.out.println(F.toString());
	}
}