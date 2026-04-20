import java.util.List;

class Event {
    String name;
    int participants;

    Event(String name, int participants) {
        this.name = name;
        this.participants = participants;
    }

    public String getName() {
        return name;
    }

    public int getParticipants() {
        return participants;
    }
}

public class StreamsExample3 {
    public static void main(String[] args) {
        List<Event> events = List.of(
                new Event("Event1", 150),
                new Event("Event2", 400),
                new Event("Event3", 250)
        );

        List<String> filteredEvents = events.stream()
                .filter(e -> e.getParticipants() < 300)
                .map(e -> e.getName())
                .toList();

        System.out.println(filteredEvents);
    }
}