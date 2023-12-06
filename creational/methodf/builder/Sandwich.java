package pattern.creational.methodf.builder;

public class Sandwich {
    // private final 수정을 막기 위해서
    private final String bread; // 빵 선택
    private final String vegetable; // 채소 선택
    private final String cheese; // 체다,모짜 등 치즈 선택
    private final String source; // 머스타드,케찹 등 소스 선택

    public static class Builder{
        private final String bread; // 빵 선택
        private  String vegetable; // 토마토 여부
        private  String cheese; // 체다,모짜 등 치즈 선택
        private  String source; // 머스타드,케찹 등 소스 선택

        public Builder(String bread){
            this.bread = bread;
        }
        public Builder vegetable(String vegetable){
            this.vegetable = vegetable;
            return this;
        }
        public Builder cheese(String cheese){
            this.cheese = cheese;
            return this;
        }
        public Builder source(String source){
            this.source = source;
            return this;
        }
        public Sandwich build(){
            return new Sandwich(this);
        }
    }

    private Sandwich(Builder builder){
        this.bread = builder.bread;
        this.vegetable = builder.vegetable;
        this.cheese = builder.cheese;
        this.source = builder.source;
    }

    @Override
    public String toString(){
        return "Sandwich {"+ " bread => "+ bread + " vegetable => "+ vegetable + " cheeze => "+ cheese + " source => "+ source +"}";
    }
}
