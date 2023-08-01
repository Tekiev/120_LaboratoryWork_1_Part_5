package DEV120_1_5_Tekiev;


public class Main {

    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(5);

        list.addFirst(4);

        list.addFirst(3);

        list.addFirst(2);

        list.addFirst(1);

        list.printAll();

       // System.out.println(list.getHead());

      //  list.printAll();

      //  System.out.println(list.getHeadAndDelete());

      //  System.out.println(list.getHeadAndDelete());

      // System.out.println(list.getHeadAndDelete());

       // list.printAll();

        System.out.println();

        list.addEnd(6);

        list.addEnd(7);

        list.addEnd(8);

        list.addEnd(9);

        list.addEnd(10);

        list.addEnd(11);

        list.addEnd(12);

        list.addEnd(13);

        list.printAll();

       // System.out.println(list.getLast());

        System.out.println();

       // list.printAll();

       // System.out.println();

      //  System.out.println(list.getLastAndDelete());

     //   System.out.println();

      //  list.printAll();

      //  System.out.println();



       //  list.printForEachStraight();


        System.out.println();


        // list.printForEachReverse();

        System.out.println();


        list.printEndToKey(6);

        System.out.println();


        list.printFromKeyToEnd(5);

        System.out.println();


        list.printFromKeyToHead(5);












    }

}
