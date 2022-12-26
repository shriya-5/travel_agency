/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trip;

import java.awt.Component;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SHRIYA
 */
interface amt
{
    void calculate();
}
 class hotel_bill implements amt
       {
   public  int hotel_bill=12956;
    public int other_activites=500;
    public int site_seeing=3096;
    public int total=hotel_bill+other_activites+site_seeing;
            public void calculate()
            {
                System.out.println("\n FOOD DETAILS "+"\n");
                 System.out.println("\n HOTEL NAME :  "+"Club Mahindra Resorts "+"\n");
                 System.out.println("\n HOTEL PH :  "+"+91 2342344546 "+"\n");
                  System.out.println("\n Room Rent :  "+ hotel_bill+"\n");
                  System.out.println("\n Activites :  "+ other_activites+"\n");
                System.out.println("\n Site-Seeing :  "+ site_seeing+"\n\n");
                   System.out.println("\n - - - - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - \n");
                  System.out.println("\n HOTEL-TOTAL :  "+ total+"\n");
                   System.out.println("\n - - - - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - \n");
                 
            }
        }
 class food_bill extends hotel_bill
 {
    public int breakfast=5000;
    public int lunch=7000;
    public int dinner=8000;
    public int tot=breakfast+lunch+dinner;
     public void cal()
            {
                 System.out.println("\n FOOD DETAILS "+"\n");
                System.out.println("\n Breakfast :  "+ breakfast+"\n");
                 System.out.println("\n Lunch :  "+ lunch+"\n");
                 System.out.println("\n Dinner :  "+ dinner+"\n");
                 System.out.println("\n - - - - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - \n");
                 System.out.println("\n FOOD BILL :  "+tot+"\n");
                 System.out.println("\n - - - - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - \n");
            }
     
 }
 class travel_exp extends food_bill
 {
     public int exp=5790;
     public void travel(String mode)
     {
           System.out.println("\n Mode of Transport  "+ mode +"\n");
           System.out.println("\n Travel Expenditure "+ exp+"\n");
     }
 }
 class disp_bill extends travel_exp
 {
     public void disp(int no)
     {
        
         int total_amt=total+tot+exp;
          System.out.println("\n TOTAL BILL :  "+ total_amt+"\n");
         System.out.println("\n TOTAL BILL FOR  "+ no + " tickets : "+ total_amt*no+"\n");
         
     }
 }
class InvalidticketException  extends Exception  
{  
    public InvalidticketException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
 class ex
{
     void validate (int no) throws InvalidticketException{    
       if(no > 7){  
  
        // throw an object of user defined exception  
        throw new InvalidticketException("Ticket not available");  
        
        
    }  
       else {   
        System.out.println("\n  Seats Available\n Please Proceed with Bill");  
        }   
     }    
}

  class bus extends Thread
        {
             public void run()
             {
                  System.out.println("------------------------\n");
                 System.out.println("Mode of Transport : BUS\n");
                 System.out.println("------------------------\n");
                 System.out.println("Bus Name : RYC Travels\n");
                System.out.println("Departure time : 19:20 PM\n");
                 System.out.println("Arrival time : 8:20 AM\n");
                  System.out.println("------------------------\n");
             }
        }
    class train extends Thread
        {
             public void run()
             {
                 System.out.println("Mode of Transport : TRAIN\n");
                System.out.println("------------------------\n");
                 System.out.println("Train Name : Chennai Express\n");
                  System.out.println("Train No : AE432\n");
                 System.out.println("Departure time : 6:20 PM\n");
                 System.out.println("Arrival time : 8:20 AM\n");
                  System.out.println("------------------------\n");
             }
        }
    class Flight extends Thread
        {
             public void run()
             {
                 System.out.println("Mode of Transport : FLIGHT\n");
                 System.out.println("------------------------\n");
                 System.out.println("Flight Name : Indigo Airways \n");
                 System.out.println("Flight No : IN989\n");
                 System.out.println("Departure time : 6:20 PM\n");
                System.out.println("Arrival time : 7:20 AM\n");
                  System.out.println("------------------------\n");
             }
        }
public class Trip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        System.out.println("******************************************************************");
        System.out.println("\nTRIP AGENCY\n");
        System.out.println("******************************************************************");
        System.out.println("The Whole awaits, Travel smarter not harder\n");
        System.out.println("\nReach us @");
        System.out.println("\nPh no:+91 9342323423");
        System.out.println("\nEmail ID:tripagency@gmail.com\n");
        System.out.println("******************************************************************");
        String y=" ",name = null,address,phno,mail;
        String source = null,destination = null,transport = null;
        int no = 0;
        
