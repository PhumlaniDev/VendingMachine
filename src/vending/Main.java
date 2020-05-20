package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolates;
import vending.product.Product;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    @Test
    public void shouldAddStock(){

        //Chocolates
        OverloadedVendingMachine vendingMachine1 = new OverloadedVendingMachine(0,0,0);
        Chocolates chocolates = new Chocolates();
        vendingMachine1.addStock(chocolates);
        assertEquals(1,vendingMachine1.getStock(chocolates));


        //SaltySnacks
        OverloadedVendingMachine vendingMachine2 = new OverloadedVendingMachine(0,0,0);
        SaltySnacks saltySnacks = new SaltySnacks();
        vendingMachine2.addStock(saltySnacks);
        vendingMachine2.addStock(saltySnacks);
        assertEquals(2,vendingMachine2.getStock(saltySnacks));


        //SoftDrinks
        OverloadedVendingMachine vendingMachine3 = new OverloadedVendingMachine(0,0,0);
        SoftDrinks softDrinks = new SoftDrinks();
        vendingMachine3.addStock(softDrinks);
        vendingMachine3.addStock(softDrinks);
        vendingMachine3.addStock(softDrinks);
        assertEquals(3,vendingMachine3.getStock(softDrinks));


        //Products
        OverloadedVendingMachine vendingMachine4 = new OverloadedVendingMachine(0,0,0);
        Product product = new Product();
        vendingMachine4.addStock(product);
        assertEquals(3,vendingMachine4.getStock());


    }

    @Test
    public void shouldBuyStock(){

        //Chocolates
        OverloadedVendingMachine vendingMachine1 = new OverloadedVendingMachine(0,0,0);
        Chocolates chocolates = new Chocolates();
        vendingMachine1.addStock(chocolates);
        vendingMachine1.buy(chocolates);
        assertEquals(0,vendingMachine1.getStock(chocolates));


        //SaltySnacks
        OverloadedVendingMachine vendingMachine2 = new OverloadedVendingMachine(0,0,0);
        SaltySnacks saltySnacks = new SaltySnacks();
        vendingMachine2.addStock(saltySnacks);
        vendingMachine2.addStock(saltySnacks);
        vendingMachine2.buy(saltySnacks);
        assertEquals(1,vendingMachine2.getStock(saltySnacks));


        //SoftDrinks
        OverloadedVendingMachine vendingMachine3 = new OverloadedVendingMachine(0,0,0);
        SoftDrinks softDrinks = new SoftDrinks();
        vendingMachine3.addStock(softDrinks);
        vendingMachine3.addStock(softDrinks);
        vendingMachine3.addStock(softDrinks);
        vendingMachine3.buy(softDrinks);
        assertEquals(2,vendingMachine3.getStock(softDrinks));

    }

    @Test
    public void shouldAddAndBuyStock(){

        //Chocolates
        OverloadedVendingMachine vendingMachine1 = new OverloadedVendingMachine(0,0,0);
        Chocolates chocolates = new Chocolates();
        vendingMachine1.addStock(chocolates);
        vendingMachine1.addStock(chocolates);
        vendingMachine1.addStock(chocolates);
        vendingMachine1.buy(chocolates);
        vendingMachine1.addStock(chocolates);
        vendingMachine1.addStock(chocolates);
        vendingMachine1.buy(chocolates);
        assertEquals(3,vendingMachine1.getStock(chocolates));


        //SaltySnacks
        OverloadedVendingMachine vendingMachine2 = new OverloadedVendingMachine(0,0,0);
        SaltySnacks saltySnacks = new SaltySnacks();
        vendingMachine2.buy(saltySnacks);
        vendingMachine2.addStock(saltySnacks);
        vendingMachine2.addStock(saltySnacks);
        vendingMachine2.addStock(saltySnacks);
        vendingMachine2.buy(saltySnacks);
        vendingMachine2.buy(saltySnacks);
        vendingMachine2.addStock(saltySnacks);
        vendingMachine2.addStock(saltySnacks);
        vendingMachine2.addStock(saltySnacks);
        vendingMachine2.addStock(saltySnacks);
        assertEquals(4,vendingMachine2.getStock(saltySnacks));


        //SoftDrinks
        OverloadedVendingMachine vendingMachine3 = new OverloadedVendingMachine(0,0,0);
        SoftDrinks softDrinks = new SoftDrinks();
        vendingMachine3.addStock(softDrinks);
        vendingMachine3.addStock(softDrinks);
        vendingMachine3.buy(softDrinks);
        vendingMachine3.addStock(softDrinks);
        vendingMachine3.addStock(softDrinks);
        vendingMachine3.addStock(softDrinks);
        vendingMachine3.buy(softDrinks);
        vendingMachine3.addStock(softDrinks);
        vendingMachine3.addStock(softDrinks);
        vendingMachine3.addStock(softDrinks);
        vendingMachine3.addStock(softDrinks);
        vendingMachine3.buy(softDrinks);
        vendingMachine3.buy(softDrinks);
        assertEquals(5,vendingMachine3.getStock(softDrinks));

    }
}
