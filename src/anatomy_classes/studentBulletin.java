package anatomy_classes;

public class studentBulletin {
    public static void main(String[] args){
        int finalMean = 7;
        if (finalMean < 6)
            System.out.print("REPROVED");
        else if (finalMean ==  6)
            System.out.print("RECOVERY TEST");
        else
            System.out.print("APPROVED");
    }
}
