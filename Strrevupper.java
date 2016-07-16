/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strrevupper;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Strrevupper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String a,b,c,aaa;
         Scanner ss=new Scanner(System.in);
        a=ss.nextLine();
       String[] d=a.split(" ");
      b=new StringBuffer(d[0]).reverse().toString();
        System.out.println(""+b);
      b=b.toUpperCase();
      c=new StringBuffer(d[1]).reverse().toString();
        System.out.println(""+c);
      c=c.toUpperCase();
      aaa=b+" "+c;
        System.out.println(""+aaa);
    }
    
}
