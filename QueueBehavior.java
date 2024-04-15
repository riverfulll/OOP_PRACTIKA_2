public interface QueueBehavior {
    void takeInQueue(Aktor actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}