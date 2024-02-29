/**
 * ArrayPlotter.java  10/18/14
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id nnnnnnn
 *
 * @author - I received help from ...
 *
 *
 * The ArrayPlotter class provides methods for drawing in
 *    a grid by setting the boolean values of a 2D array.
 *
 *    Each drawing method must
 *    - take zero arguments,
 *    - have a void return type, and
 *    - have a name that conforms to the on...ButtonClick format.
 *      (This restriction allows the GridPlotterGUI to recognize methods,
 *       for which it automatically generates buttons.)
 *
 * License Information:
 *   This class is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation.
 *
 *   This class is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 */

import javax.swing.JOptionPane;

public class ArrayPlotter
{
	/** The Array Plotter Graphical User Interface. */
  	private ArrayPlotterGUI gui;

	/** The Color Array.  The element values indicate how to color a grid cell:
	 *  - true: Color the cell with the Drawing Color.
	 *  - false: Color the cell with the Background Color.
	 */
  	private boolean[][] colorArray;


	/** Constructs an Array Plotter */
	public ArrayPlotter()
	{
		gui = new ArrayPlotterGUI(this);
		colorArray = null;
	}

	/** Initialize this's Color Array to a new 2D array of boolean values
	 *  with the given dimensions.
	 *  @param rows the number of rows in the new array.
	 *  @param cols the number of columns in the new array.
	 *  Postcondition: All of the Color Array's elements have the value false.
	 */
	public void initializeColorArray(int rows, int cols)
	{
		colorArray = new boolean[rows][cols];
	}


  	// Drawing Methods

	/** Removes all objects from the grid. */
	public void onClearGridButtonClick()
	{
		// REPLACE showMessageDialog call with correct code.
		
                        for (int r = 0; r < colorArray.length; r++)
                        {
                                for (int x = 0; x<colorArray[0].length; x++)
                                {
                                        colorArray[r][x] = false;
                                }
                        }
                        gui.update(colorArray);        
	}

	/** Fills in all the cells of the grid using a row-major traversal. */
	public void onRowMajorFillButtonClick()
	{
		
                        for(int r = 0; r < colorArray.length; r++)
                        {
                                for(int x = 0; x < colorArray[0].length; x++)
                                {
                                        colorArray[r][x] = true;
                                        gui.update(colorArray);
	                        }
                        }
        }
        public void onColMajorFillButtonClick()
        {
                for(int r = 0; r < colorArray[0].length; r++)
                {
                        for(int x = 0; x < colorArray.length; x++)
                        {
                                colorArray[x][r] = true;
                                gui.update(colorArray);
                        }
                }
         }
  	/** main method that creates the grid plotter application. */
	public static void main(String[] args)
        {
    	        ArrayPlotter plotter = new ArrayPlotter();   		
	}
        public void onReverseRowMajorFillButtonClick()
        {
                for(int r = colorArray.length - 1; r>=0; r--)
                {
                        for(int x = 0; x<colorArray[0].length; x++)
                        {
                                colorArray[r][x] = true;
                                gui.update(colorArray);
                        }
                }
        }
        public void onMainDiagonalFillButtonClick()
        {
                for(int r = 0; r<colorArray.length; r++)
                {
                        for(int x = 0; x < colorArray[0].length; x++)
                        {
                                if (r==x)
                                {
                                        colorArray[r][x] = true;
                                        gui.update(colorArray);
                                }
                        }
                }
        }
        public void onMainTriangleFillButtonClick()
        {
                for(int r = 0; r<colorArray.length; r++)
                {
                          for(int x = 0; x < colorArray[0].length; x++)
                          {
                                if(r >= x)
                                {
                                        colorArray[r][x] = true;
                                        gui.update(colorArray);
                                }
                          }
                 }
        }
        public void onOtherDiagonalFillButtonClick()
        {
                for(int x = colorArray[0].length - 1; x >= 0 && (colorArray[0].length - 1) - x < colorArray.length; x--)
                {
                        colorArray[(colorArray[0].length - 1) - x][x] = true;
                        gui.update(colorArray);
                }
        }
        public void onOtherTriangleFillButtonClick()
        {
                for(int r = 0; r < colorArray.length; r++)
                {
                        for(int x = colorArray[0].length - 1; x >= (colorArray[0].length - 1) - r && x>=0; x--)
                        {
                                if (!(colorArray[r][x]))
                                {
                                        colorArray[r][x] = true;
                                        gui.update(colorArray);
                                }
                        }
                }
        }
        public void onXFillButtonClick()
        {
                       int i = colorArray[0].length - 1;
                       for(int r = 0; r < colorArray.length; r++)
                       {
                                for(int x = 0; x < colorArray[0].length; x++)
                                {
                                        if (r == x)
                                        {
                                                colorArray[r][x] = true;
                                                gui.update(colorArray);  
                                        }                      
                                }
                       }
                       
                       
                       for(int x = colorArray[0].length - 1; x >= 0 && i - x >= 0; x--)
                       {
                                if ((i-x) <= colorArray.length - 1)
                                {
                                        colorArray[i - x][x] = true;
                                        gui.update(colorArray);
                                }                      
                       }
                                     
                       
        }
       
       
        private void fillRowLeftToRight(boolean [] row)
        {
                     
                      for(int r = 0; r < row.length; r++)
                      {
                                if(row[r] == false)
                                {
                                        row[r] = true;
                                        gui.update(colorArray);
                                }
                        }
                     
        }
       
