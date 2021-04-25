package world.srv.yeahbutstill;

import com.google.gson.Gson;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Gson gson = new Gson();

        Person person = new Person("Azhilla Dani Setiawan");
        String json = gson.toJson(person);
        System.out.println(json);

    }
}
