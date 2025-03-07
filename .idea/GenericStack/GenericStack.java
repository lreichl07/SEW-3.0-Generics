package GenericStack;

/**
 * This class creates a generic stack
 * @author Lisa Reichl
 * @version 2025-03-07
 * @param <T> is the datatype of the stack (has to inherit from Object)
 */
public class GenericStack <T> {
    private T[] stack = (T[]) new Object[10];

    /**
     * parameterless constructor
     */
    public GenericStack() {
        this.stack= (T[]) new Object[10];
    }

    /**
     * constuctor with parameter
     * @param stack is the stack
     */
    public GenericStack (T[] stack) {
         this.stack = stack;
    }

    /**
     * this method is used to add an entry to the stack
     * @param stack is the stack being added to
     * @param value is the value being added to the stack
     * @param <T> is the datatype of the value and the stack
     * @throws StackFullException in case of the entire stack already being full
     */
    public static <T> void push(T[] stack, T value) throws StackFullException {
        boolean done = false;
        for (int i = 0; i < stack.length && done == false; i++) {
            if (stack[i] == null) {
                stack[i] = value;
                done = true;
            }
        }
        if(done==false) {
            throw new StackFullException("Stack is full");
        }
    }

    /**
     * this method removes the most recently added object in the stack
     * @param stack is the stack being removed from
     * @return gives back the object that was removed
     * @param <T> is the datatype of the stack and the value
     * @throws StackEmptyException in case of the entire stack already being empty
     */
    public static <T> T pop(T[] stack) throws StackEmptyException {
        boolean done = false;
        for (int i = stack.length - 1; i >= 0 && done == false; i--) {
            if (stack[i] != null) {
                T temp = stack[i];
                stack[i] = null;
                done = true;
                return temp;
            }
        }
        if(done==false) {
            throw new StackEmptyException("Stack is empty");
        }
        return null;
    }

    /**
     * this method checks the top of the stack and returns the value without removing it from the stack
     * @param stack is the stack being looked at
     * @return gives back the top object
     * @param <T> is the datatype of the stack
     * @throws StackEmptyException in case of the entire stack already being empty
     */
    public static <T> T peek(T[] stack) throws StackEmptyException {
        boolean done = false;
        for (int i = stack.length - 1; i >= 0 && done == false; i--) {
            if (stack[i] != null) {
                done = true;
                return stack[i];
            }
        }
        if(done == false) {
            throw new StackEmptyException("Stack is empty");
        }
        return null;
    }

    /**
     * this method returns the entire stack as a String.
     * @param stack is the stack being written
     * @return gives out the String
     * @param <T> is the datatype of the stack
     */
    public static <T> String list(T[] stack) {
        String result = "";
        for(int i = stack.length - 1; i >= 0; i--) {
            if (stack[i] != null) {
                result += stack[i] + "; ";
            }
        }
        return result;
    }
}
