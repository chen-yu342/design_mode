package design.proxy;

/**
 * haeco
 *
 * @author tolstoy.chen
 * @date 2023/10/16 15:04
 */
public class Proxy implements IGiveGift {
    Pursuit pursuit;

    public Proxy(SchoolGirl mm) {
        pursuit = new Pursuit(mm);
    }

    @Override
    public void GiveDolls() {
        pursuit.GiveDolls();
    }

    @Override
    public void GiveFlowers() {
        pursuit.GiveFlowers();
    }

    @Override
    public void GiveChocolate() {
      pursuit.GiveDolls();
    }
}
