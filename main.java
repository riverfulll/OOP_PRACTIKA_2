public class main {
    public static void main(String[] args) {

        Human hm = new Human();
        hm.name = "Roman";

        Market market = new Market();

        market.acceptToMarket(hm);
        market.takeInQueue(hm);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hm);
        market.update();

    }
}