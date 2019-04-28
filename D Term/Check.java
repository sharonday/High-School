import java.util.ArrayList;

public class Check {

	public static void main(String[] args) {
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(3);
		b.add(5);
		b.add(2);
		b.add(14);
		b.add(9);
		b.add(4);
		b.add(0);
		b.add(38);
		b.add(1);
		b.add(8);
//		int q = 0;
//        while(q==0){
            for (int i = 0; i < b.size()-1; i++)
            {
                for(int j = 0; j < b.size()-i-1; j++)
                {
                    if(b.get(j) > b.get(j + 1))
                    {
                        int e = b.get(j + 1);
                        b.set(j + 1, b.get(j));
                        b.set(j, e);
                        
                    }
                    System.out.println(b);
                }
            }

        }

	}


