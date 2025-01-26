package module2.Ex10;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private final String[] keywords = {":(", "=(", ":|"};

    @Override
    public Label processText(String text) {
        String[] keywords = getKeywords();
        for (String keyword : keywords) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}