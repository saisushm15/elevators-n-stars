/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevatror.and.stairs;

import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class ElevatrorAndStairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t>0)
        {
           int n=input.nextInt();
           int v1=input.nextInt();
           int v2=input.nextInt();
           if(v2>(int)(v1*Math.sqrt(2)))
           {
		System.out.println("Elevator");
           }
           else
           {
	        System.out.println("Stairs");
           }
        }
        t--;
    }
    
}
