//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в пол
// Практика от 20261105
import java.util.Scanner;

public class main {
    public static void main() {
        task1(); // 3 числа - разность двух чисел
        task2(); // два бандита задача №33
        task3(); // автобусная экскурсия задача №233
        task4(); // болты и гайки задача №294
    }

    private static void task4() {
    }

    private static void task3() {
        IO.println("автобусная экскурсия задача №233");
        IO.println("================================");
        int kolBridge = Integer.parseInt(IO.readln("введите количество мостов "));
        int i=0;
        boolean accident =false;
        while (!accident && i < kolBridge )  {  // пока нет аварии и не закончились мосты
            i++;
            int height = Integer.parseInt(IO.readln("введите высоту моста № "+i+' ' ));
            if(height < 437){
                IO.println("Crash "+i);
                accident =true;
            }
        }
        if(!accident) {
            IO.println("No crash");
        }
    }

    private static void task1 () {
        IO.println("3 числа - разность двух чисел");
        IO.println("================================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа. Первое число : ");
        int numb1 = scanner.nextInt();
        System.out.println("Введите второе число : ");
        int numb2 = scanner.nextInt();
        System.out.println("Введите третье число : ");
        int numb3 = scanner.nextInt();
        IO.println(numb1+" - "+ numb2+ " = " + (numb1-numb2));
        IO.println(numb1+" - "+ numb3+ " = " + (numb1-numb3));
        IO.println(numb2+" - "+ numb1+ " = " + (numb2-numb1));
        IO.println(numb2+" - "+ numb3+ " = " + (numb2-numb3));
        IO.println(numb3+" - "+ numb1+ " = " + (numb3-numb1));
        IO.println(numb3+" - "+ numb2+ " = " + (numb3-numb2));
    }
    private static void task2() {
        IO.println("два бандита задача №33");
        IO.println("================================");
        int kolGarry = Integer.parseInt(IO.readln("введите количество простреленных банок Гарри "));
        int kolLarry = Integer.parseInt(IO.readln("введите количество простреленных банок Ларри "));
        int allKol = kolGarry + kolLarry -1 ;
        IO.println(" Всего банок " + allKol );
        IO.println(" Не прострелил Гарри " + (allKol - kolGarry));
        IO.println(" Не прострелил Ларри " + (allKol - kolLarry));
    }

}
