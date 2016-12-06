import java.util.Scanner;

public class TestDriver extends VendingMachine{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VendingMachine vm = new VendingMachine();
		int largeCup = 0;
		int smallCup = 0;
		int price =0;
		
		System.out.println("------------Sahil Chalke(A20354354)-----------------");
		System.out.println();
		System.out.println("Vending Machine");
		System.out.println("Please Select from below Option");
		System.out.println("1. Coin");
		System.out.println("2. Small Cup");
		System.out.println("3. Large Cup");
		System.out.println("4. Sugar");
		System.out.println("5. Tea");
		System.out.println("6. Insert Large Cups");
		System.out.println("7. Insert Small Cups");
		System.out.println("8. Set Price");
		System.out.println("9. Cancel");
		System.out.println("10. Dispose");
		System.out.println("11. Quit");
		
		System.out.println("---------------------Testing Related Methods-------------------------------");
		System.out.println("12. Show Variables");

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		while(input!=11)
		{
			switch (input)
			{
			case 1:
				System.out.println("You selected Coin");
				System.out.println("Return value is: "+vm.coin());
				break;

			case 2:
				System.out.println("You Selected Small Cup");
				System.out.println("Return value is: "+vm.small_cup());
				break;
				
			case 3:
				System.out.println("You selected Large Cup");
				System.out.println("Return value is: "+vm.large_cup());
				break;
				
			case 4:
				System.out.println("You selected Sugar:");
				System.out.println("Return value is: "+vm.sugar());
				break;
			
			case 5:
				System.out.println("You selected Tea:");
				System.out.println("Return value is: "+vm.tea());
				break;
				
			case 6:
				System.out.println("You selected Insert Large cups: ");
				System.out.println("Please enter the number of large cups: ");
				largeCup = sc.nextInt();
				System.out.println("Return Value is: "+vm.insert_large_cups(largeCup));
				break;
			
			case 7:
				System.out.println("You selected Insert Small cups: ");
				System.out.println("Please enter the number of small cups: ");
				smallCup = sc.nextInt();
				System.out.println("Return Value is: "+vm.insert_small_cups(smallCup));
				break;
				
			case 8:
				System.out.println("You selected Set Price: ");
				System.out.println("Please enter the price: ");
				price = sc.nextInt();
				System.out.println("Return Value is: "+vm.set_price(price));
				break;
				
			case 9:
				System.out.println("You selected Cancel: ");
				System.out.println("Return Value is: "+vm.cancel());
				break;
				
			case 10:
				System.out.println("You selected Dispose: ");
				System.out.println("Return Value is: "+vm.dispose());
				break;
			
			case 12:
				System.out.println("The value of variables is: ");
				vm.showVariables();
				break;
				
			default:System.out.println("Invalid input please try again");
				
			}
			System.out.println("------------Sahil Chalke(A20354354)-----------------");
			System.out.println();
			System.out.println("Vending Machine");
			System.out.println("Please Select from below Option");
			System.out.println("1. Coin");
			System.out.println("2. Small Cup");
			System.out.println("3. Large Cup");
			System.out.println("4. Sugar");
			System.out.println("5. Tea");
			System.out.println("6. Insert Large Cups");
			System.out.println("7. Insert Small Cups");
			System.out.println("8. Set Price");
			System.out.println("9. Cancel");
			System.out.println("10. Dispose");
			System.out.println("11. Quit");			
			System.out.println("---------------------Testing Related Methods-------------------------------");
			System.out.println("12. Show Variables");
			input=sc.nextInt();
		}
		System.out.println("Exit CS589 Project. GoodBye!!");
	}
}
