1. **Strategy Pattern**:
   - **Definition**: The Strategy Pattern is a behavioral design pattern that defines a family of interchangeable algorithms or behaviors, encapsulates each one, and makes them interchangeable. It allows the client to choose the appropriate algorithm at runtime.


2. **Observer Pattern**:
   - **Definition**: The Observer Pattern is a behavioral design pattern where an object (subject) maintains a list of its dependents (observers) and notifies them of state changes, typically by calling one of their methods. It establishes a one-to-many relationship between objects, ensuring that when one object changes state, all its dependents are notified and updated automatically.


3. **Decorator Pattern**:
   - **Definition**: The Decorator Pattern is a structural design pattern that allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class. It involves creating a set of decorator classes that are used to wrap concrete components.


4. **Factory Pattern**:
   - **Definition**: The Factory Pattern is a creational design pattern that provides an interface for creating objects in a super class, but allows subclasses to alter the type of objects that will be created. It abstracts the process of object creation and promotes loose coupling between client code and the objects being created.


5. **Singleton Pattern**:
   - **Definition**: The Singleton Pattern is a creational design pattern that ensures a class has only one instance and provides a global point of access to that instance. It is often used when exactly one object needs to coordinate actions across the system.


6. **Command Pattern**:
   - **Definition**: The Command Pattern is a behavioral design pattern that encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations. It also provides support for undoable operations.


7. **Adapter Pattern**:
   - **Definition**: The Adapter Pattern is a structural design pattern that allows the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code.


8. **Facade Pattern**:
   - **Definition**: The Facade Pattern is a structural design pattern that provides a simplified interface to a set of interfaces in a subsystem. It defines a higher-level interface that makes it easier to use the subsystem's functionality.


9. **Template Method Pattern**:
   - **Definition**: The Template Method Pattern is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.


10. **Iterator Pattern**:
    - **Definition**: The Iterator Pattern is a behavioral design pattern that provides a way to access elements of an aggregate object sequentially without exposing the underlying representation of the object. It separates the traversal code from the aggregate object.


11. **Composite Pattern**:
    - **Definition**: The Composite Pattern is a structural design pattern that allows you to compose objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.


12. **State Pattern**:
    - **Definition**: The State Pattern is a behavioral design pattern that allows an object to alter its behavior when its internal state changes. The object appears to change its class.


13. **Proxy Pattern**:
    - **Definition**: The Proxy Pattern is a structural design pattern that provides a surrogate or placeholder for another object to control access to it. It can be used to add a level of control over the interaction with the real object, such as lazy initialization, access control, or logging.


14. **Model-View-Controller (MVC) Pattern**:
    - **Definition**: The Model-View-Controller (MVC) is an architectural design pattern used in software engineering and application development. It divides an application into three interconnected components to separate the concerns of data manipulation, user interface, and control flow:
        1. **Model**: The Model represents the application's data and business logic. It encapsulates the data and provides methods for retrieving and manipulating it. It is unaware of the user interface and communicates with the Controller to notify of changes.
        2. **View**: The View is responsible for presenting the data to the user and handling user interface elements. It displays the information from the Model and sends user input to the Controller. Views are typically passive and do not contain business logic.
        3. **Controller**: The Controller acts as an intermediary between the Model and the View. It receives user input from the View, processes it, and updates the Model accordingly. It also listens for changes in the Model and updates the View to reflect those changes. The Controller handles the application's overall flow and logic.
