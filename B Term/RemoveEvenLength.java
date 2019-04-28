import java.util.ArrayList;

public class RemoveEvenLength {

	public static void main(String[] args) {
		// let's make this thing first
		ArrayList<String> list = new ArrayList<String>();

		// fill it up
		list.add("Greta");
		list.add("Sarah");
		list.add("Daya");
		list.add("Sam");
		list.add("Nils");
		list.add("Michelle");
		list.add("Sameer");
		list.add("Numaan");
		list.add("Patrick");
		list.add("Yassi");
		list.add("Cameron");
		list.add("Jinchao");
		list.add("Varnika");
		list.add("Tamsin");
		list.add("Kevin");
		list.add("Sathwik");
		list.add("Abby");
		System.out.println(list);

		// find and get rid of evens
		for (int i = 0; i < list.size(); i++){
			if(list.get(i).length() %2 ==0){
				list.remove(i);
				i--;
			}
		}

		// Print? already?
		System.out.print(list);
	}

}
