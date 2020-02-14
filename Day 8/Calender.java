import java.util.*;

class Calender
{
    public static void main(String [] args)
    {
        Date d = new Date();
        System.out.println(d);
        // System.out.println(d.getTime());
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
        System.out.println(d.getClass());

    }
}