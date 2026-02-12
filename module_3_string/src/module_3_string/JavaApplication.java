/**
 * 
 */
package module_3_string;

/**
 * 
 */
public interface JavaApplication {
	public static void execution1() {
		String s1 = "java";
		System.out.println(s1);
		
		String s2 = new String("java");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2)); //it gives true bcz String class override equals
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println();
	}
	
	public static void execution2() {
		StringBuffer s1 = new StringBuffer("java");
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("java");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2)); //it gives false bcz StringBuffer class does not override equals
		System.out.println(s1.hashCode()); //same with hashcode as above
		System.out.println(s2.hashCode());
		System.out.println();
	}
	
	public static void execution3() {
		StringBuilder s1 = new StringBuilder("java");
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder("java");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2)); //it gives false bcz StringBuilder class does not override equals
		System.out.println(s1.hashCode()); //same with hashcode as above
		System.out.println(s2.hashCode());
		System.out.println();
	}
	
	public static void execution4() {
		StringBuffer f1 = new StringBuffer("Ra");
		System.out.println(f1);
		StringBuffer f2 = f1.append("ni");
		System.out.println("f1: "+f1);
		System.out.println("f2: "+f2);
		System.out.println("f1 == f2: "+(f1 == f2));
	}
}
