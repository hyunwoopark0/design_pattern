package pattern.creational.methodf.builder;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        //호출
        //빌더를 이용한 생성
        Sandwich sandwich = new Sandwich.Builder("ciabatta").vegetable("tomato").cheese("mozzarella").source("mustard").build();

        //지연 생성 하는 방법
        ArrayList<Sandwich.Builder> sandwiches = new ArrayList<>();
        sandwiches.add(new Sandwich.Builder("ciabatta").cheese("mozzarella"));
        sandwiches.add(new Sandwich.Builder("wrap ").source("mustard"));
        sandwiches.add(new Sandwich.Builder("bagetta").vegetable("tomato"));

        for (Sandwich.Builder b : sandwiches){
            Sandwich sandwich1 = b.build();
            System.out.println(sandwich1);
        }
    }
}