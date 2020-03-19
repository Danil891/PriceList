package price;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ListTest{

    @Test
    public void testAddProduct() {
        List list = new List();
        list.addProduct(2, new List.Product("milk", 7, 0));
        list.addProduct(1, new List.Product("mars", 1, 50));
        List priceList1 = new List(new HashMap<Integer, List.Product>() {{
            put(2, new List.Product("milk", 700));
            put(1, new List.Product("mars", 150));
        }});
        assertEquals(list, priceList1);
        list.addProduct(3, new List.Product("fewf",200, 66));
        assertNotEquals(list, priceList1);
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