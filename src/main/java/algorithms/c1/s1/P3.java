package algorithms.c1.s1;

public class P3 {

    public static boolean equals(int[] inputs) {
        //don't do anything if there is no input or if the input array is empty
        if (inputs == null || inputs.length == 0) {
            return false;
        }
        //get initial value. if all inputs are equal to this, then the method returns true. if any does not equal, then
        //the method short-circuits and returns false
        int val = inputs[0];
        for (int i=0; i< inputs.length; i++) {
            if (val == inputs[i]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

}
