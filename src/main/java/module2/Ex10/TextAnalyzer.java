package module2.Ex10;

public interface TextAnalyzer {
    Label processText(String text);
}

enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}