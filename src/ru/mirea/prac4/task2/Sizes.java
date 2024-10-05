package ru.mirea.prac4.task2;

public enum Sizes{
    XXS(32){
        @Override
        public String getDescription(){
            return "XXS(Детский размер)";
        }
    },
    XS(34) {
        @Override
        public String getDescription() {
            return "XS";
        }
    },
    S(36) {
        @Override
        public String getDescription() {
            return "S";
        }
    },
    M(38) {
        @Override
        public String getDescription() {
            return "M";
        }
    },
    L(40) {
        @Override
        public String getDescription() {
            return "L";
        }
    };

    private final int euroSize;

    public int getEuroSize() {
        return euroSize;
    }

    Sizes(int euroSize){
        this.euroSize = euroSize;
    }

    public abstract String getDescription();
}
