import static java.lang.System.*;

public class NewClass {

    public static void main (String [] args) {
        out.print("hello world , welcome");

        int ano = 2024;
        String BR = "Brazil";
        final String BR_UPPER_CASE = "Final Brazil";
        String my_name = "Lucas Costa";
        int new_year = 2025;
        boolean isTrue = false;

        out.print(ano);
        out.print(BR);
        out.print(BR_UPPER_CASE);
        out.print(isTrue);
        out.print(new_year);
        out.print(my_name);

        String primaryName = "Lucas";
        String secondaryName = "Medeiros";

        String nameCompleted = nameCompleted(primaryName, secondaryName);
        out.print(nameCompleted);
    }

    public static String nameCompleted (String primaryName, String secondaryName) {
        return primaryName.concat(" ").concat(secondaryName);
    }
}

