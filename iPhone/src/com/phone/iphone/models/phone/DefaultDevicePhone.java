package com.phone.iphone.models.phone;

import com.phone.iphone.models.iPhone;

public class DefaultDevicePhone implements DevicePhone{

    private String number;

    private String person;

    private boolean turnOff = false;

    private iPhone phone;


    public DefaultDevicePhone(String number, String person, iPhone phone) {
        this.number = number;
        this.person = person;
        this.turnOff = true;
        this.phone = phone;
    }

    public String getNumber() {
        return number;
    }

    public String getPerson() {
        return person;
    }

    @Override
    public boolean call() {
       if (phone.displayPhone() && getNumber() != null) {
           System.out.println("It is calling to " + getPerson());
           return true;
       }
       return false;
    }

    @Override
    public void answerPhone() {
        if (!turnOff)
            System.out.println("You are answer somebody");
    }

    @Override
    public void startPostVoice() {
        if (call())
            System.out.println("You are record your message");
    }
}
