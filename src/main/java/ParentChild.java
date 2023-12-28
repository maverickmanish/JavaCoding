class Vehicle {
    public void start() {
        System.out.println("Vehicle start logic");
    }

    public void stop() {
        System.out.println("Vehicle stop logic");
    }
}

class TwoWheeler extends Vehicle {

    public float start(int a) {
        System.out.println("Two wheeler start logic");
        return 0;
    }

    @Override
    public void stop() {
        System.out.println("Two Wheeler stop logic");
    }
}

class ParentChild {
    public static void main(String[] args) {

        String str = "java|in|simple|way";
        String[] tokens = str.split("\\|");//splits the string based on pipe symbol
        //loop the returned array to print each element of string array
        for (String token : tokens) {
            System.out.println(token);
        }

        StringBuffer sb = new StringBuffer("java in easy way");
        sb.replace(8, 12, "simple");
        System.out.println(sb);


        Vehicle twoWheeler = new TwoWheeler();
        System.out.println(1 + 4 + 6 + 99 + "manidh" + "dgffdg" + 88 + 88);
        twoWheeler.start();
        twoWheeler.stop();

    }
} 