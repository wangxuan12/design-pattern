package behavioral.strategy.java;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
    private PromotionStrategyFactory() {}
    private static final Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP= new HashMap<>();
    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.NONE, new NonePromotionStrategy());
    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        return PROMOTION_STRATEGY_MAP.getOrDefault(promotionKey, new NonePromotionStrategy());
    }

    interface PromotionKey {
        String MANJIAN = "manjian";
        String FANXIAN = "fanxian";
        String NONE = "none";
    }
}
