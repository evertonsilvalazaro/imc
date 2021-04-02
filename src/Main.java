import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double peso,altura,imc;
		
		System.out.println("Digte o seu peso");
		peso=teclado.nextDouble();
		System.out.println("Digte sua altura");
		altura=teclado.nextDouble();
		
		imc=peso/Math.pow(altura,2);
		
		if (imc<20) {
			System.out.println("Abaixo do peso");
			
		}else if ((imc>20)&&(imc<=25)) {
			System.out.println("Normal");
			
		}else if ((imc>25)&&(imc<=30)) {
			System.out.println("Sobrepeso");
			
		}else if((imc>30)&&(imc<=40)){
			System.out.println("Obesidade");
			
		}else if(imc>40) {
			System.out.println("Obesidade Mórbida");
		}
		
		
		
		
		
		teclado.close();
		
		
	}

}
