Notes:-> 

1. Bazel is a tool to build the java project. It essentially gives an essence of how a build system works.
2. Inside the package no need to import to create an object of one class into another. 



Questions:->

1. In one java file, can we have many classes? if yes, which class would be public? and is there any requirement of main method?

-> Probably, we can have as many classes as we do. Public modifier will be added to that class which has a similar name with the java file, even without public, is also valid. It is not necessarily need to have a class name similar to the file name. We can have multiple classes. But remember that when we assign a public keyword to any class, that class's name should match the file name. In this case, if we compile the filename.java it would work but now onwards that .class file would run which has a main method,which is nothing but the entry point of the class.  
