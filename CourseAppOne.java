import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class CourseAppOne {
    public static void main(String[] args) {

        // VARIABLES
        int operations = 1;
        String UserText;
        String[] numberList;
        String[] textExplode;
        String math_process_name;
        int math_process_index = 0;

        // CLASSES
        Scanner input = new Scanner(System.in);

        // USER TEXT
        System.out.print("İfadenizi Giriniz..: ");
        UserText = input.nextLine();

        // TEXT EXPLODE
        textExplode = UserText.split(" ");

        // TRANSACTION CAPTURE
        for(String explode: textExplode){
            if(explode.contains("topla")){
                operations = 0;
                math_process_index = UserText.indexOf("topla");
            }else if(explode.contains("çıkar")){
                operations = 0;
                math_process_index = UserText.indexOf("çıkar");
            }else if(explode.contains("fark")){
                operations = 0;
                math_process_index = UserText.indexOf("fark");
            }else if(explode.contains("çarp")){
                math_process_index = UserText.indexOf("çarp");
            }else if(explode.contains("böl")){
                math_process_index = UserText.indexOf("böl");
            }
        }
        // MATH PROCESS NAME
        math_process_name = UserText.substring(math_process_index).split(" ")[0];

        // NUMBERS
        numberList = new String[10];
        numberList[0] = "0";
        numberList[1] = "1";
        numberList[2] = "2";
        numberList[3] = "3";
        numberList[4] = "4";
        numberList[5] = "5";
        numberList[6] = "6";
        numberList[7] = "7";
        numberList[8] = "8";
        numberList[9] = "9";

        // ALL CONTROLLER
        for(int i=0;i<numberList.length; i++){
            for(int j=0; j<textExplode.length; j++){
                if(!textExplode[j].isBlank()){
                    if(textExplode[j].matches(numberList[i])){
                        int number = Integer.parseInt(numberList[i]);
                        if(math_process_name.contains("topla")){
                            operations+=number;
                        }else if(math_process_name.contains("çıkar") || math_process_name.contains("fark")){
                            operations = number - operations;
                        }else if(math_process_name.contains("çarp")){
                            operations*=number;
                        }else if(math_process_name.contains("böl")){
                            operations = number / operations;
                        }else{
                            System.err.println("Böyle bir işlem daha önce tanımlanmadı.. GEÇERSİZ İŞLEM!!!");
                        }
                    }
                }
            }
        }

        if(operations >= 0){
            System.out.println(operations);
        }else{
            System.err.println("İşlem Yapılamadı.. Lütfen Programı Tekrar Başlatınız!!!");
        }




    }
}
