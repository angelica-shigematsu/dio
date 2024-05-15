package com.collections.set;

public class Main {
    public static void main(String[] args) {
        AccessControl controlInvite = new AccessControl();

        controlInvite.addInvite(23456, "Maria");
        controlInvite.addInvite(123456, "Angelica");
        controlInvite.addInvite(123456, "Angela");

        System.out.println(controlInvite.showInvite());

        System.out.println(controlInvite.findByNumber(123456));

        System.out.println(controlInvite.updateName(123456,"Lara"));

        controlInvite.remove(123456);

        controlInvite.addInvite(123454, "Angela");

        System.out.println("Invite atualizado");
        System.out.println(controlInvite.showInvite());

        System.out.println("Invite ordenado pelo número");
        System.out.println(controlInvite.orderByNumber());

    }
}
