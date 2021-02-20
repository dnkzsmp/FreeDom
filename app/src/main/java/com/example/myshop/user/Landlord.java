package com.example.myshop.user;

public class Landlord extends User {

    public Landlord(String phone, String password) {
        super(phone, password);
        status = Status.LANDLORD;
    }

    public Landlord() {}

    @Override
    public int getMinAge() {
        return MIN_AGE;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    @Override
    public Status getStatus() {
        return status;
    }
}
