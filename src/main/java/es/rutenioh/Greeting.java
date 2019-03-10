package es.rutenioh;

import java.util.ArrayList;
import java.util.List;

public class Greeting {

    public static final String GREET_HELLO = "Hello";
    public static final String SHOUT_HELLO = "HELLO";

    public static String DEFAUL_USER = "my friend";

    public String greet(String name) {

        String finalName = name !=null ? name : DEFAUL_USER;
        if (finalName.toUpperCase().equals(name)) {
            return String.format(SHOUT_HELLO + " %s!",name);
        }
        return String.format(GREET_HELLO + ", %s.", finalName);
    }

    public String greet(String[] names) {

        List<String> normal = new ArrayList<>();
        List<String> upCase = new ArrayList<>();

        for (String name: names) {
            if (name.toUpperCase().equals(name)) {
                upCase.add(name);
            } else {
                normal.add(name);
            }
        }

        String upCaseGreeting = upCase.isEmpty() ? "" : getUpcaseGreeting(upCase);
        String normalString = normal.isEmpty() ? "" : getNormalGreeting(normal);

        return normalString + upCaseGreeting;
    }

    private String getUpcaseGreeting(List<String> upCase) {
        StringBuilder upcaseBuilder = new StringBuilder();
        upcaseBuilder.append(" AND HELLO ");
        for (int i = 0; i < upCase.size()-1; i++) {
            if (i != 0) {
                upcaseBuilder.append(", ");
            }
            upcaseBuilder.append(upCase.get(i));
        }
        if (upCase.size() > 1)
            upcaseBuilder.append(" AND ");
        upcaseBuilder.append(upCase.get(upCase.size()-1));
        upcaseBuilder.append("!");
        return upcaseBuilder.toString();

    }

    private String getNormalGreeting(List<String> normalCase) {
        StringBuilder normalBuilder = new StringBuilder();
        normalBuilder.append("Hello, ");
        for (int i = 0; i < normalCase.size()-1; i++) {
            if (i != 0) {
                normalBuilder.append(", ");
            }
            normalBuilder.append(normalCase.get(i));
        }
        if (normalCase.size() > 1)
            normalBuilder.append(" and ");
        normalBuilder.append(normalCase.get(normalCase.size()-1));
        normalBuilder.append(".");
        return normalBuilder.toString();

    }


}
