public class Omgfear {

public static void main(String[]args) {

    int[] nums = {1 , 2 , 3 , 4 , 5};

    for (int i = 0; i < nums.length; i++) {

        if (nums[i] == 3) {
            break;

        }

        System.out.println( nums[i] );
    }

    int i = 2;

    switch (i) {
        case 0:
            System.out.println( "Zero!" );
            break;

        case 1:
            System.out.println( "One!" );
            break;

        default:
            System.out.println( "WTF man??" );

    }
}
}

