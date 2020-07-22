package behavioral.strategy.java;

public class NonePromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无促销");
    }
}