        do
        {
            System.out.println("\n1.Enter Personal Details\n");
            System.out.println("\n2.Enter Travel Details\n");
            System.out.println("\n3.Generate Bill\n");
            int choice;
            
            System.out.println("\nEnter your Choice: \n");
            String n=in.nextLine();
            choice=Integer.parseInt(n);
            switch(choice)
            {
                case 1:
                    System.out.println("\n******PERSONAL DETAILS******\n");
                    System.out.println("\nEnter Name :\n");
                    name=in.nextLine();
                    System.out.println("\nEnter Address :\n");
                    address=in.nextLine();
                    System.out.println("\nEnter Phone number :\n");
                    phno=in.nextLine();
                    System.out.println("\nEnter Mail :\n");
                    mail=in.nextLine();
                   break;
                   
                case 2:
                    System.out.println("\n******TRAVEL DETAILS******\n");
                    System.out.println("\nEnter Pickup Place :\n");
                    System.out.println("\n1.TamilNadu\n2.Kerala\n3.Hyderabad\n4.Goa\n5.Banglore");
                    System.out.println("\nEnter your Choice: \n");
                     String n1=in.nextLine();
                    int choice1=Integer.parseInt(n1);
                    switch(choice1)
                    {
                        case 1:
                            source="TamilNadu";
                            break;
                        case 2:
                            source="Kerala";
                            break;
                        case 3:
                            source="Hyderabad";
                            break;
                        case 4:
                            source="Goa";
                            break;
                        case 5:
                            source="Banglore";
                            break;
                            
                    }
                    
                    System.out.println("\nEnter Destination :\n");
                    System.out.println("\n1.TamilNadu\n2.Kerala\n3.Hyderabad\n4.Goa\n5.Banglore");
                    System.out.println("\nEnter your Choice: \n");
                     String n2=in.nextLine();
                    int choice2=Integer.parseInt(n2);
                    switch(choice2)
                    {
                        case 1:
                            destination="TamilNadu";
                            break;
                        case 2:
                            destination="Kerala";
                            break;
                        case 3:
                            destination="Hyderabad";
                            break;
                        case 4:
                            destination="Goa";
                            break;
                        case 5:
                           destination="Banglore";
                            break;
                            
                    }
                    System.out.println("\nAvailable Transport Details");
                    System.out.println("\n****************************************");
                    System.out.println("\n PICKUP PLACE :"+source);
                     System.out.println("\n DESTINATION :"+destination);
                     bus b=new bus();
        train t=new train();
        Flight f=new Flight();
        b.start();
        try {
            b.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Trip.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.start();
        try {
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Trip.class.getName()).log(Level.SEVERE, null, ex);
        }
        f.start();
        try {
            f.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Trip.class.getName()).log(Level.SEVERE, null, ex);
        }
                    System.out.println("\nEnter Mode of Transport :\n");
                    System.out.println("\n1.Bus\n2.Train\n3.Flight\n");
                    System.out.println("\nEnter your Choice: \n");
                     String n3=in.nextLine();
                    int choice3=Integer.parseInt(n);
                    switch(choice3)
                    {
                        case 1:
                          transport="Bus";
                            break;
                        case 2:
                           transport="Train";
                            break;
                        case 3:
                            transport="Flight";
                            break;
                      
                    }
                    break;
                case 3:
                     System.out.println("\n********8BILL*********\n");
                     System.out.println("\nCUSTOMER NAME  : "+name);
                     System.out.println("\n Enter the number of seats");
                    
                      String number=in.nextLine();
                     no=Integer.parseInt(number);
                      System.out.println("Checking Seat Availabilty......");
                      ex e=new ex();
        try  
        {  
            
            e.validate(no);
                    
        }  
        catch (InvalidticketException ex)  
        {  
             System.out.println("\n Invalid!\n Seats Unavailable"); 
           
        }  
                     disp_bill fb=new disp_bill();
                      fb.calculate();
                    fb.cal();
                     fb.travel(transport);
                      fb.disp(no);
                    
                    break;
            }
            System.out.println("\n Do you want to continue:(yes/no)");
             y=in.nextLine();
             
        }while(y.equalsIgnoreCase("yes"));
        
    }
    
}
