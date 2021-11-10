//import File.FilePath;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStream;
//
//public class WriteFile {
//    public void WriteFile() throws IOException {
//
//        FilePath filePath = new FilePath();
//
//        //TODO: "dynamic" FileWriter, InputStream, httpExchange
//        //Get the incoming data(request body)
//        InputStream bodyStream = httpExchange.getRequestBody();
//
//        //reading all remaining byte from the input stream
//        byte []b = bodyStream.readAllBytes();
//        String toWrite = new String(b);
//
//        try {
//            //Save the incoming data to a file
//            FileWriter putWriter = new FileWriter(String.valueOf(filePath));
//            putWriter.write(toWrite);
//
//            //close the connection
//
//            putWriter.close();
//            System.out.println("Received file from client: \n" + toWrite);
//            System.out.println("Successfully wrote to the file.");
//        } catch (
//                IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }
//
//}
