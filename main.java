public class main{
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 5, 5, 5, 5};
        int majorityElement = findMajorityElement(nums);
        System.out.println(majorityElement);
    }

    static int findMajorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        // Finding the potential majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        // Verifying if the potential majority element is the actual majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Returning the majority element if it exists, otherwise -1
        if (count > nums.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
}

   
