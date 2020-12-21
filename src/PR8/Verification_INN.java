package PR8;


public class Verification_INN  extends Exception
{
    public Verification_INN(Account client)
    {
        super("У клиента "+client.getName()+" недействительный ИНН");
    }

    public Verification_INN(String massage)
    {
        super(massage);
    }

    public String toString(Account client)
    {
        return ("У клиента "+client.getName()+" недействительный ИНН");
    }
}