
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
    	ArrayList<Integer> sum = new ArrayList<>();
    	
    	int temp = 0;
    	for (int rows = 0; rows < this.square.length; rows++) {
    		for (int columns = 0; columns < this.square[rows].length; columns++) {
    			temp += this.square[rows][columns];
    		}
    		sum.add(temp);
    		temp = 0;
    	}
        return sum;
    }

    public ArrayList<Integer> sumsOfColumns() {
            	ArrayList<Integer> sum = new ArrayList<>();
    	
    	int temp = 0;
    	for (int rows = 0; rows < this.square.length; rows++) {
    		for (int columns = 0; columns < this.square[rows].length; columns++) {
    			temp += this.square[columns][rows];
    		}
    		sum.add(temp);
    		temp = 0;
    	}
        return sum;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
            	ArrayList<Integer> sum = new ArrayList<>();
    	
    	int temp = 0;
    	// left diagonal
    	for (int i=0; i < this.square.length; i++) {
    		temp+= this.square[i][i];
    	}
    	sum.add(temp);
    	temp=0;
    	
    	int d = this.square.length -1;
    	for (int i=0; i< this.square.length; i++) {
    		temp += this.square[i][d];
    		d--;
    	}
    	
    	sum.add(temp);
    	temp =0;
    	
    	
        return sum;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
