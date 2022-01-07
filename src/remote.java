import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;
interface Search extends Remote{
    public String query(String search) throws RemoteException;
}
class SearchQuery extends UnicastRemoteObject
        implements Search
{
    // Default constructor to throw RemoteException
    // from its parent constructor
    SearchQuery() throws RemoteException
    {
        super();
    }

    // Implementation of the query interface
    public String query(String search)
            throws RemoteException
    {
        String result;
        if (search.equals("Reflection in Java"))
            result = "Found";
        else
            result = "Not Found";

        return result;
    }
}
public class remote {
    public static void main(String[] args) {
        {
            try
            {
                // Create an object of the interface
                // implementation class
                Search obj = new SearchQuery();

                // rmiregistry within the server JVM with
                // port number 1900
                LocateRegistry.createRegistry(1900);

                // Binds the remote object by the name
                // geeksforgeeks
                Naming.rebind("rmi://localhost:1900"+
                        "/geeksforgeeks",obj);
            }
            catch(Exception ae)
            {
                System.out.println(ae);
            }
        }
    }
}
