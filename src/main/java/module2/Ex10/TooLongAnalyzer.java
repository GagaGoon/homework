package module2.Ex10;

public class TooLongAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongAnalyzer(int maxLength) {
        if (maxLength >= 0) {
            this.maxLength = maxLength;
        } else {
            this.maxLength = 0;
        }
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}