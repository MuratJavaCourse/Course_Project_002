import java.util.Scanner;

public class CourseAppTwo {
    public static void main(String[] args) {

        // VARIABLE
        int temporaryData;
        int UserNumberCount;
        int InputNumber;
        int SortTypes;

        // CLASSES
        Scanner sc = new Scanner(System.in);

        // USER COUNT NUMBER
        System.out.print("Kaç Adet Sayı Girmek İstiyorsunuz..: ");
        UserNumberCount = sc.nextInt();

        if(UserNumberCount >= 2){
            // NUMBER LIST
            int[] numberList = new int[UserNumberCount];

            // USER NUMBERS
            for(int i=0; i<UserNumberCount; i++){
                System.out.print((i+1)+". Sayı..: ");
                InputNumber = sc.nextInt();
                numberList[i]+=InputNumber;
            }

            System.out.println("(1) Büyükten - Küçüğe");
            System.out.println("(2) Küçükten - Büyüğe");
            System.out.print("Sıralama Türü..: ");
            SortTypes = sc.nextInt();
            System.out.println();

            // NUMBER LIST -> LENGTH
            if(numberList.length > 0){
                // SORT
                for(int i=0; i<numberList.length;i++){
                    for(int j=0; j<numberList.length; j++){
                        if(SortTypes == 1){
                            if(numberList[i]>numberList[j]){
                                temporaryData = numberList[i];
                                numberList[i] = numberList[j];
                                numberList[j] = temporaryData;
                            }
                        }else{
                            if(numberList[i]<numberList[j]){
                                temporaryData = numberList[i];
                                numberList[i] = numberList[j];
                                numberList[j] = temporaryData;
                            }
                        }
                    }
                }

                System.out.println("---------------------------");

                // SORT ARRAY -> PRINT
                for(int i=0; i<numberList.length; i++){
                    System.out.println(numberList[i]);
                }

            }
        }else{
            System.err.println("Girilen Sayı EN AZ (2) Olabilir!!!");
        }



    }
}
