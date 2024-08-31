package practice.java.dsa;

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
public class RailWayReservation1 {

    int[] seats;
    int allSeats;

    public RailWayReservation1(int n) {
        allSeats = n;
        seats = new int[n+1];

        for (int i = 1; i <= n; i++) {
            seats[i] = i;
        }
    }

    public static void main(String[] args) {
        RailWayReservation1 railWayReservation1 = new RailWayReservation1(5);
        System.out.println(railWayReservation1.reserve());
        railWayReservation1.unreserve(1);

        for (int i = 1; i <= railWayReservation1.allSeats ; i++) {
            System.out.println(railWayReservation1.seats[i]);
        }
    }


    public int reserve() {
        int seatReserved = 0;
        for (int i = 1; i <= allSeats; i++) {
            if (seats[i] != -1) {
                seatReserved = i;
                seats[i] = -1;
                break;
            }
        }
        return seatReserved;
    }

    public void unreserve(int seatNumber) {

        seats[seatNumber] = seatNumber;
    }
}
