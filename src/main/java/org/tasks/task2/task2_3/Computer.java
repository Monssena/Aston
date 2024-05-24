package org.tasks.task2.task2_3;

public class Computer {

    public static class Processor {
        private final String model;

        public Processor(String model) {
            this.model = model;
        }

        public String getDetails() {
            return "Model: " + model;
        }
    }

    public class RAM {

        private final int size;

        public RAM(int size) {
            this.size = size;
        }

        public String getDetails() {
            return "Size: " + size + "GB";
        }

    }
}
