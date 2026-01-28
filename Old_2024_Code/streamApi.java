import java.util.*;
import java.util.stream.*;

public class streamApi {
  public static void main(String[] args) throws Exception {

    List<Integer> list1 = Arrays.asList(62, 323, 44, 22);
    Stream<Integer> streamData = list1.stream();

    // long count = streamData.count();
    // System.out.println(count);

    Stream<Integer> Streamshort = streamData.sorted();

    Streamshort.forEach(n -> System.out.println(n));
  }
}
