import java.util.Random;

public class RandomGenerator {

	public static void main(String[] args) {
		
		System.out.println("Generate 10 random integers between 1 and 6");
		
		
		for(int i=0; i<=10; i++){
			
			int randomNumber = randomNumber(5,95);
			System.out.println("Generated number: " + randomNumber);
        }
    
        System.out.println("Done.");
		
	}

	
	public static int randomNumber(int bound1, int bound2){
		
		Random ran = new Random();
		
		int max = Math.max(bound1, bound2);
		int min = Math.min(bound1, bound2);
		
			int dif = max - min;
		return min + ran.nextInt(dif);
	}

}
