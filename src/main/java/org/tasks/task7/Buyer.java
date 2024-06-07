package org.tasks.task7;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class Buyer implements IBuyer, IUseBasket, Runnable {

    private static final AtomicInteger countOfBuyer = new AtomicInteger(0);
    private final String name;

    private final Map<String, Integer> products = new HashMap<>() {{
        put("Bread", 60);
        put("Milk", 90);
        put("Apples", 300);
        put("Sweets", 200);
    }};

    public Buyer() {
        name = "Buyer №" + countOfBuyer;
        countOfBuyer.incrementAndGet();
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

        System.out.println(name + " вошел в магазин");
    }

    @Override
    public void chooseGoods() {

        int timeToChoose = ThreadLocalRandom.current().nextInt(500, 2001);

        try {

            System.out.println(name + " выбирает товар");
            Thread.sleep(timeToChoose);
            System.out.println(name + " выбрал товар");

        } catch (InterruptedException InterruptedException) {

        }
    }

    @Override
    public void goOut() {

        System.out.println(name + " оплатил и уходит");
    }

    @Override
    public void takeBasket() {
        int timeBasket = ThreadLocalRandom.current().nextInt(500, 2001);

        try {

            Thread.sleep(timeBasket);

        } catch (InterruptedException e) {}

        System.out.println(name + " взял корзину");
    }

    @Override
    public void putGoodsToBasket() {

        List<Map.Entry<String, Integer>> goodsList = collectTheBasket();

        for (Map.Entry<String, Integer> entry : goodsList) {
            System.out.println(name + " кладет в корзину: " + entry.getKey() + " - " + entry.getValue());
        }
    }

    public List<Map.Entry<String, Integer>> collectTheBasket() {

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(products.entrySet());

        Collections.shuffle(entryList);

        int MIN_PRODUCTS = 1;
        int MAX_PRODUCTS = 4;

        int numberElements = ThreadLocalRandom.current().nextInt(MIN_PRODUCTS, MAX_PRODUCTS);

        for (int i = 0; i < numberElements; i++) {

            int operationTime = ThreadLocalRandom.current().nextInt(500, 2001);

            try {

                Thread.sleep(operationTime);

            } catch (InterruptedException e) {}
        }

        return entryList.subList(0, numberElements);
    }
}
