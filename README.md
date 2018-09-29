# S.D.Nirmal
[Graph Algorithm Implementation]

Contains 2 packages
	-Main
	-Tool
Main package contains 3 classes
	-Main.java
	-Graph.java
	-Vertex.java
Tool package contains 1 class
	-Queue.java

==Package Main==

--------------Main.java--------------

Main.java is the main class.It contains the instructios to insert vertices into the graph,create paths between vertices,to do breadth first traversal and to do depth first traversal.

--------------Graph.java-------------

Is simply the graph with vertices and edges.

Contains methods
	-addVertex(add a vertex to the graph.If the vertex is pre-existing,it will not be added)
	-addEdge(will create paths between vertices)
	-checkVertex(will check whether a certain vertex already exists in the graph)
	-displayEdges(will display all the paths between vertices)
	-displayVertices(will display all the vertices in the graph)
	-breadthFirstTraversal(will do a breadth first traversal while displaying the value of the 		 vertex)
	-callDepthFirstTraversal(will call the DepthFirstTraversal Mehtod)
	-DepthFirstTraversal(will do a depth first traversal through the graph while displaying the 		 values of the vertices)


--------------Vertex.java-------------	

Template for creating vertex objects in order to insert into the graph.Is a bean class with setters and getter for all the variables in the class.

==Package Tool==

--------------Queue.java-------------	

is a dynamic queue with basic queue functionalities.Is also a generic class so you can store whatever data type you like.
