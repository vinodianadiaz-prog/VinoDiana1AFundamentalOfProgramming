public class QuizGrader {
    public static void main(String[] args) {

        // PART 1: Set up the arrays (char uses single quotes)
        char[] answerKey      = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'};
        char[] studentAnswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'};

        // PART 2: Grade the quiz
        int correctCount = 0;
        for (int i = 0; i < answerKey.length; i++) {
            if (studentAnswers[i] == answerKey[i]) {   // == works for char
                correctCount++;
            } else {
                // BONUS 1: Missed questions tracker
                System.out.println("Question " + (i + 1) + ": Incorrect. You answered '"
                        + studentAnswers[i] + "', correct answer is '" + answerKey[i] + "'");
            }
            // BONUS 2 (case insensitive) would replace the if-condition with:
            // Character.toUpperCase(studentAnswers[i]) == Character.toUpperCase(answerKey[i])
        }

        // PART 3: Score
        // (double) avoids integer division (7 / 10 would become 0)
        double scorePercentage = (double) correctCount / answerKey.length * 100;
        System.out.println("\nCorrect Answers: " + correctCount + "/" + answerKey.length);
        System.out.println("Score: " + scorePercentage + "%");

        // PART 4: Pass/Fail
        if (scorePercentage >= 70.0) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
