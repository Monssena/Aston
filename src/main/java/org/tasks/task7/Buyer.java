package org.tasks.task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class Buyer implements Runnable, IBuyer, IUseBasket {

    private static final AtomicInteger id = new AtomicInteger(0);
    private final String name;
    private Basket basket;
    private final Map<String, Good> availableGoods;

    public Buyer(Map<String, Good> availableGoods) {
        name = "Buyer №" + id.incrementAndGet();
        this.availableGoods = availableGoods;
    }

    @Override
    public void run() {

        enterToMarket();
        takeBasket();
        chooseGoods();
        putGoodsToBasket();
        goOut();
    }

    @Override
    public void enterToMarket() {

        System.out.println(name + " вошел в магазин.");
    }

    @Override
    public void chooseGoods() {

        System.out.println(name + " выбирает товары.");

        try {

            Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2001));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void goOut() {

        System.out.println(name + " вышел из магазина.");
    }

    @Override
    public void takeBasket() {

        System.out.println(name + " взял корзину.");

        basket = new Basket();
    }

    @Override
    public void putGoodsToBasket() {

        int numberOfGoods = ThreadLocalRandom.current().nextInt(1, 5);
        List<Good> goodsList = new ArrayList<>(availableGoods.values());

        for (int i = 0; i < numberOfGoods; i++) {

            Good good = goodsList.get(ThreadLocalRandom.current().nextInt(goodsList.size()));
            System.out.println(name + " положил " + good.getName() + " по цене " + good.getPrice() + "р. в корзину.");
            basket.addGood(good);

            try {

                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2001));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
