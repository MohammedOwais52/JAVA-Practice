
public class TwoDArray {

	public static void main(String[] args) {
		
		
				int[][] a = { {5, 15, 25}, {43, 45, 55} };
				int[][] b = {{22, 32, 42}, {65, 35, 55} };
				int[][] Sum = new int[2][3];
				int rows, columns;
				
				for(rows = 0; rows < a.length; rows++) {
					for(columns = 0; columns < a[0].length; columns++) {
						Sum[rows][columns] = a[rows][columns] + b[rows][columns];  
					}			
				}
				System.out.println("Sum Of those Two Arrays are: ");
				for(rows = 0; rows < a.length; rows++) {
					for(columns = 0; columns < a[0].length; columns++) {
						System.out.format("%d \t", Sum[rows][columns]);
					}
					System.out.println("");
				}
			}
		}