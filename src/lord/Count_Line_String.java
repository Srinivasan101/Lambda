package lord;

public class Count_Line_String {

	public static void main(String[] args) {
		        String str = "This is\na\nmulti-line\nstring.";

		        int numLines = 1; // Start at 1 since there's always at least one line

		        for (int i = 0; i < str.length(); i++) {
		            if (str.charAt(i) == '\n') {
		                numLines++;
		            }
		        }

		        System.out.println("String: " + str);
		        System.out.println("Number of lines: " + numLines);
		    }
	}


	/*public class CountLinesExample {
    public static void main(String[] args) {
        String str = "This is\na\nmulti-line\nstring.";

        int numLines = str.split("\r\n|\r|\n").length;

        System.out.println("String: " + str);
        System.out.println("Number of lines: " + numLines);
    }
}*/
