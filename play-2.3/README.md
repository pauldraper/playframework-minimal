# Play Framework 2.3

## Run

1. Install [SBT](http://www.scala-sbt.org/) (Simple Build Tool).
2. In this directory, run `sbt run`.
3. See [http://localhost:9000/](http://localhost:9000/)

## Explanation

There are six files.

**project/build.properties** specifies the SBT version.

**project/build.sbt** pulls in Play's SBT plugin, which implements auto reloading.

**build.sbt** enables Play's SBT plugin, and sets build settings such as Scala version and dependencies on external libraries.

**conf/application.conf** is HOCON configuration, and can override Play defaults.

**conf/routes** maps method and URL patterns to controllers.

The app directory contains the application code, such as **app/example/ExampleController.scala**.
