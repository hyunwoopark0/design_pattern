package pattern.creational.prototype;

import java.util.List;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Hambuger hambuger = new Hambuger();

        // db 로 부터 데이터 받아온걸로가정
        hambuger.setHambugerList();

        Hambuger hambuger1 = (Hambuger) hambuger.clone();

        List<String> hambuger1List = hambuger1.getHambugerList();
        hambuger1List.add("beef");

        System.out.println(hambuger1List);
        System.out.println(hambuger.getHambugerList());
    }
}
