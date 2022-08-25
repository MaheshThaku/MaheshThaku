// @MaheshThakur
// contact Number - 9812085112

/*
1.Write a method that takes a String and returns a String of the
same length containing the 'X' character in all positions except the
last 4 positions. The characters in the last 4 positions must be the
same as in the original string. For example, if the argument is
"12345678", the return value should be "XXXX5678".
 */
// class declaration is begin
public class ReplaceCharsToX {
//	accepting a single string from user
	String replaceStrTO(String s)
	{
//		here strReplace variable containing "XXXX"
		String strReplace = "XXXX";
		
//		here newStr is variable is containing strReplace + s.substring(4)
//		which means first XXXX and than after four char print string chars
		String newStr = strReplace + s.substring(4);
		
//		Returning newStr;
		return newStr;
	}
	public static void main(String[] args) {
//		creating instance of class ReplaceCharsToX for invoking its method
		ReplaceCharsToX ob = new ReplaceCharsToX();
		
//		here the result of method is storing into a variable
		String s = ob.replaceStrTO("295511443055");
		
//		printing output of returning value
		System.out.println(s);
	}

}
