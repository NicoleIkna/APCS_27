/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee Jim = new Employee(2474, "Jim", "Halper", 4416.66);
		Employee Pam = new Employee(2011, "Pam", "Beesly", 2250);
		Employee Elin = new Employee(1089, "Elin", "Marghosian", 400001);
		
		michael.raiseSalary(1);
		Dwight.raiseSalary(99);
		Jim.raiseSalary(14);
		Pam.raiseSalary(67);
		Elin.raiseSalary(38546746);
		
		
		double michaelAnnual = michael.getAnnualSalary();
		double DwightAnnual = Dwight.getAnnualSalary();
		double JimAnnual = Jim.getAnnualSalary();
		double PamAnnual = Pam.getAnnualSalary();
		double ElinAnnual = Elin.getAnnualSalary();

		michael.employeeToString();
		System.out.println("Micheal's annual salary: $" + michaelAnnual);
		Dwight.employeeToString();
		System.out.println("Dwight's annual salary: $" + DwightAnnual);
		Jim.employeeToString();
		System.out.println("Jim's annual salary: $" + JimAnnual);
		Pam.employeeToString();
		System.out.println("Pam's annual salary: $" + PamAnnual);
		Elin.employeeToString();
		System.out.println("Elin's annual salary: $" + ElinAnnual);
		


		
		
	}
}
