package practice.dsa.linkedList;

import java.util.PriorityQueue;

/**
 * Design a system that manages the reservation state of n seats that are numbered from 1 to n.
 * <p>
 * Implement the SeatManager class:
 * <p>
 * SeatManager(int n) Initializes a SeatManager object that will manage n seats numbered from 1 to n. All seats are initially available.
 * int reserve() Fetches the smallest-numbered unreserved seat, reserves it, and returns its number.
 * void unreserve(int seatNumber) Unreserves the seat with the given seatNumber.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input
 * ["SeatManager", "reserve", "reserve", "unreserve", "reserve", "reserve", "reserve", "reserve", "unreserve"]
 * [[5], [], [], [2], [], [], [], [], [5]]
 * Output
 * [null, 1, 2, null, 2, 3, 4, 5, null]
 * <p>
 * Explanation
 * SeatManager seatManager = new SeatManager(5); // Initializes a SeatManager with 5 seats.
 * seatManager.reserve();    // All seats are available, so return the lowest numbered seat, which is 1.
 * seatManager.reserve();    // The available seats are [2,3,4,5], so return the lowest of them, which is 2.
 * seatManager.unreserve(2); // Unreserve seat 2, so now the available seats are [2,3,4,5].
 * seatManager.reserve();    // The available seats are [2,3,4,5], so return the lowest of them, which is 2.
 * seatManager.reserve();    // The available seats are [3,4,5], so return the lowest of them, which is 3.
 * seatManager.reserve();    // The available seats are [4,5], so return the lowest of them, which is 4.
 * seatManager.reserve();    // The only available seat is seat 5, so return 5.
 * seatManager.unreserve(5); // Unreserve seat 5, so now the available seats are [5].
 */
public class RailWayReservation {
    PriorityQueue<Integer> seatNums;

    public RailWayReservation(int seats) {
        seatNums = new PriorityQueue<>(seats);

        for (int i = 0; i < seats; i++) {
            seatNums.add(i);
        }
    }

    public static void main(String[] args) {

    }


    public int reserve() {

        return seatNums.poll();
    }

    public void unreserve(int seatNumber) {
        seatNums.add(seatNumber);
    }
}
