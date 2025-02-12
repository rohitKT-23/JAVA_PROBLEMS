import java.util.*;

public class sort_game {
    static class emploeE {
        String naam;
        int tannkhuuaa;

        emploeE(String naam, int tannkhuuaa) {
            this.naam = naam;
            this.tannkhuuaa = tannkhuuaa;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t_salry = scn.nextInt();

        int t_emploE = scn.nextInt();
        scn.nextLine();  

        List<emploeE> employees = new ArrayList<>();

        for (int empluyee = 0; empluyee < t_emploE; empluyee++) {
            String naam = scn.next();
            int tannkhuuaa = scn.nextInt();
            if (tannkhuuaa >= t_salry) {
                employees.add(new emploeE(naam, tannkhuuaa));
            }
        }

        employees.sort((emply1, emply2) -> {
            if (emply1.tannkhuuaa != emply2.tannkhuuaa) {
                return emply2.tannkhuuaa - emply1.tannkhuuaa; 
            } else {
                return emply1.naam.compareTo(emply2.naam);
            }
        });

        for (emploeE emp : employees) {
            System.out.println(emp.naam + " " + emp.tannkhuuaa);
        }

        scn.close();
    }
}
