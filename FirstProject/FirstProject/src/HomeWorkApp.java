public class HomeWorkApp {
    public static void main(String[] args) {
        checkSumSign();
        writeString("Hello!",5);
        checkNumber(2);
        System.out.println(checkYear(2023));

    }
    public static void checkSumSign(){
        int first = 3;
        int second = 7;
        int sum = first+second;
        if (sum>0) System.out.println("Сумма положительная");
        else if (sum<0) System.out.println("Сумма отрицательная");
        else System.out.println("Сумма равна 0");
    }
    public static void writeString(String str, int num){
        for(int i = 0; i<num;i++){
            System.out.println(str);
        }
    }
    public static  boolean checkNumber(int num){
        if(num>=0)
        return true;
        else return false;
    }
    public static boolean checkYear(int year){
        int count=0;
        while (true){
            if(year>count){
            count=count+4;
            if(year==count){
                return year != 100;
            }
            }
            else return false;
        }
    }

}
