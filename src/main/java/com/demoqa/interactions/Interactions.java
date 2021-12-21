package com.demoqa.interactions;

public class Interactions {


    public Interactions() {
    }

    public void sleep(int milisegundos) {

        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
