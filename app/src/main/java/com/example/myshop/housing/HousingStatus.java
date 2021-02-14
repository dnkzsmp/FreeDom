package com.example.myshop.housing;

public enum HousingStatus {
    BUSINESS_CLASS {
        @Override
        public String toString() {
            return "БИЗНЕСС-КЛАСС";
        }
    },
    ECONOMY {
        @Override
        public String toString() {
            return "ЭКОНОМ";
        }
    },
    STUDIO {
        @Override
        public String toString() {
            return "СТУДИЯ";
        }
    },
    COTTAGE {
        @Override
        public String toString() {
            return "КОТТЕДЖ";
        }
    },
    DUPLEX {
        @Override
        public String toString() {
            return "ДУПЛЕКС";
        }
    },
    PENTHOUSE {
        @Override
        public String toString() {
            return "ПЕНТХАУС";
        }
    },
    VILLA {
        @Override
        public String toString() {
            return "ВИЛЛА";
        }
    }
}
