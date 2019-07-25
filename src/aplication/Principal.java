package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new  ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			System.out.println("Tax payer #"+ i +" data:");
			System.out.print("or company (i/c)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double gastosComSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastosComSaude));
			}else if (ch == 'c') {
				System.out.print("Number of employees: ");
				int numeroDeFuncionario = sc.nextInt();
				list.add(new PessoaJuridica(name, rendaAnual, numeroDeFuncionario));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		for(Person person : list) {
			System.out.println(person.getName() +" $ " + person.tax());
		}
		
		sc.close();
	}

}
