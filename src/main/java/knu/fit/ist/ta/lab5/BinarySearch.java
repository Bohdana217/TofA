/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.List;

/**
 *
 * @author admin
 */
public class BinarySearch {
    
    public static int binarySearch(int find, List<Integer> list) {
        int result = -1;
        int start = 0;
        int n = list.size() - 1;
        while (n > 1) {

            if (start + n > list.size()) {
                start--;
            }
            n = (n + 1) / 2;

            if (list.get(n + start).intValue() == find) {
                return start + n;
            } else if (list.get(n+start).intValue() < find) {
                start = start + n;
            }

        }

        return result;
    }
}