        private void fillRowRightToLeft(boolean [] row)
        {
                     
                      for(int r = row.length - 1; r >= 0; r--)
                      {
                                if(row[r] == false)
                                {
                                        row[r] = true;
                                        gui.update(colorArray);
                                }
                      }
                     
        }
       
        public void onSerpentineFillButtonClick()
        {
                     
                      for(int r = 0; r < colorArray.length; r++)
                      {
                                if(r % 2 == 0)
                                {
                                        fillRowLeftToRight(colorArray[r]);
                                }
                                else
                                {
                                        fillRowRightToLeft(colorArray[r]);
                                }
                      }
                     
        }
       
        public void onBorderFillButtonClick()
        {
                       
                       fillRowLeftToRight(colorArray[0]);
                       for(int r = 0; r < colorArray.length - 1; r++)
                       {
                                if (colorArray[r][colorArray[0].length - 1] == false)
                                {
                                        colorArray[r][colorArray[0].length - 1] = true;
                                        gui.update(colorArray);  
                                }
                       }  
                       fillRowRightToLeft(colorArray[colorArray.length - 1]);  
                       for(int r = colorArray.length - 2; r > 0; r--)
                       {  
                                if (colorArray[r][0] == false)
                                {
                                        colorArray[r][0] = true;
                                        gui.update(colorArray);  
                                }  
                       }                
                       
        }
        public void onEyesButtonClick()
        {
                colorArray[0][0] = true;
                colorArray[0][colorArray[0].length - 1] = true;
                gui.update(colorArray);
        }
        public void onNoseButtonClick()
        {
                colorArray[(colorArray.length - 1)/2][(colorArray[0].length - 1)/2] = true;
                colorArray[(colorArray.length - 1)/2][(colorArray[0].length - 1)/2 + 1] = true;
                colorArray[(colorArray.length - 1)/2 - 1][(colorArray[0].length - 1)/2] = true;
                colorArray[(colorArray.length - 1)/2 + 1][(colorArray[0].length - 1)/2] = true;
                gui.update(colorArray);
        }
        public void onSmileButtonClick()
        {
                for(int x = 0; x < colorArray[0].length; x++)
                {
                        colorArray[colorArray.length - 1][x] = true;
                }
                colorArray[colorArray.length - 2][0] = true;
                colorArray[colorArray.length - 2][colorArray[0].length - 1] = true;
                gui.update(colorArray);
        }
                 
                
}                                                                                 