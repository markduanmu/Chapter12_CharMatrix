/*
 * Implements a 2-D array of characters
 */

public class CharMatrix
{
  // Fields:
  char[][] theMatrix;


  public CharMatrix(int rows, int cols)
  {
    theMatrix = new char[rows][cols];
  }

  /*
   * Constructor: creates a grid with dimensions rows , cols ,
   * and fills it with the fill  character
   */
  
  public CharMatrix(int rows, int cols, char fill)
  {
    theMatrix = new char[rows][cols];
    fillRect(0,0,rows,cols,fill);
  }

  /*
   * Returns the number of rows in grid
   */
  
  public int numRows()
  {
    return theMatrix.length;
  }

  /*
   * Returns the number of columns in grid
   */
  
  public int numCols()
  {
	return theMatrix[0].length;
  }

  /*
   * Returns the character at row, col location
   */
  
  public char charAt(int row, int col)
  {
	  if (row<theMatrix.length && col<theMatrix[0].length){
		  return theMatrix[row][col];
	  }else{
		  return 0;
	  }
  }

  /*
   * Sets the character at row, col location to ch
   */
  
  public void setCharAt(int row, int col, char ch)
  {
    theMatrix[row][col] = ch;
  }

  /*
   * Returns true if the character at row, col is a SPACE,
   * false otherwise
   */
  
  public boolean isEmpty(int row, int col)
  {
    if(theMatrix[row][col] == ' '){
    	return true;
    }else{
    	return false;
    }
  }

  /*
   * Fills the given rectangle with the fill characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    for(int m=row0;m<row1;m++){
    	for(int k=col0;k<col1;k++){
//    		replace(theMatrix[k],fill);
    		theMatrix[m][k] = fill;
    	}
    }
  }

  /*
   * Fills the given rectangle with the SPACE characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  
  private void replace(char[] cs, char fill) {	
}

public void clearRect(int row0, int col0, int row1, int col1)
  {
    fillRect(row0,col0,row1,col1,' ');
  }

  /*
   * Returns the count of all non-SPACE characters in row.
   */

  public int countInRow(int row)
  {
    int count= 0;
    for (int i = 0; i < theMatrix[0].length; i++){
    	if(theMatrix[row][i]!=' '){
    		count++;
    	}
    }
    return count;
  }

  /*
   * Returns the count of all non-SPACE characters in col.
   */
  
  public int countInCol(int col)
  {
	int count = 0;
	for (int i = 0; i < theMatrix.length; i++){
		if(theMatrix[i][col]!=' '){
			count++;
		}
	}
	return count;
  }
}
