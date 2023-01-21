package com.driver;

public class Pizza {

    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    private Boolean isVeg;
    private String bill;

    boolean flagChe=false;
    boolean flagTop=false;

    boolean flagTake=false;
    boolean flagBill=false;

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
        if(this.flagChe==false) {
            this.bill+="Extra Cheese Added: 80"+"\n";
            this.price += 80;
            this.flagChe=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.flagTop==false) {
            if (this.isVeg == true) {
                this.bill+="Extra Toppings Added: 70"+"\n";
                this.price += 70;
            } else {
                this.bill+="Extra Toppings Added: 120"+"\n";
                this.price += 120;
            }
            this.flagTop = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(this.flagTake==false) {
            this.bill += "Paperbag Added: 20" + "\n";
            this.price += 20;
            this.flagTake=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(this.flagBill==false) {
            this.bill += "Total Price: " + this.price+"\n";
            this.flagBill=true;
        }
        return this.bill;
    }
}
