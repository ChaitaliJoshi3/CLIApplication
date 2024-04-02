# Word CountCLI  

# Spring Boot CLI Application

This is a command-line application developed in Java that accepts a file path as an argument and displays a word count of the file's contents. The output lists each word along with the frequency of its occurrence in the file, sorted in descending order based on frequency.

Tech stack:

- Spring Boot 3
- Spring Framework 6
- Spring Shell
- GraalVM
- Maven
- Java 17

## Instructions

### Building the Application

To build the application, follow these steps:

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/word-count-cli.git
    ```

2. Navigate to the project directory:

    ```bash
    cd CLIAPPLICATION_MULTITONE
    ```

3. Implementing GraalVM:

    GraalVM is used to compile Java applications into native images. It is a high-performance JDK that can speed up the performance of Java and JVM-based applications using an alternative just-in-time (JIT) compiler. It lowers application latency, improves peak throughput by reducing garbage collection time.

    To package a Spring Boot application into a native executable, you need to use Spring Native and add Maven/Gradle plugin for GraalVM Native Image (Native Build Tools).

    Using GraalVM Native Image, you can compile Java bytecode into a platform-specific, self-contained native executable to achieve faster startup and a smaller footprint for your application.

    If you do not have GraalVM on your machine, please follow the steps below or skip to the next section:

    1. To download GraalVM specific to your machine, you need to select it from the link below:
       [Download GraalVM](https://www.graalvm.org/latest/docs/getting-started/)

    2. Remove the quarantine attribute (required for macOS Catalina and later):
       ```bash
       sudo xattr -r -d com.apple.quarantine graalvm-jdk-<version>_macos-<architecture>.tar.gz
       ```

    3. Unzip the archive:
       ```bash
       tar -xzf graalvm-jdk-<version>_macos-<architecture>.tar.gz
       ```

    4. Move the downloaded package to its proper location, the `/Library/Java/JavaVirtualMachines` directory. Since this is a system directory, `sudo` is required:
       ```bash
       sudo mv graalvm-jdk-<version>_macos-<architecture> /Library/Java/JavaVirtualMachines
       ```

    5. To verify if the move is successful and to get a list of all installed JDKs, run `/usr/libexec/java_home -V`.

    6. Set the `JAVA_HOME` environment variable to resolve to the GraalVM installation directory:
       ```bash
       export JAVA_HOME=/Library/Java/JavaVirtualMachines/<graalvm>/Contents/Home
       ```

    7. Set the value of the `PATH` environment variable to the GraalVM bin directory:
       ```bash
       export PATH=/Library/Java/JavaVirtualMachines/<graalvm>/Contents/Home/bin:$PATH
       ```

    8. To check whether the installation was successful, run the `java -version` command.

4. Build the project using Maven:

   * GraalVM is successfully installed on your machine. Now to build the project, please run the following command:
     ```bash
     ./mvnw -Pnative native:compile
     ```

   * After this, you would be able to see an executable native file in the project's `target` folder.

5. Run Application:
   * After a successful build, there will be an executable native file created in the project's `target` folder.
   * Simply double click the executable file from the file explorer, and a CLI shell will be opened.
   * In the shell, you can fire the `help` command to get implemented commands in this application.
   * You can run the below command which will return the result of words and their occurrence in descending order.
     ```bash
     WordCountOfFile ABSOLUTE/PATH/TO/FILE/test.txt
     ```

### Assumptions

* This application only accepts plain/text mime type documents (.txt files).
* Words are separated by whitespace characters (spaces, tabs, newlines).
* The word count is case-sensitive, so "Hello" and "hello" will be counted as separate words.
* Special characters, punctuation marks, and numbers are considered part of words.
* As this is a CLI application, space in file name will be considered as another argument of a command.

