package edu.tongji.designpattern.ClassDesign.Person;

import edu.tongji.designpattern.ClassDesign.Business.AirConditionerAPI.AirConditionerAPI;

public class Waiter extends Employee {

    Customer customer;
    private double temperature;


    public Waiter(double temperature,AirConditionerAPI airConditionerAPI) {
        super(airConditionerAPI);
        this.temperature= temperature;
    }

    public void getState(Customer customer){
        System.out.println("顾客现在的状态是：");
    }

    @Override
    public void changeTmp() {
        System.out.println("服务员修改空调温度——");
        airConditionerAPI.changeTem(temperature);
    }

    @Override
    public void update() {

    }

    @Override
    public void settleComplaint() {

    }

    @Override
    public void getMessage() {

    }

    @Override
    public void sendMessage() {

    }
}