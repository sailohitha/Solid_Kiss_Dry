package EPAM3.Solid_Kiss_Dry;

import java.util.*;
public class Calci_console {
static Scanner sc = new Scanner(System.in);
	public static List<Double> getInput(){
		double a,b;
		System.out.println("Enter first number");
		a = sc.nextDouble();
		System.out.println("Enter second number");;
		b = sc.nextDouble();
		List<Double> res = new ArrayList<Double>();
		res.add(a);
		res.add(b);
		return res;
	}
	public static void main(String[] args) throws Exception{
		int select = 0;
		List<Double> list = null;
		do {
			System.out.println("Select!");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Exit");
			select = sc.nextInt();
			switch(select) {
			case 1:
				list = getInput();
				System.out.println(Calci.add(list.get(0),list.get(1)));
				break;
			case 2:
				list = getInput();
				System.out.println(Calci.substract(list.get(0),list.get(1)));
				break;
			case 3:
				list = getInput();
				System.out.println(Calci.multiply(list.get(0),list.get(1)));
				break;
			case 4:
				list = getInput();
				System.out.println(Calci.divide(list.get(0),list.get(1)));
				break;
			case 5:
				System.out.println("Here's your Result!");
				break;
			default:
				System.out.println("Enter inputs between 1 to 5");
				break;
			}
		}
		while(select != 5);
	}
}
