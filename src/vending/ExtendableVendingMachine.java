package vending;

import vending.product.*;

public class ExtendableVendingMachine {

    private int chocolatesQty;
    private int saltySnacksQty;
    private int softDrinkQty;
    private int sweetsQty;

    public ExtendableVendingMachine(int chocolatesQty , int saltySnacksQty ,int softDrinkQty, int sweetsQty) {
        this.chocolatesQty = chocolatesQty;
        this.saltySnacksQty = saltySnacksQty;
        this.softDrinkQty = softDrinkQty;
        this.sweetsQty = sweetsQty;
    }

    public void buy(Product product, int amount) {
        if (product instanceof Chocolates) {
            chocolatesQty -= amount;
            if (chocolatesQty <= 0){
                chocolatesQty = 0;
            }
        }

        else if (product instanceof SaltySnacks) {
            saltySnacksQty -= amount;
            if (saltySnacksQty <= 0){
                saltySnacksQty = 0;
            }
        }

        else if (product instanceof SoftDrinks) {
            softDrinkQty -= amount;
            if (softDrinkQty <= 0){
                softDrinkQty = 0;
            }
        }

        else if (product instanceof Sweets) {
            sweetsQty -= amount;
            if (sweetsQty <= 0){
                sweetsQty = 0;
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

        if (product instanceof SaltySnacks){
            saltySnacksQty--;
            if (saltySnacksQty == 0){
                saltySnacksQty = 0;
            }
        }

        if (product instanceof SoftDrinks){
            softDrinkQty--;
            if (softDrinkQty == 0){
                softDrinkQty = 0;
            }
        }
    }

    public void addStock(Product product, int qty){
        if (product instanceof Chocolates) {
            chocolatesQty += qty;
        }

        if (product instanceof SaltySnacks) {
            saltySnacksQty += qty;
        }

        if (product instanceof SoftDrinks) {
            softDrinkQty += qty;
        }

        if (product instanceof Sweets) {
            sweetsQty += qty;
        }
    }

    public void addStock(Product product){
        if (product instanceof Chocolates){
            chocolatesQty += 3;
        }

        if (product instanceof SaltySnacks){
            saltySnacksQty += 3;
        }

        if (product instanceof SoftDrinks){
            softDrinkQty += 3;
        }

        if (product instanceof Sweets){
            sweetsQty += 3;
        }
    }

    public int getStock(Product product) {

        return chocolatesQty + saltySnacksQty + softDrinkQty + sweetsQty;
    }
}
