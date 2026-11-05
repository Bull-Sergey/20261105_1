//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в пол
// Практика от 20261105
import java.util.Scanner;
import static java.lang.Math.max;

public class main {
    public static void main() {
        //task1(); // 3 числа - разность двух чисел
        //task2(); // два бандита задача №33
        //task3(); // автобусная экскурсия задача №233
        task4(); // болты и гайки задача №294
    }

    private static void task4() {
        IO.println("================================");
        IO.println("болты и гайки задача №294");
        IO.println("================================");
        int k1 = 0, l1= -1, m1 = 0; // болты количество, процент потерянных, стоимость одного болта
        int k2 = 0, l2= -1, m2 = 0; // шайбы количество, процент потерянных, стоимость одной шайбы
        // вводим данные по болтам
        while ( k1 < 1 || k1 > 300  )  {
            k1 = Integer.parseInt(IO.readln("введите количество болтов в сотнях. максимально 300 "));
            if ( k1 < 1 || k1 > 300  ) {
                IO.println("Неправильное значение!");
            }
        }
        while ( l1 < 0 || l1 > 100  )  {
            l1 = Integer.parseInt(IO.readln("введите процент потерянных болтов. максимально 100 "));
            if ( l1 < 0 || l1 > 100  ) {
                IO.println("Неправильное значение!");
            }
        }
        while ( m1 < 1 || m1 > 100  )  {
            m1 = Integer.parseInt(IO.readln("введите стоимость одного болта. максимально 100 "));
            if ( m1 < 1 || m1 > 100  ) {
                IO.println("Неправильное значение!");
            }
        }
        // вводим данные по гайкам
        while ( k2 < 1 || k2 > 300  )  {
            k2 = Integer.parseInt(IO.readln("введите количество гаек в сотнях. максимально 300 "));
            if ( k2 < 1 || k2 > 300  ) {
                IO.println("Неправильное значение!");
            }
        }
        while ( l2 < 0 || l2 > 100  )  {
            l2 = Integer.parseInt(IO.readln("введите процент потерянных гаек. максимально 100 "));
            if ( l2 < 0 || l2 > 100  ) {
                IO.println("Неправильное значение!");
            }
        }
        while ( m2 < 1 || m2 > 100  )  {
            m2 = Integer.parseInt(IO.readln("введите стоимость одной гайки. максимально 100 "));
            if ( m2 < 1 || m2 > 100  ) {
                IO.println("Неправильное значение!");
            }
        }
        int k1Lose = k1 * l1;  // количество потерянных болтов
        int k2Lose = k2 * l2; // количество потерянных гаек
        int kFound = Math.min(k1 * 100 - k1Lose, k2 * 100 - k2Lose); // парное количество болтов и гаек
        int sumk1 = (k1*100 - kFound) * m1; // сумма потерянных болтов
        int sumk2 = (k2*100 - kFound) * m2; // сумма потерянных гаек
        IO.println("Размер ущерба " + (sumk1+sumk2));


    }

    private static void task3() {
        IO.println("================================");
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
        IO.println("================================");
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
        IO.println("================================");
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
