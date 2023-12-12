package javaapplication9;

class Clock {

    String time;

    void setTime(String t) {
        time = t;
    }

    // Convert the return type of getTime method to String
    String getTime() {
        return time;
    }
}

class ClockTestDrive {

    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
