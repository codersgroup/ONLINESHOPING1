package com.varunasoft.shopingBackend;

import com.varunasoft.shopingBackend.daoImpl.CatagoryDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        CatagoryDaoImpl CatagoryDaoImpl=new CatagoryDaoImpl();
        System.out.println(CatagoryDaoImpl.list());
    }
}
