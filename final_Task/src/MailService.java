import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {
    Map<String, List<T>> mailBox = new HashMap<>(){
        @Override
        public List<T> get(Object key) {
            if (!containsKey(key)) {
                return Collections.emptyList();
            }
            return super.get(key);
        }
    };

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }


    @Override
    public void accept(Sendable<T> sendable) {
        List<T> list = mailBox.get(sendable.getTo());
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        list.add(sendable.getContent());
        mailBox.put(sendable.getTo(), list);
    }
}