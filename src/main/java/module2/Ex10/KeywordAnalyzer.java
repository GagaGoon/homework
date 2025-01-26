package module2.Ex10;

abstract public class KeywordAnalyzer {
    private String[] keywords;

    abstract protected String[] getKeywords();

    abstract protected Label getLabel();
}