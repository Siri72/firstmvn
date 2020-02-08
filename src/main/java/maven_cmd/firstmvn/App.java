package maven_cmd.firstmvn;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "This maven project is created from command prompt\n"
        		+ "follow the below steps to create a maven project from command prompt:\n"
        		+ "1.Install latest maven from apache.\n"
        		+ "2.Set environment variables M2_HOME and MAVEN_HOME along with JAVA_HOME(make sure you have java 1.7 or new versions)\n"
        		+ "3.create a folder\n"
        		+ "4.open command prompt from that folder and type the following commands\n"
        		+ "5.mvn -version : just to verify the existance and path variables \n"
        		+ "6.mvn archetype:archetype (enter)"
        		+ "this downloads required files for the project \n"
        		+ "7.give the groupId,artifactId,version,package details "
        		+ "\n 8.Build is then successful\n"
        		+ "9.To edit it in eclipse IDE type the following command\n"
        		+ "mvn eclipse:eclipse (enter)"
        		+ "\n once deployment finishes import the maven file into eclipse." );
    }
}
