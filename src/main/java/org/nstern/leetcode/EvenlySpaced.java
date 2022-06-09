package org.nstern.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

public class EvenlySpaced {

    public static void main(String[] args) {
        assertThat(evenlySpaced(1, 2, 3)).isTrue();
        assertThat(evenlySpaced(1, 3, 2)).isTrue();
        assertThat(evenlySpaced(3, 1, 2)).isTrue();
        assertThat(evenlySpaced(3, 2, 1)).isTrue();
        assertThat(evenlySpaced(2, 3, 1)).isTrue();
        assertThat(evenlySpaced(2, 1, 3)).isTrue();
        assertThat(evenlySpaced(1, 2, 5)).isFalse();
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int largest, medium, smallest;

        int[] nums = {a, b, c};
        Arrays.sort(nums);

        int delta1 = nums[1] - nums[0];
        int delta2 = nums[2] - nums[1];
        return delta2 == delta1;
    }

}
