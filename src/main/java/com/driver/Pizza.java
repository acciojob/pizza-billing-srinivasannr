package com.driver;

public class Pizza {

    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    private Boolean isVeg;
    private String bill;

    int flagChe=0;
    int flagTop=0;

    int flagTake=0;

    public Pizza(Boolean isVeg){
        this.bill="";
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
            this.bill+="Base Price Of The Pizza: 300"+"\n";
            this.price+=300;
        }
        else{
            this.bill+="Base Price Of The Pizza: 400"+"\n";
            this.price+=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.flagTop==0 && this.flagChe==0) {
            this.bill+="Extra Cheese Added: 80"+"\n";
            this.price += 80;
            this.flagChe=1;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.flagTop==0 && this.flagChe==1) {
            if (isVeg == true) {
                this.bill+="Extra Toppings Added: 70"+"\n";
                this.price += 70;
            } else {
                this.bill+="Extra Toppings Added: 120"+"\n";
                this.price += 120;
            }
            this.flagTop = 1;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(flagTake==0) {
            this.bill += "Paperbag Added: 20" + "\n";
            this.price += 20;
            this.flagTake=1;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill+="Total Price: "+this.price;
        return this.bill;
    }
}
