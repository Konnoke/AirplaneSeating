/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirplaneSeating;
import java.util.Scanner;

/**
 *
 * @author Konnoke
 * Time Complexity of this is shit
 */
public class Airplane{
    private Scanner in;
    int[][] firstClass = new int[5][4];
    int[][] economyClass = new int[15][6];
    
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
