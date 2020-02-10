public class SolutionCountWord {
    public int solution(String input){
        int maxWord = 0;
        String trimInput = input.trim();
        String [] sentences = trimInput.split("[.!?]");
        if (trimInput.isEmpty())
            return 0;
        for (String line:sentences){
            String trimSentence = line.trim();
            if (trimSentence.split("\\s").length > maxWord){
                maxWord = trimSentence.split("\\s").length;
            }
        }
        return maxWord;
    }
}
