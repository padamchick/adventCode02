package adventcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Code {
    private final List<Integer> code = new ArrayList<>();
    private Coordinates currentPosition;
    private Coordinates startingPosition;

    public Code(Coordinates startingPosition) {
        this.currentPosition = startingPosition;
        this.startingPosition = startingPosition;
    }

    public void findCodeDigit(String path, int length) {
        Coordinates newPosition = new Coordinates();
        for(int i=0; i<length; i++) {
             newPosition= currentPosition.changePosition(path.charAt(i));
             currentPosition=newPosition;
        }
        code.add(Keypad.convert(newPosition));
    }
    public void printPassword() {
        for(Integer digit:code) {
            System.out.print(digit);
        }
    }
    public static Code decode(String inputFileName) {
        Code code = new Code(new Coordinates(0,0));
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));

        String line;
        List<String> codeLines = new ArrayList<>();
        while((line = reader.readLine())!=null) {
            codeLines.add(line);
        }
        for(String codeLine:codeLines) {
            code.findCodeDigit(codeLine, codeLine.length());
        }
        code.printPassword();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return code;
    }


}
