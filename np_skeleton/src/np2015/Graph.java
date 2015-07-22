package np2015;

import java.util.ArrayList;
import java.util.Vector;

public class Graph {
		/**
		 * object representation of the graph.
		 */
		private  ArrayList<Vector<Integer>> graph = new ArrayList<>();
		/**
		 * row size and column size of the graph.
		 */
		private int row, column; 

		/**
		 * @param n: row size
		 * @param m: column size
		 * Constructor of the graph object
		 */
		public Graph(int n, int m){
			this.row = n;
			this.column = m;
			//initialize the graph object with zeros as start value
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					this.graph.get(i).set(j,0);
				}
			}
		}

		public int getRow() {
			return row;
		}

		public void setRow(int row) {
			this.row = row;
		}

		public int getColumn() {
			return column;
		}

		public void setColumn(int column) {
			this.column = column;
		}

}
