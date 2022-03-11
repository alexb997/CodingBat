//Given an array of scores,
// return true if each score is equal or greater than the one before.
// The array will be length 2 or more.

public class ScoresIncreasing {
    public static boolean scoresIncreasing(int[] scores) {
        for(int i = 1; i < scores.length; i++) {
            if(scores[i] < scores[i-1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums= {1,3,5};
        System.out.println(scoresIncreasing(nums));
    }
}
