//Your cell phone rings.
// Return true if you should answer it.
// Normally you answer, except in the morning you only answer if it is your mom calling.
// In all cases, if you are asleep, you do not answer.

public class AnswerCell {
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep)
            return false;
        if ((isMorning && isMom) || !isMorning)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(answerCell(true,false,true));
    }
}