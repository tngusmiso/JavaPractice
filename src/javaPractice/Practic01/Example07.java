package javaPractice.Practic01;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

class Data {
    double weight;
    String name;
    boolean enabled;
    Date startDate;
    
    public Data(double weight, String name, boolean enabled, Date startDate) {
        this.weight = weight;
        this.name = name;
        this.enabled = enabled;
        this.startDate = startDate;
    }
   
    @Override
    public boolean equals(Object obj) {
    	if (obj instanceof Data == false) return false;
        Data d = (Data)obj;
        return this.weight==d.weight && Objects.equals(this.name, d.name) 
        		&& this.enabled==d.enabled && Objects.equals(this.startDate, d.startDate);
    }
}


public class Example07 {
    static Date createDate(int year, int month, int day) {
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        return calendar.getTime();
    }
    
    public static void main(String[] args) {
        Data d1 = new Data(10.3, "data", true, createDate(2018, 9, 10));
        Data d2 = new Data(10.3, "data", true, createDate(2018, 9, 10));
        Data d3 = new Data(11.9, "data", true, createDate(2018, 9, 10));
        Data d4 = new Data(10.3, "datt", true, createDate(2018, 9, 10));
        Data d5 = new Data(10.3, "data", false, createDate(2018, 9, 10));
        Data d6 = new Data(10.3, "data", true, createDate(2018, 9, 11));
        
        System.out.println(d1.equals(d2));	//true
        System.out.println(d1.equals(d3));	//false
        System.out.println(d1.equals(d4));	//false
        System.out.println(d1.equals(d5)); 	//false
        System.out.println(d1.equals(d6));	//false
    }
}