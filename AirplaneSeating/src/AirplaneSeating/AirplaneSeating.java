/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirplaneSeating;

import java.io.IOException;

/**
 *
 * @author Konnoke aka Kevin Baik
 * 
 */
public class AirplaneSeating {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        Airplane plane = new Airplane();
        plane.showSeating();
        
        
        
        plane.run();
        
        
        
        
        
    }
    
}
