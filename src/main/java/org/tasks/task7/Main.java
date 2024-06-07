package org.tasks.task7;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        final int duration = 2 * 60 * 1000; // 2 минуты в миллисекундах
        final int interval = 1000; // Интервал в миллисекундах (1 секунда)

        Map<String, Good> goods = new HashMap<>();

        goods.put("Bread", new Good("Bread", 60));
        goods.put("Milk", new Good("Milk", 90));
        goods.put("Butter", new Good("Butter", 40));
        goods.put("Cheese", new Good("Cheese", 150));

        long startTime = System.currentTimeMillis();
        long endTime = startTime + duration;

        while (System.currentTimeMillis() < endTime) {

            int numberOfBuyers = ThreadLocalRandom.current().nextInt(0, 3);

            for (int i = 0; i < numberOfBuyers; i++) {
                Buyer buyer = new Buyer(goods);
                Thread buyerThread = new Thread(buyer);
                buyerThread.start();
            }

            try {

                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
