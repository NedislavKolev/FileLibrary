package MaNik.File;


import java.io.*;


/**
 * Author: Dincher and Nedislav
 *
 * Usage:
 * 1.readFile(): reads the content of a file
 *
 * 2.writeToFile(): writes the input into a file
 *
 * //2.httpExchangeWriter(): writes down data into file(specific method for httpServer)
 *
 * //3.httpServletWriter(): writes down data into file(specific method for Servlet)
 */
public class MaNikFileLibrary {


    public String readFile(String file_name) throws IOException {

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