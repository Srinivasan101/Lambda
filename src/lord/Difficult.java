package lord;

public class Difficult {

	public static void main(String[] args) {
		String arr = "Ready to race 2023 !!!";
		int letter = 0, space = 0 , num =0, others =0;
		char [] array = arr.toCharArray();
		for (int i = 0 ; i < arr.length(); i++) {
			if(Character.isDigit(array[i])) {
				num++;
			}else if (Character.isLetter(array[i])) {
				letter++;
			}else if (Character.isSpace(array[i])) {
				space++;
			}else {
				others++;
			}
		}
			System.out.println("count of the array " + arr);
			System.out.println("letter : " + letter + " space : " +space + " num : " + num + " others : " + others);
	}

}
