package hashing;

import input.Input;
import input.ProcessInput;

public class HashingExecutor {

    public static void execute(){
        Input input = ProcessInput.processInput();
        ArraySubsetOfAnotherArray.execute(input.getInputArrList1(), input.getInputArrList2());
    }
}
