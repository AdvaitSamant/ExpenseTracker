package BudgetTracker;
import java.util.ArrayList;
import java.util.Scanner;
public class Main 
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		ArrayList<Expense> expenses = Storage.loadExpenses();
		while (true)
		{
			System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch (choice)
            {
            case 1:
            	System.out.print("Enter Date (YYYY-MM-DD): ");
                String date = sc.next();
                sc.nextLine();  // Consume newline left over
                System.out.print("Enter Description : ");
                String desc = sc.nextLine();
                System.out.print("Enter Amount: ");
                double amount = sc.nextDouble();
                expenses.add(new Expense(date, desc, amount));
                Storage.saveExp(expenses);
                break;
            case 2:
            	for(Expense e : expenses)
            	{
            		System.out.println(e);
            	}
            	break;
            case 3:
            	System.out.println("Quiting...");
            	return;
            default:
            	System.out.println("Invalid Choice. Please select a valid choice from the given menu...");
            
                
            }
		}
	}
}
