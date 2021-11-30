/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trangchu;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author phamv
 */
public class AllAddr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {
            InetAddress[] addr = InetAddress.getAllByName("www.microsoft.com");
            for (int i = 0; i < addr.length; i++)
            {
                System.out.println (addr[i]);
            }
        }
        catch (UnknownHostException ex)
        {
            System.out.println("Could not find www.microsoft.com");
        }
    }   
}
