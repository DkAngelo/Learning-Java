package com.DkAngelo.exercises.OOP.phonebook;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneBookList implements PhoneBook {
    ArrayList<Person> phonebook;
    public PhoneBookList() {
    }

    @Override
    public boolean addPerson(Person person) {
        if((phonebook.size() + 1) > MAX_PERSONS) {
            return false;
        }
        else if(phonebook.contains(person)){
            return false;
        }
        phonebook.add(person);
        return true;
    }

    @Override
    public boolean removePerson(Person person) {
        if(phonebook.contains(person)){
            phonebook.remove(person);
            return true;
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> founded = new ArrayList<>();
        for(Person people : phonebook){
            if (lastname.compareTo(people.getLastname()) == 0){
                founded.add(people);
            }
        }

        return founded.toArray(new Person[0]);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> founded = new ArrayList<>();
        for(Person people : phonebook){
            if (lastname.compareTo(people.getLastname()) == 0 && name.compareTo(people.getName()) == 0){
                founded.add(people);
            }
        }

        return founded.toArray(new Person[0]);
    }
}
