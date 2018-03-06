/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparts;

import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.mail.MessagingException;

/**
 *
 * @author Toozigba
 */
public interface sendMail extends Remote  {
    String sendMail(String EmailAddress)throws RemoteException, MessagingException;
}
