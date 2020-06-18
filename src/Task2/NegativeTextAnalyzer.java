package Task2;

public class NegativeTextAnalyzer extends AbstractKeywordAnalyzer{

    private String[] analyzerKey = {":(", "=(", ":|"};

    @Override
    public String[] getKeywords() {
        return analyzerKey;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
