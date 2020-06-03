package vending;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import vending.product.Chocolates;
import vending.product.Product;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

public class OverloadedVendingMachine {

    private int chocolatesQty;
    private int saltySnacksQty;
    private int softDrinkQty;

    private Chocolates chocolates;
    private SaltySnacks saltySnacks;
    private SoftDrinks softDrinks;

    public OverloadedVendingMachine(int chocolatesQty , int saltySnacksQty ,int softDrinkQty) {
        this.chocolatesQty = chocolatesQty;
        this.saltySnacksQty = saltySnacksQty;
        this.softDrinkQty = softDrinkQty;
    }

    public void addStock(Chocolates chocolates){
        if (chocolates != null){
            chocolatesQty++;
        }
    }

    public void addStock(SaltySnacks saltySnacks){
        if (saltySnacks != null){
            saltySnacksQty++;
        }
    }

    public void addStock(SoftDrinks softDrinks){
        if (softDrinks != null){
            softDrinkQty++;
        }
    }

    public void addStock(Product product){
        if (product != null){
            chocolatesQty++;
        }

        if (product != null){
            saltySnacksQty++;
        }

        if (product != null){
            softDrinkQty++;
        }
    }


    public void buy(Chocolates chocolates){

        if (chocolates != null){
            chocolatesQty--;
            if (chocolatesQty < 0){
                chocolatesQty = 0;
            }
        }
    }

    public void buy(SaltySnacks saltySnacks){
        if (saltySnacks != null){
            saltySnacksQty--;
            if (saltySnacksQty == 0){
                saltySnacksQty = 0;
            }
        }
    }

    public void buy(SoftDrinks softDrinks){
        if (softDrinks != null){
            softDrinkQty--;
            if (softDrinkQty == 0){
                softDrinkQty = 0;
            }
        }
    }

    public void buy(Product product){
        if (product instanceof Chocolates){
            chocolatesQty--;
            if (chocolatesQty == 0){
                chocolatesQty = 0;
            }
        }

        else if (product instanceof SaltySnacks){
            saltySnacksQty--;
            if (saltySnacksQty == 0){
                saltySnacksQty = 0;
            }
        }

        else if (product instanceof SoftDrinks){
            softDrinkQty--;
            if (softDrinkQty == 0){
                softDrinkQty = 0;
            }
        }
    }


    public int getStock(Chocolates chocolates){

        int countStock = 0 ;

        if (chocolates != null){
            return chocolatesQty += countStock;
        }

        return countStock;
    }

    public int getStock(SaltySnacks saltySnacks){

        int countStock = 0 ;

        if (saltySnacks != null){
            return saltySnacksQty += countStock;
        }

        return countStock;
    }

    public int getStock(SoftDrinks softdrinks){

        int countStock = 0 ;

        if (softdrinks != null){
            return softDrinkQty += countStock;
        }

        return countStock;
    }

    public int getStock() {
        return softDrinkQty + saltySnacksQty + chocolatesQty;
    }

}
