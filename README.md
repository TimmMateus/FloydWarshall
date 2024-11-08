# FloydWarshall
Floyd-Warshall Algorithm University Project
This project, developed as a university assignment, implements the Floyd-Warshall algorithm in Java to find the shortest paths between all pairs of vertices in a weighted graph. The algorithm is particularly useful for network routing, geographical mapping, dynamic programming, and game development.

## Files:

### Main.java:
This file contains the main method which orchestrates the execution of the project. It imports the graph weights from a CSV file, prints the initial weights, executes the Floyd-Warshall algorithm, and prints the updated weights.

### Reader.java: 
This class handles the reading of the CSV file and converts it into a matrix representing the graph weights. It treats the value "inf" as a representation of infinite weight.

### GraphsWeights.java:
This class represents the graph with weights. It includes methods to get and set the weights, calculate the distance between vertices, and print the matrix.

### FloydWarshall.java:
This class contains the implementation of the Floyd-Warshall algorithm and methods to calculate and print the shortest distance between selected vertices.

### Support.java: 
This class includes auxiliary methods, such as waiting for user input to continue.

## Steps of the code:

* The program starts by importing graph weights from a CSV file (e.g., matrix.csv) using the Reader class.
* The initial weights are printed to the console.
* FloydWarshall class executes the algorithm to find the shortest paths between all pairs of vertices.
* The updated weights, representing the shortest paths, are printed to the console.
* The user can select the origin and destination vertices to calculate and print the shortest distance between them.

## Steps of the Floyd-Warshall Algorithm:
* Create a distance matrix where dist[i][j] represents the weight of the edge from vertex i to vertex j.
* Iterate over all pairs of vertices and update the distance matrix to ensure that dist[i][j] contains the shortest path from i to j.
* After completing the iteration, dist[i][j] will contain the shortest distance between vertex i and vertex j.

## How to Use the Floyd-Warshall Algorithm 
To use the Floyd-Warshall algorithm implemented in this project, follow these steps: 
### Prerequisites
Ensure you have [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) installed on your system. You can verify the installation by running the following command in your terminal: 

```
java -version
 ```

### Step-by-Step Instructions
1. Clone the Github Repository:
Begin by cloning the project repository from GitHub. Open your terminal and run the following command:

```
git clone https://github.com/TimmMateus/FloydWarshall.git
 ```

2. Navigate to the Project Directory:
Change your working directory to the project directory:

```
cd FloydWarshall
```
3. Run the script

Execute the script to run the Floyd-Warshall algorithm. Ensure your CSV file (e.g., matrix.csv) is placed in the appropriate directory. Run the following command:

```
Start.cmd
```

4. Follow the On-Screen Instructions:
The program will prompt you to select the origin and destination vertices. Follow the on-screen instructions to calculate and print the shortest distance between the selected vertices.

## License
[This project is licensed under the MIT License - see the LICENSE.md file for details.](LICENSE.md)
## 
Created by Mateus R Timm
