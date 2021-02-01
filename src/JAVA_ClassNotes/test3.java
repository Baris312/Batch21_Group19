package JAVA_ClassNotes;

import java.util.ArrayList;
import java.util.List;

public class test3 extends ArrayList
    {
        public static void main(String[] args)
            {
             ArrayList items = new test3();

                items.add(1);
                items.add(2);
                items.add(3);
                items.add(4);
                items.add(5);

                print(items);

            }

        public static void print(ArrayList n)
            {
                for ( Object i : n )
                    {
                        System.out.println( (Integer)  i*2);
                    }
            }
    }
