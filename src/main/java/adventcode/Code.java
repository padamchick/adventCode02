package adventcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Code {
    private final List<Integer> code = new ArrayList<Integer>();
    private Coordinates currentPosition;
    private Coordinates startingPosition;

    public Code(Coordinates startingPosition) {
        this.currentPosition = startingPosition;
        this.startingPosition = startingPosition;
    }

    public void findCodeDigit(String path) {
        Coordinates newPosition = new Coordinates();
        for (String direction : path.split("")) {
            newPosition = currentPosition.changePosition(direction);
            currentPosition = newPosition;
        }
        code.add(Keypad.convert(newPosition));
    }

    public static Code decode(String inputFileName) {
        Code code = new Code(new Coordinates(0, 0));
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));

            String line;
            List<String> codeLines = new ArrayList<String>();
            while ((line = reader.readLine()) != null) {
                codeLines.add(line);
            }
            for (String codeLine : codeLines) {
                code.findCodeDigit(codeLine);
            }

            reader.close();
            return code;
        } catch (IOException ex) {
            System.err.format("Exception occurred trying to read '%s'.", inputFileName);
            ex.printStackTrace();
            return null;
        }
    }

    public String printPassword() {
        StringBuilder sb = new StringBuilder();
        for (Integer digit : code) {
            sb.append(digit);
        }
        return sb.toString();
    }
}
