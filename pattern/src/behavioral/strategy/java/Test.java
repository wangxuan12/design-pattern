package behavioral.strategy.java;

public class Test {
    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new FanXianPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new ManJianPromotionStrategy());
//        promotionActivity618.executePromotionStrategy();
//        promotionActivity1111.executePromotionStrategy();

        String promotionKey = "manjian";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}
