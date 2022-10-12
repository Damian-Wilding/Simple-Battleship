import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class CertificateCreator {

    //creates and fills out a certificate for the player if one doesn't already exist
    public static void CreateCertificate() {
        
        //creates the certificate if one doesn't already exist
        try {
            File certificate = new File("Certificate.txt");
            if (certificate.createNewFile()) {
                System.out.println("Certificate created!");
            }
            //tells the user that they will not be receiving a certificate since they already have one
            else {
                System.out.println("Certificate not created since you already have one.");
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //fills out the certificate
        try {
            FileWriter writing = new FileWriter("Certificate.txt");
            writing.write("Congratulations! you won!");
            writing.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
