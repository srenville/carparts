/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparts;

import java.io.FileNotFoundException;

/**
 *
 * @author Toozigba
 */
public class CarParts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        CarPartsServer server=new CarPartsServer();
        PartsClient client=new PartsClient();
        server.main(null);
        client.main(null);
    }
    
}
