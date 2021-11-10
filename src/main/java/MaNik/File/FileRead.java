package MaNik.File;


import java.io.*;


/**
 * Author: Dincher and Nedislav
 *
 * Usage:
 * 1.readFile(): reads the content of a file
 *
 * 2.httpExchangeWriter(): writes down data into file(specific method for httpServer)
 *
 * 3.httpServletWriter(): writes down data into file(specific method for Servlet)
 */
public class FileRead {


    public String readFile() throws IOException {

        String file_name = "";
        String line = null;

        //specify the file name
        File file = new File(file_name);

        //read the content of the file
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }


//    public void writeToFile(InputStream stream,String file_name) throws IOException {
//
//        InputStreamReader reader1 = new InputStreamReader(stream);
//        BufferedReader reader  = new BufferedReader(reader1);
//
//        try {
//            //Save the incoming data to a file
//            FileWriter putWriter = new FileWriter(file_name);
//
//            reader.lines().forEach(line -> {
//                try {
//                    putWriter.write(line);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
//            putWriter.flush();
//            //close the connection
//            putWriter.close();
//            stream.close();
//            reader.close();
//            reader1.close();
//
//            System.out.println("Received file from client: \n");
//            System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }

    public void writeToFile(String stream,String file_name) throws IOException {

        try {
            //Save the incoming data to a file
            FileWriter putWriter = new FileWriter(file_name);

            putWriter.write(stream);

            putWriter.flush();
            //close the connection
            putWriter.close();

            System.out.println("Received file from client: \n");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}