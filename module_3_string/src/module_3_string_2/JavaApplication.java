package module_3_string_2;

public interface JavaApplication {
	public static void execution1() {
		System.out.println("execution1()");
		String s1 = "09AZaz";
		System.out.println(s1.length());
		for(int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i) + "-" + s1.codePointAt(i));
		}
		System.out.println();
	}
	
	public static void execution2() {
		System.out.println("execution2()");
		String s1 = "core";
		System.out.println(s1);
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println();
		
		String s3 = "JAVA";
		System.out.println(s3);
		String s4 = s3.toLowerCase();
		System.out.println(s4);
		System.out.println(s3 == s4);
		System.out.println();
	}
	
	public static void execution3() {
		System.out.println("execution3()");
		String s1 = "corejava";
		System.out.println(s1);
		String s2 = s1.substring(4);
		System.out.println(s2);
		System.out.println(s1 == s2);
		String s3 = s1.substring(0, 4);
		System.out.println(s3);
		String s4 = s1.substring(2, 6);
		System.out.println(s4);
		System.out.println();
	}
	
	public static void execution4() {
		System.out.println("execution4()");
		StringBuffer f1 = new StringBuffer();
		f1.insert(0, "java");
		System.out.println(f1);
		f1.setCharAt(0, 'J');
		System.out.println(f1);
		f1.deleteCharAt(2);
		System.out.println(f1);
		System.out.println();
	}
}
