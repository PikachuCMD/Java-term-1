
/*import java.util.Scanner;
public class Q35 {
       public static void main(String[] args) {
           String x=new Scanner(System.in).next();
           String y=new Scanner(System.in).next();
           if(x.equalsIgnoreCase(y)){System.out.print("same");}
           else{System.out.print("defferent");}
       }
}*/
import java.util.Scanner;

public class Q35 {
	private static boolean equalIgnoreCase(String str1, String str2) {
		int i = 0;
		int len1 = str1.length();
		int len2 = str2.length();
		if (len1 != len2) {
			return false;
		}
		while (i < len1) {
			if (str1.charAt(i) == str2.charAt(i)) {
				i++;
			} else if (!((str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
					|| (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z'))) {
				return false;
			} else if (!((str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z')
					|| (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z'))) {
				return false;
			} else {
				if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
					if (str1.charAt(i) - 32 != str2.charAt(i)) {
						return false;
					}
				} else if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') {
					if (str1.charAt(i) + 32 != str2.charAt(i)) {
						return false;
					}
				}
				i++;
			}
		}
		return true;
	}

	private static void equalIgnoreCaseUtil(String str1, String str2) {
		boolean res = equalIgnoreCase(str1, str2);
		if (res == true) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();

		equalIgnoreCaseUtil(str1, str2);

	}

}
