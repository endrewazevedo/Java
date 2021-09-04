package aula19;

public class Exerc22 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int qZero = 0, qUm = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random()*1);
			if(vetorA[i] == 0) {
				qZero++;
			}
			else {
				qUm++;
			}
		}
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
			}
		System.out.println("\nNuméro zero são " +qZero*10+ "%");
		System.out.println("Numéro um são " +qUm*10+ "%");
		

	}

}
