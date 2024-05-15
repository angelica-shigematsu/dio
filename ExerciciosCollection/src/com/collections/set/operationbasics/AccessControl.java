package com.collections.set;

import java.util.*;

public class AccessControl {
    private Set<Invite> setInvite;

    public AccessControl() {
        this.setInvite = new HashSet<>();
    }

    public void addInvite(int numberInvite, String personName) {
        setInvite.add(new Invite(numberInvite, personName));
    }

    public void remove(int numberInvite) {
        Invite hasValidateInvite = null;

        if (!setInvite.isEmpty()) {
            for (Invite i : setInvite) {
                if (i.getNumberInvite() == numberInvite) {
                    hasValidateInvite = i;
                }
            }
            setInvite.remove(hasValidateInvite);
        }
    }

    public String showInvite() {
        if (setInvite.isEmpty()) return "Lista Vazia!";

        for (Invite i : setInvite) {
            System.out.println(i.toString());
        }
        return "***************************************";
    }

    public String findByNumber(int numberInvite) {
        for (Invite i : setInvite) {
            if (i.getNumberInvite() == numberInvite) {
                return i.toString();
            }
        }
        return "Não foi encontrado o convite";
    }

    public Invite updateName(int numberInvite, String name) {
        Invite updateInvite = null;
        for (Invite i: setInvite) {
            if (i.getNumberInvite() == numberInvite) {
                i.setNamePerson(name);
                updateInvite = i;
                return updateInvite;
            }
        }
        return null;
    }

    public Set<Invite> orderByNumber() {
        Set<Invite> invite = new TreeSet<>(setInvite);
        return invite;
    }
}
