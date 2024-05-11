package com.collections.set;

import java.util.Comparator;
import java.util.Objects;

public class Invite implements Comparable<Invite> {
    private int numberInvite;

    private String namePerson;

    public Invite(int numberInvite, String namePerson) {
        this.numberInvite = numberInvite;
        this.namePerson = namePerson;
    }

    public int getNumberInvite() {
        return numberInvite;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    @Override
    public String toString() {
        return "numberInvite=" + numberInvite +
                ", namePerson='" + namePerson + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invite invite = (Invite) o;
        return numberInvite == invite.numberInvite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberInvite);
    }

    @Override
    public int compareTo(Invite i) {
        return Integer.compare(i.numberInvite, getNumberInvite());
    }
}
