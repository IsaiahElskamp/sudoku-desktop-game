package sudoku.model.helpers;

import sudoku.model.models.SudokuField;

import java.util.HashSet;
import java.util.Set;

public class UniqueChecker {
    public static boolean checkUnique(SudokuField[] fields) throws IllegalArgumentException {
        Set<Integer> values = new HashSet<Integer>();
        for (SudokuField field : fields) {
            int value = field.getValue();
            //Izzy added to make test possible
            if (value < 0 || value > 9) {
                throw new IllegalArgumentException("Invalid Sudoku value");
            }

            if (value != 0) {
                if (values.contains(value)) {
                    return false;
                }
                values.add(value);
            }
        }
        return true;
    }
}
