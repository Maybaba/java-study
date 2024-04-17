package day07.player;

public class Main {
    public static void main(String[] args) {
        Warrior w = new Warrior("주주");
        Mage m = new Mage("쇼쇼");
        Hunter h = new Hunter("호호");


        w.showStatus();
        m.showStatus();
        h.showStatus();
    }
}
