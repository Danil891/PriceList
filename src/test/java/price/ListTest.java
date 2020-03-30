package price;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ListTest{

    @Test
    public void testAddProduct() {
        List priceList1 = new List();
        priceList1.addProduct(2, new List.Product("milk", 7, 0));
        priceList1.addProduct(1, new List.Product("mars", 1, 50));

        List priceList2 = new List();
        priceList2.addProduct(2, new List.Product("milk", 7, 0));
        priceList2.addProduct(1, new List.Product("mars", 1, 50));
        priceList1.addProduct(3, new List.Product("bread" , 5, 0  ));
        assertNotEquals(priceList1, priceList2);
    }

    @Test
    public void testRemoveProduct() {
        List priceList1 = new List();
        priceList1.addProduct(2, new List.Product("milk", 7, 0));
        priceList1.addProduct(1, new List.Product("mars", 1, 50));

        List priceList2 = new List();
        priceList2.addProduct(2, new List.Product("milk", 7, 0));
        priceList2.addProduct(1, new List.Product("mars", 1, 50));
        priceList2.addProduct(3, new List.Product("bread" , 5, 0  ));
        assertNotEquals(priceList1, priceList2);
        priceList2.removeProduct(3);
        assertEquals(priceList1, priceList2);
    }

    @Test
    public void testChangeProduct() {
        List priceList1 = new List();
        priceList1.addProduct(2, new List.Product("milk", 7, 0));
        priceList1.addProduct(1, new List.Product("mars", 1, 50));

        List priceList2 = new List();
        priceList2.addProduct(2, new List.Product("milk", 7, 0));
        priceList2.addProduct(1, new List.Product("mars", 1, 50));
        priceList2.changeProduct(1, new List.Product("bread" , 5, 0  ));

        assertNotEquals(priceList1, priceList2);
    }

    @Test
    public void testCountPrice() {
        List priceList1 = new List();
        priceList1.addProduct(1, new List.Product("mars", 1, 50));
        priceList1.addProduct(2, new List.Product("milk", 7, 0));

        assertEquals(priceList1.countPrice(1, 3), 4, 50);
        assertEquals(priceList1.countPrice(2, 4), 28, 0);


    }
}