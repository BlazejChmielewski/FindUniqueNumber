import java.util.List;
import java.util.stream.Collectors;
import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {

        double[] a = new double[]{0, 0, 3, 0, 0};
        List<Double> collect = stream(a).sorted().boxed().collect(Collectors.toList());

        if (collect.get(0).equals(collect.get(1))) {
            System.out.println(collect.get(collect.size() - 1));
        } else {
            System.out.println(collect.get(0));
        }
    }
}