import java.util.Scanner;

public class otuzekim {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("(ax�+bx+c)�kinci dereceden bir denklemdir,\n L�tfen denklemin de�erlerini s�ras�yla girin.");



System.out.println("a De�erini Girin");
double a = scan.nextDouble();
System.out.println("b De�erini Girin");
double b = scan.nextDouble();
System.out.println("c De�erini Girin");
double c = scan.nextDouble();

double delta =(b*b)-(4*a*c);

if (delta >0) {
	double x1=((-1*b)- Math.sqrt(delta))/(2 * a);
	double x2=((-1*b)+ Math.sqrt(delta))/(2 * a);
	System.out.println(" x1="+ x1 +"\n x2="+ x2);						
}
if (delta <0) {
	System.out.println("Denklemin Ger�el K�k� Yoktur");	
}
if(delta==0) {
	double x= (-1 * b)/(2 * a);
	System.out.println("Denklemin �ak���k K�k� Vard�r: x1=x2"+x);
}

}

}
	




	


