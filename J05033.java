import java.util.*;

class Time implements Comparable<Time> {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    @Override
    public int compareTo(Time o) {
        if (this.hour > o.hour) {
            return 1;
        } else if (this.hour < o.hour) {
            return -1;
        } else {
            if (this.minute > o.minute) {
                return 1;
            } else if (this.minute < o.minute) {
                return -1;
            } else {
                if (this.second > o.second) {
                    return 1;
                } else if (this.second < o.second) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    @Override
    public String toString() {
        return hour + " " + minute + " " + second;
    }
}

public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Time> list = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            int second = sc.nextInt();
            Time time = new Time(hour, minute, second);
            list.add(time);
        }
        Collections.sort(list);
        for (Time time1 : list) {
            System.out.println(time1);
        }
    }
}