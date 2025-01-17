class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }

        // Sort the balloons by their ending points
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1; // At least one arrow is needed
        int currentEnd = points[0][1]; // Position of the first arrow

        for (int i = 1; i < points.length; i++) {
            // If the current balloon starts after the current arrow's position, use a new arrow
            if (points[i][0] > currentEnd) {
                arrows++;
                currentEnd = points[i][1]; // Update the position of the arrow
            }
        }

        return arrows;
    }
}