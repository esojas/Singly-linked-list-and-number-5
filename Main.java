import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Main {
      public static void main(String[] args) {
            Linkedlist.Node<String> tom = new Linkedlist.Node<>("Tom");
            Linkedlist.Node<String> dick = new Linkedlist.Node<>("Dick");
            Linkedlist.Node<String> harry = new Linkedlist.Node<>("Harry");
            Linkedlist.Node<String> sam = new Linkedlist.Node<>("Sam");
            tom.next = dick;
            dick.next = harry;
            harry.next = sam;
            System.out.println(tom.data);
            Linkedlist.KWSingleLinkedList<String> names = new Linkedlist.KWSingleLinkedList<>();
            names.addFirst("Sam");
            names.addFirst("Harry");
            names.addFirst("Dick");
            names.addFirst("Tom");
            Linkedlist.Node<String> bob = new Linkedlist.Node<>("Bob");
            bob.next = harry.next;
            harry.next = bob;
            tom.next = tom.next.next;
            names.removeFirst();
            System.out.println(names.toString());
    
            List<Integer> arrayList = new ArrayList<>();
            List<Integer> linkedList = new LinkedList<>();
            int n = 10000;
            Instant start = Instant.now();
            for (int i = 0; i < n; i++) {
                arrayList.add(i);
            }
            Instant stop = Instant.now();
            Duration duration = Duration.between(start, stop);
            long milliseconds = duration.toNanos();
            System.out.println("Time taken: " + milliseconds + " milliseconds");
            Instant startl = Instant.now();
            for (int i = 0; i < n; i++) {
                linkedList.add(i);
            }
            Instant stopl = Instant.now();
            Duration durationl = Duration.between(startl, stopl);
            long millisecondss = durationl.toNanos();
            System.out.println("Time taken: " + millisecondss + " milliseconds");
      }

    }

