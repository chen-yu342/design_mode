package design.proxy;

/**
 * haeco
 *
 * @author tolstoy.chen
 * @date 2023/10/16 14:55
 */
public class Pursuit implements IGiveGift{
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void GiveDolls() {
        System.out.println("我是Pursuit, "+mm.name + "送你洋娃娃");
    }

    @Override
    public void GiveFlowers() {
        System.out.println("我是Pursuit, "+mm.name + "送你花花");
    }

    @Override
    public void GiveChocolate() {
        System.out.println("我是Pursuit, "+mm.name + "送你洋巧克力");
    }
}
