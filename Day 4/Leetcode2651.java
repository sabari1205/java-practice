/**
 * LeetCode 2651: Calculate Delayed Arrival Time
 * You are given a positive integer arrivalTime denoting the arrival time of a train in hours,
 * and another positive integer delayedTime denoting the amount of delay in hours.
 * Return the time when the train will arrive at the station (in 24-hours format).
 */
public class Leetcode2651 {
    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }

    public static void main(String[] args) {
        System.out.println("=== LeetCode 2651: Calculate Delayed Arrival Time ===");
        System.out.println("Arrival: 15, Delay: 5 -> Actual Time: " + findDelayedArrivalTime(15, 5));
        System.out.println("Arrival: 23, Delay: 5 -> Actual Time: " + findDelayedArrivalTime(23, 5));
    }
}
