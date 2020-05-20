package vending;

import vending.product.Chocolates;
import vending.product.Product;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

public class OverloadedVendingMachine {

    private int chocolatesQty;
    private int saltySnacksQty;
    private int softDrinkQty;

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
        if (product instanceof Chocolates){
            chocolatesQty++;
        }

        if (product instanceof SaltySnacks){
            saltySnacksQty++;
        }

        if (product instanceof SoftDrinks){
            softDrinkQty++;
        }
    }


    public void buy(Chocolates chocolates){
        if (chocolates != null){
            chocolatesQty--;
            if (chocolatesQty == 0){
                return;
            }
        }
    }

    public void buy(SaltySnacks saltySnacks){
        if (saltySnacks != null){
            saltySnacksQty--;
            if (saltySnacksQty == 0){
                return;
            }
        }
    }

    public void buy(SoftDrinks softDrinks){
        if (softDrinks != null){
            softDrinkQty--;
            if (softDrinkQty == 0){
                return;
            }
        }
    }

    public void buy(Product product){
        if (product instanceof Chocolates){
            chocolatesQty--;
            if (chocolatesQty == 0){
                return;
            }
        }

        else if (product instanceof SaltySnacks){
            saltySnacksQty--;
            if (saltySnacksQty == 0){
                return;
            }
        }

        else if (product instanceof SoftDrinks){
            softDrinkQty--;
            if (softDrinkQty == 0){
                return;
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

    public int getStock(){
      return 0;
    }

}
