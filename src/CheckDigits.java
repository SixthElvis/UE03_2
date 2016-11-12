
public class CheckDigits {

	public static void main(String[] args) {
		byte weight = 7;
		int baseID;
		int tempID;
		int tempRem;
		int divider = 5;
		int weightedSum = 0;
		int checkDigit;

		System.out.println("Enter a Base ID with 6 digits (no preceding zero):");
		baseID = Input.readInt();
		System.out.println("Base ID: "+baseID);
		tempID = baseID;
		for (int i = 0; i < 6; i++) {
			tempRem = (int)(tempID%Math.pow(10, divider));
			tempID = (int)(tempID / Math.pow(10, divider));
			System.out.print("D: "+tempID);
			System.out.printf(", R:%6d",tempRem);
			System.out.print(", W: "+weight);
			System.out.printf(", D*W:%3d%n",tempID*weight);
			weightedSum = weightedSum + tempID*weight;
			tempID = tempRem;
			divider--;
			weight--;
		}
		System.out.printf("Weighted Sum    : %3d%n", weightedSum);
		System.out.printf("Weighted Sum/11 : %3d", weightedSum/11);
		checkDigit = weightedSum%11;
		System.out.printf(", R:%2d%n", checkDigit);
		System.out.printf("Check Digit:%8d%n", checkDigit);
		System.out.printf("ID         :%7d%1d", baseID, checkDigit);
	}
}
