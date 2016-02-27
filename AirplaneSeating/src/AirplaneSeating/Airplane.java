/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirplaneSeating;

import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Konnoke aka Kevin Baik
 * Time Complexity is shit
 * This was rushed and poorly formated
 * 
 */
public class Airplane{
    int[][] firstClass = new int[5][4];
    int[][] economyClass = new int[15][6];
    boolean seatFound;
    
    public Airplane(){
        for(int i = 0; i < 5; i ++){
            //System.out.println("");
            for(int j = 0; j <4; j ++){
                
                firstClass[i][j] = 0;
            }
            //System.out.println("");
            
        }
        
        for(int k = 0; k < 15; k ++){
            
            for(int l = 0; l < 6; l ++){
                
                economyClass[k][l] = 0;
            }
            
            
        }
        
    }
    
    public void showSeating(){
        
        for(int i = 0; i < 5; i ++){
            System.out.print("  ");
            for(int j = 0; j <4; j ++){
                
                System.out.print(firstClass[i][j] +" ");
                if(j == 1){
                    System.out.print("|  |");
                }
            }
            System.out.println("");
            
        }
        System.out.println("-------  -------");
        for(int k = 0; k < 15; k ++){
            
            for(int l = 0; l <6; l ++){
                
                System.out.print(economyClass[k][l] +" ");
                if(l == 2){
                    System.out.print("|  |");
                }
            }
            System.out.println("");
            
        }
        
    }
    
    public void addSeating(){
        
        
    }
    
    public void quit(){
        
        
    }
    
    public boolean aisleSearch(){
        seatFound = false;
        
        
        while(seatFound = false)
        {for(int i=0; i< 5; i++){
            for(int j=1; j<3; j++){
                if(firstClass[i][j] == 0){
                    firstClass[i][j] = 1;
                    System.out.println("Your first class seat is at row: " + (i+1) +", seat: "+ j);
                    seatFound = true;
                    
                }
            }
        }
        break;
        }
         
        if (seatFound==false){
            while(seatFound= false){
            for (int i=0; i<15; i++){
                 
                for(int j=2; j<4; j++){
                        if(economyClass[i][j] == 0){
                           economyClass[i][j] = 1;
                           System.out.println("Your seat is at row: " + (i+1) +", seat: "+ j);
                           
                        }      
                    }
                }
            break;
            }
        }
         
         
         return seatFound;
    }
    
     public boolean centerSearch(){
        seatFound=false;
        while(seatFound = false){
        for(int i=0; i<15; i++){
            for(int j=1; j<5; j++){
                if(economyClass[i][j] == 0){
                    economyClass[i][j] = 1;
                    System.out.println("Your seat is at row: " + (i+1) +", seat: "+ j);
                    seatFound=true;
                    //break;
                }
            }
        }
        break;
        }
        
         
        return seatFound; 
     }
    
    public boolean windowSearch(){
         seatFound = false;
         
         while(seatFound = false){
         for(int i=0; i< 4; i++){
             for(int j=0; j<1; j++){
                 if(firstClass[i][j] == 0){
                     firstClass[i][j] = 1;
                     System.out.println("Your first class seat is at row: " + (i+1) +", seat: "+ j);
                     seatFound = true;
                     //break;
                }
            }for(int j=3; j<4; j++){
                 if(firstClass[i][j] == 0){
                     firstClass[i][j] = 1;
                     System.out.println("Your first class seat is at row: " + (i+1) +", seat: "+ j);
                     seatFound = true;
                     //break;
                }
         }
         break;
         }
         
        if (seatFound==false){
            while(seatFound = false){
            for (int i=0; i<15; i++){
                 
                for(int j=0; j<1; j++){
                    if(economyClass[i][j] == 0){
                        economyClass[i][j] = 1;
                        System.out.println("Your seat is at row: " + (i+1) +", seat: "+ j);
                        seatFound=true;
                        //break;
                    }      
                }
                for(int j=4; j<5; j++){
                    if(economyClass[i][j] == 0){
                        economyClass[i][j] = 1;
                        System.out.println("Your seat is at row: " + (i+1) +", seat: "+ j);
                        seatFound=true;
                        //break;
                    }      
                }
                
              }
            break;
            }
            
        }
         
         
        
         }
         return seatFound;
    }
    
    /**
     *
     * @throws IOException
     */
    public void run() throws IOException      
   {
      boolean done = false;
      Scanner in = new Scanner(System.in);
      
      while (!done)
      {
        System.out.println("Enter 'A' to assign a seat \n Enter 'S' to show the seats \n Enter 'Q' to quit");
        String command = in.next().toUpperCase();

          switch (command) {
              case "A":
                  System.out.println("First or Economy? \n Enter 'F' or 'E'");
                  String whichClass = in.next().toUpperCase();
                  if (whichClass.equals("F"))
                  {
                      System.out.println("How many passengers? (1-2)");
                      int num = in.nextInt();
                      String seat_pref = "A";
                      if (num == 2)
                      {
                          System.out.println("Aisle or Window? \n Enter 'A' or 'W'");
                          seat_pref = in.next().toUpperCase();
                          boolean success = false;
                          if (seat_pref.equals("A"))
                            success = aisleSearch();
                          else if (seat_pref.equals("W"))
                            success = windowSearch();
                          if (!success)
                          System.out.println("Assignment did not succeed.");
                      }
                      boolean success = false;
                      if (seat_pref.equals("A"))
                          success = aisleSearch();
                      else if (seat_pref.equals("W"))
                          success = windowSearch();
                      if (!success)
                          System.out.println("Assignment did not succeed.");
                  }
                  else if (whichClass.equals("E"))
                  {
                      System.out.println("Passengers? (1-3)");
                      int num = in.nextInt();
                      String seat_pref = "A";
                      if (num == 3)
                      {
                          System.out.println("Aisle, Center, or Window? \n Enter 'A', 'C', or 'W'");
                          seat_pref = in.next().toUpperCase();
                          boolean success = false;
                          switch (seat_pref) {
                          case "A":
                              success = aisleSearch();
                              break;
                          case "C":
                              success = windowSearch();
                              break;
                          case "W":
                              success = centerSearch();
                              break;
                          default:
                              break;
                        }
                        if (!success)
                          System.out.println("Assignment did not succeed.");
                      
                      }
                      if (num >= 2)
                      {
                          System.out.println("Aisle, Center, or Window? \n Enter 'A', 'C', or 'W'");
                          seat_pref = in.next().toUpperCase();
                          boolean success = false;
                          switch (seat_pref) {
                          case "A":
                              success = aisleSearch();
                              break;
                          case "C":
                              success = windowSearch();
                              break;
                          case "W":
                              success = centerSearch();
                              break;
                          default:
                              break;
                        }
                        if (!success)
                          System.out.println("Assignment did not succeed.");
                      
                      }
                      
                      
                      boolean success = false;
                      switch (seat_pref) {
                          case "A":
                              success = aisleSearch();
                              break;
                          case "C":
                              success = windowSearch();
                              break;
                          case "W":
                              success = centerSearch();
                              break;
                          default:
                              break;
                      }
                      if (!success)
                          System.out.println("Assignment did not succeed.");
                  }     break;
              case "S":
                  showSeating();
                  break;
              case "Q":
                  done = true;
                  break;
              default:
                  break;
          }
      }
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
