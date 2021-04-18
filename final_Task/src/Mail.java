public class Mail<T> implements Sendable<T> {
    private String from;
    private String to;
    private T content;

    public Mail(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public T getContent() {
        return content;
    }


}
