package javaPractice.Practic01;

public class Example06 {
    public static void main(String[] args) {
        String[] a = { " the", "world\t ", " \nwar " };
        for (String s : a) {
            System.out.printf("%s %d\n",s.trim(), s.trim().length() );
        } 
    }
}
 