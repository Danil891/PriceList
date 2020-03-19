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
    }

    @Test
    public void testChangeProduct() {
    }

    @Test
    public void testCountPrice() {
    }
}