package np2015;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Graph implements ImageConvertible {
		/**
		 * object representation of the graph.
		 */
		private  Vector<Column> graph;
		/**
		 * row size and column size of the graph.
		 */
		private int row, column; 

		/**
		 * @param ginfo: The GraphInfo instance to take information from
		 * Constructor of the graph object
		 */
		public Graph(GraphInfo ginfo){
			this.row = ginfo.height;
			this.column = ginfo.width;
			//initialize the graph object according to ginfo
			graph = new Vector<>(column);
			for (Map.Entry<Integer, HashMap<Integer, Double>> entryCol : ginfo.column2row2initialValue.entrySet()) {
				int currCol = entryCol.getKey();
				for (Map.Entry<Integer, Double> entryRow : entryCol.getValue().entrySet()) {
					int currRow = entryRow.getKey();
					double currVal = entryRow.getValue();
					if (graph.get(currCol) == null) {
						graph.add(currCol, new Column());	//TODO correct constructor
					}
					graph.get(currCol).addInitialNode(currRow, currVal);
				}
			}
		}

		public int getRow() {
			return row;
		}
		
		public int getColumn() {
			return column;
		}

		@Override
		public double getValueAt(int column, int row) {
			// TODO Auto-generated method stub
			return 0;
		}

}
