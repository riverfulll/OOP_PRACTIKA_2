public interface MarketBehavior {
    void acceptToMarket(Aktor actor);
    void releaseFromMarket(Aktor actor);
    void update();
}