package gr11review.part1;
public class Review1 {

    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);


                System.out.print("Enter the month number: ");
                int month = scanner.nextInt();

                System.out.print("Enter the day number: ");
                int days = scanner.nextInt();

                int January = 0;
                int February = 31;
                int March= 59;
                int April = 90;
                int May = 120;
                int June = 151;
                int July = 181;
                int August = 212;
                int September = 243;
                int October = 273;
                int November = 304;
                int December = 334;


              if (month == 1) {
                  month = January;
              } else if (month == 2) {
                  month = February;
              } else if (month == 3) {
                  month = March;
              } else if (month == 4) {
                  month = April;
              } else if (month == 5) {
                  month = May;
              } else if (month == 6) {
                  month = June;
              } else if (month == 7) {
                  month = July;
              } else if (month == 8) {
                  month = August;
              } else if (month == 9) {
                  month = September;
              } else if (month == 10) {
                  month = October;
              } else if (month == 11) {
                  month = November;
              } else {
                  month = December;
              }
              System.out.println(month + days);


            }
        }