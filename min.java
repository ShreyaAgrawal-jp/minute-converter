import java.io.*;
import java.util.*;
public class min_days_yrs {
        public static void main(String[] args) throws IOException {
            Scanner s=new Scanner (System.in);
            System.out.println("minutes: ");
            int m=s.nextInt();
            int d,y;
            if(m<0)
                System.out.println("Negative value for minutes!!!");
            else
            {d=m/1440;
            y=m/525600;
            System.out.println("\n"+"days: "+d+"\n");
            System.out.println("years: "+y);
            }
        }
}
