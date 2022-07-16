package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void test(){
        //Given
        Product product1 = new Product("orange");
        Product product2 = new Product("apple");
        Product product3 = new Product("banana");

        Item item1 = new Item(product1, BigDecimal.valueOf(15), 4, BigDecimal.valueOf(60));
        Item item2 = new Item(product2, BigDecimal.valueOf(20), 4, BigDecimal.valueOf(80));
        Item item3 = new Item(product3, BigDecimal.valueOf(10), 2, BigDecimal.valueOf(20));

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        Invoice invoice = new Invoice("124", items);

        //When
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        invoiceDao.save(invoice);

        //Then
        Assertions.assertNotNull(invoice.getId());
        Assertions.assertNotNull(item1.getId());
        Assertions.assertNotNull(item2.getId());
        Assertions.assertNotNull(item3.getId());
        Assertions.assertNotNull(product1.getId());
        Assertions.assertNotNull(product2.getId());
        Assertions.assertNotNull(product3.getId());

        //CleanUp
        try {
            invoiceDao.deleteById(invoice.getId());
            productDao.deleteById(product1.getId());
            productDao.deleteById(product2.getId());
            productDao.deleteById(product3.getId());
        } catch (Exception e) {
            //do nothing
        }
    }
}
