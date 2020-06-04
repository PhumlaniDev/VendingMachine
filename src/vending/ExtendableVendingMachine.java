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

    public void buy(Product product, int qty) {
        if (product instanceof Chocolates) {
            chocolatesQty -= qty;
            if (chocolatesQty <= 0){
                chocolatesQty = 0;
            }
        }

        else if (product instanceof SaltySnacks) {
            saltySnacksQty -= qty;
            if (saltySnacksQty <= 0){
                saltySnacksQty = 0;
            }
        }

        else if (product instanceof SoftDrinks) {
            softDrinkQty -= qty;
            if (softDrinkQty <= 0){
                softDrinkQty = 0;
            }
        }

        else if (product instanceof Sweets) {
            sweetsQty -= qty;
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

        if (product instanceof Chocolates) {
            return chocolatesQty;
        }

        if (product instanceof SaltySnacks) {
            return saltySnacksQty;
        }

        if (product instanceof SoftDrinks) {
            return softDrinkQty;
        }

        if (product instanceof Sweets) {
            return sweetsQty;
        }

        return chocolatesQty + saltySnacksQty + softDrinkQty + sweetsQty;
    }
}
