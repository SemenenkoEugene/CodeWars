package HeadFirstJava;

 class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            go();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void go() throws InterruptedException {
        Thread.sleep(2000);
        doMore();
    }

    public void doMore() {
        System.out.println("Вершина стека");
    }

    public static class ThreadTestDrive {
        public static void main(String[] args) {
            Runnable threadJob = new MyRunnable()  ;
            Thread myThread = new Thread(threadJob);

            myThread.start();
            System.out.println("Возвращаемся в метод main");
        }
    }
}
