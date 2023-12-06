package pattern.structural.flyweight;

public class Client {
    public static void main(String[] args) {
        Hambuger hambuger = new Hambuger("bulgogi","bulgogi",HambugerFactory.getInstance("nomal:lettuce"));
        Hambuger hambuger1 = new Hambuger("chili","bulgogi",HambugerFactory.getInstance("nomal:lettuce"));
        Hambuger hambuger2 = new Hambuger("ketchup","bulgogi",HambugerFactory.getInstance("nomal:tomato"));
        System.out.println(hambuger);
        System.out.println(hambuger1);
        System.out.println(hambuger2);
    }

}
