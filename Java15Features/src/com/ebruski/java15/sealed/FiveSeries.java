package com.ebruski.java15.sealed;

public non-sealed class FiveSeries extends BMWSeries {

    public int start(){
        record PickupData(int pickupTime){

        }

        return new PickupData(10).pickupTime;
    }
}
