package MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> companies = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] tokens = command.split(" -> ");
            String company = tokens[0];
            String id = tokens[1];

            if (!companies.containsKey(company)) {
                companies.put(company, new ArrayList<>());
            }

            if (companies.containsKey(company)
                    && !companies.get(company).contains(id)) {
                companies.get(company).add(id);
            }

            command = scanner.nextLine();
        }

        for (var entry : companies.entrySet()) {
            System.out.println(entry.getKey());
            for (String ids : entry.getValue()) {
                System.out.printf("-- %s%n", ids);
            }

        }
    }
}
