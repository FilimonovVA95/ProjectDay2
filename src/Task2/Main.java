package Task2;

public class Main {

    public static void main(String[] args) {

    }

    public static Label verificationText(TextAnalyzer[] textAnalyzers, String text) {
        for (TextAnalyzer textAnalyzer : textAnalyzers) {
            if (textAnalyzer.processText(text) != Label.OK)
                return textAnalyzer.processText(text);
        }
        return Label.OK;
    }

}
