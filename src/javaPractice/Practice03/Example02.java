package javaPractice.Practice03;

public class Example02 {
	
	static String toString(String[] a) {
		
		StringBuilder builder = new StringBuilder();
		builder.append('{');
		for(String s:a) {
			if (builder.length() > 1) builder.append(", ");
            builder.append('"');
            builder.append(s);
            builder.append('"');
		}
        builder.append('}');
		
		return new String(builder);
	}

    public static void main(String[] args) {
        String[] a = { "one", "two", "three", "four" };
        String s = toString(a);
        System.out.println(s);
	}
}
