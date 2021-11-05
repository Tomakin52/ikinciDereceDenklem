import java.util.Scanner;

public class otuzekim {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("(ax²+bx+c)Ýkinci dereceden bir denklemdir,\n Lütfen denklemin deðerlerini sýrasýyla girin.");



System.out.println("a Deðerini Girin");
double a = scan.nextDouble();
System.out.println("b Deðerini Girin");
double b = scan.nextDouble();
System.out.println("c Deðerini Girin");
double c = scan.nextDouble();

double delta =(b*b)-(4*a*c);

if (delta >0) {
	double x1=((-1*b)- Math.sqrt(delta))/(2 * a);
	double x2=((-1*b)+ Math.sqrt(delta))/(2 * a);
	System.out.println(" x1="+ x1 +"\n x2="+ x2);						
}
if (delta <0) {
	System.out.println("Denklemin Gerçel Kökü Yoktur");	
}
if(delta==0) {
	double x= (-1 * b)/(2 * a);
	System.out.println("Denklemin Çakýþýk Kökü Vardýr: x1=x2"+x);
}

}

}
	




	


