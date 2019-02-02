package input;

import java.util.ArrayList;

public class Input {
    public int inputN;
    public int inputN1;
    public int inputN2;
    public String inputArr1;
    public String inputArr2;
    public int inputk;

    public int getInputN() {
        return inputN;
    }

    public void setInputN(int inputN) {
        this.inputN = inputN;
    }

    public int getInputN1() {
        return inputN1;
    }

    public void setInputN1(int inputN1) {
        this.inputN1 = inputN1;
    }

    public int getInputN2() {
        return inputN2;
    }

    public void setInputN2(int inputN2) {
        this.inputN2 = inputN2;
    }

    public String getInputArr1() {
        return inputArr1;
    }

    public void setInputArr1(String inputArr1) {
        this.inputArr1 = inputArr1;
    }

    public String getInputArr2() {
        return inputArr2;
    }

    public void setInputArr2(String inputArr2) {
        this.inputArr2 = inputArr2;
    }

    public int getInputk() {
        return inputk;
    }

    public void setInputk(int inputk) {
        this.inputk = inputk;
    }

    public ArrayList<Integer> getInputArrList1() {
        ArrayList<Integer> inputArrayList1 = new ArrayList<>();
        for(String str: inputArr1.split(" ")){
            inputArrayList1.add(Integer.valueOf(str));
        }
        return inputArrayList1;
    }

    public ArrayList<Integer> getInputArrList2() {
        ArrayList<Integer> inputArrayList2 = new ArrayList<>();
        for(String str: inputArr2.split(" ")){
            inputArrayList2.add(Integer.valueOf(str));
        }
        return inputArrayList2;
    }

}
