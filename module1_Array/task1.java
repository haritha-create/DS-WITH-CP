class ArrayInitializationDemo {
    public static void main(String[] args) {

        // 1. Static Initialization
        int[] numbers = {10, 20, 30};
        String[] names = {"Haritha", "VARSHITHA", "Sita"};

        System.out.println("Static Initialization:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // 2. Using new keyword with values
        float[] marks = new float[]{75.5f, 80.0f, 92.5f};

        System.out.println("\nUsing new keyword with values:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // 3. Dynamic Initialization
        int[] nums = new int[5];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;
        nums[3] = 20;
        nums[4] = 25;

        System.out.println("\nDynamic Initialization:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // 4. Declaration first, Allocation later
        String[] users;
        users = new String[3];
        users[0] = "User1";
        users[1] = "User2";
        users[2] = "User3";

        System.out.println("\nDeclaration first, Allocation later:");
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }
    }
}code
