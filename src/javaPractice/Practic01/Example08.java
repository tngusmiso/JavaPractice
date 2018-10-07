package javaPractice.Practic01;

public class Example08 {
	public static boolean isNullEmptyBlank(String s) {
		if(s==null)
			return true;
		
		String t = s.replace('\t','\0');
		t = t.replace('\n', '\0');
		t = t.trim();
		
		if(t.length()==0) return true;
		else return false;
	}
	
    public static void main(String[] args) {
        String[] a = { null, "", " ", "  ", " \t ", " \t\n", " . "};
        for (String s : a)
            System.out.println(isNullEmptyBlank(s));
	}
}
