package org.abubeker_leetcode;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/**
 * This program counts the number of favorite singers in Bob's playlist.
 * A favorite singer is the one whose songs are the most on the playlist.
 * 
 * Input Format:
 * - The first line contains an integer n, denoting the number of songs in Bob's playlist.
 * - The following input contains n integers, where each integer represents the singer of a song.
 * 
 * Output Format:
 * - Output a single integer, the number of favorite singers of Bob.
 * 
 * Example:
 * Input:
 * 5
 * 1 2 2 3 3
 * Output:
 * 2
 * 
 * Link to the problem: https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/favourite-singer-a18e086a/
 */
public class FavoriteSingers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of songs in Bob's playlist
        int n = scanner.nextInt();

        // Create a HashMap to count the occurrences of each singer
        Map<Integer, Integer> singerCount = new HashMap<>();

        // Read the singer of each song and update the count
        for (int i = 0; i < n; i++) {
            int singer = scanner.nextInt();
            singerCount.put(singer, singerCount.getOrDefault(singer, 0) + 1);
        }

        // Find the maximum count
        int maxCount = 0;
        for (int count : singerCount.values()) {
            maxCount = Math.max(maxCount, count);
        }

        // Count the number of favorite singers
        int favoriteSingers = 0;
        for (int count : singerCount.values()) {
            if (count == maxCount) {
                favoriteSingers++;
            }
        }

        System.out.println(favoriteSingers);

        scanner.close();
    }
}
