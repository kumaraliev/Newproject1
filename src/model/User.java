package model;

import company.Gender;

public class User {
   private int id;
   private String name;
   private String surname;

   private Gender gender;

    public User(int id, String name, String surname, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User: " +
                "id: " + id +
                ", name: " + name + '\'' +
                ", surname: " + surname + '\'' +
                ", gender:" + gender ;
    }
}
