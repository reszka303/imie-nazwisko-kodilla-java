package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given

        Item itemSoap = new Item(new BigDecimal(1.99),500);
        Item itemWashingPowder = new Item(new BigDecimal(34.99),250);
        Item itemBike = new Item(new BigDecimal(5769.00),10);

        Product soap = new Product("Bambino");
        Product washingPowder = new Product("Ariel");
        Product bike = new Product("Cube");


        soap.getItems().add(itemSoap);
        itemSoap.setProduct(soap);

        washingPowder.getItems().add(itemWashingPowder);
        itemWashingPowder.setProduct(washingPowder);

        bike.getItems().add(itemBike);
        itemBike.setProduct(bike);

        Invoice invoice = new Invoice("30/10/2019");

        invoice.getItems().add(itemSoap);
        itemSoap.setInvoice(invoice);

        invoice.getItems().add(itemWashingPowder);
        itemWashingPowder.setInvoice(invoice);

        invoice.getItems().add(itemBike);
        itemBike.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int itemSoapID = itemSoap.getId();
        int soapID = soap.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertNotEquals(0, itemSoapID);
        Assert.assertNotEquals(0, soapID);

        //CleanUp
        invoiceDao.delete(invoice);
    }
}
