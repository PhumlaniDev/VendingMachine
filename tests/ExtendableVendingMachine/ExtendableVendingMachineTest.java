package ExtendableVendingMachine;

import org.junit.jupiter.api.Test;
import vending.ExtendableVendingMachine;
import vending.product.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtendableVendingMachineTest {

    @Test
    public void shouldAddStock(){

        //Chocolates
        ExtendableVendingMachine extendableVendingMachine1 = new ExtendableVendingMachine(0, 0,
                0, 0);

        Product chocolates = new Chocolates();
        extendableVendingMachine1.addStock(chocolates);
        assertEquals(3, extendableVendingMachine1.getStock(chocolates));

        //Chocolates
        ExtendableVendingMachine extendableVendingMachine2 = new ExtendableVendingMachine(0, 0,
                0, 0);
        Product chocolates1 = new Chocolates();
        extendableVendingMachine2.addStock(chocolates1,3);
        extendableVendingMachine2.addStock(chocolates1,3);
        assertEquals(6, extendableVendingMachine2.getStock(chocolates1));

        //SaltySnacks
        ExtendableVendingMachine extendableVendingMachine3 = new ExtendableVendingMachine(0, 0,
                0, 0);
        Product saltySnacks = new SaltySnacks();
        extendableVendingMachine3.addStock(saltySnacks);
        extendableVendingMachine3.addStock(saltySnacks);
        assertEquals(6, extendableVendingMachine3.getStock(saltySnacks));

        //SaltySnacks
        ExtendableVendingMachine extendableVendingMachine4 = new ExtendableVendingMachine(0, 0,
                0, 0);
        Product saltySnacks1 = new SaltySnacks();
        extendableVendingMachine4.addStock(saltySnacks1,3);
        extendableVendingMachine4.addStock(saltySnacks1,3);
        extendableVendingMachine4.addStock(saltySnacks1,3);
        assertEquals(9, extendableVendingMachine4.getStock(saltySnacks1));

        //SoftDrinks
        ExtendableVendingMachine extendableVendingMachine5 = new ExtendableVendingMachine(0, 0,
                0, 0);
        Product softDrinks = new SoftDrinks();
        extendableVendingMachine5.addStock(softDrinks);
        extendableVendingMachine5.addStock(softDrinks);
        extendableVendingMachine5.addStock(softDrinks);
        assertEquals(9, extendableVendingMachine5.getStock(softDrinks));

        //SoftDrinks
        ExtendableVendingMachine extendableVendingMachine6 = new ExtendableVendingMachine(0, 0,
                0, 0);
        Product softDrinks1 = new SoftDrinks();
        extendableVendingMachine6.addStock(softDrinks1,3);
        extendableVendingMachine6.addStock(softDrinks1,3);
        extendableVendingMachine6.addStock(softDrinks1,3);
        extendableVendingMachine6.addStock(softDrinks1,3);
        assertEquals(12, extendableVendingMachine6.getStock(softDrinks1));

        //Sweets
        ExtendableVendingMachine extendableVendingMachine7 = new ExtendableVendingMachine(0, 0,
                0, 0);
        Product sweets = new Sweets();
        extendableVendingMachine7.addStock(sweets);
        extendableVendingMachine7.addStock(sweets);
        extendableVendingMachine7.addStock(sweets);
        extendableVendingMachine7.addStock(sweets);
        assertEquals(12, extendableVendingMachine7.getStock(sweets));

        //Sweets
        ExtendableVendingMachine extendableVendingMachine8 = new ExtendableVendingMachine(0, 0,
                0, 0);
        Product sweets1 = new Sweets();
        extendableVendingMachine8.addStock(softDrinks1,3);
        extendableVendingMachine8.addStock(softDrinks1,3);
        extendableVendingMachine8.addStock(softDrinks1,3);
        extendableVendingMachine8.addStock(softDrinks1,3);
        extendableVendingMachine8.addStock(softDrinks1,3);
        assertEquals(15, extendableVendingMachine8.getStock(softDrinks1));


    }

    @Test
    public void shouldAddAndBuyStock(){

        //Chocolates
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(0,0,
                0,0);
        Product chocolates = new Chocolates();
        extendableVendingMachine.addStock(chocolates,3);
        extendableVendingMachine.buy(chocolates,2);
        extendableVendingMachine.addStock(chocolates,3);
        extendableVendingMachine.addStock(chocolates,3);
        extendableVendingMachine.addStock(chocolates,3);
        extendableVendingMachine.buy(chocolates,4);
        assertEquals(6,extendableVendingMachine.getStock(chocolates));

        //SaltySnacks
        ExtendableVendingMachine extendableVendingMachine1 = new ExtendableVendingMachine(0,0,
                0,0);
        Product saltySnacks = new SaltySnacks();
        extendableVendingMachine1.addStock(saltySnacks,3);
        extendableVendingMachine1.buy(saltySnacks,3);
        extendableVendingMachine1.addStock(saltySnacks,3);
        extendableVendingMachine1.addStock(saltySnacks,3);
        extendableVendingMachine1.addStock(saltySnacks,3);
        extendableVendingMachine1.buy(saltySnacks,5);
        extendableVendingMachine1.addStock(saltySnacks,3);
        extendableVendingMachine1.addStock(saltySnacks,3);
        extendableVendingMachine1.addStock(saltySnacks,3);
        assertEquals(13,extendableVendingMachine1.getStock(saltySnacks));

        //SoftDrinks
        ExtendableVendingMachine extendableVendingMachine2 = new ExtendableVendingMachine(0,0,
                0,0);
        Product softDrinks = new SoftDrinks();
        extendableVendingMachine2.addStock(softDrinks,3);
        extendableVendingMachine2.buy(softDrinks,3);
        extendableVendingMachine2.addStock(softDrinks,3);
        extendableVendingMachine2.addStock(softDrinks,3);
        extendableVendingMachine2.addStock(softDrinks,3);
        extendableVendingMachine2.buy(softDrinks,5);
        extendableVendingMachine2.addStock(softDrinks,3);
        extendableVendingMachine2.addStock(softDrinks,3);
        extendableVendingMachine2.addStock(softDrinks,3);
        extendableVendingMachine2.buy(softDrinks,13);
        extendableVendingMachine2.buy(softDrinks,13);
        assertEquals(0,extendableVendingMachine2.getStock(softDrinks));

        //Sweets
        ExtendableVendingMachine extendableVendingMachine3 = new ExtendableVendingMachine(0,0,
                0,0);

        Product sweets = new Sweets();

        extendableVendingMachine3.addStock(sweets,3);
        extendableVendingMachine3.buy(sweets,3);
        extendableVendingMachine3.addStock(sweets,3);
        extendableVendingMachine3.addStock(sweets,3);
        extendableVendingMachine3.addStock(sweets,3);
        extendableVendingMachine3.buy(sweets,5);
        extendableVendingMachine3.addStock(sweets,3);
        extendableVendingMachine3.addStock(sweets,3);
        extendableVendingMachine3.addStock(sweets,3);
        extendableVendingMachine3.buy(sweets,13);
        extendableVendingMachine3.buy(sweets,13);
        extendableVendingMachine3.addStock(sweets,100);
        extendableVendingMachine3.buy(sweets,70);

        assertEquals(30,extendableVendingMachine3.getStock(sweets));
    }

    @Test
    public void shouldAllStockLevels() {

        //Products
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3,6,
                9,12);
        Product product = new Product();
        assertEquals(30, extendableVendingMachine.getStock(product));

        //Chocolates
        ExtendableVendingMachine extendableVendingMachine1 = new ExtendableVendingMachine(3,6,
                9,12);
        Product chocolates = new Chocolates();
        assertEquals(3, extendableVendingMachine1.getStock(chocolates));

        //SaltySnacks
        ExtendableVendingMachine extendableVendingMachine2 = new ExtendableVendingMachine(3,6,
                9,12);
        Product saltySnacks = new SaltySnacks();
        assertEquals(6, extendableVendingMachine2.getStock(saltySnacks));

    }
}
