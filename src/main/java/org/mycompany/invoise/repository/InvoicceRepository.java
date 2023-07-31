package org.mycompany.invoise.repository;

import org.mycompany.invoise.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoicceRepository {

    private static List<Invoice> invoices = new ArrayList<>();
    public void create(Invoice invoice){
        invoices.add(invoice);
        System.out.println("Invoice added with number: "+invoice.getNumber()+" for customer: "+invoice.getCustomerName());


    }


}
