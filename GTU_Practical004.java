/**
 * Problem Statement:
 * Body Mass Index (BMI) is a measure of health on weight. 
 * It can be calculated by taking your weight in kilograms 
 * and dividing by the square of your height in meters. 
 * Write a program that prompts the user to enter a weight in 
 * pounds and height in inches and displays the BMI. 
 * (Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters.)
 *
 */	
import java.util.Scanner;

public class GTU_Practical004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight,height,bmi;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pound: ");
		weight= input.nextDouble()*0.45359273; // convert pound to kg
		
		System.out.print("Enter height in inches");
		height = input.nextDouble()*0.0254;
		
		bmi=weight/(height*height);
		System.out.print("BMI : "+bmi);
	}

}