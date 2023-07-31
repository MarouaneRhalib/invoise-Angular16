package org.mycompany.invoise.service;

import org.mycompany.invoise.entity.Invoice;
import org.mycompany.invoise.repository.InvoicceRepository;

public class InvoiceService {
    private static long lastNumber=0L;
    private InvoicceRepository invoicceRepository = new InvoicceRepository();
    public void createInvoice (Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
        invoicceRepository.create(invoice);

    }

}
