package Task2;

public class SpamAnalyzer extends AbstractKeywordAnalyzer{

    private String[] analyzerKey;

    public SpamAnalyzer(String[] analyzerKey) {
        this.analyzerKey = analyzerKey;
    }

    @Override
    public String[] getKeywords() {
        return analyzerKey;
    }

    @Override
    public Label getLabel() {
        return Label.SPAM;
    }
}
