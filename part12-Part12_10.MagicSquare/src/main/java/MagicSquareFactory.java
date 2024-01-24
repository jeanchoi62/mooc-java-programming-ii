
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);
        int count = 1;
        int row = 0;
        int originalRow = 0;
        int column = size/2;
        int originalColumn = size/2;
        // center column
        square.placeValue(row, column, count);
    	count++;
        
        while (count <= size*size) {
        	// go up
        	if (row-1 < 0) {
        		row = size - 1;
        	} else {
        		row = row -1;
        	}
        	// go right
        	if (column + 1 >= size) {
        		column = 0;
        	} else {
        		column++;
        	}
        	// placement
        	if (square.readValue(row, column) != 0) {
        		square.placeValue(originalRow+1, originalColumn, count);
        		originalRow++;
        		row=originalRow;
        		column=originalColumn;
        		count++;
        	} else {
        		square.placeValue(row, column, count);
        		originalRow = row;
        		originalColumn = column;
        		count++;
        	}
        }
        return square;
    }
}