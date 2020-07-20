public class OrderFacade {
    private SubSystemCheckGoods subSystemCheckGoods;
    private SubSystemPay subSystemPay;
    private SubSystemShipping subSystemShipping;

    public OrderFacade() {
        subSystemCheckGoods = new SubSystemCheckGoods();
        subSystemPay = new SubSystemPay();
        subSystemShipping = new SubSystemShipping();
    }

    public void buy() {
        if (subSystemCheckGoods.check()) {
            if (subSystemPay.pay()) {
                System.out.println("购买成功");
                return;
            }
        }
        System.out.println("购买失败");
    }

    public String position() {
        return subSystemShipping.shipping();
    }
}