package com.day1;
import java.util.Scanner;

public class UserInput
{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Employee id:");
  int id=sc.nextInt();
  sc.nextLine();
  System.out.println("Enter Emloyee Name:");
  String name=sc.nextLine();
  System.out.println("Enter Salary:");
  float salary=sc.nextFloat();

  System.out.println("Employee Id:"+id);
  System.out.println("Employee Name:"+name);
  System.out.println("Employee Salary:"+salary);


}
}