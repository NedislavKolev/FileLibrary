# FileLibrary

Build by MaNik-IT this Java external library allows you to read and write from and to files.

## Installation



```
In terminal
mvn clean install

Add the MaNik.FileLibrary-1.0.jar as ExternalLibrary to your IDE
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

}

class WriteToFile {
    //allows you to write to file     
    FileRead fileRead = new FileRead();
    fileRead.writeToFile(toWrite,"C:\\Path\\to\\file.txt")
    //Where toWrite is inputstream and 
    // "C:\\Path\\to\\file.txt" is the location of the file you want to write to
}
```

## Contributing
Pull requests are welcome.
