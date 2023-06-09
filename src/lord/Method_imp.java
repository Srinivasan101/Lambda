package lord;

public class Method_imp {
	
		public static int countWords(String str) {
		    if (str == null || str.isEmpty()) {
		        return 0;
		    }
		    
		    String[] words = str.trim().split("\\s+");
		    return words.length;
		}
		public static void main(String [] args) {
			String str = "This is a sentence with nine words";
			int count = countWords(str);
			System.out.println("The string contains " + count + " words.");

		}
		
	}



