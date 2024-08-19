import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

public class newf {

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        // Lambda Expression Example
        Runnable runnable = () -> System.out.println("Hello from a Lambda Expression!");
        new Thread(runnable).start();

        // Base64 Encoding and Decoding Example
        String originalInput = "Hello, World!";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        System.out.println("Encoded: " + encodedString);

        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded: " + decodedString);

        // Date and Time Example
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current DateTime: " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);

        // forEach Method Example
        List<String> items = Arrays.asList("item1", "item2", "item3");
        items.forEach(item -> System.out.println(item));

        // Varargs Example
        printNumbers(1, 2, 3, 4, 5,6);

        // Enum Example
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);

        // Collectors and Streams Example
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        List<String> uppercaseFruits = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase Fruits: " + uppercaseFruits);

        int sum = Arrays.asList(1, 2, 3, 4, 5).stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);

        // Fetch Data Example
        fetchData("https://jsonplaceholder.typicode.com/todos/1");
    }

    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void fetchData(String urlString) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();

            System.out.println("Fetched Data: " + content.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

