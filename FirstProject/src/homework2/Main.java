package homework2;

public class Main {
    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0] = new Employee("Колодкин А.А", "Начальник", "kolodkinna4@mail.ru", "+78569634578", 500000.0, 55);
        arr[1] = new Employee("Борзов Н.А", "Работник", "Borzovv@mail.ru", "+788956562", 50000.0, 25);
        arr[2] = new Employee("Николаев К.Л", "Зам", "niko@mail.ru", "+79876543212", 300000.0, 45);
        arr[3] = new Employee("Тормозова А.В", "Бухгалтер", "tormoz@mail.ru", "+78527419878", 45000.0, 39);
        arr[4] = new Employee("Васильева А.Г", "Заведущий", "vasvas@mail.ru", "+78617438246", 100000.0, 41);
        for (int i = 0; i<arr.length;i++){
            if(arr[i].getAge()>40){
                arr[i].printEmployee();
            }
        }
    }
}