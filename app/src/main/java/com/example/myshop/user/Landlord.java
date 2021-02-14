package com.example.myshop.user;

public class Landlord extends User {

    public Landlord(int age, String name, String surname, String patronymic, String phoneNumber, Gender gender) {
        super(age, name, surname, patronymic, phoneNumber, gender);
        status = Status.LANDLORD;
    }

    @Override
    public int getMinAge() {
        return MIN_AGE;
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
    public String getPhoneNumber() {
        return phoneNumber;
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
