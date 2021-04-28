package org.example;

public class App {
    public static void main(String[] args) {

       /* int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println( a+"+"+ b + "=" + (a + b));
        System.out.println( a+"-"+ b + "=" + (a - b));
        System.out.println( a+"*"+ b + "=" + (a * b));
        System.out.println(b+"/"+ a + "="  + (b / a));
        System.out.println(b+"%"+ a + "="+ (b % a));
        System.out.println(c+"%"+ a + "="+ (c % a));
        System.out.println(a+"++   = " + (a++));
        System.out.println(b+"--   = " + (a--));
        // Проверьте разницу в d++ и ++d
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));*/
        /*int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );*/
/*
        String a = "Hello", b = "World";
        System.out.println(a + " " + b); // Здесь + означает объединение (конкатенацию) строк
        // Пробел не вставляется автоматически

        // Строки конкатенируются слева направо, надо помнить это когда соединяешь строку и примитив
        String c = 2 + 2 + ""; // "4"
        String d = "" + 2 + 2; // "22"
        d = "" + (2 + 2); // а теперь d тоже "4"
*/
     /*   String a = "Hello", b = "World";
        System.out.println(a + " " + b); // Здесь + означает объединение (конкатенацию) строк
        // Пробел не вставляется автоматически

        // Строки конкатенируются слева направо, надо помнить это когда соединяешь строку и примитив
        String c = 2 + 2 + ""; // "4"
        String d = "" + 2 + 2; // "22"
        d = "" + (2 + 2); // а теперь d тоже "4"

        String foo = "a string";
        String bar = "a string"; // bar будет указывать на тот же объект что и foo
        String baz = new String("a string"); // Чтобы гарантированно создать новую строку надо вызвать конструктор
        System.out.println("foo == bar ? " + (foo == bar)); // == сравнивает ссылки на объекты
        System.out.println("foo равен bar ? " + (foo.equals(bar))); // Метод equals служит для проверки двух объектов на равенство
        System.out.println("foo == baz ? " + (foo == baz));
        System.out.println("foo равен baz ? " + (foo.equals(baz)));
*/
     /*int [] ar = {1,2,3,4,5,6,7,8,9,10};
     System.out.println("1й + 3й + 7й: "+(ar[0]+ar[2]+ar[6]));
    */
     /*
     int [] arr = new int[25];
     arr[0]=1;
     arr[1]=1;
     int a = 2;
        while (a <= 24) {
            arr[a] = arr[a-1]+arr[a-2];
            System.out.println(" "+ arr[a-2] + "+"+ arr[a-1]+"="+arr[a]);
            //System.out.println("a = "+ a + " "+ arr[a]);
            ++a;
        }
        String s = "";

        for (int i: arr){
            s = s +" "+ i;
        }
        System.out.println(s);*/
        /*int [] ar = {11,23,35,49,59,60,71,38,92,10};
        int  max = ar[0], min = ar[0], avg = 0;
        for (int i: ar){
            if (i>max) {max=i;}
            if (i<min) {min=i;}
            avg +=i;
        }
        System.out.println("MAX: "+max);
        System.out.println("MIN: "+min);
        System.out.println("AVG: "+(double)avg/ar.length);
        */
        /*System.out.print("    ");
        for (a = 10; a <= 20; a++) {
            System.out.print(a+"  ");
        }

        for (a = 10; a <= 20; a++) {
              System.out.println("");
            System.out.print(a+ "  ");
            for (b = 10; b <= 20; b++) {
                result = a * b;
                System.out.print(result+" ");
            }
        }*/
 /*for (a = 2; a<=(i/2); a++ ){
            if (i % a == 0) {
                n = (n == 0) ? a:n;
            }
        }*/
      /*  int i = 94752, n = 1;
        boolean isSimple = true;

        while (isSimple && n < i/2) {
            n++;
            isSimple = (i%n ==0 ) ? false:true;
        }
        System.out.println(isSimple? (i+ " простое "):(i+ " не простое. " + "Делитель: "+ n));
*/
      int m= 10;
      String month="", season="";
      switch (m){
          case 1: month = "Январь";  break;
          case 2: month = "Февраль";  break;
          case 12: month = "Декабрь";  break;
          case 3: month = "Март"; break;
          case 4: month = "Апрель"; break;
          case 5: month = "Май";  break;
          case 6: month = "Июнь";  break;
          case 7: month = "Июль";  break;
          case 8: month = "Август";  break;
          case 9: month = "Сентябрь";  break;
          case 10: month = "Октябрь"; break;
          case 11: month = "Ноябрь";  break;
      }
        switch (m){
            case 1:
            case 2:
            case 12: season = "Зимний"; break;
            case 3:
            case 4:
            case 5: season = "Весенний"; break;
            case 6:
            case 7:
            case 8: season = "Летний"; break;
            case 9:
            case 10:
            case 11: season = "Осенний"; break;
        }

        System.out.println(month+" - это "+ season + " месяц");

    }
}
