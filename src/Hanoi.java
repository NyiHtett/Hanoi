public class Hanoi {
	private int numDiscs;
	Hanoi(int n){
		numDiscs = n;
		moveDiscs(numDiscs, 1, 3, 2);
	}
	public void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
		if(num>0) {
			moveDiscs(num-1, fromPeg, tempPeg, toPeg);
			System.out.println("move a disc from peg "+fromPeg+" to peg"+toPeg);
			moveDiscs(num-1, tempPeg, toPeg, fromPeg);
		}
	}
	public static void main(String[] args) {
		new Hanoi(1);
	}

}
