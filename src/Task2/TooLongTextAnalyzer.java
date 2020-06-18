package Task2;

public class TooLongTextAnalyzer implements TextAnalyzer {

    private int length;

    public TooLongTextAnalyzer(int length) {
        this.length = length;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > length)
            return Label.TOO_LONG;
        else
            return Label.OK;
    }
}
