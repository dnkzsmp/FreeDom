package com.example.myshop.user;

public enum Gender {
    MALE {
        @Override
        public String toString() {
            return "МУЖЧИНА";
        }
    },
    FEMALE {
        @Override
        public String toString() {
            return "ЖЕНЩИНА";
        }
    }
}
