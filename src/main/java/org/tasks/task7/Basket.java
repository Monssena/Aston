package org.tasks.task7;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<Good> goodList = new ArrayList<Good>();

    public void addGood(Good good) {
        goodList.add(good);
    }

    public int getSizeGoodList() {
        return goodList.size();
    }
}
