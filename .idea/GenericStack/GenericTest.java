package GenericStack;

import javax.swing.*;

/**
 * this class tests the methods from the GenericStack class.
 * @author Lisa Reichl
 * @version 2025-03-07
 */
public class GenericTest {

    /**
     * the main method used to test
     * @param args is not used.
     */
    public static void main(String[] args) {
        //TEST FOR TEXT ARRAY
        String[] stack = new String[10];
        try {
            GenericStack.push(stack, "test1");
            GenericStack.push(stack,"test2");
        } catch (StackFullException e) {
            e.printStackTrace();
        }
        try{
            System.out.println(GenericStack.peek(stack).toString());
        } catch (StackEmptyException e) {
            e.printStackTrace();
        }
        System.out.println(GenericStack.list(stack));
        try{
            System.out.println(GenericStack.pop(stack).toString());
        } catch (StackEmptyException e) {
            e.printStackTrace();
        }

        //TEST FOR NUMBER ARRAY
        Integer[] stack2 = new Integer[10];
        try {
            GenericStack.push(stack2, 1);
            GenericStack.push(stack2,2);
        } catch (StackFullException e) {
            e.printStackTrace();
        }
        try{
            System.out.println(GenericStack.peek(stack2));
        } catch (StackEmptyException e) {
            e.printStackTrace();
        }
        System.out.println(GenericStack.list(stack2));
        try{
            System.out.println(GenericStack.pop(stack2));
        } catch (StackEmptyException e) {
            e.printStackTrace();
        }


    }



}
