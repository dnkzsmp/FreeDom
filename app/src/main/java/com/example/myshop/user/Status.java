package com.example.myshop.user;

public enum Status {
    RESIDING {
        @Override
        public String toString() {
            return "ПРОЖИВАЮЩИЙ";
        }
    },
    LANDLORD {
        @Override
        public String toString() {
            return "АРЕНДОДАТЕЛЬ";
        }
    }
}
