public class traprainwater {
    public static int trapped(int height[]) {
        int n = height.length;
        // calculate the leftmax boundry
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate the right max boundry
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i++) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);

        }
        int trappedwater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // calculate the waterlevel
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            // calculte the trapped water her with the formula of trappedwater = (waterlevel
            // - height[i])
            trappedwater += (waterlevel - height[i]);
        }
        return trappedwater;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trapped(height));
    }
}