package com.bentsou.jibx.test;

import java.io.StringWriter;
import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IMarshallingContext;
import org.jibx.runtime.JiBXException;

/**
 *
 * @author bentsou
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Building Order object.");
        Order order = new Order(345);
        System.out.println(order);
        
        System.out.println("Marshalling");
        StringWriter stringWriter = new StringWriter();
        try {
            IBindingFactory bindingFactory = BindingDirectory.getFactory(Order.class);
            IMarshallingContext context = bindingFactory.createMarshallingContext();
            context.marshalDocument(order, "UTF-8", false, stringWriter);
        } catch (JiBXException ex) {
            ex.printStackTrace();
        }
        
        System.out.println(stringWriter.toString());
        
    }
}
