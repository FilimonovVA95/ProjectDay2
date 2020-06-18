package Task2;

public abstract class AbstractKeywordAnalyzer implements TextAnalyzer{

    public abstract String[] getKeywords();

    public abstract Label getLabel();

    public Label processText(String text) {
        String[] keywords = getKeywords();
        for (String s : keywords) {
            if (text.contains(s))
                return getLabel();
        }
        return Label.OK;

    }

}
