package Task2.Analyzer;

import Task2.Label;
import Task2.TextAnalyzer;

public class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLen;

    public TooLongTextAnalyzer(int maxLen) {
        this.maxLen = maxLen;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLen){
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
