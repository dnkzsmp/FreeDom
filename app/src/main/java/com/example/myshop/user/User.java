package com.example.myshop.user;

import java.util.Objects;

public abstract class User {

    protected final int MIN_AGE = 18;

    public abstract int getMinAge();

    public abstract int getAge();

    public abstract String getName();

    public abstract String getPassword();

    public abstract String getSurname();

    public abstract String getPatronymic();

    public abstract String getPhone();

    public abstract Gender getGender();

    public abstract Status getStatus();

    protected int age;
    protected String name;
    protected String surname;
    protected String patronymic;
    protected String phone;
    protected Gender gender;
    protected Status status;
    protected String password;

    public User() {}

    public User(String phone, String password) {
        this.phone = phone;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getAge() == user.getAge() &&
                getName().equals(user.getName()) &&
                getSurname().equals(user.getSurname()) &&
                getPatronymic().equals(user.getPatronymic()) &&
                getPhone().equals(user.getPhone()) &&
                getGender() == user.getGender() &&
                getStatus() == user.getStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                MIN_AGE,
                getAge(),
                getName(),
                getSurname(), 
                getPatronymic(),
                getPhone(),
                getGender(),
                getStatus()
        );
    }

    @Override
    public String toString() {
        return "User {" +
                "age = " + age +
                ", name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", patronymic = '" + patronymic + '\'' +
                ", phoneNumber = '" + phone + '\'' +
                ", gender = " + gender +
                ", status = " + status +
                '}';
    }

}
