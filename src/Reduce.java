public class Reduce {
    public static void main(String[] args) {
        int count = 100;
        int answer = countReduce(count);
        System.out.println(answer);
    }
    private static int countReduce(int count) {
        int steps = 0;
        while (count != 0) {
            if (count % 2 == 0) {
                count /= 2;
            } else {
                count -= 1;
            }
            steps++;
        }
        return steps;
    }
}
