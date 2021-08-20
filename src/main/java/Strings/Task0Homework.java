package Strings;

public class Task0Homework {

    public static void main(String[] args) {

        int[] ticket = {1, 3, 4, 6, 1, 1};
        Task0Homework.printLuckyTicket(ticket);
    }

    public static void printLuckyTicket(int[] ticket){
        if ((ticket[0] + ticket[1] + ticket [2]) == (ticket[3] + ticket[4] + ticket [5])){
            System.out.println("Билет счастливый: true");
        }else {
            System.out.println("Билет не счастливый: false");
        }
    }

}
