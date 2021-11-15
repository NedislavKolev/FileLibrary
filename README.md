# FileLibrary

Build by MaNik-IT this Java external library allows you to read and write from and to files.

## Installation



```
In terminal
mvn clean install

Add the MaNik.FileLibrary-1.0.jar as ExternalLibrary to your IDE 
OR
As dependecy to your pom.xml
```

## Usage

```java
import MaNik.File.*;

/**
 * @Methods:
 * readFile
 * writeToFile
 */
class ReadFile {
    //allows you to read a file

    MNFileLib fileRead = new MNFileLib();
    String toPrint = fileRead.readFile("C:\\Path\\to\\file.txt");
}

class WriteToFile {
    //allows you to write to file   
    
    MNFileLib fileWrite = new MNFileLib();
    fileWrite.writeToFile(toWrite,"C:\\Path\\to\\file.txt")
    //Where toWrite is inputstream and 
    // "C:\\Path\\to\\file.txt" is the location of the file you want to write to
}
```

## Contributing
Pull requests are welcome.
