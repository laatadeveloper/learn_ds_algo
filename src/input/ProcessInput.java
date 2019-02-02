package input;

public class ProcessInput {

    public static Input processInput(){
        FastReader fastReader = FastReader.getInstance();
        Input input = new Input();
        return process(input, fastReader);
    }

    public static Input process(Input input, FastReader fastReader){
        input.inputArr1 = fastReader.nextLine();
        input.inputArr2 = fastReader.nextLine();
        return input;
    }
}
