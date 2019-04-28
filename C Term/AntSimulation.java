
public class AntSimulation {

	public static void main(String[] args) {
		AntPopulation ants = new AntPopulation(10);
		for (int i = 0; i < 3; i++){
			ants.breed();
			ants.spray();
			System.out.println("pop: " + ants.getAnts());
		}

	}

}
