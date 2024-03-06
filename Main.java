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
            List<Integer> arrayList2 = new ArrayList<>();
            Iterator<Integer> it = arrayList2.iterator();
            int n = 10000;
            Instant start = Instant.now();
            for (int i = 0; i < n; i++) {
            arrayList.add(i);
            }
            Instant stop = Instant.now();
            Duration duration = Duration.between(start, stop);
            long nanoseconds = duration.toNanos();
            System.out.println("Time taken: " + nanoseconds + " nanoseconds");
            Instant startl = Instant.now();
            for (int i = 0; i < n; i++) {
            linkedList.add(i);
            }
            Instant stopl = Instant.now();
            Duration durationl = Duration.between(startl, stopl);
            long nanosecondss = durationl.toNanos();
            System.out.println("Time taken: " + nanosecondss + " nanoseconds");
            Instant starti = Instant.now();
            while (it.hasNext()) {
            Integer i = it.next();
            if (i < n) {
                arrayList2.add(i);
            }
            }
            Instant stopi = Instant.now();
            Duration durationi = Duration.between(starti, stopi);
            long nanosecondsss = durationi.toNanos();
            System.out.println("Time taken: " + nanosecondsss + " nanoseconds");
      }

    }

