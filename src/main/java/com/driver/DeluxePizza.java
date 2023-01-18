package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        if(this.flagChe==0 && this.flagTop==0){
            this.flagChe=1;
            this.flagTop=1;
            setPrice(getPrice()+80);
            if(isVeg==true){
                setPrice(getPrice()+70);
            }
            else{
                setPrice(getPrice()+120);
            }
        }
        // your code goes here
    }
}
