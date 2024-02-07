package com.invoice.invoicemanager.services;

import com.invoice.invoicemanager.models.Invoice;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    public void generateInvoice(Invoice invoice){
    Double invoiceAmount = invoice.getAdvert().getAdvertSizeAndPrice().getAdvertPrice();
    String clientName = invoice.getAdvert().getClient().getName();
    String clientEmail = invoice.getAdvert().getClient().getEmail();
    }
}
