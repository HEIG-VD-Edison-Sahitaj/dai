Protocol design
===============

Goals
-----

* Learn to write a specification of an application-layer protocol.
* Learn to implement a client-server application over TCP.

Overview
--------

You will work on this lab in groups of 2 students (or 1, but not 3). You will need to *fork this repository* under the GitHub account of one of the students. Both students can then clone the forked respository on their machine.

In this lab, you will design and implement a client-server application. The server can perform computations such as "ADD 10 20". The client reads user inputs from stdin, sends them to the server and displays the result.

### Specification

The first goal is to **specify a client-server protocol**.

You decide the functionality to be implemented. You can keep it simple or go as far as you like. At the least, as a client I should be able to send an operation (addition or multiplication) to the server and get my result back. Of course, once you have the basics in place, you can extend as much as you want. Use your creativity.

![](https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Calculator_on_macOS.png/381px-Calculator_on_macOS.png)

The specification must contain **everything** that is needed for **one person to implement a client**, for **another person to implement a server** and for the 2 applications to work together. The specification is a **contract** between the server and the client.

### Implementation

The second goal is to implement both the client and the server such that the client-server application fonctions correctly.

Steps
-----

### Phase 1: write the specification (individually, 20 minutes)

Rename the folder `specs/student1_student2` to indicate the GitHub user IDs of your group.
Then, in this folder, create a file named `protocol.md` and write your **specification**.
 
### Phase 2: review specifications (in pairs, 5 minutes)

* Are there big differences between the specification?
* What are the common elements?
* Are there missing or confusing elements in the specification?

### Phase 3: validate specs in pairs (in pairs, 20 minutes)

* One student simulates the the server, the other the client
* Pick one of the 2 specifications
* One student uses netcat (nc) to start a server (nc -kl). The other student uses netcat to start a client.
* Go through a couple of scenarios to validate that your specification is complete (**if you need to ask something to the other student, or if you need to discuss, you probably should make your specification more complete**)

After this validation, improve and merge your specifications into a single document `protocol.md`.

Once you have a specification document with which you are satisfied, **submit a Pull Request**

### Phase 4: implement a client and a server (180 minutes)

* Change the name of the folder `code/student1_student2` to your GitHub IDs. Put your code there.
* Use the skeleton provided as a basis. The folder contains 2 Maven projects: one for the client, one for the server. 
  If you open the folder `code/student1_student2` in your IDE, it should recongnize the 2 projects `client` and `server`.
* One student implements the client, the other the server.
* The server should send the supported operations in a welcome message.
* The client should print the supported operations and wait for the user to enter a command, which is then sent to the server. It then prints the result.
* The application must not crash if something unexpected happens or an unknown operation is requested.
* Perform tests to validate that the client and the server work together (on the same machine, across two machines connected to the same network, ...).
* Add your code in your folder and submit a PR on the upstream repository.

To guide your implementation, have a look at the DAI repository [dai-codeexamples](https://github.com/HEIGVD-Course-DAI/dai-codeexamples). Read and test the examples for a textual TCP server and client.

At the end **create a pull request** to submit your code.
