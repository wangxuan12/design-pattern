package behavioral.templatemethod.java;

public abstract class Cook {
        protected final void cooking() {
            prepare();
            addFood();
            addSalt();
            if (needSugar()) {
                addSugar();
            }
            deliver();
        }

        final void prepare() {
            System.out.println("准备烹饪道具，和食材");
        }

        abstract void addFood();

        final void addSalt() {
            System.out.println("加盐");
        }

        final void addSugar() {
            System.out.println("加糖");
        }

        final void deliver() {
            System.out.println("上菜");
        }

        protected boolean needSugar() {
            return false;
        }
}
