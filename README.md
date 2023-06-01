# Shortest Path in Binary Matrix

This Java code finds the shortest path in a binary matrix using the breadth-first search (BFS) algorithm.

## Concept

The shortest path problem involves finding the shortest path between two points in a graph. In this case, we have a binary matrix where cells can be either empty (0) or obstacles (1). The goal is to find the shortest path from the top-left cell to the bottom-right cell, considering only empty cells as valid steps.

## Breadth-First Search (BFS)

BFS is an algorithm for traversing or searching a graph or tree. It explores all the vertices of a graph in breadth-first order, i.e., visiting all the neighbors of a vertex before moving to the next level.

The steps of the BFS algorithm used in this code are as follows:

1. Initialize a queue to store cells to be visited and a grid to mark visited cells.
2. Add the starting cell to the queue with a distance of 1 and mark it as visited.
3. While the queue is not empty:
   - Remove the first cell from the queue and extract its coordinates and distance.
   - If the current cell is the destination cell, return the distance as the shortest path length.
   - Iterate over the neighboring cells of the current cell:
     - Check if the neighboring cell is valid (within the grid boundaries) and not visited.
     - If valid, add the neighboring cell to the queue with an updated distance and mark it as visited.
4. If the BFS traversal completes without finding a valid path to the destination cell, return -1.

## Usage

1. Provide a binary matrix as input, where 0 represents an empty cell and 1 represents an obstacle.
2. Create an instance of the `Solution` class.
3. Call the `shortestPathBinaryMatrix` method, passing the binary matrix as an argument.
4. The method will return the shortest path length from the top-left cell to the bottom-right cell.
5. If no valid path exists, -1 will be returned.

## Example

    int[][] grid = {
      {0, 0, 0},
      {1, 1, 0},
      {1, 1, 0}
     };

     Solution solution = new Solution();
     int shortestPath = solution.shortestPathBinaryMatrix(grid);
     System.out.println("Shortest Path Length: " + shortestPath);


This example creates a binary matrix and finds the shortest path using the shortestPathBinaryMatrix method. The resulting shortest path length is then printed to the console.

    Shortest Path Length: 5

