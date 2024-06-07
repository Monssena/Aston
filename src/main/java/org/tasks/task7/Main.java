package org.tasks.task7;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        final int duration = 2 * 60 * 1000; // 2 минуты в миллисекундах
        final int interval = 1000; // Интервал в миллисекундах (1 секунда)

        long startTime = System.currentTimeMillis();
        long endTime = startTime + duration;

        while (System.currentTimeMillis() < endTime) {
            // Генерация случайного количества покупателей от 0 до 2
            int numberOfBuyers = ThreadLocalRandom.current().nextInt(0, 3);

            for (int i = 0; i < numberOfBuyers; i++) {
                Buyer buyer = new Buyer();
                Thread buyerThread = new Thread(buyer);
                buyerThread.start();
            }

            try {
                // Ожидание 1 секунду перед следующим запуском
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
