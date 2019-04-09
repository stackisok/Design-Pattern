package builder;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 22:11 2018/3/20
 *@Modified By:
 *
 */
public class Director {
    private Builder builder = new Classic();
    public ServerProduct createClassicUbuntuEnvironment(){
        builder.installOS("Ubuntu").installLanguage("Java").installServer("Tomcat").installDatabase("Mysql");
        return builder.getProduct();
    }
    public ServerProduct createClassicCentOSEnvironment(){
        builder.installOS("CentOS").installLanguage("Java").installServer("Tomcat").installDatabase("Mysql");
        return builder.getProduct();
    }
}
